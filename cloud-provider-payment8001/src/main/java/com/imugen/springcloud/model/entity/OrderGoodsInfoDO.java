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
 * 订单-商品信息
 * </p>
 *
 * @author liuqiang
 * @since 2020-11-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("order_goods_info")
public class OrderGoodsInfoDO{

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
     * 商品id
     */
    @TableField("goods_id")
    private Long goodsId;

    /**
     * 商品名称
     */
    @TableField("name")
    private String name;

    /**
     * 商品类型
     */
    @TableField("type")
    private Integer type;

    /**
     * 商品结算价格
     */
    @TableField("price")
    private BigDecimal price;

    /**
     * 商品数量
     */
    @TableField("quantity")
    private Integer quantity;

    /**
     * 商品规格id
     */
    @TableField("spec_type")
    private Long specType;

    /**
     * 商品单位(次; 月;)
     */
    @TableField("unit")
    private String unit;

    /**
     * 新增时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField("modify_time")
    private LocalDateTime modifyTime;

    /**
     * 市场价格
     */
    @TableField("market_price")
    private BigDecimal marketPrice;

    /**
     * 平台价格
     */
    @TableField("platform_price")
    private BigDecimal platformPrice;

    /**
     * 会员价格
     */
    @TableField("member_price")
    private BigDecimal memberPrice;

    /**
     * 线上业务(1:三小备案;)
     */
    @TableField("online_business")
    private Integer onlineBusiness;

    /**
     * 商品封面图片
     */
    @TableField("cover_img")
    private String coverImg;


}
