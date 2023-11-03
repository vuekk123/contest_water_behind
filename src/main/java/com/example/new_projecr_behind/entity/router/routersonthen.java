package com.example.new_projecr_behind.entity.router;

import java.util.ArrayList;

public class routersonthen {
    private String path;
    private String name;
    private String redirect;
    private sonMeta meta;
    private ArrayList<Object> children;

    public routersonthen() {
    }

    public routersonthen(String path, String name, String redirect, sonMeta meta, ArrayList<Object> children) {
        this.path = path;
        this.name = name;
        this.redirect = redirect;
        this.meta = meta;
        this.children = children;
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

    public ArrayList<Object> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Object> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "routersonthen{" +
                "path='" + path + '\'' +
                ", name='" + name + '\'' +
                ", redirect='" + redirect + '\'' +
                ", meta=" + meta +
                ", children=" + children +
                '}';
    }
}
