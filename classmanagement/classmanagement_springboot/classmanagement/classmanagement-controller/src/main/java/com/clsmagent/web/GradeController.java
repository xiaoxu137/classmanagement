package com.clsmagent.web;

import com.clsmagent.pojo.entry.Grade;
import com.clsmagent.pojo.entry.SubjectSort;
import com.clsmagent.pojo.info.TotalGrade;
import com.clsmagent.service.IGradeService;
import com.clsmagent.service.ISubjectSortService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/grade")
public class GradeController {

    @Resource
    private ISubjectSortService iSubjectSortService;

    @Resource
    private IGradeService gradeService;

    @GetMapping("/{code}")
    public Grade getGrade(@PathVariable String code){
        return gradeService.getGrade(code);
    }

    @DeleteMapping("/{id}")
    public String delGrade(@RequestBody Grade grade){
        return  gradeService.delGrade(grade);
    }

    @PutMapping("/{id}")
    public String updateGrade(@PathVariable Integer id,@RequestBody Grade grade){
        return gradeService.update(grade);

    }

    @PostMapping("/{id}")
    public String addGrade(@RequestBody Grade grade){
        return gradeService.addGrade(grade);
    }

    @GetMapping("/subject")
    @ResponseBody
    public SubjectSort getSub(){
        return iSubjectSortService.getSubjectSort();
    }

    @PatchMapping("/{code}")
    @ResponseBody
    public List<Grade> getAllGrade(@PathVariable String code){
        return gradeService.getAllGrade(code);
    }

    @GetMapping
    @ResponseBody
    public List<Grade> getAllGrades(){
        return gradeService.getAllGrades();
    }

    @GetMapping("/total")
    @ResponseBody
    public List<Integer> getTotalGrade(){
        return gradeService.getTotal();
    }

    @GetMapping("/AllTotalGrade")
    @ResponseBody
    public List getAllTotalGrade(){
        return gradeService.getTotalGrade();
    }

}
