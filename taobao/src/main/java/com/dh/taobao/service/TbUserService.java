package com.dh.taobao.service;

import com.dh.taobao.entity.TbUser;
import java.util.List;

/**
 * 用户表(TbUser)表服务接口
 *
 * @author makejava
 * @since 2020-10-26 22:58:49
 */
public interface TbUserService {


    /**
     * 通过用户名获取账号
     * @param userName
     * @return
     */
    TbUser getByUserName(String userName);
}