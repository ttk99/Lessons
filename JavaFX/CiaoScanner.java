import java.util.Scanner;
  
  public class CiaoScanner {
    public static void main( String[] args ) {
      Scanner sc = new Scanner( System.in );	
      System.out.print( "input your name >" );
      System.out.print( "input your msg: " );
      String msg = sc.nextLine();
       int loop = 10;
      for ( int i=0; i<loop; i++ ) {
        System.out.println( i + ": " + msg + "! from " + name );
    }
  }
}