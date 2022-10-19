package Poly_demo;

public class eg1_over extends eg_overriding{
	
	@Override
	void process(int num) {
		int f=1;
		while(num>0) {
			f=f*num;
			System.out.println(f);
			num--;
		}
		System.out.println("The Factorial is ="+f);
	}

}


