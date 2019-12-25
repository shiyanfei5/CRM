package com.yfshi.crm.service.impl;

import com.yfshi.crm.domain.Employee;
import com.yfshi.crm.mapper.EmployeeMapper;
import com.yfshi.crm.query.PageResult;
import com.yfshi.crm.query.QueryObject;
import com.yfshi.crm.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    private EmployeeMapper dao;     //mapper == respository

    @Override
    public int save(Employee e) {
        return dao.insert(e);
    }

    @Override
    public int update(Employee emp) {
        return dao.updateByPrimaryKey(emp);
    }

    @Override
    public int delete(Long id) {
        return dao.deleteByPrimaryKey(id);
    }

    @Override
    public Employee get(Long id) {
        return dao.selectByPrimaryKey(id);
    }

    @Override
    public List<Employee> selectAll() {
        return dao.selectAll();
    }

    @Override
    public PageResult selectByCondition(QueryObject q) {
        Long count = dao.queryByConditionCount(q);
        if(count <= 0){
            return PageResult.EMPTY;
        } else{
            return new PageResult(count, dao.queryByCondition(q));
        }
    }
}
