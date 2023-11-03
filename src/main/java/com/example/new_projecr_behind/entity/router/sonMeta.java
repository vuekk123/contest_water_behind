package com.example.new_projecr_behind.entity.router;

import java.util.ArrayList;
import java.util.Arrays;

public class sonMeta {
    private String title;
    private String icon;
    private String extraIcon;
    private Boolean showLink;
    private Boolean showParent;
    private ArrayList<String> roles;
    private ArrayList<String> auths;
    private Boolean keepAlive;
    private String frameSrc;
    private Boolean frameLoading;
    private Boolean hiddenTag;
    private int dynamicLevel;
    private String activePath;

    public sonMeta() {
    }
    public sonMeta(String title, String icon, ArrayList<String> roles,ArrayList<String> auths) {
        this.title = title;
        this.icon = icon;
        this.roles = roles;
        this.extraIcon = "";
        this.showLink = true;
        this.showParent = true;
        this.auths = auths;
        this.keepAlive = true;
        this.frameSrc = "";
        this.frameLoading = false;
        this.hiddenTag = false;
        this.dynamicLevel = 3;
        this.activePath = "";
    }

    public sonMeta(String title, String icon, String extraIcon, int showLink, int showParent, ArrayList<String> roles,
                   ArrayList<String> auths, int keepAlive, String frameSrc, int frameLoading,
                    int hiddenTag,
                   int dynamicLevel, String activePath) {
        this.title = title;
        this.icon = icon;
        this.extraIcon = extraIcon==null?"":extraIcon;
        this.showLink = showLink==0?false:true;
        this.showParent = showParent==0?false:true;
        this.roles = roles;
        this.auths = auths==null?new ArrayList<String>():auths;
        this.keepAlive = keepAlive == 0?false:true;
        this.frameSrc = frameSrc==null?"":frameSrc;
        this.frameLoading = frameLoading==0?false:true;
        this.hiddenTag = hiddenTag == 0?false:true;
        this.dynamicLevel = dynamicLevel ==0?1:dynamicLevel;
        this.activePath = activePath ==null?"":activePath;
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

    public Boolean getShowLink() {
        return showLink;
    }

    public void setShowLink(Boolean showLink) {
        this.showLink = showLink;
    }

    public Boolean getShowParent() {
        return showParent;
    }

    public void setShowParent(Boolean showParent) {
        this.showParent = showParent;
    }

    public ArrayList<String> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<String> roles) {
        this.roles = roles;
    }

    public ArrayList<String> getAuths() {
        return auths;
    }

    public void setAuths(ArrayList<String> auths) {
        this.auths = auths;
    }

    public Boolean getKeepAlive() {
        return keepAlive;
    }

    public void setKeepAlive(Boolean keepAlive) {
        this.keepAlive = keepAlive;
    }

    public String getFrameSrc() {
        return frameSrc;
    }

    public void setFrameSrc(String frameSrc) {
        this.frameSrc = frameSrc;
    }

    public Boolean getFrameLoading() {
        return frameLoading;
    }

    public void setFrameLoading(Boolean frameLoading) {
        this.frameLoading = frameLoading;
    }

    public Boolean getHiddenTag() {
        return hiddenTag;
    }

    public void setHiddenTag(Boolean hiddenTag) {
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

    @Override
    public String toString() {
        return "sonMeta{" +
                "title='" + title + '\'' +
                ", icon='" + icon + '\'' +
                ", extraIcon='" + extraIcon + '\'' +
                ", showLink=" + showLink +
                ", showParent=" + showParent +
                ", roles=" + roles +
                ", auths=" + auths +
                ", keepAlive=" + keepAlive +
                ", frameSrc='" + frameSrc + '\'' +
                ", frameLoading=" + frameLoading +
                ", hiddenTag=" + hiddenTag +
                ", dynamicLevel=" + dynamicLevel +
                ", activePath='" + activePath + '\'' +
                '}';
    }
}
