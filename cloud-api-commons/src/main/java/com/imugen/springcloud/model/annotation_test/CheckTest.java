package com.imugen.springcloud.model.annotation_test;

import com.imugen.springcloud.model.valid.Check;
import com.imugen.springcloud.model.valid.CheckValidator;

import javax.validation.Constraint;
import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author liuqiang
 * @since 2022-01-21
 */
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
@Retention(RUNTIME) // 注解保留在程序运行期间，此时可以通过反射获得定义在某个类上的所有注解
@Documented
@Constraint(validatedBy = CheckValidator.class) // 通过使用 validatedBy 来指定与注解关联的验证器
public @interface CheckTest {
}
