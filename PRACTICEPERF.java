// https://www.codechef.com/problems/PRACTICEPERF?tab=statement
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
		int res=0;
		for(int i =0;i<4;i++){
		    int a = s.nextInt();
		    if(a>=10)
		    res = res+1;
		}
		System.out.println(res);
	}
}
