package Prince;

import java.util.Scanner;

public class Fectorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1,num,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		for(i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println( " Factorial of "+num +" = " + fact);

	}

}
