package com.dh.taobao.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Max;


/**
 * @author DH
 */
public class UserParam {
    public @interface login{};

    /**
     * 用户名
     */
    @NotBlank(message = "用户名不能为空" , groups = {UserParam.login.class})
    @Length(max = 5 , message ="用户名长度不能超过5个字符" ,groups = {UserParam.login.class})
    private String userName;
    /**
     * 密码
     */
    @NotBlank(message = "密码不能为空" , groups = {UserParam.login.class})
    @Length(max = 10 , message = "密码长度不能超过10个字符",  groups = {UserParam.login.class})
    private String passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
