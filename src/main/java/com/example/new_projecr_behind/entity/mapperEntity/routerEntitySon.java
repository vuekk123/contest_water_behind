package com.example.new_projecr_behind.entity.mapperEntity;

public class routerEntitySon    {
    private String path;
    private String name;
    private String redirect;
    private String title;
    private String icon;
    private String extraIcon;
    private int showLink;
    private int showParent;
    private String roles;
    private String auths;
    private int keepAlive;
    private String frameSrc;
    private int frameLoading;
    private int hiddenTag;
    private int dynamicLevel;
    private String activePath;
    private String father;
    private int stages;
    private int haschildren;

    public routerEntitySon() {
    }

    public routerEntitySon(String path, String name, String redirect, String title, String icon, String extraIcon,
                           int showLink, int showParent, String roles, String auths, int keepAlive, String frameSrc,
                           int frameLoading,int hiddenTag, int dynamicLevel, String activePath,
                           String father, int stages, int haschildren) {
        this.path = path;
        this.name = name;
        this.redirect = redirect;
        this.title = title;
        this.icon = icon;
        this.extraIcon = extraIcon;
        this.showLink = showLink;
        this.showParent = showParent;
        this.roles = roles;
        this.auths = auths;
        this.keepAlive = keepAlive;
        this.frameSrc = frameSrc;
        this.frameLoading = frameLoading;
        this.hiddenTag = hiddenTag;
        this.dynamicLevel = dynamicLevel;
        this.activePath = activePath;
        this.father = father;
        this.stages = stages;
        this.haschildren = haschildren;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getExtraIcon() {
        return extraIcon;
    }

    public void setExtraIcon(String extraIcon) {
        this.extraIcon = extraIcon;
    }

    public int getShowLink() {
        return showLink;
    }

    public void setShowLink(int showLink) {
        this.showLink = showLink;
    }

    public int getShowParent() {
        return showParent;
    }

    public void setShowParent(int showParent) {
        this.showParent = showParent;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getAuths() {
        return auths;
    }

    public void setAuths(String auths) {
        this.auths = auths;
    }

    public int getKeepAlive() {
        return keepAlive;
    }

    public void setKeepAlive(int keepAlive) {
        this.keepAlive = keepAlive;
    }

    public String getFrameSrc() {
        return frameSrc;
    }

    public void setFrameSrc(String frameSrc) {
        this.frameSrc = frameSrc;
    }

    public int getFrameLoading() {
        return frameLoading;
    }

    public void setFrameLoading(int frameLoading) {
        this.frameLoading = frameLoading;
    }


    public int getHiddenTag() {
        return hiddenTag;
    }

    public void setHiddenTag(int hiddenTag) {
        this.hiddenTag = hiddenTag;
    }

    public int getDynamicLevel() {
        return dynamicLevel;
    }

    public void setDynamicLevel(int dynamicLevel) {
        this.dynamicLevel = dynamicLevel;
    }

    public String getActivePath() {
        return activePath;
    }

    public void setActivePath(String activePath) {
        this.activePath = activePath;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public int getStages() {
        return stages;
    }

    public void setStages(int stages) {
        this.stages = stages;
    }

    public int getHaschildren() {
        return haschildren;
    }

    public void setHaschildren(int haschildren) {
        this.haschildren = haschildren;
    }

    @Override
    public String toString() {
        return "routerEntitySon{" +
                "path='" + path + '\'' +
                ", name='" + name + '\'' +
                ", redirect='" + redirect + '\'' +
                ", title='" + title + '\'' +
                ", icon='" + icon + '\'' +
                ", extraIcon='" + extraIcon + '\'' +
                ", showLink=" + showLink +
                ", showParent=" + showParent +
                ", roles='" + roles + '\'' +
                ", auths='" + auths + '\'' +
                ", keepAlive=" + keepAlive +
                ", frameSrc='" + frameSrc + '\'' +
                ", hiddenTag=" + hiddenTag +
                ", dynamicLevel=" + dynamicLevel +
                ", activePath='" + activePath + '\'' +
                ", father='" + father + '\'' +
                ", stages=" + stages +
                ", haschildren=" + haschildren +
                '}';
    }
}
