package com.parking.dao.bean;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by wpg on 2017/12/31.
 */
@Table(name = "test")
public class Test {
    @Id
    private Long id;
    private String name;
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
