package com.example.new_projecr_behind.entity.loginbaseobj;
public class loginbaseinfo {
    private String username;
    private String password;
    private String roles;

    public loginbaseinfo(String username, String password, String roles) {
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

    public loginbaseinfo() {
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

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "loginbaseinfo{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + roles +
                '}';
    }
}
