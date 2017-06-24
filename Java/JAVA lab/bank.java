import java.io.*;
class bank
{
	int ac_no,bal;
	bank(int an, int amt)
	{
	ac_no=an;
	bal=amt;
	}
	public void with(int an,int amt)
	{
	if( amt+500 <= bal )
		{
		bal-=amt;
		System.out.println("Amount withdrawl successfully.\nPress any key to continue");
		}
	else
		System.out.println("Insufficient amount.\nPress any key to continue");
	}
	public void dep(int an, int amt)
	{
		bal+=amt;
		System.out.println("Amount Deposited successfully.\nPress any key to continue");
	}
	public void display(int an)
	{
		System.out.println("Available balance : "+ bal + "\nPress any key to continue");
	}
}
class bankMain
{
	public static void main(String[] args)
	{
	try 
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			bank obj[] = new bank[10];
			for(int i = 0; i < 10 ; i++)
				obj[i] = new bank(i+1,0);
			do
			{
			System.out.println("Press 1 for deposit\nPress 2 for Withdrawl\nPress 3 for Enquiry\n\tEnter Your Choice : ");
			int ch =  Integer.parseInt(br.readLine());
			switch(ch)
				{
					case 1:
						{
						System.out.println("Enter your account number : ");
						int an = Integer.parseInt(br.readLine());
						System.out.println("Enter amount : ");
						obj[an-1].dep(an,Integer.parseInt(br.readLine()));	
						break;
						}
					case 2:
						{
						System.out.println("Enter your account number : ");
						int an = Integer.parseInt(br.readLine());
						System.out.println("Enter amount : ");
						obj[an-1].with(an,Integer.parseInt(br.readLine()));	
						break;
						}
					case 3:
						{
						System.out.println("Enter your account number : ");
						int an = Integer.parseInt(br.readLine());
						obj[an-1].display(an);	
						break;
						}
					default: System.exit(0);	
				}
			br.readLine();
			}
			while(true);			
		}
		catch(Exception e){}
	}
}