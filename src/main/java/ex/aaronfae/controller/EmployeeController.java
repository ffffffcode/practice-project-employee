package ex.aaronfae.controller;

import ex.aaronfae.entity.Employee;
import ex.aaronfae.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

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
        View view = new InternalResourceView("/WEB-INF/JSP/queryAll.jsp");
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
    @RequestMapping("/queryAll")
    public String queryAll() {
        return "queryAll";
    }

    /*添加@ModelAttribute注解的方法，会在SpringMVC在调用任何一个业务方法之前被自动调用
    此时传向前端页面的key为employeeList*/
    @ModelAttribute
    public List<Employee> getList() {
        return employeeService.queryAll();
    }

    /*@ModelAttribute
    public void getList(Map<String, List<Employee>> map) {
        map.put("list", employeeService.queryAll());
    }

    @ModelAttribute
    public void getList(Model model) {
        model.addAttribute("list", employeeService.queryAll());
    }*/

    @RequestMapping("/editEmployee")
    public ModelAndView editEmployee(Integer e_id) {
        ModelAndView modelAndView = new ModelAndView("editEmployee");
        modelAndView.addObject("id", e_id);
        return modelAndView;
    }
}
