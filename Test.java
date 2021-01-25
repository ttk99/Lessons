import javafx.animation.TranslateTransition;
  import javafx.util.Duration;
  import javafx.application.Application;
  import javafx.scene.Group;
  import javafx.scene.Scene;
  import javafx.scene.shape.Rectangle;
  import javafx.stage.Stage;
   
  public class Test extends Application{
   
  	public static void main(String[] args) {
  		launch(args);
  	}
   
  	@Override
  	public void start(Stage primaryStage) {
  		View v = new View();
  		Scene scene = new Scene(v, 400, 400);
  		primaryStage.setScene(scene);
  		primaryStage.show();
  	}
  }
  
  
  class View extends Group{
  	public View() {
  		Rectangle rect = new Rectangle(0,0,50,50);
  		
  		TranslateTransition animation = new TranslateTransition(Duration.seconds(1), rect);
  		animation.setFromY(0);
  		animation.setToY(250);
  		animation.setFromX(0);
  		animation.setToX(350);
  		animation.setCycleCount(Animation.INDEFINITE);
  		animation.setAutoReverse(true);
  		//animation.setAutoReverse(false);
  		animation.play();
  		getChildren().add(rect);

  		
  	}
  }