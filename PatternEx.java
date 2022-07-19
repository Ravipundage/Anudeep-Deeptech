class PatternEx
{
	public static void main(String[] ar)
	{
		for(int row=1;row<=6;row++)	
		{
			for(int column=1;column<=row;column++)	
			{
				System.out.print("*"+"  ");
			}
			System.out.println();
		}
		for(int row=6;row>=1;row--)	
		{
			for(int column=1;column<=row;column++)	
			{
				System.out.print("*"+"  ");
			}
			System.out.println();
		}
	}


}