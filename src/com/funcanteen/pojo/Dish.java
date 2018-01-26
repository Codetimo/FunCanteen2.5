package com.funcanteen.pojo;

public class Dish {
    private Integer dishid;

    private String dishname;

    private double price;

    private String photo;

    private Integer winid;

    public Integer getDishid() {
        return dishid;
    }

    public void setDishid(Integer dishid) {
        this.dishid = dishid;
    }

    public String getDishname() {
        return dishname;
    }

    public void setDishname(String dishname) {
        this.dishname = dishname == null ? null : dishname.trim();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double pri) {
        this.price = pri;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public Integer getWinid() {
        return winid;
    }

    public void setWinid(Integer winid) {
        this.winid = winid;
    }
}