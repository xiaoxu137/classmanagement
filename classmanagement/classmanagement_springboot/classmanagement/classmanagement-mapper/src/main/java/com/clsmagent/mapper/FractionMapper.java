package com.clsmagent.mapper;

import com.clsmagent.pojo.info.FractionInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FractionMapper {

    List<FractionInfo> getAllFraction();

    FractionInfo getFraction(String code);

    int addFraction(FractionInfo fractionInfo);

    int delFraction(FractionInfo fractionInfo);

    int updateFra(@Param("code") String code,@Param("fra") int fra);

    int getQualifiedFra();

}
