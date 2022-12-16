package stringAssingments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1= "stops";
		String text2= "potss";
		int L1=text1.length();
		int L2=text2.length();
     
		System.out.println(L1);
      System.out.println(L2);
	char[] Arr1 = text1.toCharArray();
	char[] Arr2 = text2.toCharArray();
	//String[] split=text1.split("");
	//System.out.println(split);
	
	
	for(int i=0;i<Arr1.length;i++)
	{
		System.out.println(Arr1[i]);
	}
	for(int j=0;j<Arr2.length;j++)
	{
		System.out.println(Arr2[j]);
	}
	Arrays.sort(Arr1);
	System.out.println(Arr1);
	Arrays.sort(Arr2);
	System.out.println(Arr2);
	//if ()
		
	
	
	}
	

}
