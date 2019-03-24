package com.cantfu.controller;

import com.cantfu.beans.Employee;
import com.cantfu.service.EmplyeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * EmplyeeController
 *
 * @author cantfu
 * @date 2019/2/2
 */
@Controller
public class EmplyeeController {

    @Autowired
    EmplyeeService emplyeeService;

    @RequestMapping("/emps")
    public String emps(Model model){
        List<Employee> emps = emplyeeService.getEmps();
        System.out.println("list:"+emps);
        model.addAttribute("allEmps",emps);
        model.addAttribute("testAttr","成功");

        return "list";
    }
}
