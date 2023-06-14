package com.clsmagent.service.impl;

import com.clsmagent.mapper.FractionMapper;
import com.clsmagent.pojo.info.FractionInfo;
import com.clsmagent.service.IFractionService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@PropertySource(value = "logininfo.properties",encoding = "utf-8")
public class FractionSvcImpl implements IFractionService {

    @Value("${ADD.SUCCESS}")
    private String addsuc;
    @Value("${UP.SUCCESS}")
    private String upsuc;
    @Value("${DEL.SUCCESS}")
    private String delsuc;
    @Value("${ADD.FRA.HAVING}")
    private String addhav;
    @Value("${ADD.ERROR}")
    private String adderr;
    @Value("${DEL.NOFRA}")
    private String nofra;
    @Value("${DEL.ERROR}")
    private String delerr;
    @Value("${UP.ERR}")
    private String uperr;

    @Resource
    private FractionMapper fractionMapper;

    public List<FractionInfo> getAllFraction() {
        return fractionMapper.getAllFraction();
    }

    public FractionInfo getFraction(String code) {

        return fractionMapper.getFraction(code);
    }

    public String addFraction(FractionInfo fractionInfo) {
        if(getFraction(fractionInfo.getCode())!=null){
            return addhav;
        }
        int i = fractionMapper.addFraction(fractionInfo);

        if(i<=0){
            return adderr;
        }
        return addsuc;
    }

    public String delFraction(FractionInfo fractionInfo) {
        if(getFraction(fractionInfo.getCode())==null){
            return nofra;
        }
        int i = fractionMapper.delFraction(fractionInfo);

        if(i<=0){
            return delerr;
        }

        return delsuc;
    }

    public String updateFra(String code, int fra) {
        if(getFraction(code)==null){
            return nofra;
        }

        int oldfra = getFraction(code).getFra();

        int i = fractionMapper.updateFra(code, oldfra + fra);
        if(i<=0){
            return uperr;
        }

        return upsuc;
    }

    public Integer getQualifiedFra() {
        return fractionMapper.getQualifiedFra();
    }
}
