package com.example.new_projecr_behind.entity.router;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class routermain {
    private String path;
    private String name;
    private String redirect;
    private mainMeta meta;
    private ArrayList<routerson> children;

    public routermain() {
    }

    public routermain(String path, String name, String redirect, mainMeta meta, ArrayList<routerson> children) {
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

    public mainMeta getMeta() {
        return meta;
    }

    public void setMeta(mainMeta meta) {
        this.meta = meta;
    }

    public ArrayList<routerson> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<routerson> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "routermain{" +
                "path='" + path + '\'' +
                ", name='" + name + '\'' +
                ", redirect='" + redirect + '\'' +
                ", meta=" + meta +
                ", children=" + children +
                '}';
    }
}
