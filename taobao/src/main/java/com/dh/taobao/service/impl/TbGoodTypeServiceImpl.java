package com.dh.taobao.service.impl;

import com.dh.taobao.entity.TbGoodType;
import com.dh.taobao.dao.TbGoodTypeDao;
import com.dh.taobao.service.TbGoodTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品类型表(TbGoodType)表服务实现类
 *
 * @author makejava
 * @since 2020-10-26 22:58:23
 */
@Service("tbGoodTypeService")
public class TbGoodTypeServiceImpl implements TbGoodTypeService {
    @Resource
    private TbGoodTypeDao tbGoodTypeDao;

   
}