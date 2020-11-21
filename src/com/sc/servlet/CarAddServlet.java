package com.sc.servlet;

import com.sc.bean.Cars;
import com.sc.dao.CarDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * 类名：${NAME}
 * 描述：一段话描述类的信息
 * 作者：陈龙
 * 日期：2020/9/11 11:21
 * 版本：V1.0
 */
@WebServlet(urlPatterns = "/caradd")
public class CarAddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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


        HttpSession session = request.getSession();
        int userId=(int)session.getAttribute("userId");
        //2、封装成购物车对象
        Cars cars=new Cars(0,goodsId,goodsName,goodsPrice,goodsImg,goodsNum,userId);

        //3、调用dao类的添加方法，保存到数据库
        CarDao dao=new CarDao();
        dao.add(cars);

        //4、查询该用户的购物车商品进行显示
        List<Cars> carsList = dao.select(userId);

        //5、把购物车集合存入session，重定向到购物车页面显示
        session.setAttribute("carsList",carsList);
        response.sendRedirect("cars.jsp");
    }
}
