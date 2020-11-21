/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int c;
		float four=0,three=0,two=0,one=0;
		while(N-- >0) {
			c=in.nextInt();
			if(c==1) one++;
			else if(c==2) two++;
			else if(c==3) three++;
			else if(c==4) four++;
		}

		float ans=0;
		if(one>three) {
		    float r_one=one-three;
		    if(two==(r_one*2)) 
		        ans=two;
		    else if(two>(r_one*2)) 
		        ans=(r_one*2)+(float)Math.ceil((two-(r_one*2))/2);
		    else if(two<(r_one*2))
		        ans=two+(float)Math.ceil((r_one-(two*2))/4);
		    
			ans+=four+three;
		}
		else if(one<three)
			ans=four+one+(float)Math.ceil(two/2)+(three-one);
		else 
		    ans=four+one+(float)Math.ceil(two/2);

		System.out.println((int)ans);
	}
}
