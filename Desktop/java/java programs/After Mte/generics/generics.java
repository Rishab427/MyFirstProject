class Test {
	 
	public static void main(String[] args) 
	{
        Gen<String> obj = new Gen<String>("Hello");
        System.out.println(obj.getObject());
	obj.showType();
	Gen<Integer> obj1 = new Gen<Integer>(25);
        System.out.println(obj1.getObject());
	obj1.showType();
	}

	}
class Gen<T>
{
	T str;
	Gen(T s)
	{
		str=s;
	}
	T getObject()
	{
		return str;
	}
	void showType()
	{
	System.out.println("Object Type is :- "+str.getClass());
	}	

}