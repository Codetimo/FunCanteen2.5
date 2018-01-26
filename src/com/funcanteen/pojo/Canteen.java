package com.funcanteen.pojo;

public class Canteen {
    private Integer canteenid;

    private String canteenname;

    private Integer adid;

    public Integer getCanteenid() {
        return canteenid;
    }

    public void setCanteenid(Integer canteenid) {
        this.canteenid = canteenid;
    }

    public String getCanteenname() {
        return canteenname;
    }

    public void setCanteenname(String canteenname) {
        this.canteenname = canteenname == null ? null : canteenname.trim();
    }

    public Integer getAdid() {
        return adid;
    }

    public void setAdid(Integer adid) {
        this.adid = adid;
    }
}