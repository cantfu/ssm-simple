package com.cantfu.beans;

import lombok.Data;

import java.io.Serializable;

/**
 * Employee
 *
 * @author cantfu
 * @date 2019/2/1
 */
@Data
public class Employee implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
    private float salary;

}
