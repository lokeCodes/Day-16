// https://www.codechef.com/problems/COURSEREG
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
		    int a = s.nextInt();
		    int b = s.nextInt();
		    int c = s.nextInt();
		    int res = a+c;
		    String res1 = (res<=b) ? "YES" : "NO";
		    System.out.println(res1);
		}
	}
}
