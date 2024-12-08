package week3.day2;

public class Amazon extends CanaraBank {

	@Override
	public void cashOnDelivery() {
		// TODO Auto-generated method stub
		
		System.out.println("Cash on delivery accepted");
		
	}

	@Override
	public void upiPayments() {
		// TODO Auto-generated method stub
		
		System.out.println("UPI payments accepted");
		
	}

	@Override
	public void cardPayments() {
		// TODO Auto-generated method stub
		
		System.out.println("Cards accepted");
		
	}

	@Override
	public void internetBanking() {
		// TODO Auto-generated method stub
		
		System.out.println("internet banking accepted");
		
	}

	public static void main(String args[])
	
	{
		Amazon a = new Amazon();
		a.cardPayments();
		a.cashOnDelivery();
		a.internetBanking();
		a.upiPayments();
	}
}
