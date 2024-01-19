class This5{
    int x=10;

    This5(){
    this.x=20;
    System.out.println(x);
    System.out.println("non-para");
    }

    This5(int x){
     this.x=30;
     System.out.println(x);
     System.out.println("In Atg");
    }

	public static void main(String[]args){

	This5 obj=new This5();
	This5 obj1=new This5(50);
	}
}