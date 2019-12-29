package com.yfshi.crm.service;

import com.yfshi.crm.domain.Employee;
import com.yfshi.crm.page.PageResult;
import com.yfshi.crm.query.QueryObject;

import java.util.List;

public interface IEmployeeService {
    int save(Employee e);
    int update(Employee emp);
    int delete(Long id);
    Employee get(Long id);
    List<Employee> selectAll();
    PageResult selectByCondition(QueryObject q);

}
