package com.atguigu.jsonData.bean;

public class Department {
    private Integer id;

    private String deptName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    @Override
    public String toString() {
        return "Department [id=" + id + ", deptName=" + deptName + "]";
    }
}