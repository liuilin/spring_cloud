package com.imugen.springcloud.model.vo;

import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 订单-流程历史信息
 * </p>
 *
 * @author liuqiang
 * @since 2020-11-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="OrderProcessHistoryDO视图对象")
public class OrderProcessHistoryVO{
    @ApiModelProperty(value = "自增id")
    private Long id;

    @ApiModelProperty(value = "订单编号")
    private String tradeNo;

    @ApiModelProperty(value = "流程类型 1-订单流程 2-服务流程")
    private Integer type;

    @ApiModelProperty(value = "节点")
    private Integer node;

    @ApiModelProperty(value = "操作人id")
    private Long userId;

    @ApiModelProperty(value = "操作人描述")
    private String userDesc;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime modifyTime;

    @ApiModelProperty(value = "流程变更")
    private Long modify;


}
