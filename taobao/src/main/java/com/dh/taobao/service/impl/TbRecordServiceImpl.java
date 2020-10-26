package com.dh.taobao.service.impl;

import com.dh.taobao.entity.TbRecord;
import com.dh.taobao.dao.TbRecordDao;
import com.dh.taobao.service.TbRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 购买记录表(TbRecord)表服务实现类
 *
 * @author makejava
 * @since 2020-10-26 22:58:43
 */
@Service("tbRecordService")
public class TbRecordServiceImpl implements TbRecordService {
    @Resource
    private TbRecordDao tbRecordDao;

   
}