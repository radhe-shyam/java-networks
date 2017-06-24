class matrix
	{
	int a[][]=new int[3][3];
	matrix()
		{
		//a=new int[3][3];
		for(byte i=0;i<3;i++)
			{
			for(byte j=0;j<3;j++)
				{
				a[i][j]=j+i;
				}
			}
		}
	void print()
		{
		for(byte i=0;i<3;i++)
			{
			for(byte j=0;j<3;j++)
				{
				System.out.print("\t"+a[i][j]);
				}
			System.out.println();
			}
		}
	matrix add(matrix m2)
		{
		matrix m3=new matrix();
		for(byte i=0;i<3;i++)
			for(byte j=0;j<3;j++)
				{
				m3.a[i][j]=0;
				for(byte k=0;k<3;k++)
					m3.a[i][j]=m3.a[i][j]+(m2.a[i][k]*a[k][j]);
				}
		return m3;
		}
	}
class rdj
	{
	public static void main(String arg[])
		{
		matrix m1=new matrix();
		m1.print();
		matrix m2=new matrix();
		matrix m3;
		m3=m1.add(m2);
		m3.print();
		}
	}