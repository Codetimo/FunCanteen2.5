package com.funcanteen.pojo;

public class Deliver {
    private Integer deliverid;

    private String delivername;

    private String deliverphone;

    private Integer windid;
   

	public Integer getDeliverid() {
        return deliverid;
    }

    public void setDeliverid(Integer deliverid) {
        this.deliverid = deliverid;
    }

    public String getDelivername() {
        return delivername;
    }

    public void setDelivername(String delivername) {
        this.delivername = delivername == null ? null : delivername.trim();
    }

    public String getDeliverphone() {
        return deliverphone;
    }

    public void setDeliverphone(String deliverphone) {
        this.deliverphone = deliverphone == null ? null : deliverphone.trim();
    }

    public Integer getWindid() {
        return windid;
    }

    public void setWindid(Integer windid) {
        this.windid = windid;
    }
}