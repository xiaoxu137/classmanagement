package com.clsmagent.service;

import com.clsmagent.pojo.info.ShowStuInfo;

import java.util.List;
import java.util.Map;

public interface IShowStuInfoService {
    List<ShowStuInfo> getAllInfo();

    ShowStuInfo getInfo(String code);

    String addInfo(ShowStuInfo showStuInfo);

    String delInfo(String code);
    String updateInfo(ShowStuInfo showStuInfo);
    Map getStudentNumInfo();
}
