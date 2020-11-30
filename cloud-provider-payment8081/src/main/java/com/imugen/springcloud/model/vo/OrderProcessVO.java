package com.imugen.springcloud.model.vo;

import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 订单-客服领取服务流程关系
 * </p>
 *
 * @author liuqiang
 * @since 2020-11-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="OrderProcessDO视图对象")
public class OrderProcessVO{
    @ApiModelProperty(value = "自增id")
    private Long id;

    @ApiModelProperty(value = "订单编号")
    private String tradeNo;

    @ApiModelProperty(value = "客服用户id")
    private Long userId;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime modifyTime;

    @ApiModelProperty(value = "关联记录id")
    private Long recordId;

    @ApiModelProperty(value = "服务结果 1-已通过 0-未通过")
    private Integer result;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "流程状态")
    private Integer status;


}
