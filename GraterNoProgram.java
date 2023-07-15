package Prince;

import java.util.Scanner;

public class GraterNoProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2,n3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		n1=sc.nextInt();
		System.out.println("Enter Second Number");
		n2=sc.nextInt();
		System.out.println("Enter Third Number");
		n3=sc.nextInt();
		if(n1>n2&&n1>n3) {
			System.out.println("n1 is grater");
		}
		else if(n1<n2&&n2>n3){
			System.out.println("n2 is grater");
		}
		else {
			System.out.println("n3 is grater");
		}

	}

}
