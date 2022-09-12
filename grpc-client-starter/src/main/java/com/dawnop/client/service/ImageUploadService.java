package com.dawnop.client.service;


import com.dawnop.algorithm.proto.AlgorithmProto.ImageRequest;
import com.dawnop.algorithm.proto.AlgorithmProto.ImageResponse;
import com.dawnop.algorithm.proto.AlgorithmProto.State;
import com.dawnop.algorithm.proto.AlgorithmServiceGrpc.AlgorithmServiceBlockingStub;
import com.dawnop.client.entity.ImageRecord;
import com.dawnop.client.entity.RespBean;
import com.dawnop.client.exception.AlgorithmServerException;
import com.dawnop.client.mapper.ImageMapper;
import com.google.protobuf.ByteString;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Iterator;


@Service
public class ImageUploadService {

    @GrpcClient("grpc-server")
    private AlgorithmServiceBlockingStub stub;


    @Autowired
    private ImageUpdateService imageUpdateService;

    @Autowired
    private ImageMapper imageMapper;

    public RespBean questAlgorithmImage(byte[] imageBytes, ImageRecord imageRecord) throws AlgorithmServerException, IOException {
        Iterator<ImageResponse> responseIterator = stub.image(ImageRequest.newBuilder()
                .setImage(ByteString.copyFrom(imageBytes))
                .setMethod(imageRecord.getProcessMethod())
                .build()
        );
        if (responseIterator.hasNext()) {
            ImageResponse response = responseIterator.next();
            if (response.getState() == State.OK) {
                int rows = imageMapper.insert(imageRecord);
                if (rows == 1) {
                    Integer imageId = imageRecord.getImageId();
                    imageUpdateService.waitForUpdate(responseIterator, imageId);
//                    return String.format("success, image ID: %d", imageId);
                    return RespBean.success("upload successfully", imageRecord);
                }
            }
        }
        throw new IOException("Can not get response from server.");
    }
}
