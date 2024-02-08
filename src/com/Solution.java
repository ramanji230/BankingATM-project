package com;
import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {

		System.out.println("Welcome to AndhraBank");
		System.out.println("------------------------");
		Scanner ip = new Scanner(System.in);


		Bank bank = new BankImpl(5000);//upcasting for achive abstraction

		while(true) {
			
			System.out.println("1:Deposite Amount \n2:withdraw Amount");
			System.out.println("3:check balance \n4:Exit");
			int choice = ip.nextInt();


			switch(choice) {

			case 1:
				System.out.println("Enter deposite amount:");
				int amountToDeposit = ip.nextInt();
				bank.deposit(amountToDeposit);//bank.deposit(ip.nextInt());
				break;


			case 2:
				System.out.println("Enter withdraw amont");
				int amountToWithdraw = ip.nextInt();
				bank.withdraw(amountToWithdraw);//bank.withdraw(ip.nextInt());
				break;


			case 3:
				bank.checkBalance();
				break;

			case 4:
				System.out.println("Thank you! visit Again");
				System.exit(0);

			default:
				try {
					throw new InvaildChoiceException("Ivaild choice!");
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
					
				}
			}
			System.out.println("------------------");
		}
		//Scanner
		//upcasting -->Bank & BankImpl
		//infinite loop--->while(true)
		//menu Driven prg -->1:Deposite Amount 2: 3: 4:exit
		//switch()-->case 1: 2 : 3: 4: default


	}
}