public class Pattern05
{
		public static void main(String[] args) {
		int n=5;
	  for(int i=0;i<=n;i++){
	    for(int j=0;j< (n/2)-i;j++){	
		  System.out.print(" ");
		}
		for(int k=0;k<=i;j++){
          System.out.print("*");
	  }
	   System.out.println("");
	  }
	}
}
/*

      *
     **
    ***
   ****
  *****
 ******

*/