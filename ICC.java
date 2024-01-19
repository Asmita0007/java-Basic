class ICC{
	ICC(){
	 System.out.prinln("In ICC");
	}
}
class BCCI extends ICC{
	BCCI(){
	System.out.println("BCCI");
	}
}
class Client{
	public sattic void main(String[]args){
     BCCI obj=new BCCI();
	}
}