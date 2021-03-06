package com.wuqi.dev.department.service;

import com.wuqi.dev.domain.Department;

import java.util.List;

/**
 * Author: 武奇<p>
 * Company: lanou3g.com<p>
 * Date: 2017/11/14 <p>
 */
public interface DepartmentService {

    List<Department> findAllDepartments();

    void addOrEditDepartment(Department dept);

    Department findDeptById(String deptId);

}
