package com.imugen.springcloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.imugen.springcloud.mapper.OrderRefundInfoMapper;
import com.imugen.springcloud.model.entity.OrderRefundInfoDO;
import com.imugen.springcloud.service.IOrderRefundInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 订单-退款信息 服务实现类
 * </p>
 *
 * @author liuqiang
 * @since 2020-11-25
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class OrderRefundInfoServiceImpl extends ServiceImpl<OrderRefundInfoMapper, OrderRefundInfoDO> implements IOrderRefundInfoService {

}
