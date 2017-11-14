package com.wuqi.dev.department.dao.impl;

import com.wuqi.dev.department.dao.DepartmentDao;
import com.wuqi.dev.domain.Department;
import org.hibernate.LockMode;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

/**
 * Author: 武奇<p>
 * Company: lanou3g.com<p>
 * Date: 2017/11/14 <p>
 */
public class DepartmentDaoImpl
    extends HibernateDaoSupport
    implements DepartmentDao{

    @Override
    public List<Department> findAllDepartments() {
        return getHibernateTemplate().loadAll(Department.class);
    }

    @Override
    public void addOrEditDepartment(Department dept) {
        getHibernateTemplate().saveOrUpdate(dept);

    }

    @Override
    public Department findDeptById(String deptId) {
        return getHibernateTemplate().load(Department.class, deptId, LockMode.READ);
    }
}
