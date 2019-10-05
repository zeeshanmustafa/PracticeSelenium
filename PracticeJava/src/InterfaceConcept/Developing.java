package InterfaceConcept;

public class Developing implements BankingClient, DomainClient{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Developing deve = new Developing();
		
		deve.login();
		deve.CheckingBalance();
		deve.TransferBalance();
		deve.PayCreditCard();
		
		BankingClient dr = new Developing();//its called 'Run time polymor'
		
		 DomainClient DC=new Developing();
		 DC.investment();

	}

	@Override
	public void PayCreditCard() {
		// TODO Auto-generated method stub
		
		System.out.println("Pay Credit Card Implemented");
		
	}

	@Override
	public void CheckingBalance() {
		// TODO Auto-generated method stub
		System.out.println("Checking Balance implemented");
		
	}

	@Override
	public void TransferBalance() {
		// TODO Auto-generated method stub
		
		System.out.println("TransferBalance Implemented");
		
	}
	
	public void login() {
		
		System.out.println("Login method");
	}

	@Override
	public void investment() {
		// TODO Auto-generated method stub
		System.out.println("Investment method implemented");
		
	}

}
