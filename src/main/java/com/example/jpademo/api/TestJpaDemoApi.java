package com.example.jpademo.api;

import com.example.jpademo.service.TestJpaDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qinfeng
 * @date 2019/12/21
 */
@RestController
public class TestJpaDemoApi {

    @Autowired
    private TestJpaDemoService testJpaDemoService;

//    @Autowired
//    private FormatTemplate formatTemplate;

//    @GetMapping("/findAll")
//    public List<DemoJpaEntity> findAll(){
//        return testJpaDemoService.findAll();
//    }
//
//    @GetMapping("/start")
//    public String start(){
//        return formatTemplate.doExecute("ceshi");
//    }
}
