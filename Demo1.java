//Null pointer exception
class Demo1{
    void m1(){
    System.out.println("in m1");
    }
    void m2(){
    System.out.println("in m2");
    }
   
	public static void main(String[]args){
	System.out.println("main start");
	Demo1 obj=new Demo1();
	obj.m1();
	obj=null; //null pointer exception occurs
	obj.m2();
	System.out.println("end main");
	}
}