package com.ash.server.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author ash
 * @since 2021-01-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("h_image")
@ApiModel(value="Image对象", description="")
public class Image implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "图片id")
    private Integer imageId;

    @ApiModelProperty(value = "图片地址")
    private String imageUrl;

    @ApiModelProperty(value = "图片删除状态")
    private Boolean imageDelete;

    @ApiModelProperty(value = "图片创建时间")
    private LocalDateTime imageCreateTime;

    @ApiModelProperty(value = "图片最近修改时间")
    private LocalDateTime imageUpdateTime;


}
