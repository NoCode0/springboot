package com.atguigu.jsonData.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Employee {
    private Integer id;

    private String username;

    private String loginacct;

    private String userpswd;

    private String email;

//    @JsonFormat(pattern = "yyyy年MM月dd日", timezone = "GMT+8")
    private Date createtime;

    private Integer dId;
    
    private Department dept;
    
    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getLoginacct() {
        return loginacct;
    }

    public void setLoginacct(String loginacct) {
        this.loginacct = loginacct == null ? null : loginacct.trim();
    }

    public String getUserpswd() {
        return userpswd;
    }

    public void setUserpswd(String userpswd) {
        this.userpswd = userpswd == null ? null : userpswd.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", username=" + username + ", loginacct=" + loginacct + ", userpswd=" + userpswd
                + ", email=" + email + ", createtime=" + createtime + ", dId=" + dId + "]";
    }
    
}