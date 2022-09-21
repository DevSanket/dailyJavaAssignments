package Sankets;

import java.util.Scanner;

public class Factorial {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to find factorial");
		int fact = sc.nextInt();
		sc.close();
		int ans=1;
		while(fact != 0) {
			ans = fact*ans;
			fact--;
		}
		System.out.println(ans);
		
	}
}
