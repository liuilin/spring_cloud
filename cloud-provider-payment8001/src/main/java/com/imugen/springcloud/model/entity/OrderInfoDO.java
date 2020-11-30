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
 * 订单-基本信息
 * </p>
 *
 * @author liuqiang
 * @since 2020-11-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("order_info")
public class OrderInfoDO{

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
     * 下单用户id
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 下单用户名
     */
    @TableField("user_name")
    private String userName;

    /**
     * 下单手机号
     */
    @TableField("user_phone")
    private String userPhone;

    /**
     * 订单总额（元）
     */
    @TableField("total_amount")
    private BigDecimal totalAmount;

    /**
     * 是否开通会员 1-是 0-否
     */
    @TableField("is_open_member")
    private Integer isOpenMember;

    /**
     * 会员费（元）
     */
    @TableField("member_amount")
    private BigDecimal memberAmount;

    /**
     * 应付金额（元）
     */
    @TableField("should_amount")
    private BigDecimal shouldAmount;

    /**
     * 订单状态  1-待付款 2-已取消 3-已付款
     */
    @TableField("status")
    private Integer status;

    /**
     * 是否已退款 1-是 0-否
     */
    @TableField("is_refund")
    private Integer isRefund;

    /**
     * 订单创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField("modify_time")
    private LocalDateTime modifyTime;

    /**
     * 订单商品类型 1-代运营类 2-证照代办类 3-会员类
     */
    @TableField("type")
    private Integer type;


}
