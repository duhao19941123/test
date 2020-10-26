package com.dh.taobao.entity;

import java.io.Serializable;

/**
 * 商品表(TbGoods)实体类
 *
 * @author makejava
 * @since 2020-10-26 22:58:31
 */
public class TbGoods implements Serializable {
    private static final long serialVersionUID = -83557082233303936L;
    /**
    * id
    */
    private String id;
    /**
    * 商品名称
    */
    private String goodsName;
    /**
    * 价格
    */
    private String price;
    /**
    * 描述
    */
    private String describle;
    /**
    * 0=未删除1=删除
    */
    private String isDeleted;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescrible() {
        return describle;
    }

    public void setDescrible(String describle) {
        this.describle = describle;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

}