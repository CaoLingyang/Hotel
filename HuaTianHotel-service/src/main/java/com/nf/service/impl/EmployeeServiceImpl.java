package com.nf.service.impl;

import com.nf.EmployeeDao.EmployeeDao;
import com.nf.EmployeeEntity.EmployeeEntity;
import com.nf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;
    @Override
    public List<EmployeeEntity> getAll(int pageNum, int pageSize) {
        return employeeDao.getAll(pageNum, pageSize);
    }

    @Override
    public void insert(EmployeeEntity employeeEntity) {
         employeeDao.insert(employeeEntity);
    }

    @Override
    public void deleteByEmployeeId(int employeeid) {
        employeeDao.deleteByEmployeeId(employeeid);
    }

    @Override
    public void update(EmployeeEntity employeeEntity) {
        employeeDao.update(employeeEntity);
    }
}
