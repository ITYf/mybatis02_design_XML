package top.ityf.mybatis.io;

import java.io.InputStream;

/**
 * ClassName:Resources
 * Package: top.ityf.mybatis.io
 * Description: 使用类加载器读取配置文件的类
 *
 * @Date: 2019/10/29 10:06
 * @Author: YanFei
 */
public class Resources {
    /**
     * 根据传入的参数，获取一个字节输入流
     * 第一步、获取字节码
     * 第二步、获取类加载器
     * 第三步、获取字节输入流
     * */
    public static InputStream getResourceAsStream(String filePath){
        return Resources.class.getClassLoader().getResourceAsStream(filePath);
    }
}
