<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/9/8
  Time: 9:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>修改商品</title>
  </head>
  <body>
     <%
         request.setCharacterEncoding("utf-8");
         String goodsId=request.getParameter("goodsId");
         String goodsName=request.getParameter("goodsName");
         String goodsPrice=request.getParameter("goodsPrice");
         String goodsNum=request.getParameter("goodsNum");
         String goodsStock=request.getParameter("goodsStock");
         String goodsImg=request.getParameter("goodsImg");
     %>

     <center>
        <h1>修改商品</h1>
        <form action="goodsupdate" method="post">

            <input type="hidden" name="goodsId" value="<%out.print(goodsId);%>">
            <input type="hidden" name="goodsNum" value="<%out.print(goodsNum);%>">
            <input type="hidden" name="goodsImg" value="<%out.print(goodsImg);%>">

            商品名称：<input type="text" name="goodsName"
                     placeholder="请输入商品名称" value="<%out.print(goodsName);%>">
          <br> <br>
            商品价格：<input type="text" name="goodsPrice"
                     placeholder="请输入商品价格" value="<%out.print(goodsPrice);%>">
          <br> <br>
            库存数量：<input type="text" name="goodsStock"
                     placeholder="请输入库存数量" value="<%out.print(goodsStock);%>">
          <br> <br>
          <input type="submit" value="提交">

        </form>
     </center>
  </body>
</html>
