package com.example.new_projecr_behind.entity.loginbaseobj;

import java.util.Arrays;

public class loginobj {
    private String[] roles;
    private String username;
    private String accessToken;
    private String refreshToken;
    private String expires;

    public loginobj() {
    }

    public loginobj(String[] roles, String username, String accessToken, String refreshToken, String expires) {
        this.roles = roles;
        this.username = username;
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.expires = expires;
    }

    @Override
    public String toString() {
        return "loginobj{" +
                "roles=" + Arrays.toString(roles) +
                ", username='" + username + '\'' +
                ", accessToken='" + accessToken + '\'' +
                ", refreshToken='" + refreshToken + '\'' +
                ", expires='" + expires + '\'' +
                '}';
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getExpires() {
        return expires;
    }

    public void setExpires(String expires) {
        this.expires = expires;
    }
}
