/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s=new Scanner(System.in);
	String str=s.next();
	int count=0;
	for(int i=0;i<str.length();i++)
	 {
	char ch=str.charAt(i);
	if(Character.isDigit(ch))
              count++;
	 }
	 if(count==0)
	 System.out.println("No");
	 else
	  System.out.println("Yes");
	 
	 
	
	}
}
