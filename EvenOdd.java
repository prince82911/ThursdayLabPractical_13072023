package Prince;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		if(num % 2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
		

	}

}
