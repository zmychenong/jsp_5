package com.sc.dao;

import com.sc.bean.Cars;
import com.sc.bean.Goods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * 类名：GoodsDao
 * 描述：一段话描述类的信息
 * 作者：陈龙
 * 日期：2020/9/12 10:23
 * 版本：V1.0
 */
public class GoodsDao {

    //查询所有商品的方法
    public List<Goods> select(){

        List<Goods> goodsList=new ArrayList<>();
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
            String sql = "select * from goods";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            //4、执行之前，一定要给每个问号好设置值

            //5、通过编译陈述对象执行sql语句
            ResultSet resultSet = preparedStatement.executeQuery();
            //6、处理结果集
            while(resultSet!=null&&resultSet.next()){
                //取出每一行的每列信息封装成购物车对象
                Goods goods=new Goods(resultSet.getInt("goods_id"),
                        resultSet.getString("goods_name"),
                        resultSet.getFloat("goods_price"),
                        resultSet.getString("goods_img"),
                        resultSet.getInt("goods_num"),
                        resultSet.getInt("goods_stock"));
                goodsList.add(goods);
            }
            System.out.println("查询所有商品成功！");
            //7、依次关闭陈述对象、连接对象
            resultSet.close();
            preparedStatement.close();
            connection.close();
            System.out.println("关闭资源成功！");
        }catch (Exception e){
            System.out.println("查询所有商品失败！");
        }
        return goodsList;
    }

    //添加方法
    public void add(Goods goods){
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
            String sql = "insert into goods values(null,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            //4、执行之前，一定要给每个问号好设置值
            preparedStatement.setString(1,goods.getGoodsName());
            preparedStatement.setFloat(2,goods.getGoodsPrice());
            preparedStatement.setString(3,goods.getGoodsImg());
            preparedStatement.setInt(4,goods.getGoodsNum());
            preparedStatement.setInt(5,goods.getGoodsStock());
            //5、通过编译陈述对象执行sql语句
            preparedStatement.executeUpdate();//不再设置sql
            System.out.println("添加商品成功！");
            //6、依次关闭陈述对象、连接对象
            preparedStatement.close();
            connection.close();
            System.out.println("关闭资源成功！");
        }catch (Exception e){
            System.out.println("添加商品失败！");
        }
    }

    //修改方法
    public void update(Goods goods){
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
            String sql = "update goods set goods_name=?,goods_price=?,goods_img=?,goods_num=?,goods_stock=? where goods_id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            //4、执行之前，一定要给每个问号好设置值
            preparedStatement.setString(1,goods.getGoodsName());
            preparedStatement.setFloat(2,goods.getGoodsPrice());
            preparedStatement.setString(3,goods.getGoodsImg());
            preparedStatement.setInt(4,goods.getGoodsNum());
            preparedStatement.setInt(5,goods.getGoodsStock());
            preparedStatement.setInt(6,goods.getGoodsId());
            //5、通过编译陈述对象执行sql语句
            preparedStatement.executeUpdate();//不再设置sql
            System.out.println("修改商品成功！");
            //6、依次关闭陈述对象、连接对象
            preparedStatement.close();
            connection.close();
            System.out.println("关闭资源成功！");
        }catch (Exception e){
            System.out.println("修改商品失败！");
        }
    }

    //删除方法
    public void delete(int goodsId){
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
            String sql = "delete from goods  where goods_id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            //4、执行之前，一定要给每个问号好设置值
            preparedStatement.setInt(1,goodsId);
            //5、通过编译陈述对象执行sql语句
            preparedStatement.executeUpdate();//不再设置sql
            System.out.println("删除商品成功！");
            //6、依次关闭陈述对象、连接对象
            preparedStatement.close();
            connection.close();
            System.out.println("关闭资源成功！");
        }catch (Exception e){
            System.out.println("删除商品失败！");
        }
    }


}
