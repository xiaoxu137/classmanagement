package com.clsmagent.mapper;

import com.clsmagent.pojo.entry.Grade;
import com.clsmagent.pojo.info.Grad;
import com.clsmagent.pojo.info.TotalGrade;

import java.sql.Date;
import java.util.List;

public interface GradeMapper {
    Grade getGrade(String code);
    Grade getGraded(String code, Date date);

    List<Grade> getAllGrade(String code);

    List<Grade> getAllGrades();

    int delGrade(Grade grade);

    int updateGrade(Grade grade);

    int addGrade(Grade grade);

    Grad getTotal();

    List<TotalGrade> getTotalGrade();
}
