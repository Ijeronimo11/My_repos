package again4;

public class BankAccount {
	int id;
	String name;
	double balance;	
	
	public static void main(String[] args) {
		BankAccount MyAccount = new BankAccount();
		BankAccount YourAccount = new BankAccount();
		BankAccount HisAccount = new BankAccount();
		
		MyAccount.id = 1;
		MyAccount.name = "Antoha";
		MyAccount.balance = 12.35;
		
		YourAccount.id = 2;
		YourAccount.name = "Zaur";
		YourAccount.balance = 2.00;
		
		HisAccount.id = 3;
		HisAccount.name = "Sergey";
		HisAccount.balance = 124.12;
		
		System.out.println(HisAccount.name);
	}
}

