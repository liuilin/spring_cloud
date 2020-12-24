package com.imugen.springcloud.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author liuqiang
 * @since 2020-12-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="PaymentDO传输对象")
public class PaymentDTO{
    @ApiModelProperty(value = "自增id")
    private Long id;

    @ApiModelProperty(value = "")
    private String serial;


}
