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
 * 订单-基本信息
 * </p>
 *
 * @author liuqiang
 * @since 2020-11-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="OrderInfoDO传输对象")
public class OrderInfoDTO{
    @ApiModelProperty(value = "自增id")
    private Long id;

    @ApiModelProperty(value = "订单编号")
    private String tradeNo;

    @ApiModelProperty(value = "下单用户id")
    private Long userId;

    @ApiModelProperty(value = "下单用户名")
    private String userName;

    @ApiModelProperty(value = "下单手机号")
    private String userPhone;

    @ApiModelProperty(value = "订单总额（元）")
    private BigDecimal totalAmount;

    @ApiModelProperty(value = "是否开通会员 1-是 0-否")
    private Integer isOpenMember;

    @ApiModelProperty(value = "会员费（元）")
    private BigDecimal memberAmount;

    @ApiModelProperty(value = "应付金额（元）")
    private BigDecimal shouldAmount;

    @ApiModelProperty(value = "订单状态  1-待付款 2-已取消 3-已付款")
    private Integer status;

    @ApiModelProperty(value = "是否已退款 1-是 0-否")
    private Integer isRefund;

    @ApiModelProperty(value = "订单创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime modifyTime;

    @ApiModelProperty(value = "订单商品类型 1-代运营类 2-证照代办类 3-会员类")
    private Integer type;


}
