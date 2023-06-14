package com.clsmagent.service;

import com.clsmagent.pojo.entry.Grade;
import com.clsmagent.pojo.info.TotalGrade;

import java.sql.Date;
import java.util.List;

public interface IGradeService {
    Grade getGrade(String code);

    List<Grade> getAllGrade(String code);

    List<Grade> getAllGrades();

    String delGrade(Grade grade);

    String update(Grade grade);

    String addGrade(Grade grade);

    List<Integer> getTotal();

    List getTotalGrade();
}
