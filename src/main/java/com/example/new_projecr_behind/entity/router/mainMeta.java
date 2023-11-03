package com.example.new_projecr_behind.entity.router;

public class mainMeta {
    private String title;
    private String icon;
    private Boolean showLink;
    private int rank;

    public mainMeta() {
    }

    public mainMeta(String title, String icon, int showLink, int rank) {
        this.title = title;
        this.icon = icon;
        this.showLink = showLink==0?false:true;
        this.rank = rank;
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

    public Boolean getShowLink() {
        return showLink;
    }

    public void setShowLink(Boolean showLink) {
        this.showLink = showLink;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "mainMeta{" +
                "title='" + title + '\'' +
                ", icon='" + icon + '\'' +
                ", showLink=" + showLink +
                ", rank=" + rank +
                '}';
    }
}
