package com.dh.taobao.dao;

import com.dh.taobao.entity.TbGoodsRemain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 商品库存表(TbGoodsRemain)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-26 22:58:37
 */
@Mapper
public interface TbGoodsRemainDao {


    TbGoodsRemain getById(String id);
}