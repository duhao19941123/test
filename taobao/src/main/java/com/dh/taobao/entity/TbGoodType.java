package com.dh.taobao.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 商品类型表(TbGoodType)实体类
 *
 * @author makejava
 * @since 2020-10-26 22:58:23
 */
@Getter
@Setter
public class TbGoodType implements Serializable {
    private static final long serialVersionUID = -41838758778235676L;
    /**
    * id
    */
    private String id;
    /**
    * 等级
    */
    private Integer typeLevel;
    /**
    * 分类名称
    */
    private String typeName;
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

    public Integer getTypeLevel() {
        return typeLevel;
    }

    public void setTypeLevel(Integer typeLevel) {
        this.typeLevel = typeLevel;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

}