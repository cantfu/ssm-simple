package com.cantfu.dao;

import com.cantfu.beans.Employee;

import java.util.List;

public interface EmployeeMapper {
    /**
     * 由id值获取Employee对象信息
     * @param id
     * @return
     */
    public Employee getEmpById(Integer id);

    /**
     * 获取所有Employee信息
     * @return
     */
    public List<Employee> getEmps();
}
