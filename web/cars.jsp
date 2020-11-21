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

    <h1>欢迎，<%out.println(session.getAttribute("userName"));%>，来到XX网上商城！</h1>
    <h2>我的购物车</h2>
    <h3>
      <a href="main.jsp">继续购物</a>
    </h3>
    <table border="1">
      <tr>
        <th>编号</th>
        <th>商品编号</th>
        <th>商品图片</th>
        <th>商品名称</th>
        <th>商品价格</th>
        <th>购买数量</th>
        <th>操作</th>
      </tr>
      <%
        List<Cars> carsList = (List<Cars>)session.getAttribute("carsList");
        for (int i = 0; i < carsList.size(); i++) {
          Cars cars = carsList.get(i);
          out.print("<tr>");
          out.print("<td>"+cars.getCarsId()+"</td>");
          out.print("<td>"+cars.getGoodsId()+"</td>");

          out.print("<td><img src='images/timg.jpg' width='100px' height='80px'></td>");
          out.print("<td>"+cars.getGoodsName()+"</td>");
          out.print("<td>"+cars.getGoodsPrice()+"</td>");
          out.print("<td>"+cars.getGoodsNum()+"</td>");
          out.print("<td></td>");
          out.print("</tr>");
        }
      %>
    </table>

  </center>

  </body>
</html>
