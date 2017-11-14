package com.wuqi.dev.domain;

/**
 * Author: 武奇<p>
 * Company: lanou3g.com<p>
 * Date: 2017/11/14 <p>
 */
public class Department {

    private String deptId;
    private String deptName;

    public Department() {
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId='" + deptId + '\'' +
                ", deptName='" + deptName + '\'' +
                '}';
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
