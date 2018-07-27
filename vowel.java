import java.util.*;
import java.lang.*;
import java.io.*;
class Char
{
	public static void main(String[ ] arg)
	{
	int i=0;
	Scanner sc=new Scanner(System.in);
	char ch=sc.next( ).charAt(0);	 		
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	{
	System.out.println("Vowel");
	}
	else if(ch>='a'&&ch<='z')
		System.out.println("Consonant");
	      else
		System.out.println("invalid");
	}
}
