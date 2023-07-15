import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
		double AC,CC,pi=3.14;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		r=sc.nextInt();
		AC=pi*r*r;    //formula of Area of circle
		System.out.println("Area of circle="+AC);
		CC=2*pi*r;   //formula of Circumference of circle
		System.out.println("Circumference of circle="+CC);
	}

}
