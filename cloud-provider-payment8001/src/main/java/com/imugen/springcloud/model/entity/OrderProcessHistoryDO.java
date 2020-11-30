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
 * 订单-流程历史信息
 * </p>
 *
 * @author liuqiang
 * @since 2020-11-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("order_process_history")
public class OrderProcessHistoryDO{

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
     * 流程类型 1-订单流程 2-服务流程
     */
    @TableField("type")
    private Integer type;

    /**
     * 节点
     */
    @TableField("node")
    private Integer node;

    /**
     * 操作人id
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 操作人描述
     */
    @TableField("user_desc")
    private String userDesc;

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
     * 流程变更
     */
    @TableField("modify")
    private Long modify;


}
