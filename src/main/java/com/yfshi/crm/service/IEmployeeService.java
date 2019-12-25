package com.yfshi.crm.service;

import com.yfshi.crm.domain.Employee;
import com.yfshi.crm.query.PageResult;
import com.yfshi.crm.query.QueryObject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface IEmployeeService {
    int save(Employee e);
    int update(Employee emp);
    int delete(Long id);
    Employee get(Long id);
    List<Employee> selectAll();
    PageResult selectByCondition(QueryObject q);

}
