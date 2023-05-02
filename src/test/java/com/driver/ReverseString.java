package com.driver;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String str = "This is the string to reverse";
		
		String[] arr = str.split(" ");
		
		String rev = "";
		
		char []ch1 = arr[5].toCharArray();
		
		for(int i=ch1.length-1;i>=0;i--)
		{
			rev = rev+ch1[i];
			rev = rev+" ";
		}
	
		
		
	
	
	char []ch2 = arr[4].toCharArray();
	
	for(int i=ch2.length-1;i>=0;i--)
	{
		rev = rev+ch2[i];
		rev = rev+" ";
	}

	

	
	
	char []ch3 = arr[3].toCharArray();
	
	for(int i=ch3.length-1;i>=0;i--)
	{
		rev = rev+ch3[i];
		rev = rev+" ";
	}

	
	
	char []ch4 = arr[2].toCharArray();
	
	for(int i=ch4.length-1;i>=0;i--)
	{
		rev = rev+ch4[i];
		rev = rev+" ";
	}
	
	
char []ch5 = arr[1].toCharArray();
	
	for(int i=ch5.length-1;i>=0;i--)
	{
		rev = rev+ch5[i];
		rev = rev+" ";
	}
	
	
char []ch6 = arr[0].toCharArray();
	
	for(int i=ch6.length-1;i>=0;i--)
	{
		rev = rev+ch6[i]+" ";

	}
	
	System.out.println(rev);

	
	
}

}
