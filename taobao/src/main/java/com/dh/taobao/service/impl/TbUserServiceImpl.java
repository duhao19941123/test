package com.dh.taobao.service.impl;

import com.dh.taobao.entity.TbUser;
import com.dh.taobao.dao.TbUserDao;
import com.dh.taobao.service.TbUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户表(TbUser)表服务实现类
 *
 * @author makejava
 * @since 2020-10-26 22:58:49
 */
@Service("tbUserService")
public class TbUserServiceImpl implements TbUserService {
    @Resource
    private TbUserDao tbUserDao;

    @Override
    public TbUser getByUserName(String userName) {
        return tbUserDao.getByUserName(userName);
    }
}