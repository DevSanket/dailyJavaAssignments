package Sankets;

import java.util.Scanner;

public class While_Loop {
 public static void main(String arg[]) {
	 int min,max;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Minimum Number");
		min=sc.nextInt();
		System.out.println("Enter Max Number");
		max=sc.nextInt();
		sc.close();
		
		while(min<=max) {
			System.out.println(min);
			min++;
		}
	 
 }
}
