package com.dawnop.client.controller;


import com.dawnop.client.entity.ImageRecord;
import com.dawnop.client.entity.RespBean;
import com.dawnop.client.exception.AlgorithmServerException;
import com.dawnop.client.service.ImageStateCheckService;
import com.dawnop.client.service.ImageUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Objects;

@RestController
@RequestMapping(value = "/algorithm")
public class AlgorithmController {


    @Autowired
    private ImageUploadService imageUploadService;

    @Autowired
    private ImageStateCheckService imageStateCheckService;


    @PostMapping(value = "/image")
    public RespBean image(@RequestPart MultipartFile image, String method) throws IOException, AlgorithmServerException {
        String imageFullName = image.getOriginalFilename();
        byte[] imageBytes = image.getBytes();
        int pos = Objects.requireNonNull(imageFullName).indexOf('.');
        String imageName = imageFullName.substring(0, pos);
        String imageExt = imageFullName.substring(pos + 1);
        ImageRecord imageRecord = new ImageRecord()
                .setImageName(imageName)
                .setImageExt(imageExt)
                .setImageSize((long) imageBytes.length)
                .setProcessMethod(method);
        return imageUploadService.questAlgorithmImage(imageBytes, imageRecord);
    }

    @GetMapping(value = "/image")
    public RespBean image(Integer imageId) {
        return imageStateCheckService.image(imageId);
    }

}
