package com.sc.servlet;

import com.sc.bean.Goods;
import com.sc.dao.GoodsDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 类名：${NAME}
 * 描述：一段话描述类的信息
 * 作者：陈龙
 * 日期：2020/9/12 11:08
 * 版本：V1.0
 */
@WebServlet(urlPatterns = "/goodsselect")
public class GoodsSelectServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("查询商品");
        GoodsDao dao=new GoodsDao();
        List<Goods> goodsList = dao.select();

        //把商品集合存入request对象
        request.setAttribute("goodsList",goodsList);
        //转发
        request.getRequestDispatcher("goodsselect.jsp").forward(request,response);
    }
}
