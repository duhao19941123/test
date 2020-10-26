package com.dh.taobao.service.impl;

import com.dh.taobao.dao.TbEvaluationDao;
import com.dh.taobao.service.TbEvaluationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 评价表(TbEvaluation)表服务实现类
 *
 * @author makejava
 * @since 2020-10-26 23:05:36
 */
@Service("tbEvaluationService")
public class TbEvaluationServiceImpl implements TbEvaluationService {
    @Resource
    private TbEvaluationDao tbEvaluationDao;

   
}