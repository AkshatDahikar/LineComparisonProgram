package LineComparisonProgram;

import javax.sound.sampled.Line;

public class Comparison implements Comparable<Comparison>{
	private double  x1,y1,x2,y2;
	public Comparison(double x1,double y1,double x2,double y2) {
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
	}
	private double getLength() {
		return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1, 2));
	
}
@Override
public int compareTo(Comparison otherLine) {
	double thislength =this.getLength();
	double otherLength= otherLine.getLength();
	return Double.compare(thislength, otherLength);
	
}
@Override
public String toString() {
	return "Line[("+ x1+","+y1+") to (" + x2+", "+y2+")]";
}

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
		Comparison line1 = new Comparison(0, 0, 3, 4);
		Comparison line2= new Comparison(1,1,4,5);
		Comparison line3=new Comparison(0,0,6,8);
		System.out.println("Line 1:"+line1);
		System.out.println("Line 2:"+line2);
		System.out.println("Line 3:"+line3);
		System.out.println("Comparison Results:");
		 System.out.println("Line 1 vs Line 2: " + line1.compareTo(line2));
		 System.out.println("Line 1 vs Line 2: "+line1.compareTo(line3));
		 System.out.println("Line 1 vs Line 2: "+line3.compareTo(line2));
		 
		
	}
}
