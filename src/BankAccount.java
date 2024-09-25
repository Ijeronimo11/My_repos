
public class BankAccount {
	int id;
	String name;
	double balance;
	
	double popolnenieScheta(double bablo) {
		balance += bablo;
		System.out.println(balance);
		return balance;
	}
	
	double snyatieSoScheta(double dengi) {
		balance -= dengi;
		System.out.println(balance);
		return balance;
	}

	public static void main(String[] args) {
		BankAccount MyAccount = new BankAccount();
		BankAccount YourAccount = new BankAccount();
		BankAccount HisAccount = new BankAccount();
		
		MyAccount.id = 1;
		MyAccount.name = "Zaur";
		MyAccount.balance = 12.35;
		MyAccount.popolnenieScheta(10.10);
		
		YourAccount.id = 2;
		YourAccount.name = "Mike";
		YourAccount.balance = 2.00;
		
		HisAccount.id = 3;
		HisAccount.name = "Ivan";
		HisAccount.balance = 124.12;
		HisAccount.snyatieSoScheta(24.12);
	}
}
