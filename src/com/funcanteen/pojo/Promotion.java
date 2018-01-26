package com.funcanteen.pojo;

import java.util.Date;

public class Promotion {
    private Integer promotionid;

    private String proname;

    private String content;

    private Date time;

    private Integer windoid;

    public Integer getPromotionid() {
        return promotionid;
    }

    public void setPromotionid(Integer promotionid) {
        this.promotionid = promotionid;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname == null ? null : proname.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getWindoid() {
        return windoid;
    }

    public void setWindoid(Integer windoid) {
        this.windoid = windoid;
    }
}