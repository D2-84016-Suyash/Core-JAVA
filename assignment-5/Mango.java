package com.app.fruits;

public class Mango extends Fruits {

public Mango() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mango(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
		// TODO Auto-generated constructor stub
	}

@Override
String Taste() {
	// TODO Auto-generated method stub
	return "sweet";
	
}

@Override
public String toString() {
	return "Mango [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
}


}
