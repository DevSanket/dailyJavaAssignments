package sanketscode;

import java.util.Scanner;

public class User_Process extends Bank_process {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User_Process ob = new User_Process();
		ob.process();
		}
	
	public void process() {
		Scanner sc = new Scanner(System.in);
		String u_id;
		int u_pass,u_bal;
		System.out.println("Enter Your User ID");
		u_id=sc.next();
		System.out.println("Enter your password");
		u_pass=sc.nextInt();
		System.out.println("Enter your amount to store in your bank account");
		u_bal=sc.nextInt();
		Bank_process obj=new Bank_process();
		obj.setPass(u_pass);
		obj.setAc_bal(u_bal);
		sc.close();
		
		System.out.println("The User Id is ="+u_id);
		System.out.println("The user _pass="+obj.getPass());
		System.out.println("The acccount balance is ="+obj.getAc_bal());
	}

}
