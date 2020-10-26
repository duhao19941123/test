package com.dh.taobao.service.impl;

import com.dh.taobao.entity.SysMenu;
import com.dh.taobao.dao.SysMenuDao;
import com.dh.taobao.service.SysMenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 菜单表(SysMenu)表服务实现类
 *
 * @author makejava
 * @since 2020-10-26 22:57:58
 */
@Service("sysMenuService")
public class SysMenuServiceImpl implements SysMenuService {
    @Resource
    private SysMenuDao sysMenuDao;

   
}