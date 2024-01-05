class NonStat{
    static int a=10;
    static int b=20;
    void fun1()
    {
      System.out.println(a+b);
    }

	public static void main(String args[]){
	NonStat obj=new NonStat();
	obj.fun1();

	}
}