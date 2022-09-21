package Sankets;

import java.util.Scanner;

public class For_Loop {
	
	public static void main(String arg[]) {
		int min,max,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Minimum Number");
		min=sc.nextInt();
		System.out.println("Enter Max Number");
		max=sc.nextInt();
		sc.close();
		// if max number is invalid not greater than min
		if(max < min) {
		 for(i=min;i>=max;i--) {
			 System.out.println(i);
		 };
		}else {
			for(i=min;i<=max;i++) {
				System.out.println(i);
			}
		}
	}

}
