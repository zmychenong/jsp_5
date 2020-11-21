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
    <title>添加商品</title>
  </head>
  <body>
     <center>
        <h1>添加商品</h1>
        <form action="goodsadd" method="post">

            商品名称：<input type="text" name="goodsName"
                     placeholder="请输入商品名称">
          <br> <br>
            商品价格：<input type="text" name="goodsPrice"
                     placeholder="请输入商品价格">
          <br> <br>
            库存数量：<input type="text" name="goodsStock"
                     placeholder="请输入库存数量">
          <br> <br>
          <input type="submit" value="提交">

        </form>
     </center>
  </body>
</html>
