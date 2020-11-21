package com.sc.dao;

import com.sc.bean.Cars;
import com.sc.bean.Goods;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 类名：CarDao
 * 描述：一段话描述类的信息
 * 作者：陈龙
 * 日期：2020/9/11 11:34
 * 版本：V1.0
 */
public class CarDao {

    //添加方法
    public void add(Cars cars){
        try {
            //1、注册Mysql数据库驱动
            Class.forName("com.mysql.jdbc.Driver");//名称不需要记住，导入后复制
            System.out.println("注册Mysql数据库驱动成功");
            //主要协议:次要协议://主机名称:端口号/数据库名称
            String url = "jdbc:mysql://localhost:3306/db202001";
            String username = "root";
            String password = "root";
            //2、通过驱动管理器获取连接对象，需传入url地址，用户名和密码
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("连接Mysql数据库成功");
            //3、通过连接对象创建预编译陈述对象
            String sql = "insert into cars values(null,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            //4、执行之前，一定要给每个问号好设置值
            preparedStatement.setInt(1,cars.getGoodsId());
            preparedStatement.setString(2,cars.getGoodsName());
            preparedStatement.setFloat(3,cars.getGoodsPrice());
            preparedStatement.setString(4,cars.getGoodsImg());
            preparedStatement.setInt(5,cars.getGoodsNum());
            preparedStatement.setInt(6,cars.getUserId());
            //5、通过编译陈述对象执行sql语句
            preparedStatement.executeUpdate();//不再设置sql
            System.out.println("添加购物车成功！");
            //6、依次关闭陈述对象、连接对象
            preparedStatement.close();
            connection.close();
            System.out.println("关闭资源成功！");
        }catch (Exception e){
            System.out.println("添加购物车失败！");
        }
    }

    //通过用户id查询购物车商品的方法
    public List<Cars> select(int userId){

        List<Cars> carsList=new ArrayList<>();
        try {
            //1、注册Mysql数据库驱动
            Class.forName("com.mysql.jdbc.Driver");//名称不需要记住，导入后复制
            System.out.println("注册Mysql数据库驱动成功");
            //主要协议:次要协议://主机名称:端口号/数据库名称
            String url = "jdbc:mysql://localhost:3306/db202001";
            String username = "root";
            String password = "root";
            //2、通过驱动管理器获取连接对象，需传入url地址，用户名和密码
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("连接Mysql数据库成功");
            //3、通过连接对象创建预编译陈述对象
            String sql = "select * from cars where user_id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            //4、执行之前，一定要给每个问号好设置值
            preparedStatement.setInt(1,userId);
            //5、通过编译陈述对象执行sql语句
            ResultSet resultSet = preparedStatement.executeQuery();
            //6、处理结果集
            while(resultSet!=null&&resultSet.next()){
                //取出每一行的每列信息封装成购物车对象
                Cars cars=new Cars(resultSet.getInt("cars_id"),
                        resultSet.getInt("goods_id"),
                        resultSet.getString("goods_name"),
                        resultSet.getFloat("goods_price"),
                        resultSet.getString("goods_img"),
                        resultSet.getInt("goods_num"),
                        resultSet.getInt("user_id"));
                carsList.add(cars);//把每个购物车对象装进集合
            }
            System.out.println("通过用户id查询购物车商品成功！");
            //7、依次关闭陈述对象、连接对象
            resultSet.close();
            preparedStatement.close();
            connection.close();
            System.out.println("关闭资源成功！");
        }catch (Exception e){
            System.out.println("通过用户id查询购物车商品失败！");
        }
        return carsList;
    }
}
