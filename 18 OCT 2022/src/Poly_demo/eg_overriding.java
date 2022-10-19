package Poly_demo;

public class eg_overriding {
	
	void process(int num) {
		int r,s=0;
		do {
			r=num%10;
			s=s+r;
			num=num/10;
		}while(num>0);
		
		System.out.println("The Sum of digit is ="+s);
	}

}
