public class BubbleSort {
    public static void main(String[] args) {
		int[] arr= {87,54,23,12,2,69,47,52,22,10,4};
		int len=arr.length;
	    int temp;
	      for(int i=0;i<len-1;i++){
	      for(int j=0;j<len-1-i;j++){
	      	  if(arr[j]>arr[j+1]) {
	      	      temp=arr[j];
	      	     arr[j]= arr[j+1];
	      	     arr[j+1]=temp;
	      	      
	      	  }
	  }
   }
    for(int item: arr)
    System.out.print(item+"  ");
}
}
