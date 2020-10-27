package com.dh.taobao.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 商品库存表(TbGoodsRemain)实体类
 *
 * @author makejava
 * @since 2020-10-26 22:58:37
 */
@Getter
@Setter
public class TbGoodsRemain implements Serializable {
    private static final long serialVersionUID = 625704246216052001L;
    /**
    * id
    */
    private String id;
    /**
    * 商品id
    */
    private String goodsId;
    /**
    * 商品尺寸
    */
    private String goodsSize;
    /**
    * 剩余库存
    */
    private Integer goodsNum;


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

    public String getGoodsSize() {
        return goodsSize;
    }

    public void setGoodsSize(String goodsSize) {
        this.goodsSize = goodsSize;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

}