class Fibonacci{
	
		public static void main(String args[])
		{
		fibonacci(1,1);
		}

	public static void fibonacci(int a, int b)
	{
			if((a + b) < 1000)
		{
			int sum = a+ b;
			System.out.println(b + "" + sum);
			fibonacci(b, sum);
		}

	}


}