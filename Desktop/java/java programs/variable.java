class variablelength
{
public static void main(String [] jf)
{
sum(1,2,3);
sum(1,2,3,4,5,6);
int [] a={1,2,3,4,5,6,7,8,9};
sum(a);
}
static void sum(int ... arr)
{
int sum=0;
for(int i=0;i<arr.length;i++)
{
sum=sum+arr[i];
}
System.out.println("Sum is = "+sum);
}
}