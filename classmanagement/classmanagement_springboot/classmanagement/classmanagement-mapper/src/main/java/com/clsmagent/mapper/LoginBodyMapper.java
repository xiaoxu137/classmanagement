package com.clsmagent.mapper;

import com.clsmagent.pojo.login.LoginBody;
import org.apache.ibatis.annotations.Param;


public interface LoginBodyMapper {

    LoginBody getLoginBody(LoginBody loginBody);

    LoginBody getLogin(String code);

    Integer getRegisterNum();

    Integer getStatusNum(@Param("status") int status);
}
