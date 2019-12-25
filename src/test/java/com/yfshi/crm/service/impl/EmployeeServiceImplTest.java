package com.yfshi.crm.service.impl;

import com.yfshi.crm.domain.Employee;
import com.yfshi.crm.service.IEmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class EmployeeServiceImplTest {
    @Autowired
    IEmployeeService service;

    @Test
    public void save() {
        Employee e = new Employee();
        e.setUsername("yfshi");
        e.setTel("888888");
        e.setState(true);
        e.setRealname("yfshi");
        e.setPassword("11111");
        e.setAdmin(true);
        e.setEmail("123@com.cn");
        service.save(e);
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void get() {
    }

    @Test
    public void selectAll() {
    }

    @Test
    public void selectByCondition() {
    }
}