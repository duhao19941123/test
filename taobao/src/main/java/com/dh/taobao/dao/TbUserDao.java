package com.dh.taobao.dao;

import com.dh.taobao.entity.TbUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 用户表(TbUser)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-26 22:58:49
 */
@Mapper
public interface TbUserDao {


    /**
     * 通过用户名获取账号
     * @param userName
     * @return
     */
    TbUser getByUserName(String userName);
}