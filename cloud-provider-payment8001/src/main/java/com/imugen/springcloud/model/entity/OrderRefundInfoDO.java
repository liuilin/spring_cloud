package com.imugen.springcloud.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.time.LocalDateTime;
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
@TableName("order_refund_info")
public class OrderRefundInfoDO{

    /**
     * 自增id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 订单编号
     */
    @TableField("trade_no")
    private String tradeNo;

    /**
     * 退款金额
     */
    @TableField("refund_amount")
    private BigDecimal refundAmount;

    /**
     * 支付方式  1-支付宝 2-微信 3-银行卡 4-现金
     */
    @TableField("pay_model")
    private Integer payModel;

    /**
     * 收款账号、银行卡号
     */
    @TableField("account")
    private String account;

    /**
     * 财务凭证地址,多个用逗号隔开
     */
    @TableField("bill")
    private String bill;

    /**
     * 备注
     */
    @TableField("remark")
    private String remark;

    /**
     * 退款时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField("modify_time")
    private LocalDateTime modifyTime;

    /**
     * 操作人id
     */
    @TableField("creater_id")
    private Long createrId;


}
