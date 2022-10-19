package sanketscode;

public class Bank_process {
	private int pass;
	private int ac_bal=500;
	
	public int getPass() {
		return pass;
	}
	
	public void setPass(int abc) {
		this.pass = abc;
	}
	
	public int getAc_bal() {
		return ac_bal;
	}
	
	public void setAc_bal(int new_val) {
		this.ac_bal += new_val;
	}
}


