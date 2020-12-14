public class People {
    public static void main ( String[] args ) {
      Teacher tanaka = new Teacher("田中", "元気ですか？");
      Teacher yamamoto = new Teacher("山本", "出席たりてますか？");
      Teacher yoshino = new Teacher("吉野", "ALOHA!");
      
      tanaka.hello();
      yamamoto.hello();
      yoshino.hello();
      
      attack( tanaka, yoshino );
    }
    
    public void attack( tanaka, yoshino ) {
      System.out.println( .name + "のこうげき！" );
      System.out.println( .name + "に 5 のダメージ！" );
      
      int newHp = .hp - 5;
      .hp = newHp;
      
      if ( .hp <= 0 ) {
        System.out.println(  をたおした！ );
      }
    }
  }