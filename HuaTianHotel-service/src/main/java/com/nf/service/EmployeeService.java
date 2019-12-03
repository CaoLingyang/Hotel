package com.nf.service;

import com.nf.EmployeeEntity.EmployeeEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeService {
    List<EmployeeEntity> getAll(@Param("pageNum")int pageNum, @Param("pageSize") int pageSize);
    void insert(EmployeeEntity employeeEntity);
    void deleteByEmployeeId(int employeeid);
    void update(EmployeeEntity employeeEntity);
}
