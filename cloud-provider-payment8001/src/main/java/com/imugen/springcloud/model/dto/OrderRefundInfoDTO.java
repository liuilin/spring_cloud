package com.imugen.springcloud.model.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 订单-退款信息
 * </p>
 *
 * @author liuqiang
 * @since 2020-11-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="OrderRefundInfoDO传输对象")
public class OrderRefundInfoDTO{
    @ApiModelProperty(value = "自增id")
    private Long id;

    @ApiModelProperty(value = "订单编号")
    private String tradeNo;

    @ApiModelProperty(value = "退款金额")
    private BigDecimal refundAmount;

    @ApiModelProperty(value = "支付方式  1-支付宝 2-微信 3-银行卡 4-现金")
    private Integer payModel;

    @ApiModelProperty(value = "收款账号、银行卡号")
    private String account;

    @ApiModelProperty(value = "财务凭证地址,多个用逗号隔开")
    private String bill;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "退款时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime modifyTime;

    @ApiModelProperty(value = "操作人id")
    private Long createrId;


}
