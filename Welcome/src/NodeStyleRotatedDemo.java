import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class NodeStyleRotatedDemo extends Application {
public void start(Stage primaryStage){
	StackPane pane = new StackPane();
	Button btOK = new Button("OK");

	btOK.setStyle("-fx-border-color: blue;");
	pane.getChildren().add(btOK);
	
	btOK.setRotate(90);
	pane.setRotate(-45);
	pane.setStyle("-fx-border-color: red; -fx-border-width:5px;"
			+ " -fx-background-color: lightgray;");
	
	Scene scene = new Scene(pane, 200, 50);
	primaryStage.setTitle("NodeStyleRotateDemo");
	primaryStage.setScene(scene);
	primaryStage.show();
	
}
	public static void main(String[] args) {
	launch(args);
	}
}
