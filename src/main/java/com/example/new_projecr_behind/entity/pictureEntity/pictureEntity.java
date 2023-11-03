package com.example.new_projecr_behind.entity.pictureEntity;

public class pictureEntity {
    private String pictureBase;
    private String userfor;

    public pictureEntity(String pictureBase, String userfor) {
        this.pictureBase = pictureBase;
        this.userfor = userfor;
    }

    public pictureEntity() {
    }

    public String getPictureBase() {
        return pictureBase;
    }

    public void setPictureBase(String pictureBase) {
        this.pictureBase = pictureBase;
    }

    public String getUserfor() {
        return userfor;
    }

    public void setUserfor(String userfor) {
        this.userfor = userfor;
    }

    @Override
    public String toString() {
        return "pictureEntity{" +
                "pictureBase='" + pictureBase + '\'' +
                ", userfor='" + userfor + '\'' +
                '}';
    }
}
