package ex.aaronfae.service;

import ex.aaronfae.entity.Department;
import ex.aaronfae.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Department> selectAllEmployee();

    List<Employee> employeeList();

    Employee editEmployee(Integer e_id);
}
