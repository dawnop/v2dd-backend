package com.dawnop.client.controller;


import com.dawnop.client.entity.ImageRecord;
import com.dawnop.client.entity.RespBean;
import com.dawnop.client.exception.AlgorithmServerException;
import com.dawnop.client.service.ImageStateCheckService;
import com.dawnop.client.service.ImageUploadService;
import com.dawnop.client.util.QiniuUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Objects;

@RestController
@RequestMapping(value = "/algorithm/v1")
public class AlgorithmControllerV1 {

    @Autowired
    private ImageUploadService imageUploadService;

    @Autowired
    private ImageStateCheckService imageStateCheckService;


    @PostMapping(value = "/image")
    public RespBean image(String fullName, String key, String method)
            throws AlgorithmServerException, IOException {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<byte[]> response = restTemplate.getForEntity(
                String.format("%s/%s", QiniuUtils.baseUrl, key), byte[].class);
        long size = response.getHeaders().getContentLength();
        byte[] imageBytes = response.getBody();
        int pos = Objects.requireNonNull(fullName).indexOf('.');
        String imageName = fullName.substring(0, pos);
        String imageExt = fullName.substring(pos + 1);
        ImageRecord imageRecord = new ImageRecord()
                .setImageName(imageName)
                .setImageExt(imageExt)
                .setImageSize(size)
                .setProcessMethod(method)
                .setCloudKey(key);
        return imageUploadService.questAlgorithmImage(imageBytes, imageRecord);
    }

    @GetMapping(value = "/image")
    public RespBean image(Integer imageId) {
        return imageStateCheckService.image(imageId);
    }

}
