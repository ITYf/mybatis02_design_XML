package top.ityf.mybatis.cfg;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:Configuration
 * Package: top.ityf.mybatis.cfg
 * Description: 自定义 Mybatis 的配置类
 *
 * @Date: 2019/11/17 12:51
 * @Author: YanFei
 */
public class Configuration {
    private String driver;
    private String url;
    private String username;

    private Map<String, Mapper> mappers = new HashMap<String, Mapper>();

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public Map<String, Mapper> getMappers() {
        return mappers;
    }

    public void setMappers(Map<String, Mapper> mappers) {
        this.mappers.putAll(mappers);
    }
}
