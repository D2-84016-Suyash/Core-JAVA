package com.app.fruits;

public class Orange  extends Fruits {

	public Orange() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orange(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	String Taste() {
		// TODO Auto-generated method stub
		return "sour";
	}
	
	@Override
	public String toString() {
		return "Orange [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}

}
