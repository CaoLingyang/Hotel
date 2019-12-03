package com.nf.EmployeeDao;

import com.nf.EmployeeEntity.EmployeeEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeDao {
   List<EmployeeEntity>getAll(@Param("pageNum")int pageNum,@Param("pageSize") int pageSize);
   void insert(EmployeeEntity employeeEntity);
   void deleteByEmployeeId(int employeeid);
   void update(EmployeeEntity employeeEntity);
}
