package com.dawnop.client.service;

import com.dawnop.client.entity.RespBean;
import com.dawnop.client.mapper.ImageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageStateCheckService {

    @Autowired
    ImageMapper imageMapper;

    public RespBean image(Integer imageId) {
        return RespBean.success("check image info successfully", imageMapper.selectById(imageId));
    }
}
