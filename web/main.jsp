<%--
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

    <%
      //模拟数据123
      //用户信息456
      session.setAttribute("userId",2);
      session.setAttribute("userName","张三");
    %>

  <center>

    <h1>欢迎，<%out.println(session.getAttribute("userName"));%>，来到XX网上商城！</h1>
    <h2>
      <a href="goodsselect">商品管理-后台</a>
    </h2>
    <h2>商品列表</h2>
    <div>
      <div style="float: left;margin: 5px">
        <img src="images/timg.jpg" width="200px" height="200px">
        <br>
        <h3 style="color: red">¥68</h3>
        <h4>羽绒服</h4>
        <h4>
          <a href="caradd?goodsId=2&goodsName=羽绒服&goodsPrice=68&goodsImg=timg.jpg&goodsNum=1&goodsStock=700">加入购物车</a>
        </h4>
      </div>
      <div style="float: left;margin: 5px">
        <img src="images/timg.jpg" width="200px" height="200px">
        <br>
        <h3 style="color: red">¥38</h3>
        <h4>牛仔裤</h4>
        <h4>
          <a href="caradd?goodsId=3&goodsName=牛仔裤&goodsPrice=38&goodsImg=timg.jpg&goodsNum=1&goodsStock=100">加入购物车</a>
        </h4>
      </div>
      <div style="float: left;margin: 5px">
        <img src="images/timg.jpg" width="200px" height="200px">
        <br>
        <h3 style="color: red">¥58.99</h3>
        <h4>保暖裤</h4>
        <h4>
          <a href="caradd?goodsId=4&goodsName=保暖裤&goodsPrice=58.99&goodsImg=timg.jpg&goodsNum=1&goodsStock=100">加入购物车</a>
        </h4>
      </div>
      <div style="float: left;margin: 5px">
        <img src="images/timg.jpg" width="200px" height="200px">
        <br>
        <h3 style="color: red">¥3000</h3>
        <h4>裙子</h4>
        <h4>
          <a href="caradd?goodsId=5&goodsName=裙子&goodsPrice=3000&goodsImg=timg.jpg&goodsNum=1&goodsStock=333">加入购物车</a>
        </h4>
      </div>
    </div>

  </center>

  </body>
</html>
