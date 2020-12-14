import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class Test5 extends Application{
	public static void main(String[]args){
		launch(args);
}
@Override
public void start (Stage stage) throws Exception{

	Label hi = new Label("TTK");

	TextField field = new TextField();

	Button button = new Button("OK");//nút

	BorderPane pane = new BorderPane();
	pane.setTop(hi);
	pane.setCenter(field);
    pane.setBottom(button);

    Scene scene = new Scene(pane,400,300);
    stage.setScene(scene);
    stage.show();
}
}