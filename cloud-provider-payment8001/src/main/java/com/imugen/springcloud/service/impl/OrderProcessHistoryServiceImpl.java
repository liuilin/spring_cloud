package com.imugen.springcloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.imugen.springcloud.mapper.OrderProcessHistoryMapper;
import com.imugen.springcloud.model.entity.OrderProcessHistoryDO;
import com.imugen.springcloud.service.IOrderProcessHistoryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 订单-流程历史信息 服务实现类
 * </p>
 *
 * @author liuqiang
 * @since 2020-11-25
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class OrderProcessHistoryServiceImpl extends ServiceImpl<OrderProcessHistoryMapper, OrderProcessHistoryDO> implements IOrderProcessHistoryService {

}
