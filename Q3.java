package Prince;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice1;
		Scanner sc=new Scanner(System.in);
		System.out.println("1 = Even odd\n"
				+ "2 = Grater number\n"
				+ "3 = Eligible for voting");
		System.out.println("Select Number");
		choice1=sc.nextInt();
		switch(choice1) {
		case 1:
			int num;
			System.out.println("enter the number");
			num=sc.nextInt();
			if(num % 2==0) {
				System.out.println("Even Number");
			}
			else {
				System.out.println("Odd Number");
			}
			break;
			
		case 2:
			int n1,n2,n3;
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
			break;

			
		case 3:
			int age;
			System.out.println("Enter the age");
			age=sc.nextInt();
			if(age>=18) {
				System.out.println("Eligible for Voting");
			}
			else {
				System.out.println("Not eligible for Voting");
			}
			
			break;
			
		default:
			System.out.println("Invalid Choice");
			break;
			
			
		}
		

	}

}
