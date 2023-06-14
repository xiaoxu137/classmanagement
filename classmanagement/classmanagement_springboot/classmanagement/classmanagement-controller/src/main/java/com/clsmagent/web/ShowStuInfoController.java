package com.clsmagent.web;

import com.clsmagent.pojo.info.ShowStuInfo;
import com.clsmagent.service.IShowStuInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/ShowStuInfo")
public class ShowStuInfoController {
    @Resource
    private IShowStuInfoService iShowStuInfoService;

    @GetMapping("/{code}")
    public ShowStuInfo getInfo(@PathVariable String code){
        return iShowStuInfoService.getInfo(code);
    }


    @GetMapping
    public List<ShowStuInfo> getAllInfo(){
        return iShowStuInfoService.getAllInfo();
    }

    @PostMapping()
    public String addInfo(@RequestBody ShowStuInfo showStuInfo){
        return iShowStuInfoService.addInfo(showStuInfo);
    }

    @DeleteMapping("/{code}")
    public String delInfo(@PathVariable String code){
        return iShowStuInfoService.delInfo(code);
    }

    @PutMapping
    public String updateInfo(@RequestBody ShowStuInfo showStuInfo){
        return iShowStuInfoService.updateInfo(showStuInfo);
    }

    @GetMapping("/num")
    public Integer getAllStuNum(){
        return getAllInfo().size();
    }

    @GetMapping("/numInfo")
    public Map getNumInfo(){
        return iShowStuInfoService.getStudentNumInfo();
    }
}
