//**VADADA VENKATA NAGA DINESH**//
//**Git hub user id vvndinesh**//

import java.util.Scanner;
public class Atm{
	long acnt;
	int check,pin,balance,actionAmnt,option;
	String name,address,bank,action;
	Scanner input =new Scanner(System.in);

	public void account()
	{
		System.out.println("Enter your account number");
		acnt= input.nextInt();
		System.out.println("Enter your Pin");
		pin= input.nextInt();
		check();
	}

	public void check()
	{
		if(acnt==222111000 && pin==1234)
		{
			name= "Sailesh";
			address="Hyderabad";
			bank="SBI";
			balance=100000;
			check=1;
		}
		else if(acnt==111222333 && pin==0000)
		{
			name= "Stark";
			address="NewYork";
			bank="American Bank";
			balance=230000;
			check=1;
		}
		else
		{
			System.out.println("********************************************");
			System.out.println("Please enter correct Account Number and Pin!");
			System.out.println("********************************************");	
			account();
		}
	}

	public void show()
	{
		if(check==1 || check==2)
		{
			System.out.println("***************************");
			System.out.println("  Hello,"+name  );
			System.out.println("  Account No: "+acnt );
			System.out.println("  Bank: "+bank  );
			System.out.println("  Account Balance: "+balance  );
			System.out.println("***************************");
			System.out.println("       Select Option       ");
			System.out.println(" 1.Withdrawl   2.Add Money ");
			System.out.println("***************************");
			option();
			System.out.println("How much amount you want to "+action+" ?");
			actionAmnt=input.nextInt();
			balance();
			System.out.println("***************************");
			System.out.println(action+" "+"Amount is :"+ actionAmnt);
			System.out.println("Balance Amount is :"+balance);	
			System.out.println("***************************");	
		}
	}

	public void option()
	{
		option=input.nextInt();
		if(option>2)
		{
			System.out.println("Enter a Valid Option");
			option();
		}
		else
		{
			balance();
		}
	}

	public void balance()
	{
		if(option==1)
		{
			action="Withdraw";
			balance= balance-actionAmnt;
		}
		else if(option==2)
		{
			action="Credit";
			balance= balance+actionAmnt;
		}
	}

	public static void main(String[]args)
	{
		Atm out=new Atm();
		out.account();
		out.check();
		out.show();
	}
}
