package com.dh.taobao.service.impl;

import com.dh.taobao.entity.TbGoodsRemain;
import com.dh.taobao.dao.TbGoodsRemainDao;
import com.dh.taobao.service.TbGoodsRemainService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品库存表(TbGoodsRemain)表服务实现类
 *
 * @author makejava
 * @since 2020-10-26 22:58:37
 */
@Service("tbGoodsRemainService")
public class TbGoodsRemainServiceImpl implements TbGoodsRemainService {
    @Resource
    private TbGoodsRemainDao tbGoodsRemainDao;


    @Override
    public TbGoodsRemain getById(String id) {
        return tbGoodsRemainDao.getById(id);
    }
}