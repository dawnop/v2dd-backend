package com.dawnop.client.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "tb_image")
public class ImageRecord implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer imageId;
    private String imageName;
    private String imageExt;
    private Long imageSize;
    private String processMethod;
    private Boolean imageFinished;
    private Date createTime;
    private Date updateTime;
    private String finishMessage;
    private String cloudKey;
}
