package top.ityf.mybatis.utils;

import top.ityf.mybatis.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * ClassName:DataSourceUtil
 * Package: top.ityf.mybatis.utils
 * Description: 创建数据源的工具类
 *
 * @Date: 2019/11/17 15:41
 * @Author: YanFei
 */
public class DataSourceUtil {
    /**
     * 用于获取连接
     *
     */
    public static Connection getConnection(Configuration cfg){
        try{
            Class.forName(cfg.getDriver());
            return DriverManager.getConnection(cfg.getUrl(),cfg.getUsername(),cfg.getPassword());
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
