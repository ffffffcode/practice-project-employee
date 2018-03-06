package ex.aaronfae.service;

import ex.aaronfae.dao.EmployeeDao;
import ex.aaronfae.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeDao employeeDao;

    @Autowired
    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public List<Employee> listEmployee() {
        return employeeDao.selectAllEmployee();
    }

    @Override
    public Employee editEmployee(Integer e_id) {
        return employeeDao.selectById(e_id);
    }

    @Override
    public int updateEmployee(Employee record) {
        return employeeDao.updateById(record);
    }

}
