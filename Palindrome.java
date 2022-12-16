package stringAssingments;

public class Palindrome {

	public static void main(String[] args) {
		
		String name= "madam";
		String rev= "";
	    int len=name.length();
		char[] cs = name.toCharArray();
		System.out.println(cs);
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
			
	   }
		System.out.println(rev);
	

	if(name.equals(rev))
	{
		System.out.println("Palindrome");
	}else
	{
		System.out.println("Not a Palindrome");
	}
	}
}
