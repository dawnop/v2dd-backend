package com.dawnop.client.service;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.dawnop.algorithm.proto.AlgorithmProto.ImageResponse;
import com.dawnop.algorithm.proto.AlgorithmProto.State;
import com.dawnop.client.entity.ImageRecord;
import com.dawnop.client.exception.AlgorithmServerException;
import com.dawnop.client.mapper.ImageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Iterator;

@Service
public class ImageUpdateService {

    @Autowired
    private ImageMapper imageMapper;

    @Async
    public void waitForUpdate(Iterator<ImageResponse> responseIterator, Integer imageId) throws AlgorithmServerException {
        if (responseIterator.hasNext()) {
            ImageResponse response = responseIterator.next();
            if (response.getState() == State.END) {
                LambdaUpdateWrapper<ImageRecord> lambdaUpdateWrapper = new LambdaUpdateWrapper<>();
                lambdaUpdateWrapper.eq(ImageRecord::getImageId, imageId)
                        .set(ImageRecord::getImageFinished, true)
                        .set(ImageRecord::getFinishMessage, response.getMessage());
                imageMapper.update(null, lambdaUpdateWrapper);
                return;
            }
            throw new AlgorithmServerException("Server algorithm error.");
        }
        throw new AlgorithmServerException("Server response error.");
    }
}
