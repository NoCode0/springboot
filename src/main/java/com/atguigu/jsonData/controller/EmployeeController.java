package com.atguigu.jsonData.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.atguigu.jsonData.bean.Employee;
import com.atguigu.jsonData.service.EmployeeService;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService empService;
    
    @PostMapping("/main.html")
    public ModelAndView main(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("main");
        return mv;
    }
    
    @RequestMapping("/")
    public ModelAndView index1(Model model){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }
    @RequestMapping("/index.html")
    public ModelAndView index2(Model model){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }
    
    @RequestMapping("/emps")
    public ModelAndView emps(){
        List<Employee> emps = empService.getAllEmps();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("success");
        mv.addObject("emps", emps);
        return mv;
    }
    
    @RequestMapping("/success2")
    public ModelAndView success(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("success2");
        return mv;
    }
    @RequestMapping("/emps2")
    public List<Employee> emps2(){
        return empService.getAllEmps();
    }
}
