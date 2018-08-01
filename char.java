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
		int N=s.nextInt();
		int K=s.nextInt();
		int a[]=new int[N];
		for(int i=0;i<N;i++)
		a[i]=s.nextInt();
		int sum=0;
		for(int i=0;i<K;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}
