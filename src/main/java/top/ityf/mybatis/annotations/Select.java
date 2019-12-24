package top.ityf.mybatis.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName:Select
 * Package: top.ityf.mybatis.annotations
 * Description: 查询的注解
 *
 * @Date: 2019/11/17 16:41
 * @Author: YanFei
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Select {
    /**
     * 配置sql语句的属性
     * */
    String value();
}
