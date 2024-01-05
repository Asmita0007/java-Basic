class Stat{
    int a=10;
    static int b=20;
    static void harsh()
    {
  // System.out.println(a);
    System.out.println(b);

    }
     
     void asmi()
     {
      System.out.println(a);
      System.out.println(b);
     }

	public static void main(String[]args){

	Stat obj=new Stat();
	obj.harsh();
	obj.asmi();
	}
}