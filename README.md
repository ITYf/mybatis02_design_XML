### **基于XML实现自定义mybatis**
&emsp;&emsp;本项目演示的就是使用XML的方式自定义mybatis。整个过程中，最关键的两步就是，创建代理对象，以及实现查询所有的操作。至于解析XML使用的技术可以忽略。
### **基于注解实现自定义mybatis**
##### **步骤**
* 在SqlMapConfig.xml中的mapper配置处，使用class属性指定dao接口的全限定类名```top.ityf.dao.UserDao```
* 在dao接口的方法上使用@Select注解 ，并且指定SQL语句。```@Select("select * from user")```
* 在mybatis包中的annotation包下创建注解，以本例为例，创建Select注解

~~~java
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
~~~

##### **两种方式的区别**
&emsp;&emsp;两种方式的区别就是在于XMLConfigBuilder类中，第二种方法巧妙地利用泛型获取到了返回的实体类的类型。这个文件的作用就是：
* 把SQL语句和实体类的全限定类名封装到mapper中
* 读取配置信息，把配置信息封装到Configuration中（包括数据库的连接信息和mapper）
