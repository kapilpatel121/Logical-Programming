class Program02 
{

	public static void main(String[] args) 
	{
		int count=1;
		int num=5;
		for(int i=0;i<num;i++){
			for(int j=0;j<num-i+1;j++){
				System.out.print(" ");		     
			}
			for(int k=0;k<i+1;k++){
				System.out.print(count++);		     
			}
			System.out.println();
		}
	}
}
