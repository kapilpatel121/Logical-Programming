// sum of array elements 
class Sum_of_array 
{
	public static void main(String[] args) 
	{
		int[] a= {87,54,23,12,2,69,47,22,10,4};
		
		int sum=0;
		for( int item:a)
			sum+=item;
		System.out.println("sum is : "+sum);
	}
}
