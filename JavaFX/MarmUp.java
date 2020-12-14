import java.util.Scanner;
  
  public class WarmUp {
    public static void main ( String[] args ) {
      String[] data = getData();			// データをつくる
      showData( data )				// データを表示する
    }
    
    // getData() メソッド;   データをつくる
    public static String[] getData () {
      System.out.println( "getData()!" );
      // データをつくる;  スキャナで入力する
      String[] fruits = new String[3];
      Scanner sc = new Scanner( System.in );
      
      for ( int i=0; i<3; i++ ) {
        System.out.print( "favorite fruit?  > " );
        fruits[i] = sc.nextLine();
      }
      
      // データをあげる
      return fruits;
    }
    
    // showData() メソッド;  データを表示する
    public static void showData( String[] names ) {
      System.out.println( "showData()!" );
      
      for ( int i=0; i<3; i++ ) {			// もらったデータを表示する
        System.out.println( names[i] );
      }
    }
  }