//number format exception
import java.io.*;
class BufferDemo{
    void getData(){
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int data=Integer.parseInt(br.readLine());
    System.out.println(data);
    }
	public static void main(String []args)throws{
    BufferDemo obj=new BufferDemo();
    obj.getData();
	}
}