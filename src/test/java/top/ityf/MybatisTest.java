package top.ityf;


import top.ityf.dao.UserDao;
import top.ityf.domain.User;
import top.ityf.mybatis.io.Resources;
import top.ityf.mybatis.sqlsession.SqlSession;
import top.ityf.mybatis.sqlsession.SqlSessionFactory;
import top.ityf.mybatis.sqlsession.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * ClassName:MybatisTest
 * Package: top.ityf
 * Description: Mybatis的入门案例
 *
 * @Date: 2019/10/28 14:13
 * @Author: YanFei
 */
public class MybatisTest {
    public static void main(String[] args) throws IOException {
        //1、读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");

        //2、创建一个SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);

        //3、使用工厂生产一个SqlSession对象
        SqlSession session = factory.openSession();

        //4、使用SqlSession创建Dao接口的代理对象
        UserDao userDao = session.getMapper(UserDao.class);

        //5、使用代理对象执行方法
        List<User> users = userDao.findAll();
        for (User user : users)
            System.out.println(user);

        //6、释放资源
        session.close();
        in.close();
    }
}
