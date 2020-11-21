package com.sc.servlet;

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
 * 日期：2020/9/12 11:22
 * 版本：V1.0
 */
@WebServlet(urlPatterns = "/goodsdelete")
public class GoodsDeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取参数
        String goodsIdStr=request.getParameter("goodsId");
        int goodsId=Integer.parseInt(goodsIdStr);

        //调用删除
        GoodsDao dao=new GoodsDao();
        dao.delete(goodsId);

        //跳转到查询的servlet
        response.sendRedirect("goodsselect");
    }
}
