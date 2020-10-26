package com.dh.taobao.entity;

import java.io.Serializable;

/**
 * 购买记录表(TbRecord)实体类
 *
 * @author makejava
 * @since 2020-10-26 22:58:43
 */
public class TbRecord implements Serializable {
    private static final long serialVersionUID = -91545834926899820L;
    
    private String id;
    /**
    * 商品id
    */
    private String goodsId;
    /**
    * 用户id
    */
    private String userId;
    /**
    * 1=购物车2=待发货3=待评价
    */
    private Integer goodsStatus;
    /**
    * 0=未删除1=删除
    */
    private Integer isDeleted;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

}