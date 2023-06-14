package com.clsmagent.web;

import com.clsmagent.pojo.login.LoginBody;
import com.clsmagent.pojo.user.LoginInfo;
import com.clsmagent.service.ILoginBodyService;
import com.clsmagent.service.ILoginInfoService;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
public class LoginController {

    /**
     * 登录信息
     */
    @Resource
    private ILoginBodyService loginBodyService;

    /**
     * 登陆成功后将信息存储到session
     */
    @Resource
    private ILoginInfoService loginInfoService;

    @RequestMapping("/login")
    public String login(@RequestBody LoginBody loginBody, HttpServletRequest request){
        HttpSession session = request.getSession();
        String loginBody1 = loginBodyService.login(loginBody);
        if(loginBody1.equals("登录成功")){
            LoginInfo user = loginInfoService.getLoginInfo(loginBody.getCode());
            session.setAttribute("user",user);
        }
        return loginBody1;
    }

    @GetMapping("/getRegNum")
    public Integer getRegisterNum(){
        return loginBodyService.getRegisterNum();
    }

    @GetMapping("/StatusNum")
    public Map getStatusNum(){
        return loginBodyService.getStatusNum();
    }


}
