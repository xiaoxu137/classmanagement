package com.clsmagent.service.impl;

import com.clsmagent.mapper.GradeMapper;
import com.clsmagent.pojo.entry.Grade;
import com.clsmagent.pojo.info.Grad;
import com.clsmagent.pojo.info.TotalGrade;
import com.clsmagent.service.IGradeService;
import com.clsmagent.service.IShowStuInfoService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


@Service
@PropertySource(value = "classpath:logininfo.properties",encoding = "utf-8")
public class GradeSvcIml implements IGradeService {

    @Value("${ADD.GRAD.NOUSER}")
    private String nouser;

    @Value("${ADD.GRAD.HAVING}")
    private String having;

    @Value("${ADD.SUCCESS}")
    private String suc;

    @Value("${ADD.ERROR}")
    private String err;

    @Value("${UP.SUCCESS}")
    private String upsc;

    @Value("${UP.ERR}")
    private String uper;

    @Value("${DEL.SUCCESS}")
    private String dsuc;

    @Value("${DEL.ERROR")
    private String derr;

    @Resource
    private IShowStuInfoService iShowStuInfoService;

    @Resource
    private GradeMapper gradeMapper;

    public Grade getGrade(String code) {
        return gradeMapper.getGrade(code);
    }

    public List<Grade> getAllGrade(String code) {
        return gradeMapper.getAllGrade(code);
    }

    public List<Grade> getAllGrades() {
        return gradeMapper.getAllGrades();
    }

    public String delGrade(Grade grade) {
        if(gradeMapper.delGrade(grade)>0){
            return dsuc;
        }
        return derr;
    }

    public String update(Grade grade) {
        if(iShowStuInfoService.getInfo(grade.getCode())==null){
            return nouser;
        }


        if(gradeMapper.updateGrade(grade)>0){
            return upsc;
        }
        return uper;
    }

    public String addGrade(Grade grade) {

        if(iShowStuInfoService.getInfo(grade.getCode())==null){
            return nouser;
        }

        if(gradeMapper.getGraded(grade.getCode(),grade.getDate())!=null){
            return having;
        }


        if(gradeMapper.addGrade(grade)>0){
            return suc;
        }
        return err;
    }

    public List<Integer> getTotal() {
        Grad grad = gradeMapper.getTotal();
        return grad.getList();
    }

    public List getTotalGrade(){
        List<TotalGrade> totalGrade= gradeMapper.getTotalGrade();
        List list = new ArrayList();
        List list1 = new ArrayList();
        List list2 = new ArrayList();
        for(TotalGrade totalGrade1:totalGrade){
            list1.add(totalGrade1.getTotal());
            list2.add(totalGrade1.getDate());
        }
        list.add(list1);
        list.add(list2);
        return list;
    }
}
