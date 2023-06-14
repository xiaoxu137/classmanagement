package com.clsmagent.service.impl;

import com.clsmagent.mapper.SubjectSortMapper;
import com.clsmagent.pojo.entry.SubjectSort;
import com.clsmagent.service.ISubjectSortService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@PropertySource(value = "classpath:logininfo.properties",encoding = "utf-8")
public class SubjectSortSvcImpl implements ISubjectSortService {


    @Value("${UP.SUCCESS}")
    private String suc;

    @Resource
    private SubjectSortMapper subjectSortMapper;

    public SubjectSort getSubjectSort() {
        return subjectSortMapper.getSubjectSort();
    }

    public String setSubjectSort(SubjectSort subjectSort) {
        return null;
    }
}
