class fuzz
{
public static void main(String[] args)
{
int i;
for(i=1;i<=50;i++)
{
if(i%5==0 && i%3==0)
{
System.out.println("FuzzBuzz");
continue;
}
if(i%3==0)
{
System.out.println("Fuzz");
continue;
}
if(i%5==0)
{
System.out.println("Buzz");
continue;
}

System.out.println(i);
}}}