package org.navis.ora.controller;

import org.navis.ora.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试类型控制层
 * @author Administrator
 */
@RestController
@RequestMapping(value = "/test")
public class TestController extends BaseController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @RequestMapping(value = "/message")
    String showTestMessage(){
        return testService.showTestMessage();
    }
}
