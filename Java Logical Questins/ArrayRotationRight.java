class ArrayRotationRight
{
	  public static void main(String[] args) 
	{
		int[] arr= {10,20,30,40,50,60,70,8};
		int temp,first;
		int len=arr.length;
		for(int j=0;j<3;j++){
		temp=arr[len-1];
		for(int i=len-1;i>0;i--){
		  arr[i]=arr[i-1];
		}
		arr[0]=temp;
		}
	for(int item: arr)
    System.out.print(item+"  ");
	}
}
