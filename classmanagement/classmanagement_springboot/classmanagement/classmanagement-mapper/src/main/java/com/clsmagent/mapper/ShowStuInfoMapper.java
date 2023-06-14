package com.clsmagent.mapper;

import com.clsmagent.pojo.info.ShowStuInfo;

import java.util.List;
import java.util.Map;

public interface ShowStuInfoMapper {
    List<ShowStuInfo> getAllInfo();

    ShowStuInfo getInfo(String code);

    int addInfo(ShowStuInfo showStuInfo);

    int delInfo(String code);
    int updateInfo(ShowStuInfo showStuInfo);


}
