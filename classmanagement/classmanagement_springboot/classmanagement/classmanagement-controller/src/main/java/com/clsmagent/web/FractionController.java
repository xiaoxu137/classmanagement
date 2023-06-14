package com.clsmagent.web;

import com.clsmagent.pojo.info.FractionInfo;
import com.clsmagent.service.IFractionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/Fraction")
public class FractionController {

    @Resource
    private IFractionService iFractionService;


    @GetMapping
    public List<FractionInfo> getAllFra(){
        return iFractionService.getAllFraction();
    }

    @GetMapping("/{code}")
    public FractionInfo getFra(@PathVariable String code){
        return iFractionService.getFraction(code);
    }

    @PostMapping
    public String addFra(@RequestBody FractionInfo fractionInfo){
        return iFractionService.addFraction(fractionInfo);
    }

    @PutMapping
    public String updateFra(@RequestBody FractionInfo fractionInfo){
        return iFractionService.updateFra(fractionInfo.getCode(),fractionInfo.getFra());
    }

    @DeleteMapping
    public String delFra(@RequestBody FractionInfo fractionInfo){
        return iFractionService.delFraction(fractionInfo);
    }

    @GetMapping("/qua")
    public Integer getQualifiedFra(){
        Integer i = iFractionService.getQualifiedFra();
        return i;
    }


}
