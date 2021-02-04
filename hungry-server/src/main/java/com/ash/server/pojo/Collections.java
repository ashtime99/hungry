package com.ash.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

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
@TableName("h_collection")
@ApiModel(value="Collection对象", description="")
public class Collections implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "评价id")
    @TableId(value = "collection_id", type = IdType.AUTO)
    private Integer collectionId;

    @ApiModelProperty(value = "用户id")
    private Integer userId;

    @ApiModelProperty(value = "商品id")
    private Integer commodityId;

    @ApiModelProperty(value = "收藏删除状态")
    private Boolean collectionDelete;

    @ApiModelProperty(value = "收藏创建时间")
    private LocalDateTime collectionCreateTime;

    @ApiModelProperty(value = "收藏最近修改时间")
    private LocalDateTime collectionUpdateTime;


}
