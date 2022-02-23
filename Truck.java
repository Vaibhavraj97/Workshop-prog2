package com.bridgelabz.Autoshop;

public class Truck extends Car{
	

private int weight = 0;
public Truck (int Speed,double regularPrice,String color,int weight){
	super(Speed, regularPrice, color);
	this.weight=weight;
}
public double getSalePrice()

	 {

	  int regularPrice;
	return (regularPrice - discount);
	 {if(weight>2000){
		 return super.getSalePrice()-(0.1*super.getSalePrice());
		 }
	 
	 else{
		 return super.getSalePrice();
	 }
	 }
	 }

	}

