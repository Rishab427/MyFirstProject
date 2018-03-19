import java.util.*;
class abc
{
	static long binaryToint(String s)
	{   char []c =new char[s.length()];
	c=s.toCharArray();
	long m =(long)s.length();
	long sum=0;
	long [] a= new long[s.length()];
	for(int i=0;i<s.length();i++)
	a[i]=(long)(((int)c[i])-48);
for(int i=0;i<s.length();i++)
{
	sum =sum+(long)(a[i]*(Math.pow(2,m-1)));
    m--;
}
	return(sum);	
	}
	
	public static void main(String [] ar)
	{   Scanner sc = new Scanner(System.in);
	int n;
	n= sc.nextInt();
		String []s =new String[n];
		long smPrime=0;
		for(int c=0;c<n;c++)
		{
		s[c]= sc.next();
		
		}
		for(int f=0;f<n;f++)
		{
		long z=binaryToint(s[f]);
		for(long x =2;x<=z;x++)
		{if(x%2==0||x%3==0||x%5==0)
			{
				if(x==2||x==3||x==5)
					smPrime =smPrime+x;
			}
			else
				smPrime=smPrime+x;
			
			
		}
		System.out.println(smPrime);
		smPrime=0;
		
	}}
	
}
		