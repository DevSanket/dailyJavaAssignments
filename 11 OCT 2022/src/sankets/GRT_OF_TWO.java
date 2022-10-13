package sankets;

import java.util.Scanner;

public class GRT_OF_TWO extends Sub {
	public static void grt() {
		int num1,num2,res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		if(num1>num2)
		{
			System.out.println("Num1 is grteater "+num1);
		}
		else
		{
			System.out.println("NUM2 is greater "+num2);
		}
	}
}
