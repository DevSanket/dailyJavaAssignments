package sankets;

import java.util.Scanner;

public class Inherit {
	
	static int demo = 10;
	public static void add() {
		int num1,num2,res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		res = num1+num2;
		System.out.println("The Add is = "+res);
	}

}
