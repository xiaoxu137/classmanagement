package com.clsmagent.service;

import com.clsmagent.pojo.login.LoginBody;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface ILoginBodyService {
    String login(LoginBody loginBody);

    LoginBody getLogin(String code);
    Integer getRegisterNum();

    Map getStatusNum();
}
