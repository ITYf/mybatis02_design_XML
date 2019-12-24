package top.ityf.mybatis.sqlsession.defaults;

import top.ityf.mybatis.cfg.Configuration;
import top.ityf.mybatis.sqlsession.SqlSession;
import top.ityf.mybatis.sqlsession.SqlSessionFactory;

/**
 * ClassName:DefaultSqlSessionFactory
 * Package: top.ityf.mybatis.sqlsession.defaults
 * Description: SqlSessionFactory接口的实现类
 *
 * @Date: 2019/11/17 14:19
 * @Author: YanFei
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {
    private Configuration cfg;

    public DefaultSqlSessionFactory(Configuration cfg) {
        this.cfg = cfg;
    }

    /**
     * 用于创建一个新的操作数据库对象
     */
    public SqlSession openSession() {
        return new DefaultSqlSession(cfg);
    }
}
