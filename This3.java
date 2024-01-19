class This4{
     int x=10;
     This4(){
     System.out.println("Non_para");
     }

     This4(int x){
       this();
       System.out.println("In _para");
     }
	public static void main(String[]args){
    This4 obj1=new This4(20);
	}
}