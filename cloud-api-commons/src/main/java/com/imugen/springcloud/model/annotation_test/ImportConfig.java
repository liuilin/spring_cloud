package com.imugen.springcloud.model.annotation_test;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author liuqiang
 * @since 2022-01-21
 */
@Configuration
@Import(Stu.class)
public class ImportConfig {

}
