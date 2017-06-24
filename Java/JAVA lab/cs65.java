import java.io.*;
class io 
{
	public static String ip()
	{
	try{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}catch(Exception e){return null;}
	}
	public static void op(String str)
	{
	System.out.print(str);
	}
	public static void opn(String str)
	{
	System.out.println(str);
	}
}
class Scanner
{
	float colorDepth, densityRange, resolution;
	void checkDensity()
	{
	io.op("Enter the density of Scanner : ");
	densityRange = Float.parseFloat(io.ip());
	io.op("Press 1 for Consumer level flat bed scanner\nPress 2 for Hign end flat bed scanner\nPress 3 for Drum scanner\n\tEnter you choice : ");
	switch(Integer.parseInt(io.ip()))
		{
		case 1:	if (densityRange >= 3.0 || densityRange <= 2.5)
			io.op("In");
			break;
		case 2:	if (densityRange >= 3.7 || densityRange <= 2.5)
			io.op("In");
			break;
		case 3:	if (densityRange >= 4.5 || densityRange <= 3.6)
			io.op("In");
			break;
		default:io.opn("Invalid choice.");
			System.exit(0);
		}
	io.op("Valid density Range.");
	}
}
class Copier extends Scanner
{
	float responsetime;
	int paperCapacity, type;
	void getCopiertype()
	{
	io.op("Press 1 for color copier\nPress 2 for B&W copier\nPress 3 for Hybrid Copier\n\tEnter Your Choice : ");
	type = Integer.parseInt(io.ip());
	}
	void getresponsetimeandPaperCapacity()
	{
	io.op("Enter the response time : ");
	responsetime =  Float.parseFloat(io.ip());
	io.op("Enter the paper capacity : ");
	paperCapacity = Integer.parseInt(io.ip());
	}
	void suggest()
	{
	getresponsetimeandPaperCapacity();
	io.op("Enter the density range for scanner : ");
	densityRange = Float.parseFloat(io.ip());
	io.op("Suggested Copier is ");
	if (paperCapacity <= 100 && responsetime <= 3.5)
		io.opn("Color Copier.");
	else if (paperCapacity <= 200 && responsetime <= 6.5)
		io.opn("B&W Copier."); 
	else	io.opn("Hybrid Copier.");
	io.op("Suggested Scanner is ");
	if (densityRange <= 3.0)
		io.opn("Consumer level flat bed scanner.");
	else if (densityRange <= 3.7)
		io.opn("High end flat bed scanner.");
	else 	io.opn("Drum scanner.");
	}
}
class cs65
{
	public static void main(String[] args)
	{
	Copier obj = new Copier();
	obj.suggest();
	}
}


/*
>java cs65
Enter the response time : 3.5
Enter the paper capacity : 150
Enter the density range for scanner : 4
Suggested Copier is B&W Copier.
Suggested Scanner is Drum scanner.
*/