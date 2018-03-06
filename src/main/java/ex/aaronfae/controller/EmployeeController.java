package ex.aaronfae.controller;

import ex.aaronfae.entity.Employee;
import ex.aaronfae.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    /**
     * 查询所有员工信息
     *
     * @return 返回带员工信息的ArrayList
     */
    /*@RequestMapping("/queryAll")
    public ModelAndView queryAll() {
        List<Employee> list = employeeService.queryAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("queryAll");
        modelAndView.addObject("list", list);
        return modelAndView;
    }*/

    /*@RequestMapping("/queryAll")
    public String queryAll(Model model) {
        List<Employee> list = employeeService.queryAll();
        model.addAttribute("list", list);
        return "queryAll";
    }*/

    /*@RequestMapping("/queryAll")
    public String queryAll(Map<String, List<Employee>> map) {
        List<Employee> list = employeeService.queryAll();
        map.put("list", list);
        return "queryAll";
    }*/

    /*@RequestMapping("/queryAll")
    public ModelAndView queryAll() {
        List<Employee> list = employeeService.queryAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list", list);
        View view = new InternalResourceView("/WEB-INF/JSP/employeeList.jsp");
        modelAndView.setView(view);
        return modelAndView;
    }*/

    /*@RequestMapping("/queryAll")
    public ModelAndView queryAll() {
        List<Employee> list = employeeService.queryAll();
        ModelAndView modelAndView = new ModelAndView("queryAll");
        modelAndView.addObject("list", list);
        return modelAndView;
    }*/

    /*@RequestMapping("/queryAll")
    public ModelAndView queryAll() {
        List<Employee> list = employeeService.queryAll();
        ModelAndView modelAndView = new ModelAndView("queryAll", "list", list);
        return modelAndView;
    }*/

    /*@RequestMapping("/employeeList")
    public String employeeList() {
        return "employeeList";
    }

    *//*添加@ModelAttribute注解的方法，会在SpringMVC在调用任何一个业务方法之前被自动调用
    此时传向前端页面的key为employeeList*//*
    @ModelAttribute
    public List<Employee> getList() {
        return employeeService.employeeList();
    }*/

    /*@ModelAttribute
    public void getList(Map<String, List<Employee>> map) {
        map.put("list", employeeService.queryAll());
    }

    @ModelAttribute
    public void getList(Model model) {
        model.addAttribute("list", employeeService.queryAll());
    }*/
    @RequestMapping("/employeeList")
    public ModelAndView employeeList() {
        ModelAndView modelAndView = new ModelAndView("employeeList");
        modelAndView.addObject("employeeList", employeeService.listEmployee());
        return modelAndView;
    }

    /*@RequestMapping("/editEmployee")
    public ModelAndView editEmployee(Integer e_id) {
        ModelAndView modelAndView = new ModelAndView("editEmployee");
        modelAndView.addObject("employee", employeeService.editEmployee(e_id));
        return modelAndView;
    }*/
    @RequestMapping(value = "/editEmployee/{e_id}", method = RequestMethod.GET)
    public String editEmployee(@PathVariable("e_id") Integer e_id, HttpServletRequest request, HttpServletResponse response) {
        if (employeeService.editEmployee(e_id) == null) {
            try {
                response.sendRedirect("/employeeList");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        request.setAttribute("employee", employeeService.editEmployee(e_id));
        return "editEmployee";
    }

    /*@RequestMapping("/employeeInfo")
    public ModelAndView selectAll() {
        ModelAndView modelAndView = new ModelAndView("employeeList");
        modelAndView.addObject("employeeList", employeeService.selectAllEmployee());
        return modelAndView;
    }*/

    @RequestMapping("/updateEmployee")
    public String updateEmployee(Employee employee) {

        switch (employee.getdName()) {
            case "研发部":
                employee.setdId(new Integer(1));
                break;
            case "销售部":
                employee.setdId(new Integer(2));
                break;
            case "行政部":
                employee.setdId(new Integer(3));
                break;
        }
        employeeService.updateEmployee(employee);
        return "redirect:/employeeList";
    }
}
