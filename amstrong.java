/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n, nu, num=0, rem;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        nu=n;
        while(nu != 0)
        {
            rem = nu%10;
            num = num + rem*rem*rem;
            nu = nu/10;
        }
        if(num == n)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
        
	}
}
