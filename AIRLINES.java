// https://www.codechef.com/problems/AIRLINES
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int x = 10*(s.nextInt());
		    int y = s.nextInt();
		    int z = s.nextInt();
		    if(x>y){
		        System.out.println(y*z);
		    }else{
		        System.out.println(x*z);
		    }
		}
	}
}
