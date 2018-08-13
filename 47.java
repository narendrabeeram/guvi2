/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 int small=0;
	 int large=0; 
             int num;
             Scanner input=new Scanner(System.in);
            int n=input.nextInt();
            for(int i=0;i<n;i++)
             {
               num=input.nextInt();
               if(num>large)
                {
                 large=num;
                }
              if(i==0&&num>0)
               small=num;
             if(num<small)
               small=num;
              System.out.println(small+" "+large);
             }
	}
}
