import jaca.util.Scanner;

public class Greenting{
	public static void main(String[] args){
		String msg = getGreenting();
		System.out.println(msg);
	}
	public static  String getGreenting(){
		Scanner sc = new Scanner(System.in);
		System.out.print("yoir name? >");
		String name = sc.nextLine();

		String msg = "HELLO," + name "!";

		return msg;
	}
}