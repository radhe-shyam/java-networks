import java.io.*;
class flight
{
	private static int et=5;
	private static int ft=5;
	private static boolean e[] = new boolean[5];
	private static boolean f[] = new boolean[5];
	private static void book(int t, int ch)
	{
	if ( ch == 1 )
		{
		if ( t > et )
			System.out.println("****Only "+ et + "tickets are available in Economy class.****");
		else	{
			et-=t;
			System.out.println(t + " Tickets booked successfully \n\n");
			}
		}
	else
		{
		
		if ( t > ft )
			System.out.println("****Only "+ ft + " tickets are available in First class.****\n\n");
		else
			{
			ft-=t;
			System.out.println("**** " + t + " Tickets booked successfully.**** \n\n");
			}
		} 
	}

	private static void display()
	{	
		System.out.println("****Economy Class****");
		for(int i = 0; i < e.length; i++)
			{
			System.out.print("Seat number " + (i+1) + " = ");
			if ( e[i] == true)
				System.out.print("Booked");
			else
				System.out.print("Vacant");
			System.out.println();
			}
		System.out.println("****First Class****");
		for(int i = 0; i < f.length; i++)
			{
			System.out.print("Seat number " + (i+1) + " = ");
			if ( e[i] == true)
				System.out.print("Booked");
			else
				System.out.print("Vacant");
			System.out.println();
			}
			
	}
	

	public static void main(String[] args)
	{
	try
		{
		display();
		int m;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do
			{
			clschoose:
			System.out.println("\tPress 1 to Book ticket\n\tPress 2 to exit\n\t\tEnter your choice : ");
			m = Integer.parseInt(br.readLine());
			if ( m == 1 )
				{
				System.out.println("\n\n\tPress 1 for Economy class\n\tPress 2 for First class\n\t\tEnter Your choice : ");
				int ch = Integer.parseInt(br.readLine());
				switch(ch)
					{
			 		case 1: {
						if ( et == 0)
							{
							System.out.println("\n****No tickets are available in Economy class.****\n");
							if ( ft == 0 )
								System.out.println("\n****No tickets available in flight. \n****Your next flight will be in 3 hours.****");
							}
						else
							{
							System.out.print("\nEnter the number of tickets : - ");
							book(Integer.parseInt(br.readLine()), ch);
							}		
						break;
						}
					case 2: {
						if ( ft == 0)
							{
							System.out.println("\n****No tickets are available in First class.****\n");
							if ( et == 0 )
								System.out.println("\n****No tickets available in flight. \n****Your next flight will be in 3 hours.****");
							}
						else
							{
							System.out.print("\nEnter the number of tickets : - ");
							book(Integer.parseInt(br.readLine()), ch);
							}		
						break;
						}
					}
				}
			else
				System.exit(0);
			}
			while(true);
		}
	catch(Exception e){}
	}
}