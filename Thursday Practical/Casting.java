class Casting
{
	public static void main(String[] args)
	{
		int A = 81;
		char A2 = (char)A;
		double D = 323.142d;
		int D2 = (int) D;
		float F1 = 72.38f;
		int F2 = (int) F1;
		byte D3 = (byte) D;

		System.out.println("char value of 81 = "+ A2);
		System.out.println("integer value of 323.142 = " + D2);
		System.out.println("integer value of 72.38 = " + F2);
		System.out.println("byte value of 323.142 = " + D3 ); 	
	}
}