package com.dawnop.client.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MailRequest implements Serializable {

    private String sendTo;
    private String subject;
    private String content;
    private String filePath;

}
