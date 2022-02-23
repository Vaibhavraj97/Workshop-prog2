package com.bridgelabz.Autoshop;

public class MyownAutoshop {

	public static void main(String[] args) {
		
		  Ford ford = new Ford(500, 500, "red", 30);
	       Sedan sedan = new Sedan(300, 300, "black", 2021, 35);
	        Truck truck = new Truck(250, 250, "yellow",  40);
	        Car car = new Car(100, 100, "white");
	        System.out.println("Ford "+ford.getSalePrice());
	        System.out.println("Sedan "+sedan.getSalePrice());
	        System.out.println("Truck "+truck.getSalePrice());
	        System.out.println("car  "+car.getSalePrice());
	    }
	}