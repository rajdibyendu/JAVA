package encapsulation;

class Bank{
	private int bal;
	public void balance(int bal) {
		this.bal=this.bal+bal;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
		
}
public class UserBank {
	public static void main(String[] args) {
		Bank bnk=new Bank();
		bnk.setBal(1000);
		System.out.println(bnk.getBal());
	}
}

//If we declare balance variable(bal) as Public in Bank class then UserBank class will
//access balance variable directly and can assign any value which is illegal as per 
//the Bank Object.