/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class main
{
	public static void main (String[] args) throws java.lang.Exception
	{   
	    int x = 123;
	    int rev =0;
        while(x!=0)
        {
            int d = x%10;
            if((rev > Integer.MAX_VALUE/10) || (rev < Integer.MIN_VALUE/10))
                 System.out.println(0);
            rev = (rev*10)+d;
            x=x/10;
        }
        System.out.println(rev);
	}
}
