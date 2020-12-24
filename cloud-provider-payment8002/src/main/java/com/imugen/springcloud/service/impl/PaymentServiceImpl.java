package com.imugen.springcloud.service.impl;

import com.imugen.springcloud.model.entity.PaymentDO;
import com.imugen.springcloud.mapper.PaymentMapper;
import com.imugen.springcloud.service.IPaymentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuqiang
 * @since 2020-12-24
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, PaymentDO> implements IPaymentService {

}
