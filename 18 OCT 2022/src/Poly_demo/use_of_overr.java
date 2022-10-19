package Poly_demo;

import java.util.Scanner;

public class use_of_overr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		eg_overriding obj = new eg_overriding();
		eg_overriding obj1 = new eg1_over();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		obj.process(num);
		obj1.process(num);

	}

}
