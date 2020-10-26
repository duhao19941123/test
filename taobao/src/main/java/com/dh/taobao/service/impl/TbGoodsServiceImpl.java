package com.dh.taobao.service.impl;

import com.dh.taobao.entity.TbGoods;
import com.dh.taobao.dao.TbGoodsDao;
import com.dh.taobao.service.TbGoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品表(TbGoods)表服务实现类
 *
 * @author makejava
 * @since 2020-10-26 22:58:31
 */
@Service("tbGoodsService")
public class TbGoodsServiceImpl implements TbGoodsService {
    @Resource
    private TbGoodsDao tbGoodsDao;

   
}