package sankets;

public class Sub1 extends Accept_Val {
	
	public void process() {
		accept();
		res = num1-num2;
		System.out.println("This Sub is = "+res);
	}
	
	public static void main(String arg[]) {
		Sub1 obj = new Sub1();
		obj.process();
		
	}
	

}
