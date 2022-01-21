package com.imugen.springcloud.model.test;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 自定义参数校验
 *
 * @author liuqiang
 * @since 2022-01-18
 */
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
@Retention(RUNTIME) // 注解保留在程序运行期间，此时可以通过反射获得定义在某个类上的所有注解
@Repeatable(Check.List.class)
@Documented
@Constraint(validatedBy = CustomValidator.class) // 通过使用 validatedBy 来指定与注解关联的验证器
public @interface Check {

    // 自定义验证枚举
    CheckEnum value() default CheckEnum.NONE;

    String message() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    /**
     * 使得注解在同一个属性上可以多次使用
     */
    @Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @interface List {
        Check[] value();
    }
}
