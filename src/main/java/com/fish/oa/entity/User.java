package com.fish.oa.entity;

public class User {
    private Long userId;//user_id,这里会把数据库里面的格式转换成驼峰命名，是因为在xml里面曾经配置过
    private String username;
    private String password;
    private Long employeeId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }
}
