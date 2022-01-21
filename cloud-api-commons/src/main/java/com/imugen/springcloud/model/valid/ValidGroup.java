package com.imugen.springcloud.model.valid;

import javax.validation.groups.Default;

/**
 * 分组接口，用于 @Validated 注解里面的 groups，继承 Default 接口后，不在分组内的字段也会进行校验
 * 默认其他注解都属于 Default.class 分组，这一点在 javax.validation.groups.Default 注释中有说明
 * 如果 ValidGroup 没有继承 Default 分组，那在代码属性上就需要加上 @Validated ({xxx, Default.class} 才能让不在分组内的字段校验生效。
 *
 * @author liuqiang
 */
public interface ValidGroup extends Default {

    interface Crud extends ValidGroup {
        interface Create extends Crud {
        }

        interface Read extends Crud {

        }

        interface Update extends Crud {
        }

        interface Delete extends Crud {

        }
    }

}