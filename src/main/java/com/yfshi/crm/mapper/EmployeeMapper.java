package com.yfshi.crm.mapper;

import com.yfshi.crm.domain.Employee;
import com.yfshi.crm.query.QueryObject;

import java.util.List;

public interface EmployeeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Employee record);

    Employee selectByPrimaryKey(Long id);

    List<Employee> selectAll();

    int updateByPrimaryKey(Employee record);

    Long queryByConditionCount(QueryObject q);

    List<Employee> queryByCondition(QueryObject q);

}