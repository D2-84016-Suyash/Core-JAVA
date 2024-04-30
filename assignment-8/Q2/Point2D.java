import java.util.Scanner;

public class Point2D {
	int x ;
	int y ;

	public Point2D(int x, int y) {
		super();
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

	public Point2D() {
		x=0;
		y=0;
	}

	void acceptPoint(Scanner sc) throws exceptionNonneagative
	{	int x1,y1;
		System.out.println("enter point x and y");
		x1=sc.nextInt();
		y1=sc.nextInt();
		if(x1<0 | y1<0)
		throw new exceptionNonneagative("please check x and y");
		setX(x1);
		setY(y1);
		getX();
		getY();
	}

}
