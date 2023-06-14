package com.clsmagent.service.impl;

import com.clsmagent.mapper.LoginInfoMapper;
import com.clsmagent.pojo.user.LoginInfo;
import com.clsmagent.service.ILoginInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginInfoSvcImpl implements ILoginInfoService {

    @Resource
    private LoginInfoMapper loginInfoMapper;


    /**
     * 返回登录用户的信息
     * @param code
     * @return
     */
    public LoginInfo getLoginInfo(String code) {
        LoginInfo loginInfo = loginInfoMapper.getLoginInfo(code);

        return loginInfo;
    }
}
