package com.clsmagent.service;

import com.clsmagent.pojo.info.FractionInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IFractionService {

    List<FractionInfo> getAllFraction();

    FractionInfo getFraction(String code);

    String addFraction(FractionInfo fractionInfo);

    String delFraction(FractionInfo fractionInfo);

    String updateFra(String code,int fra);

    Integer getQualifiedFra();
}
