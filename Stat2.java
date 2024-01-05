class Stat2{

    int a=20;
    static int b=20;
    void fun()
    {
       System.out.println(a);
       System.out.println(b);
    }

     static void fun1()
    {

        
       System.out.println(b);
    }
    
	public static void main(String[]args)
	{

	 Stat2 obj=new Stat2();
     obj.fun();
     obj.fun1();
     System.out.println("after initialization");
     obj.a=30;
     obj.b=60;

obj.fun();
     obj.fun1();
	}
}
