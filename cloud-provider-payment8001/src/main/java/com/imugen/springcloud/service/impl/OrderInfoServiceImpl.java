package com.imugen.springcloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.imugen.springcloud.mapper.OrderInfoMapper;
import com.imugen.springcloud.model.entity.OrderInfoDO;
import com.imugen.springcloud.service.IOrderInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 订单-基本信息 服务实现类
 * </p>
 *
 * @author liuqiang
 * @since 2020-11-25
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfoDO> implements IOrderInfoService {

}
