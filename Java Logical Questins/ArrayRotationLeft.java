class ArrayRotationLeft 
{
	 public static void main(String[] args) 
	{
		int[] arr= {10,20,30,40,50,60,70,80};
		int temp,first;
		int len=arr.length;
		for(int j=0;j<3;j++){
		temp=arr[0];
		for(int i=0;i<len-1;i++){
		  arr[i]=arr[i+1];
		}
		arr[len-1]=temp;
		}
	for(int item: arr)
    System.out.print(item+"  ");
	}
}
