package Prince;

import java.util.Scanner;

public class VotingEligiblity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		age=sc.nextInt();
		if(age>=18) {
			System.out.println("Eligible for Voting");
		}
		else {
			System.out.println("Not eligible for Voting");
		}

	}

}
