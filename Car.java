package com.bridgelabz.Autoshop;

public class Car {
	private double speed;
	private double regularPrice;
	private String color;
	public Car(double regularPrice2,double regularPrice,String color)
	{
		this.speed=regularPrice2;
		this.regularPrice=regularPrice;
		this.color=color;
		}
	public double getSalePrice(){
		return regularPrice;
		}
	public String getRegularPrice() {
		// TODO Auto-generated method stub
		return null;
	}
	}
	
	

