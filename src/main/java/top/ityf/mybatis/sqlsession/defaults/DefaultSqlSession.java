package top.ityf.mybatis.sqlsession.defaults;

import top.ityf.mybatis.cfg.Configuration;
import top.ityf.mybatis.sqlsession.SqlSession;
import top.ityf.mybatis.sqlsession.proxy.MapperProxy;
import top.ityf.mybatis.utils.DataSourceUtil;

import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * ClassName:DefaultSqlSession
 * Package: top.ityf.mybatis.sqlsession.defaults
 * Description: DefaultSqlSession 接口的实现类
 *
 * @Date: 2019/11/17 14:22
 * @Author: YanFei
 */
public class DefaultSqlSession implements SqlSession {
    private Configuration cfg;
    private Connection connection;

    public DefaultSqlSession(Configuration cfg) {
        this.cfg = cfg;
        this.connection = DataSourceUtil.getConnection(cfg);
    }

    /**
     * 用于创建代理对象
     */
    public <T> T getMapper(Class<T> daoInterfaceClass) {
        return (T) Proxy.newProxyInstance(daoInterfaceClass.getClassLoader(),
                new Class[]{daoInterfaceClass}, new MapperProxy(cfg.getMappers(), connection));
    }

    /**
     * 用于释放资源
     */
    public void close() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
