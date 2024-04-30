import java.util.Scanner;

public class circle {

	double diameter ;
	Point2D p;

	public circle(double diameter) {

		this.diameter = diameter;
		this.p=new Point2D();
	}

	public circle() {
		diameter=100;
		
		
	}

	public double getDiameter() {
		return diameter;
	}
	
	
	public void setDiameter(double diameter)  {
		this.diameter = diameter;
		
	}
	
	 public void accpet (Scanner sc) throws exceptionNonneagative 
	{	double d=0;
		 System.out.println("enter Diameter");
		 d=sc.nextDouble();
		 if(d<0)
		 throw new exceptionNonneagative("diameter is neagative");
		 setDiameter(d);
		 System.out.println(getDiameter());
		 p=new Point2D();
		 p.acceptPoint(sc);
	}
	
	}


