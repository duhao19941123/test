package com.dh.taobao.service;

import com.dh.taobao.entity.TbGoodsRemain;
import java.util.List;

/**
 * 商品库存表(TbGoodsRemain)表服务接口
 *
 * @author makejava
 * @since 2020-10-26 22:58:37
 */
public interface TbGoodsRemainService {


    TbGoodsRemain getById(String id);
}