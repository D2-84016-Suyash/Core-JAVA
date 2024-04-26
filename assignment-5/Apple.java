package com.app.fruits;

public class Apple extends Fruits {
	
 
	
	public Apple(String color, double weight, String name, boolean isFresh) {
	super(color, weight, name, isFresh);
	
}

	public Apple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	String Taste() {
		
		return "sweet n sour";
	}

	@Override
	public String toString() {
		return "Apple [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}

	
	

}
