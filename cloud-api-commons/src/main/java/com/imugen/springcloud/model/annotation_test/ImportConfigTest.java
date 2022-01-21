package com.imugen.springcloud.model.annotation_test;

import com.imugen.springcloud.model.annotation_test.CheckTest;
import com.imugen.springcloud.model.annotation_test.ImportConfig;
import com.imugen.springcloud.model.annotation_test.Stu;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Objects;
import java.util.Optional;

/**
 * @author liuqiang
 * @since 2022-01-21
 */
class ImportConfigTest {
    @Test
    public void test7() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ImportConfig.class);
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            if (Objects.equals(name, "com.imugen.springcloud.model.annotation_test.Stu")) {
                String name1 = Class.forName(name).getName();
                String name2 = Class.forName(name).getPackageName();
//                Class<Stu> stu = (Class<Stu>) Class.forName(name);
//                Stu stu1 = stu.newInstance();
                Class<?> aClass = Class.forName(name);
                Stu stu = (Stu) aClass.getDeclaredConstructor().newInstance();
                System.out.println("stu1 = " + stu.getAge());
                System.out.println("stu = " + stu);
                System.out.println("name1 = " + name1);
                System.out.println("name2 = " + name2);

//                CheckTest annotation = aClass.getAnnotation(CheckTest.class);
//                if (annotation != null) {
//                    System.out.println("做权限校验");
//                }
                Optional.ofNullable(aClass.getAnnotation(CheckTest.class)).ifPresentOrElse(clz -> {
                    System.out.println("aa");
                }, () -> System.out.println("fuck"));


                Optional.ofNullable(aClass.getAnnotation(CheckTest.class)).ifPresent(clz -> {
                    System.out.println("做权限校验");
                });
            }
            System.out.println(name);
        }
    }

}