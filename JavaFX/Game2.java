import java.util.Scanner;
import java.util.Random;

public class Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		System.out.println("###########");
		System.out.println("##       ##");
		System.out.println("##   TK  ##");
		System.out.println("##       ##");
		System.out.println("###########");
		System.out.println("");
		System.out.println("1:play    2:play");

		System.out.println(">");
		int userInput = sc.nextInt();

		if(userInput = 1){
			System.out.println("Let's play");
		}else{
			System.out.println("############");
		    System.out.println("##        ##");
		    System.out.println("##  Game  ##");
		    System.out.println("##  over  ##");
		    System.out.println("##        ##");
		    System.out.println("############");
		}


		
	}

}