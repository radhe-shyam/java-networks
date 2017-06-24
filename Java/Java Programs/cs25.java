class cs25
{
	public static void main(String[] args)
	{
	Long telNo = new Long(0);
	for(int i = 0; i < args[0].length(); i++)
		telNo = telNo * 10 + getNumber(args[0].charAt(i));
	System.out.print("Telephone number is " + telNo);	
	}
	public static int getNumber(char ch)
	{
	if (ch >=48 && ch <=57)
		return ch-48;
	if(ch >= 'a' && ch <='z')
		ch -= 32;
	else if(!(ch >= 'A' && ch <= 'Z'))
		ch = 59;
	if (ch > 'R')
		if (ch == 'Z') 	return 9;
		else		ch--;
	return (ch-59)/3;
	}
}