package com.example.new_projecr_behind.entity.mapperEntity;

public class routerEntity {
    private String path;
    private String name;
    private String redirect;
    private String title;
    private String icon;
    private int showLink;
    private int rank;
    private int stages;
    private int haschildren;

    public routerEntity() {
    }

    public routerEntity(String path, String name, String redirect, String title, String icon, int showLink, int rank,
                        int stages, int haschildren) {
        this.path = path;
        this.name = name;
        this.redirect = redirect;
        this.title = title;
        this.icon = icon;
        this.showLink = showLink;
        this.rank = rank;
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

    public int getShowLink() {
        return showLink;
    }

    public void setShowLink(int showLink) {
        this.showLink = showLink;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
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
        return "routerEntity{" +
                "path='" + path + '\'' +
                ", name='" + name + '\'' +
                ", redirect='" + redirect + '\'' +
                ", title='" + title + '\'' +
                ", icon='" + icon + '\'' +
                ", showLink=" + showLink +
                ", rank=" + rank +
                ", stages=" + stages +
                ", haschildren=" + haschildren +
                '}';
    }
}
