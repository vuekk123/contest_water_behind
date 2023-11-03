package com.example.new_projecr_behind.entity.tabinfoEntity;

import java.sql.Date;

public class tabinfoobj {
    private String StudentId;
    private String name;
    private Date date;
    private Date dateend;
    private String address;
    private String image;
    private String sex;
    private String tele;

    public tabinfoobj() {
    }

    public tabinfoobj(String studentId, String name, Date date, Date dateend, String address, String image,
                      String sex, String tele) {
        StudentId = studentId;
        this.name = name;
        this.date = date;
        this.dateend = dateend;
        this.address = address;
        this.image = image;
        this.sex = sex;
        this.tele = tele;
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDateend() {
        return dateend;
    }

    public void setDateend(Date dateend) {
        this.dateend = dateend;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    @Override
    public String toString() {
        return "tabinfoobj{" +
                "StudentId='" + StudentId + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", dateend=" + dateend +
                ", address='" + address + '\'' +
                ", image='" + image + '\'' +
                ", sex='" + sex + '\'' +
                ", tele='" + tele + '\'' +
                '}';
    }
}
