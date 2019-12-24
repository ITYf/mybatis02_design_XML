package top.ityf.mybatis.sqlsession;

/**
 * ClassName:SqlSessionFactory
 * Package: top.ityf.mybatis.sqlsession
 * Description:
 *
 * @Date: 2019/10/29 10:14
 * @Author: YanFei
 */
public interface SqlSessionFactory {
    /**
     * 用于打开一个新的 SqlSession 对象
     * */
    SqlSession openSession();
}
