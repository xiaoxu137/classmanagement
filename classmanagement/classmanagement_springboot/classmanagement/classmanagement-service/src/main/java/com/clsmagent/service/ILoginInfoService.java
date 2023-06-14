package com.clsmagent.service;

import com.clsmagent.pojo.user.LoginInfo;

public interface ILoginInfoService {
    LoginInfo getLoginInfo(String code);


}
