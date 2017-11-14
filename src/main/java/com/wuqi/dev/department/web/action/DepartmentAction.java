package com.wuqi.dev.department.web.action;

import com.wuqi.dev.base.BaseAction;
import com.wuqi.dev.department.service.DepartmentService;
import com.wuqi.dev.domain.Department;

import java.util.List;

/**
 * Author: 武奇<p>
 * Company: lanou3g.com<p>
 * Date: 2017/11/14 <p>
 */
public class DepartmentAction
        extends BaseAction<Department, DepartmentService> {

    private List<Department> departments;
//    private Department department;

    public String listDepartment(){
        departments = service.findAllDepartments();
        return SUCCESS;
    }

    public String add(){
        service.addOrEditDepartment(getModel());
        return SUCCESS;
    }


    public String addOrEditDepartment(){
        Department d = service.findDeptById(getModel().getDeptId());
        getModel().setDeptName(d.getDeptName());
        return SUCCESS;
    }

    public List<Department> getDepartments() {
        return departments;
    }

//    public Department getDepartment() {
//        return department;
//    }
}
