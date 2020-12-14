import java.util.Scanner;
public class ArrayTest{
	public static void main ( String[] args){
		String password = "asb";

		System.out.print("Imput password:");
		Scanner sc = new Scanner(System.in);
		String userData = sc.nextLine();

		if( password.equals(userData)){
			System.out.println("OK!");
		}eles{
			System.out.println("invalid");
		}
	}
}