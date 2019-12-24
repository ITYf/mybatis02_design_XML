package top.ityf.mybatis.sqlsession;

/**
 * ClassName:SqlSession
 * Package: top.ityf.mybatis.sqlsession
 * Description: 自定义mybatis中和数据库交互的核心类，它里面可以创建dao接口的代理对象
 *
 * @Date: 2019/10/29 10:16
 * @Author: YanFei
 */
public interface SqlSession {

    /**
     * 根据参数创建一个代理对象
     * @param daoInterfaceClass dao的接口字节码
     * */
    <T> T getMapper(Class<T> daoInterfaceClass);//注意，泛型需要在返回值之前先声明

    /**
     * 释放资源
     * */
    void close();
}
