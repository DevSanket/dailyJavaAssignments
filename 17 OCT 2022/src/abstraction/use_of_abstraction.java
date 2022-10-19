package abstraction;

import java.util.Scanner;

public class use_of_abstraction extends abs_Demo implements Sum_of_numbers {
	
	Scanner sc = new Scanner(System.in);
	
	int num1,num2,sum,size,i;
	
	int[] arr;
	
	public static void main(String arg[]) {
		use_of_abstraction obj = new use_of_abstraction();
		obj.calc();
		obj.add2no();
		obj.addnNo();
		obj.demo();
	}
	
	@Override
	public void add2no() {
		System.out.println("Enter Two Numbers");
		num1=sc.nextInt();
		num2 = sc.nextInt();
		
		sum = num1+num2;
		System.out.println("The Sum is "+ sum);
		
	}
	
	@Override
	public void addnNo() {
		System.out.println("Enter the Size");
		size=sc.nextInt();
		arr=new int[size];
		System.out.println("Enter "+size+" Numbers :");
		sum=0;
		for(int i=0;i<size;i++) {
			arr[i]  = sc.nextInt();
			sum += arr[i];
		}
		System.out.println("The Addition of Array number is ="+sum);
	}
	
	@Override
	public void demo() {
		System.out.println("Hello Everyone");
	}
	

}
