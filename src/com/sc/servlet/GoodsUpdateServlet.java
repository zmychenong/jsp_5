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
 * 日期：2020/9/12 11:49
 * 版本：V1.0
 */
@WebServlet(urlPatterns = "/goodsupdate")
public class GoodsUpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1、获取请求的参数
        request.setCharacterEncoding("utf-8");
        String goodsIdStr=request.getParameter("goodsId");
        int goodsId=Integer.parseInt(goodsIdStr);
        String goodsName=request.getParameter("goodsName");
        String goodsPriceStr=request.getParameter("goodsPrice");
        float goodsPrice=Float.parseFloat(goodsPriceStr);
        String goodsImg=request.getParameter("goodsImg");
        String goodsNumStr=request.getParameter("goodsNum");
        int goodsNum=Integer.parseInt(goodsNumStr);
        String goodsStockStr=request.getParameter("goodsStock");
        int goodsStock=Integer.parseInt(goodsStockStr);

        //封装成商品对象
        Goods goods=new Goods(goodsId,goodsName,goodsPrice,goodsImg,goodsNum,goodsStock);

        //调用dao的修改方法
        GoodsDao dao=new GoodsDao();
        dao.update(goods);

        //跳转到查询的servlet
        response.sendRedirect("goodsselect");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
