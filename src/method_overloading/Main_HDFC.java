package method_overloading;


class HDFC
{
	public void amt_trnsfer(long mob, int otp)
	{
		System.out.println("Amount is Transferred using MOBILE"+"\n"+"MOBILE NO. : "+mob+"\n"+"OTP : "+otp);
		System.out.println();
	}
	
	public void amt_trnsfer(String name, long card_no, int cvv)
	{
		System.out.println("Amount is Transferred using DEBIT CARD"+"\n"+"NAME : "+name+"\n"+"CARD NO. : "+card_no+"\n"+"CVV : "+cvv);
		System.out.println();
	}
}

class HDFC_Update extends HDFC
{
	public void amt_trnsfer(String vpa)
	{
		System.out.println("Amount is Transferred using UPI"+"\n"+"VPA : "+vpa);
		System.out.println();
	}
}

class Main_HDFC
{
	public static void main(String[] args)
	{
		HDFC_Update ref=new HDFC_Update();
		ref.amt_trnsfer(7050713624L,1234);
		ref.amt_trnsfer("Dibyendu Raj", 1234_5678_1234_5678L, 321);
		ref.amt_trnsfer("rajdibyendu@hdfc");
	}
}
