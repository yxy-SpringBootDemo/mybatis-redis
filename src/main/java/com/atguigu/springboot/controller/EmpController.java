package com.atguigu.springboot.controller;

import com.atguigu.springboot.bean.Employee;
import com.atguigu.springboot.mapper.EmployeeMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuxy_cyd
 * @version v-1.1.0
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @date: 2020年01月09日 14:04
 **/
@RestController
public class EmpController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/emp/{id}")
    @Cacheable(value="thisredis", key="'emps_'+#id")
//    @Transactional
    public Employee getEmp(@PathVariable("id") Integer id){
        Employee employee =  employeeMapper.getEmpById(id);
        logger.info(employee.toString());
        return employeeMapper.getEmpById(id);
    }
}
