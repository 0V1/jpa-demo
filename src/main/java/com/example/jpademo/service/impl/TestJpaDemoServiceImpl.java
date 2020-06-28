package com.example.jpademo.service.impl;

import com.example.jpademo.dao.TestJpaDemoRepository;
import com.example.jpademo.entity.DemoJpaEntity;
import com.example.jpademo.service.TestJpaDemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.*;
import java.util.List;

/**
 * @author qinfeng
 * @date 2019/12/21
 */
@Slf4j
@Service
public class TestJpaDemoServiceImpl implements TestJpaDemoService {


    @Autowired
    private TestJpaDemoRepository repository;


//    @Override
//    public List<DemoJpaEntity> findAll() {
//
//        return repository.findAll();
//    }

    @Override
    public List<DemoJpaEntity> findAll() {

        return repository.findAll(new Specification<DemoJpaEntity>() {
            @Override
            public Predicate toPredicate(Root<DemoJpaEntity> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {

                Path<Object> path = root.get("buyer");

                Predicate equal = criteriaBuilder.notEqual(path, "2");
//                query.select(root.get("id"));
//                query.select(root.get("buyer"));
                query.where(equal);
                query.groupBy(root.get("buyer"));
                query.orderBy(criteriaBuilder.desc(root.get("requestId")));
                log.info("{}",query);
                return query.getRestriction();
            }
        });
    }
}
