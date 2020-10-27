package com.dh.taobao.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 菜单表(SysMenu)实体类
 *
 * @author makejava
 * @since 2020-10-26 22:57:56
 */
@Getter
@Setter
public class SysMenu implements Serializable {
    private static final long serialVersionUID = -40166165915778763L;
    /**
    * id
    */
    private String id;
    /**
    * 菜单名称
    */
    private String menuName;
    /**
    * 排序
    */
    private Integer sort;
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

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

}