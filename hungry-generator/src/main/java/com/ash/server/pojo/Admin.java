package com.ash.server.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("h_admin")
@ApiModel(value="Admin对象", description="")
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "管理员id")
    @TableId(value = "admin_id", type = IdType.AUTO)
    private Integer adminId;

    @ApiModelProperty(value = "管理员账户")
    private String adminUsername;

    @ApiModelProperty(value = "管理员密码")
    private String adminPassword;

    @ApiModelProperty(value = "管理员联系号码")
    private String adminPhone;

    @ApiModelProperty(value = "管理员创建时间")
    private LocalDateTime adminCreateTime;

    @ApiModelProperty(value = "管理员最近修改时间")
    private LocalDateTime adminUpdateTime;

    @ApiModelProperty(value = "管理员最近登录时间")
    private LocalDateTime adminLoginTime;

    @ApiModelProperty(value = "管理员是否被删除")
    private Boolean adminEnabled;

    @ApiModelProperty(value = "管理员是否被冻结")
    private Boolean adminLocked;


}
