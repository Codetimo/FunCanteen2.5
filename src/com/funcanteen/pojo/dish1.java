package com.funcanteen.pojo;

public class dish1 {
private String dishname;
private Integer price;
public String getDishname() {
	return dishname;
}
public void setDishname(String dishname) {
	this.dishname = dishname;
}
public Integer getPrice() {
	return price;
}
public void setPrice(Integer price) {
	this.price = price;
}
public dish1(String dishname, Integer price) {
	super();
	this.dishname = dishname;
	this.price = price;
}
public dish1() {
	
}

}
