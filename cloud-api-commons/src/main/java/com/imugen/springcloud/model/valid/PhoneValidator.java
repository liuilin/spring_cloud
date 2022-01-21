package com.imugen.springcloud.model.valid;

import lombok.Data;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;
import java.util.regex.Pattern;

/**
 * 手机号校验器
 *
 * @author liuqiang
 */
@Data
public class PhoneValidator implements ConstraintValidator<Phone, Object> {

    @Override
    public void initialize(Phone constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    /**
     * @param value   页面传入的参数
     * @param context 提供上下文数据和操作的约束验证器
     * @return 是否验证通过
     */
    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        if (Objects.nonNull(value)) {
            return Pattern.matches("^1(3|4|5|6|7|8|9)\\d{9}$", value.toString());
        }
        return false;
    }
}
