package com.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table


public class Car {
	@Id
	@Column
	private int carno;
	@Column
	private String car_name;
	@Column
	private String boytype;
	@Column
	private String color;
	@Column
	private double price;
	@Column
	private String carmodel;
	
	public Car() {
		super();
	}
	public Car(int carno,String car_name, String boytype, String color, double price, String carmodel) {
		super();
		this.carno = carno;
		this.car_name=car_name;
		this.boytype = boytype;
		this.color = color;
		this.price = price;
		this.carmodel = carmodel;
	}
	public int getCarno() {
		return carno;
	}
	public void setCarno(int carno) {
		this.carno = carno;
	}

	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	public String getBoytype() {
		return boytype;
	}
	public void setBoytype(String boytype) {
		this.boytype = boytype;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCarmodel() {
		return carmodel;
	}
	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}
	@Override
	public String toString() {
		return "Car [carno=" + carno + ", car_name=" + car_name + ", boytype=" + boytype + ", color=" + color
				+ ", price=" + price + ", carmodel=" + carmodel + "]";
	}
	
	
	

}
