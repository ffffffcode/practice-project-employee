package ex.aaronfae.service;

import ex.aaronfae.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> listEmployee();

    Employee editEmployee(Integer e_id);

    int updateEmployee(Employee record);
}
