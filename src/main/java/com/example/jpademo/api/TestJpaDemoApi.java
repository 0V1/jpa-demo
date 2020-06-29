package com.example.jpademo.api;

import com.example.jpademo.entity.DemoJpaEntity;
import com.example.jpademo.service.TestJpaDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author qinfeng
 * @date 2019/12/21
 */
@RestController
public class TestJpaDemoApi {

    @Autowired
    private TestJpaDemoService testJpaDemoService;


    @GetMapping("/findAll")
    public List<DemoJpaEntity> findAll(){
        return testJpaDemoService.findAll();
    }

    @GetMapping("/findBy")
    public List<DemoJpaEntity> specification(){
        return testJpaDemoService.specification();
    }

}
