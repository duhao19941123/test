package com.dh.taobao.controller;

import com.alibaba.fastjson.JSONObject;
import com.dh.taobao.constant.RedisKey;
import com.dh.taobao.constant.ResponseData;
import com.dh.taobao.constant.ServiceException;
import com.dh.taobao.constant.SuccessResponseData;
import com.dh.taobao.dto.UserParam;
import com.dh.taobao.entity.TbUser;
import com.dh.taobao.exception.UserException;
import com.dh.taobao.service.TbUserService;
import com.dh.taobao.util.PasswordUtil;
import com.dh.taobao.util.RedisUtils;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户表(TbUser)表控制层
 *
 * @author makejava
 * @since 2020-10-26 22:58:49
 */
@RestController
@RequestMapping("tbUser")
public class TbUserController {

    @Autowired
    private TbUserService tbUserService;

    @Autowired
    private RedisUtils redisUtils;

    @ApiOperation(value = "登陆" , response = SuccessResponseData.class
    )
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userName",value = "用户名" , required = false,dataType = "String"),
            @ApiImplicitParam(name = "passWord",value = "密码" , required = false,dataType = "String")
    })
    @PostMapping("login")
    public ResponseData login(@RequestBody @Validated({UserParam.login.class})  UserParam userParam){
        TbUser tbUser = tbUserService.getByUserName(userParam.getUserName());
        if(ObjectUtils.isEmpty(tbUser)){
            throw new ServiceException(UserException.NOT_USER);
        }
        String passWord = PasswordUtil.encrypt( userParam.getUserName(), userParam.getPassWord(), PasswordUtil.getStaticSalt());
        if(!passWord.equals(tbUser.getPassWord())){
            throw new ServiceException(UserException.ERR_PWD);
        }
        String key = RedisKey.FRONT_LOGIN_USER_KEY + tbUser.getId();
        String userString = JSONObject.toJSONString(tbUser);
        redisUtils.set(key , userString);
        System.out.println(key);
        return new SuccessResponseData(key);
    }


}