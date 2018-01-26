package com.funcanteen.pojo;

import java.util.Date;

public class Sendmessage {
    private Date sendmessagetime;

    private String content;

    public Date getSendmessagetime() {
        return sendmessagetime;
    }

    public void setSendmessagetime(Date sendmessagetime) {
        this.sendmessagetime = sendmessagetime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}