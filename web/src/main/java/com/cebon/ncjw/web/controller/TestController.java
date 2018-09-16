package com.cebon.ncjw.web.controller;

import com.cebon.ncjw.test.entity.TestModel;
import com.cebon.ncjw.test.service.TestDemoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
@Api(value="/test", tags="测试接口模块")
public class TestController {
    @Autowired
    private TestDemoService testDemoService;

    @ApiOperation(value="swagger测试", notes = "测试信息")
    @RequestMapping(value = "/test", method = { RequestMethod.GET })
    @ResponseBody
    public TestModel getUser() {
        return testDemoService.getUser(1L);
    }
}
