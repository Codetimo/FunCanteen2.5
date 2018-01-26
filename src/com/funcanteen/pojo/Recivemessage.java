package com.funcanteen.pojo;

import java.util.Date;

public class Recivemessage {
    private Date receivetime;

    private String recontent;

    public Date getReceivetime() {
        return receivetime;
    }

    public void setReceivetime(Date receivetime) {
        this.receivetime = receivetime;
    }

    public String getRecontent() {
        return recontent;
    }

    public void setRecontent(String recontent) {
        this.recontent = recontent == null ? null : recontent.trim();
    }
}