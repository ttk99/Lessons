import javafx.application.Application;
   import javafx.stage.Stage;
   import javafx.scene.Scene;
   import javafx.scene.layout.BorderPane;
   import javafx.scene.control.Label;
   public class Test3 extends Application {
     public static void main( String[] args ) {
       launch( args );
     }
     
     @Override
     public void start( Stage stage )throws Exception{
     	//Label
     	Label A = new Label("hihi!");
     	//Pane
     	BorderPane pane = new BorderPane();
     	pane.setCenter(A);
     	//Scene
     	Scene scene = new Scene(pane,300,200);
     	//Stage
     	stage.setScene(scene);
     	stage.show();
     }
 }