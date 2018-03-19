class Continuewhile
{
public static void main(String [] args)
{int i;
while(i<5);
{
System.out.println(i+" ");
if(i%2==0)
{
continue;
i=i+1;
}
System.out.println("NO continue");
}}}