package top.ityf.mybatis.cfg;

/**
 * ClassName:Mapper
 * Package: top.ityf.mybatis.cfg
 * Description: 用于封装执行的sql语句和结果类型的全限定类名
 *
 * @Date: 2019/11/17 13:07
 * @Author: YanFei
 */
public class Mapper {
    //定义sql
    private String queryString;
    //定义实体类的全限定类名
    private String resultType;

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }
    public void Mapper(){}
}
