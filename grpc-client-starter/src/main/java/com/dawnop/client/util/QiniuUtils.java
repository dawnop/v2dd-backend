package com.dawnop.client.util;

import com.qiniu.util.Auth;
import org.springframework.stereotype.Component;

@Component
public class QiniuUtils {

    public static final String baseUrl = "http://rhbynad8p.hb-bkt.clouddn.com";

    public static final String uploadUrl = "http://upload-z1.qiniup.com";

    public static final String bucket = "dawnop";

    public static String getToken() {
        String accessKey = "6OJ_IiE3_gd4_DzbUvykyIVMv7h-BlWvl6mi7FAD";
        String secretKey = "sBldVpW9dBsEYWJwRBY5M37xH-zbUVpMl8yFYHJB";
        Auth auth = Auth.create(accessKey, secretKey);
        return auth.uploadToken(bucket);
    }
}
