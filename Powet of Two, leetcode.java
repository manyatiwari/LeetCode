/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{   
	    int n = 16;
		int ans=1;
        
        for(int i=0;i<31;i++){
            if(n == ans)
                System.out.println("true");
            
        if(ans < Integer.MAX_VALUE/2)
            ans = ans*2;
            
        }
        System.out.println("false");
	}
}
