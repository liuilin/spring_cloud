package com.imugen.springcloud.service.impl;

import com.imugen.springcloud.model.entity.OrderProcessDO;
import com.imugen.springcloud.mapper.OrderProcessMapper;
import com.imugen.springcloud.service.IOrderProcessService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 订单-客服领取服务流程关系 服务实现类
 * </p>
 *
 * @author liuqiang
 * @since 2020-11-25
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class OrderProcessServiceImpl extends ServiceImpl<OrderProcessMapper, OrderProcessDO> implements IOrderProcessService {

}
