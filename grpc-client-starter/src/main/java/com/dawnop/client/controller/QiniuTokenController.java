package com.dawnop.client.controller;

import com.dawnop.client.entity.QiniuResp;
import com.dawnop.client.entity.RespBean;
import com.dawnop.client.util.QiniuUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qiniu")
public class QiniuTokenController {

    @GetMapping("/token")
    public RespBean token() {
        return RespBean.success("get qiniu token successfully",
                new QiniuResp(QiniuUtils.getToken(), QiniuUtils.uploadUrl));
    }
}
