<%@ page import="java.util.List" %>
<%@ page import="com.sc.bean.Goods" %>
<%@ page import="com.sc.bean.Cars" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/9/11
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>


  <center>

    <h1>欢迎来到XX网上商城后台管理系统！</h1>
    <h2>商品管理</h2>
    <h3>
      <a href="goodsadd.jsp">添加商品</a>
    </h3>
    <table border="1">
      <tr>
        <th>商品编号</th>
        <th>商品图片</th>
        <th>商品名称</th>
        <th>商品价格</th>
        <th>购买数量</th>
        <th>库存数量</th>
        <th>操作</th>
      </tr>
      <%
        List<Goods> goodsList = (List<Goods>)request.getAttribute("goodsList");
        for (int i = 0; i < goodsList.size(); i++) {
          Goods goods = goodsList.get(i);
          out.print("<tr>");
          out.print("<td>"+goods.getGoodsId()+"</td>");
          out.print("<td><img src='images/timg.jpg' width='100px' height='80px'></td>");
          out.print("<td>"+goods.getGoodsName()+"</td>");
          out.print("<td>"+goods.getGoodsPrice()+"</td>");
          out.print("<td>"+goods.getGoodsNum()+"</td>");
          out.print("<td>"+goods.getGoodsStock()+"</td>");
          out.print("<td>");
          String params="goodsId="+goods.getGoodsId()+
                  "&goodsName="+goods.getGoodsName()+
                  "&goodsPrice="+goods.getGoodsPrice()+
                  "&goodsNum="+goods.getGoodsNum()+
                  "&goodsStock="+goods.getGoodsStock()+
                  "&goodsImg="+goods.getGoodsImg();
          String url1="<a href='goodsupdate.jsp?"+params+"'>修改</a>&nbsp;/&nbsp;";
          out.print(url1);
          String url2="<a href='goodsdelete?goodsId="+goods.getGoodsId()+"'>删除</a>";
          out.print(url2);
          out.print("</td>");
          out.print("</tr>");
        }
      %>
    </table>

  </center>

  </body>
</html>
