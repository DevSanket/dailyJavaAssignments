package sankets;

import java.util.Scanner;

public class Sub {
	public static void sub_demo() {
		int num1,num2,res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Numbers");
		num1 = sc.nextInt();
		num2= sc.nextInt();
		res = num1-num2;
		System.out.println("The Sub is ="+res);
	}
}
