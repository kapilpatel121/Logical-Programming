class  StringReverse
{
	public static void main(String[] args) {
	String str="java Programming";
	  String res="";
	  
	  char[] arr=str.toCharArray();
	  
	  for(int i=arr.length-1;i>=0;i--){
	      res=res+str.charAt(i);
	  }
	  
	  System.out.println(res);
	
}
}
