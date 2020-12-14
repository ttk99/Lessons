import javafx.application.Application;
   import javafx.stage.Stage;
   import javafx.scene.Scene;
   import javafx.scene.layout.BorderPane;
   import javafx.scene.control.Label;
   import javafx.scene.control.TextField;
   import javafx.scene.control.Button;
   import javafx.event.ActionEvent;
   import javafx.event.EventHandler;
   public class Test2 extends Application{
   	public static void main (String[] args){
   		launch(args);

   }
   @Override
   public void start (Stage stage){

   	Label label = new Label("hello");
   	TextField field = new TextField("TTK");
   	Button button = new Button("OK");
   	button.setOnAction(new EventHandler<ActionEvent>(){

   		@Override
   		public void handle(ActionEvent e){
   			System.out.println("HEHE");
   			String msg = field.getText();
   			label.setText(msg);
   		}
   	});


   	BorderPane pane = new BorderPane();
   	pane.setCenter(field);
    pane.setTop(label);
    pane.setBottom(button);

    Scene scene = new Scene(pane,350,250);

       stage.setScene(scene);

       stage.show();
   }
}