package com.imugen.springcloud.convert;

import com.imugen.springcloud.model.dto.PaymentDTO;
import com.imugen.springcloud.model.entity.PaymentDO;
import com.imugen.springcloud.model.vo.PaymentVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


/**
 * 订单
 *
 * @author liuqiang
 * @since 2020-12-22
 */
@Mapper
public interface PaymentConvert {

    PaymentConvert INSTANCE = Mappers.getMapper(PaymentConvert.class);

    PaymentVO convert(PaymentDO orderPayInfoDO);

    PaymentDO convert(PaymentDTO orderPayInfoDTO);

}