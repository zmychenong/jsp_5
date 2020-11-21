package com.sc.servlet;

import com.sc.bean.Goods;
import com.sc.dao.GoodsDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 类名：${NAME}
 * 描述：一段话描述类的信息
 * 作者：陈龙
 * 日期：2020/9/12 11:30
 * 版本：V1.0
 */
@WebServlet(urlPatterns = "/goodsadd")
public class GoodsAddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       //获取表单提交过来的参数
        request.setCharacterEncoding("utf-8");
        String goodsName=request.getParameter("goodsName");
        String goodsPriceStr=request.getParameter("goodsPrice");
        float goodsPrice=Float.parseFloat(goodsPriceStr);
        String goodsStockStr=request.getParameter("goodsStock");
        int goodsStock=Integer.parseInt(goodsStockStr);

        //封装成商品对象
        Goods goods=new Goods(0,goodsName,goodsPrice,null,1,goodsStock);

        //调用dao的添加方法
        GoodsDao dao=new GoodsDao();
        dao.add(goods);

        //跳转到查询的servlet
        response.sendRedirect("goodsselect");
}

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
