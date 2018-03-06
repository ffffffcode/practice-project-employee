package ex.aaronfae.dao;

import ex.aaronfae.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> selectAllEmployee();

    Employee selectById(Integer e_id);

    int updateById(Employee record);
}