package com.imugen.springcloud.model.annotation_test;

import com.imugen.springcloud.model.valid.Check;
import com.imugen.springcloud.model.valid.CheckEnum;
import lombok.Getter;

/**
 * @author liuqiang
 * @since 2022-01-21
 */
@Getter
//@CheckTest
public class Stu {
    public static void init() {
        System.out.println("fuck");
    }

    private int age = 1;
}
