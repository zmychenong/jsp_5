package com.sc.bean;

/**
 * 类名：Goods
 * 描述：一段话描述类的信息
 * 作者：陈龙
 * 日期：2020/9/11 10:20
 * 版本：V1.0
 */
public class Goods {

    //定义属性
    private int goodsId;//商品编号
    private String goodsName;//商品名称
    private float goodsPrice;//商品价格
    private String goodsImg;//商品图片
    private int goodsNum;//购买数量，默认1件
    private int goodsStock;//库存数量


    //无参构造函数
    public Goods() {
    }

    //全参构造函数
    public Goods(int goodsId, String goodsName, float goodsPrice, String goodsImg, int goodsNum, int goodsStock) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.goodsImg = goodsImg;
        this.goodsNum = goodsNum;
        this.goodsStock = goodsStock;
    }

    //set/get方法

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

    public int getGoodsStock() {
        return goodsStock;
    }

    public void setGoodsStock(int goodsStock) {
        this.goodsStock = goodsStock;
    }

    //toString
    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", goodsImg='" + goodsImg + '\'' +
                ", goodsNum=" + goodsNum +
                ", goodsStock=" + goodsStock +
                '}';
    }
}
