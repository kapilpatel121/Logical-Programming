public class SelectionSort
{
public static void main(String[] args) {
		int[] arr= {87,54,23,12,2,69,47,52,22,10,4};
		int len=arr.length;
	    int temp;
	      for(int i=0;i<len-1;i++){
	      for(int j=i+1;j<len;j++){
	       if(arr[i]>arr[j]){
	           temp=arr[i];
	           arr[i]=arr[j];
	           arr[j]=temp;
	       }	   
	  }
   }
    for(int item: arr)
    System.out.print(item+"  ");
}
}