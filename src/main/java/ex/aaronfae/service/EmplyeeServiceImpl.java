package ex.aaronfae.service;

import ex.aaronfae.dao.EmployeeDAO;
import ex.aaronfae.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmplyeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    public List<Employee> queryAll() {
        return employeeDAO.queryAll();
    }

}
