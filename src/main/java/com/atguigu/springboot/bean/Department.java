package com.atguigu.springboot.bean;

/**
 * @author 余想英
 * @version V1.0
 * @ClassName: Department
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @date: 2019年07月10日 15:47
 * @Copyright: 2019 www.ti-t.cn Inc. All rights reserved.
 **/
public class Department {
    private Integer id;
    private String departmentName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
