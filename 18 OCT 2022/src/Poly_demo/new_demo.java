package Poly_demo;

public class new_demo extends ab_Demo {
	
	public static void disp(int num1) {
		System.out.println("Bye from disp method of Second Class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new_demo obj = new new_demo();
		obj.disp(22);
		ab_Demo obj1 = new new_demo();
		obj1.disp(22);

	}

}
