package com.dawnop.client.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QiniuResp {

    private String qiniuToken;
    private String uploadUrl;
}
