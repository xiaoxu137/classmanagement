package com.clsmagent.mapper;

import com.clsmagent.pojo.user.LoginInfo;

public interface LoginInfoMapper {
    LoginInfo getLoginInfo(String code);
}
