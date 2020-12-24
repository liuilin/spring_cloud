package com.imugen.springcloud.convert;

import com.imugen.springcloud.model.dto.OrderPayInfoDTO;
import com.imugen.springcloud.model.entity.OrderPayInfoDO;
import com.imugen.springcloud.model.vo.OrderPayInfoVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


/**
 * 订单
 *
 * @author liuqiang
 * @since 2020-12-22
 */
@Mapper
public interface OrderPayInfoConvert {

    OrderPayInfoConvert INSTANCE = Mappers.getMapper(OrderPayInfoConvert.class);

    OrderPayInfoVO convert(OrderPayInfoDO orderPayInfoDO);
    OrderPayInfoDO convert(OrderPayInfoDTO orderPayInfoDTO);

}