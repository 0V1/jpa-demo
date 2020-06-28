package com.example.jpademo.dao;

import com.example.jpademo.entity.DemoJpaEntity;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

/**
 * @author qinfeng
 * @date 2019/12/21
 */
public interface TestJpaDemoRepository extends JpaRepositoryImplementation<DemoJpaEntity, Integer> {

}
