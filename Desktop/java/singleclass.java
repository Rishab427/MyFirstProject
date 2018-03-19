class singleclass
{
private static singleclass obj;
private singleclass()
{
}
public static singleclass getInstance()
{
if(obj==null)
{
obj=new singleclass();
}
return obj;
}
}
class singlet
{
public static void main(String args[])
{
singleclass t1=singleclass.getInstance();
singleclass t2=singleclass.getInstance();
if(t1==t2)
System.out.println("Same");
}
}