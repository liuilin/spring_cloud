package com.imugen.springcloud.model.test;

import lombok.Data;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;
import java.util.regex.Pattern;

/**
 * 自定义验证器
 *
 * @author liuqiang
 */
@Data
public class CustomValidator implements ConstraintValidator<Check, Object> {
    private Check check;

    @Override
    public void initialize(Check constraintAnnotation) {
        this.check = constraintAnnotation;
//        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    /**
     * @param value   页面传入的参数
     * @param context 提供上下文数据和操作的约束验证器
     * @return 是否验证通过
     */
    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        boolean isValid = false;
        CheckEnum checkEnum = this.check.value();
        if (Objects.equals(checkEnum, CheckEnum.PHONE) && Objects.nonNull(value)) {
            String rule = checkEnum.getRule();
            isValid = Pattern.matches(rule, value.toString());
        }
        if (!isValid) {
            context.buildConstraintViolationWithTemplate(checkEnum.getMessage()).addConstraintViolation();
        }
        return isValid;
    }
}
