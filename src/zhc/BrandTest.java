package zhc;


import com.alibaba.druid.pool.DruidDataSourceFactory;
import pojo.Brand;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class BrandTest {

    /*
    *删除信息
    * 1.SQL ：

        delete from tb_brand where id=?;

    * 2.参数 ：所有数据
    * 3.结果 ：boolean
     */

    public static void main(String[] args) throws Exception {
        //接收页面提交的代码
        int id=4;
        String brandName="香飘飘";
        String companyName="香飘飘";
        int orderd=1000;
        String desccription="绕地球八圈";
        int status=1;


        //1.获取connection

        //加载配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/druid.properties"));
        //获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
        //获取数据库连接
        Connection conn = dataSource.getConnection();

        //2.定义SQL语句
        String sql = "delete from tb_brand where id=?;";

        //3.获取pstmt对象
        PreparedStatement pstmt = conn.prepareStatement(sql);

        //4.设置参数
        pstmt.setInt(1,id);

        //5.执行sql
        int count = pstmt.executeUpdate();//影响的行数

        //6.处理结果
        System.out.println(count>0);

        //7.释放资源
        pstmt.close();
        conn.close();
    }
}
