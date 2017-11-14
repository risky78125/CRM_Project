package com.wuqi.dev.department.service.impl;

import com.wuqi.dev.department.dao.DepartmentDao;
import com.wuqi.dev.department.service.DepartmentService;
import com.wuqi.dev.domain.Department;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * Author: 武奇<p>
 * Company: lanou3g.com<p>
 * Date: 2017/11/14 <p>
 */
public class DepartmentServiceImpl
    implements DepartmentService{

    private DepartmentDao departmentDao;

    @Override
    public List<Department> findAllDepartments() {
        return departmentDao.findAllDepartments();
    }

    @Override
    public void addOrEditDepartment(Department dept) {
        if (StringUtils.isBlank(dept.getDeptId())){
            dept.setDeptId(null);
        }
        departmentDao.addOrEditDepartment(dept);
    }

    @Override
    public Department findDeptById(String deptId) {
        return departmentDao.findDeptById(deptId);
    }

    public void setDepartmentDao(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }
}
