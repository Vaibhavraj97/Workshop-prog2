package com.bridgelabz.Autoshop;


	public class Ford extends Car {

		private int year;
		private int manufacturerDiscount;

	
	
		    private int length;

		    public Ford(int speed, double regularPrice, String color, int length) {
		        super(speed, regularPrice, color);
		        this.length = length;
		    }

		    public double getSalePrice() {
		        return super.getSalePrice() * (length < 20 ? 0.9 : 0.85);
		    }
		}
		

		
