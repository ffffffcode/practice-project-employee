package ex.aaronfae.controller;

import ex.aaronfae.entity.Employee;
import ex.aaronfae.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * 查询所有员工信息
     *
     * @return 返回带员工信息的ModelAndView
     */
    @RequestMapping("/queryAll")
    public ModelAndView queryAll() {
        List<Employee> list = employeeService.queryAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("queryAll");
        modelAndView.addObject("list", list);
        return modelAndView;
    }


}
