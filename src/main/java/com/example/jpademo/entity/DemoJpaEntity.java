package com.example.jpademo.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author qinfeng
 * @date 2019/12/21
 */
@Data
@Entity
@Table(name="demo_jpa")
public class DemoJpaEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String buyer;

    private String requestId;

}
