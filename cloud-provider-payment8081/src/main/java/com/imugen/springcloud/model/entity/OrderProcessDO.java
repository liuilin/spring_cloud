package com.imugen.springcloud.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;

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
@TableName("order_process")
public class OrderProcessDO{

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
     * 客服用户id
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField("modify_time")
    private LocalDateTime modifyTime;

    /**
     * 关联记录id
     */
    @TableField("record_id")
    private Long recordId;

    /**
     * 服务结果 1-已通过 0-未通过
     */
    @TableField("result")
    private Integer result;

    /**
     * 备注
     */
    @TableField("remark")
    private String remark;

    /**
     * 流程状态
     */
    @TableField("status")
    private Integer status;


}
