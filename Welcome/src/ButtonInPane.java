import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonInPane extends Application {
public void start(Stage primaryStage){
	StackPane pane = new StackPane();
	pane.getChildren().add(new Button("Ok"));
	Scene scene = new Scene(pane, 200, 50);
	primaryStage.setTitle("Button in a Pane");
	primaryStage.setScene(scene);
	primaryStage.show();
}
	public static void main(String[] args) {
	launch(args);
	}
}
