package com.imugen.springcloud.service.impl;

import com.imugen.springcloud.model.entity.OrderGoodsInfoDO;
import com.imugen.springcloud.mapper.OrderGoodsInfoMapper;
import com.imugen.springcloud.service.IOrderGoodsInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 订单-商品信息 服务实现类
 * </p>
 *
 * @author liuqiang
 * @since 2020-11-25
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class OrderGoodsInfoServiceImpl extends ServiceImpl<OrderGoodsInfoMapper, OrderGoodsInfoDO> implements IOrderGoodsInfoService {

}
