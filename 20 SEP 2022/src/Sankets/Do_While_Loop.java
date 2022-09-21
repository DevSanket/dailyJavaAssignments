package Sankets;

import java.util.Scanner;

public class Do_While_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int menu_item;
		char ans;
		
		Scanner sc  =  new Scanner(System.in);
		do {
			System.out.println("Menu \n1:Starter \n2: Main Course \n3:Deserts");
			menu_item = sc.nextInt();
			switch(menu_item) {
			case 1:
				System.out.println("1:Item1");
				System.out.println("2:Item2");
				System.out.println("3:Item3");
				break;
			case 2:
				System.out.println("1:Item1");
				System.out.println("2:Item2");
				System.out.println("3:Item3");
				break;
			case 3:
				System.out.println("1:Item1");
				System.out.println("2:Item2");
				System.out.println("3:Item3");
				break;
			default:
				System.out.println("Invalid Number");
				break;
			}
			
			System.out.println("Do You want to add Another item y/n");
			ans = sc.next().charAt(0);
			
		}while(ans == 'Y' || ans=='y');
		System.out.println("Thanks for Comming");
		sc.close();
	}

}
