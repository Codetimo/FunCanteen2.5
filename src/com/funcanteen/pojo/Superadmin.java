package com.funcanteen.pojo;

public class Superadmin {
    private Integer supadminid;

    private String supadminname;

    private String supadminpwd;

    public Integer getSupadminid() {
        return supadminid;
    }

    public void setSupadminid(Integer supadminid) {
        this.supadminid = supadminid;
    }

    public String getSupadminname() {
        return supadminname;
    }

    public void setSupadminname(String supadminname) {
        this.supadminname = supadminname == null ? null : supadminname.trim();
    }

    public String getSupadminpwd() {
        return supadminpwd;
    }

    public void setSupadminpwd(String supadminpwd) {
        this.supadminpwd = supadminpwd == null ? null : supadminpwd.trim();
    }
}