//to check if a vowel is present in a string.
class    Is_vowel_Present
{
		public static void main(String[] args) 
	{
	 String str="java Programming";
	  String res="";
	  boolean flag=false;
	  char c;
	  char[] arr=str.toCharArray();
      int i;
	  for( i=0;i<arr.length;i++){
		  c=Character.toLowerCase(str.charAt(i));
		  if(c=='a' || c=='i' || c=='e' || c=='o' ||c=='u'){
			  flag=true;
			  break;
		  }
	  }	
	  if(flag)
	  System.out.println("Vowel present in String "+str+ " at index ="+ ++i);
	  else
	  System.out.println("Vowel not  present in String "+str);

	}
}
