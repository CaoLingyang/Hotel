package com.nf.controller;

import com.nf.EmployeeEntity.EmployeeEntity;
import com.nf.service.EmployeeService;
import com.nf.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/index")

    public String index(){
        return "index";
    }
    @RequestMapping(value = "/list")
    public ResponseVO list(
            @RequestParam(value = "pageNum",defaultValue = "1",required = false)int pageNum,

            @RequestParam(value = "pageSize",defaultValue = "1",required = false)int pageSize
    ){
        List<EmployeeEntity>result=employeeService.getAll(pageNum, pageSize);
        ResponseVO responseVO= ResponseVO.newBuilder()
                .code("200")
                .msg("success")
                .data(result).build();
                return responseVO;

    }
}
