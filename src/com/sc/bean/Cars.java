package com.sc.bean;

/**
 * 类名：Cars
 * 描述：一段话描述类的信息
 * 作者：陈龙
 * 日期：2020/9/11 10:31
 * 版本：V1.0
 */
public class Cars {

    private int carsId;//购物车编号
    private int goodsId;//商品编号
    private String goodsName;//商品名称
    private float goodsPrice;//商品价格
    private String goodsImg;//商品图片
    private int goodsNum;//购买数量，默认1件
    private int userId;//用户编号

    public Cars() {
    }

    public Cars(int carsId, int goodsId, String goodsName, float goodsPrice, String goodsImg, int goodsNum, int userId) {
        this.carsId = carsId;
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.goodsImg = goodsImg;
        this.goodsNum = goodsNum;
        this.userId = userId;
    }

    public int getCarsId() {
        return carsId;
    }

    public void setCarsId(int carsId) {
        this.carsId = carsId;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public float getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(float goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public int getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(int goodsNum) {
        this.goodsNum = goodsNum;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "carsId=" + carsId +
                ", goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", goodsImg='" + goodsImg + '\'' +
                ", goodsNum=" + goodsNum +
                ", userId=" + userId +
                '}';
    }
}
