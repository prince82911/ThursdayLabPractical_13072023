package Prince;

import java.util.Scanner;

public class MultiplicationOfTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num1=sc.nextInt();
		for(i=1;i<=10;i++) {
			System.out.println(num1+"*" +i +"=" +(num1*i));
		}

	}

}
