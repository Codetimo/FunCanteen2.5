package com.funcanteen.pojo;

public class Order {
    private Integer orderid;

    private Integer dishesid;

    private String dishname;

    private String addresses;
    
    private Integer windid;
    
    private Integer deliverid;
    
    private Integer userid;
      

    public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getDeliverid() {
		return deliverid;
	}

	public void setDeliverid(Integer deliverid) {
		this.deliverid = deliverid;
	}

	public Integer getWindid() {
		return windid;
	}

	public void setWindid(Integer windid) {
		this.windid = windid;
	}

	public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getDishesid() {
        return dishesid;
    }

    public void setDishesid(Integer dishesid) {
        this.dishesid = dishesid;
    }

    public String getDishname() {
        return dishname;
    }

    public void setDishname(String dishname) {
        this.dishname = dishname == null ? null : dishname.trim();
    }

    public String getAddresses() {
        return addresses;
    }

    public void setAddresses(String addresses) {
        this.addresses = addresses == null ? null : addresses.trim();
    }
}