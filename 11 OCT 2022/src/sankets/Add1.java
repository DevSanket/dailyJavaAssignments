package sankets;

public class Add1 extends Accept_Val {
	public void process(){
		accept();
		res = num1+num2;
		System.out.println("The add is ="+res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add1 obj = new Add1();
		obj.process();
	}

}

