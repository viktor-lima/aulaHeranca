package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	public static void main(String[] args) {
	
		
		List<Account> list = new ArrayList<>();
		
		
		list.add(new SavingsAccount(1001, "maria", 500.00, 0.01));
		
		list.add(new BusinessAccount(1002, "Alex", 1000.00, 400.00));
		
		list.add(new SavingsAccount(1003, "Bob", 500.00, 0.01));
		
		list.add(new BusinessAccount(1004, "anna", 500.00, 500.00));
		
		Double sum = 0.00;
		
		for (Account account : list) {
			sum += account.getBalance();
		}
		
		System.out.printf("total balance: %.2f%n", sum);
		
		for (Account account : list) {
			account.deposit(10);
		}
		for (Account acc : list) {
			System.out.printf(" update balance fot account %d: %.2f%n", acc.getNumber() , acc.getBalance());
		}
		
	
		
		
		
		
		
		
		
		
		/*Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);
		
		
		// UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "bob", 0.0, 200.00);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("update!");
		}
		
		*/
	}
}
