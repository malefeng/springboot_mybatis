package cn.zhang.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * mybatis逆向工程工具类
 * @author alen
 *
 */
public class MybatisGen {
    public static void generator() throws Exception{
           List<String> warnings = new ArrayList<String>();
           boolean overwrite = true;
           //注意项目根路径不要有中文
           File configFile = new File("E:\\projectCode\\Test\\mybatisGenerator\\src\\main\\resources/generatorConfig.xml");
           ConfigurationParser cp = new ConfigurationParser(warnings);
           Configuration config = cp.parseConfiguration(configFile);
           DefaultShellCallback callback = new DefaultShellCallback(overwrite);
           MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
           myBatisGenerator.generate(null);
           System.out.println("生成成功！");
    }
    public static void main(String[] args) {
        try {
            generator();
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
}
