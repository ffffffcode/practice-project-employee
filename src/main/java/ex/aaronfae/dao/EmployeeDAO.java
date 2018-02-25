package ex.aaronfae.dao;

import ex.aaronfae.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> queryAll();
}