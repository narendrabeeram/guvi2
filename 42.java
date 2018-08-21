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
		String s1=s.next();
		String s2=s.next();
		int k=-1;
		for(int i=0;i<s1.length();i++)
		{
			char ch1=s1.charAt(i);
			for(int j=0;j<s2.length();j++)
			{
				char ch2=s2.charAt(j);
				if(ch1>ch2)
				{
					k=0;break;
				}
				else if(ch1<ch2)
				{
					k=0;break;
				}
			}
		}
		if(k==0)
		System.out.print(s1);
		else if(k==1)
		System.out.print(s2);
		else
		System.out.print(s1);
	}
}
