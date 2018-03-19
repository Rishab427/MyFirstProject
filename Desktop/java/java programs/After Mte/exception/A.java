import java.util.*;
class encrypt
{
	public static void main(String [] ar)
	{
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		int [] n =new int[t];
		int [] k = new int[t];
		char [][] a= new char[t][];
		for(int i =0;i<t;i++)
		{	n[i]=sc.nextInt();
		    k[i]=sc.nextInt();
		}
		for(int z=0;z<t;z++)
		{
			int f = n[z];
			a[z]= new char[f];
			a[z]= sc.next().toCharArray();
		
		}
		for(int z=0;z<t;z++)
		{
			int f = n[z];
			a[z]= new char[f];
			System.out.println(a[z]);
			
		}
	}
}