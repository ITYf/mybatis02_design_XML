package top.ityf.mybatis.sqlsession;

import top.ityf.mybatis.cfg.Configuration;
import top.ityf.mybatis.sqlsession.defaults.DefaultSqlSessionFactory;
import top.ityf.mybatis.utils.XMLConfigBuilder;

import java.io.InputStream;

/**
 * ClassName:SqlSessionFactoryBuilder
 * Package: top.ityf.mybatis.sqlsession
 * Description: 用于接收SqlMapConfig.xml文件流，创建一个 SqlSessionFactoryBuilder 对象
 *
 * @Date: 2019/10/29 10:11
 * @Author: YanFei
 */
public class SqlSessionFactoryBuilder {
    /**
     * 根据参数的字节输入流来构建一个SqlSessionFactory工厂
     * */
    public static SqlSessionFactory build(InputStream config){
        Configuration cfg = XMLConfigBuilder.loadConfiguration(config);
        return new DefaultSqlSessionFactory(cfg);
    }
}
