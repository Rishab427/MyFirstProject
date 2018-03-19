import java.util.*;
class time
{public static void main(String[] ra)
{Scanner sc = new Scanner(System.in);
	int t=sc.nextInt();
String [] ar= new String[t];
int [] foo = new int[t];
for(int i=0;i<t;i++)
{

ar[i]=sc.nextLine();
}
for(int i=0;i<t;i++)
{


foo[i]=Integer.parseInt(ar[i],2);
System.out.println(foo[i]);
}
}
}