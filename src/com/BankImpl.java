package com;

public class BankImpl implements Bank{

	int balance;


	BankImpl(int balance){
		this.balance=balance;
	}


	@Override
	public  void deposit(int amount) {
		System.out.println("Depositing Rs."+amount);
		balance = balance+amount;//balance + = amount;
		System.out.println("Amount Deposite successfuly!");
	}


	@Override
	public  void withdraw(int amount) {
		if(amount <= balance) {
			System.out.println("Widthdraw Rs."+amount);
			balance -= amount;//balance = balance - amount;
			System.out.println("Amount withdraw successfuly");
		}
		else {
			try {
				throw new  InsufficintBalanceException("insufficintBalance!");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}


	@Override
	public  void checkBalance() {
		System.out.println("Avilable Balance: Rs."+balance);
	}

}
