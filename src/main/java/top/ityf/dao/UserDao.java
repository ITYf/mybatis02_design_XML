package top.ityf.dao;

import top.ityf.domain.User;
import top.ityf.mybatis.annotations.Select;

import java.util.List;

/**
 * ClassName:UserDao
 * Package: top.ityf
 * Description: 用户的持久层接口
 *
 * @Date: 2019/10/28 10:57
 * @Author: YanFei
 */

public interface UserDao {
    /**
     * 查询所有的操作
     * */
    //这是使用注解的方法
    @Select("select * from user")
    List<User> findAll();
}
