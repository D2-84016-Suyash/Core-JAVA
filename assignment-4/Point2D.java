package com.app.geometry;

public class Point2D {
	int x=0;
	int y=0;
	
public Point2D() {
		
	}
	
	public Point2D(int x, int y) {
		
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public String getDetails() {
		return getX() +","+ getY();
	
	}
	
	public boolean isEqual(Point2D p) {
		if(this.getX()== p.x && this.getY()==p.y)
		{
			return true;
		}
		else {
			double r=Math.sqrt(Math.pow((this.x-p.x),2)+Math.pow((this.y-p.y),2));
			System.out.println("distance between two points="+r);
			return false;
		}
	}
	
	
	
	

}
