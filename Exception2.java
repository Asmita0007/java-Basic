import java.util.Scanner;

class Exception2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        try {
            int number = Integer.parseInt(sc.next());
        }/* catch (NumberFormatException ex) {
            System.out.println("enter the valid no only");
        } */
        catch (Exception obj) {
            System.out.println("enter the valid no only");
        }
    }
}
