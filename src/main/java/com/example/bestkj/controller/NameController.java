package com.example.bestkj.controller;

import com.example.bestkj.pojo.Name;
import com.example.bestkj.service.NameService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "用户表")
@RestController
@RequestMapping("/name")
public class NameController {

    @Autowired
    private NameService nameService;

    @GetMapping("/select")
    @ApiOperation(value = "获取", notes = "测试用户")
    @ApiImplicitParam(name = "name",value = "名字",required = true,dataType = "String",paramType = "query")

    public Name getEmployee(@RequestParam String name) {
        return nameService.selectName(name);
    }

}
