package com.cantfu.service;

import com.cantfu.beans.Employee;
import com.cantfu.dao.EmployeeMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * EmplyeeService
 *
 * @author cantfu
 * @date 2019/2/2
 */
@Service
public class EmplyeeService {
    private final Logger LOGGER = LoggerFactory.getLogger(EmplyeeService.class);
    @Autowired
    private EmployeeMapper employeeMapper;

    public List<Employee> getEmps(){
        LOGGER.debug("Service Method getEmps!");
        System.out.println(employeeMapper);
        return employeeMapper.getEmps();
    }
}
