// swap two numbers without using a third variable in Java?
class  SwapWithoutThirdVar
{
	public static void main(String[] args) 
	{
		int a=50;
		int b=20;
		 a=a+b;
         b=a-b;
		 a=a-b;
		System.out.println("a "+a);
	    System.out.println("b "+b);
	}
}
