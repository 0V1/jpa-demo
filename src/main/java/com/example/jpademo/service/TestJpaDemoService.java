package com.example.jpademo.service;

import com.example.jpademo.entity.DemoJpaEntity;

import java.util.List;

/**
 * @author qinfeng
 * @date 2019/12/21
 */
public interface TestJpaDemoService {

    /**
     * findAll
     *
     * @return List
     */
    List<DemoJpaEntity> findAll();

}
