package com.imugen.springcloud.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 订单-支付信息
 * </p>
 *
 * @author liuqiang
 * @since 2020-11-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="OrderPayInfoDO视图对象")
public class OrderPayInfoVO{
    @ApiModelProperty(value = "自增id")
    private Long id;

    @ApiModelProperty(value = "订单编号")
    private String tradeNo;

    @ApiModelProperty(value = "支付成功交易凭证单号")
    private String payNo;

    @ApiModelProperty(value = "支付方式  1-支付宝 2-微信 3-银行卡 4-现金")
    private Integer payModel;

    @ApiModelProperty(value = "实付金额（元）")
    private BigDecimal actualAmount;

    @ApiModelProperty(value = "支付时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime modifyTime;


}
