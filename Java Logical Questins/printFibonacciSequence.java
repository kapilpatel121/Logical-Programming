class printFibonacciSequence 
{
	public static void main(String[] args) 
	{ 
		int n=10;
         int a=-1;
		 int b=1;
		 int sum=0;
		for(int i=0;i<n;i++){
		 	sum=a+b;
			 a=b;
			 b=sum;
			System.out.print(sum+ " ");

		}
	
	}
}
