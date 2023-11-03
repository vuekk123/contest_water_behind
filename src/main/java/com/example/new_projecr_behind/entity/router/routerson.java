package com.example.new_projecr_behind.entity.router;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class routerson {
    private String path;
    private String name;
    private String redirect;
    private sonMeta meta;

    public routerson() {
    }

    public routerson(String path, String name, String redirect, sonMeta meta) {
        this.path = path;
        this.name = name==null?"":name;
        this.redirect = redirect==null?"":redirect;
        this.meta = meta;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRedirect() {
        return redirect;
    }

    public void setRedirect(String redirect) {
        this.redirect = redirect;
    }

    public sonMeta getMeta() {
        return meta;
    }

    public void setMeta(sonMeta meta) {
        this.meta = meta;
    }
}
