package com.dh.taobao.entity;

import java.io.Serializable;

/**
 * 评价表(TbEvaluation)实体类
 *
 * @author makejava
 * @since 2020-10-26 23:05:34
 */
public class TbEvaluation implements Serializable {
    private static final long serialVersionUID = -20632790895576731L;
    
    private String id;
    /**
    * 购买记录id
    */
    private String buyId;
    /**
    * 商品评价
    */
    private String goodsNote;
    /**
    * 物流评价
    */
    private String transportNote;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBuyId() {
        return buyId;
    }

    public void setBuyId(String buyId) {
        this.buyId = buyId;
    }

    public String getGoodsNote() {
        return goodsNote;
    }

    public void setGoodsNote(String goodsNote) {
        this.goodsNote = goodsNote;
    }

    public String getTransportNote() {
        return transportNote;
    }

    public void setTransportNote(String transportNote) {
        this.transportNote = transportNote;
    }

}