class Test1 {
	 
	public static void main(String[] args) 
	{
        Gen<String,Integer> obj = new Gen<String,Integer>("Hello",12);
        System.out.println(obj.getObject());
	System.out.println(obj.getObject1());
	obj.showType();
	}

	}
class Gen<T,V>
{
	T str;
	V i;
	Gen(T s,V e)
	{
		str=s;
		i=e;
	}
	T getObject()
	{
		return str;
		
	}
	V getObject1()
	{
		return i;
		
	}
	void showType()
	{
	System.out.println("Object Type is :- "+str.getClass());
	System.out.println("Object Type is :- "+i.getClass());
	}	

}