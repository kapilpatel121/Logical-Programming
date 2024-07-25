class AllZeroAtLeftRight
{
	 public static void main(String[] args) 
	{
		int[] arr= {10,0,30,40,0,0,70,80,0};
		int temp,count=0;
		int len=arr.length;
		
		for(int i=0;i<len;i++){
		   if(arr[i]==0){
			  temp= arr[count];
			  arr[count++]=0;
			  arr[i]=temp;
		   }
		}
	for(int item: arr)
    System.out.print(item+"  ");
	}
}

