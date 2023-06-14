package com.clsmagent.service.impl;

import com.clsmagent.mapper.ShowStuInfoMapper;
import com.clsmagent.pojo.info.ShowStuInfo;
import com.clsmagent.pojo.login.LoginBody;
import com.clsmagent.pojo.user.LoginInfo;
import com.clsmagent.service.ILoginBodyService;
import com.clsmagent.service.ILoginInfoService;
import com.clsmagent.service.IShowStuInfoService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@PropertySource(value = "classpath:logininfo.properties",encoding = "utf-8")
@Service
public class ShowStuInfoImpl implements IShowStuInfoService {

    @Value("${ADD.SUCCESS}")
    private String success;
    @Value("${ADD.ERROR}")
    private String error;
    @Value("${ADD.NOREG}")
    private String noregister;
    @Value("${DEL.NOSTU}")
    private String nostu;
    @Value("${DEL.ERROR}")
    private String delerr;
    @Value("${DEL.SUCCESS}")
    private String delsuc;
    @Value("${UP.ERR}")
    private String uperr;
    @Value("${UP.SUCCESS}")
    private String upsuc;
    @Value("${ADD.HAVEUSER}")
    private String havuser;

    @Resource
    private ShowStuInfoMapper showStuInfoMapper;

    @Resource
    private ILoginBodyService iLoginBodyService;

    public List<ShowStuInfo> getAllInfo() {
        return showStuInfoMapper.getAllInfo();
    }

    public ShowStuInfo getInfo(String code) {
        return showStuInfoMapper.getInfo(code);
    }

    public String addInfo(ShowStuInfo showStuInfo) {

        LoginBody login = iLoginBodyService.getLogin(showStuInfo.getCode());
        if(login==null){
            return noregister;
        }

        ShowStuInfo info = getInfo(showStuInfo.getCode());
        if(info!=null){
            return havuser;
        }

        int i= showStuInfoMapper.addInfo(showStuInfo);
        if(i>0){
            return success;
        }
        return error;


    }

    public String delInfo(String code) {

        ShowStuInfo info = getInfo(code);
        if(info==null){
            return nostu;
        }
        int i = showStuInfoMapper.delInfo(code);
        if(i<=0){
            return delerr;
        }
        return delsuc;
    }

    public String updateInfo(ShowStuInfo showStuInfo) {
        ShowStuInfo info = getInfo(showStuInfo.getCode());
        if(info==null){
            return nostu;
        }
        int i = showStuInfoMapper.updateInfo(showStuInfo);
        if(i<=0){
            return uperr;
        }
        return upsuc;
    }

    public Map getStudentNumInfo(){//获取班级人数以及男女生人数
        Map m = new HashMap();
        List<ShowStuInfo> showStuInfos = getAllInfo();
        int totalNum = showStuInfos.size();
        int man =0;
        int woman =0;
        for(ShowStuInfo showStuInfo:showStuInfos){
            if(showStuInfo.getStugenderCode()==1) {
                man++ ;
            }else{
                woman++;
            }
        }
        m.put("totalNum",totalNum);
        m.put("man",man);
        m.put("woman",woman);
        return m;

    }
}
