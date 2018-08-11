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
      int i=s.nextInt();
      int j=s.nextInt();
      int temp=i;
             i=j;
           j=temp;
           System.out.println(i+" "+j);
	}
}
