import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
public class Test4 extends Application{
	public static void main (String[]args){
		launch(args);
	}
	@Override
	public void start (Stage stage) throws Exception{
		Label tren = new Label("Hello.javaFX!");
		Label ten = new Label("TTK");
		Label lop = new Label("IG12");

		BorderPane pane = new BorderPane();
		pane.setTop(tren); //trên
		pane.setCenter(ten); //giữa
		pane.setBottom(lop);//dưới

		Scene scene = new Scene(pane,400,300);

		stage.setScene(scene);
		stage.show();
	}
}