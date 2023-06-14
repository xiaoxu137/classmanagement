package com.clsmagent.service.impl;

import com.clsmagent.mapper.LoginBodyMapper;
import com.clsmagent.pojo.login.LoginBody;
import com.clsmagent.service.ILoginBodyService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
@PropertySource(value = "classpath:logininfo.properties",encoding = "utf-8")
public class LoginBodySvcImpl implements ILoginBodyService {

    @Resource
    private LoginBodyMapper loginBodyMapper;
    @Value("${LOGIN.NOUSER}")
    private String nouser;
    @Value("${LOGIN.ERRPWD}")
    private String errpwd;
    @Value("${LOGIN.STATUS}")
    private String status;
    @Value("${LOGIN.SUCCESS}")
    private String success;

    /**
     * 根据用户输入的数据查询
     * @param loginBody
     * @return
     */
    public String login(LoginBody loginBody) {
        LoginBody res = loginBodyMapper.getLoginBody(loginBody);
        if(res==null){
            return nouser;
        }
        if(!res.getPassword().equals(loginBody.getPassword())){
            return errpwd;
        }
        if(res.getStatus()!=1){
            return status;
        }
        return success;
    }

    public LoginBody getLogin(String code){
        return loginBodyMapper.getLogin(code);
    }

    public Integer getRegisterNum(){
        return loginBodyMapper.getRegisterNum();
    }

    public Map getStatusNum() {
        int qua = loginBodyMapper.getStatusNum(1);
        int disqua = loginBodyMapper.getStatusNum(0);
        Map map = new HashMap();
        map.put("qua",qua);
        map.put("disqua",disqua);
        return map;
    }
}
