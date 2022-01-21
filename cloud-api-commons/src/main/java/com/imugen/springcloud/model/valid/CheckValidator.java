package com.imugen.springcloud.model.valid;

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
public class CheckValidator implements ConstraintValidator<Check, Object> {
    private Check check;
    // 是否强制校验
    private boolean required;

    @Override
    public void initialize(Check constraintAnnotation) {
        this.check = constraintAnnotation;
        this.required = constraintAnnotation.required();
//        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    /**
     * @param value   页面传入的参数
     * @param cxt context 提供上下文数据和操作的约束验证器
     * @return 是否校验通过
     */
    @Override
    public boolean isValid(Object value, ConstraintValidatorContext cxt) {
        // 禁止默认的空消息返回
        cxt.disableDefaultConstraintViolation();

        // 是否校验通过
        boolean valid = true;
        if (required) {
            CheckEnum checkEnum = this.check.value();
            if (Objects.nonNull(value)) {
                if (Objects.equals(checkEnum, CheckEnum.PHONE)) {
                    String rule = checkEnum.getRule();
                    valid = Pattern.matches(rule, value.toString());
                } else if (Objects.equals(checkEnum, CheckEnum.IP)) {
                    String rule = checkEnum.getRule();
                    valid = Pattern.matches(rule, value.toString());
                }
            } else { // 传入参数为空
                cxt.buildConstraintViolationWithTemplate(checkEnum.getCode() + " 不能为空").addConstraintViolation();
                return false;
            }
            // 没校验通过，提示对应的错误
            if (!valid) {
                cxt.buildConstraintViolationWithTemplate(checkEnum.getLabel() + checkEnum.getMessage()).addConstraintViolation();
            }
        }
        return valid;
    }
}
