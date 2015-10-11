import java.io.File;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;


public class Player extends  Application {
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage stage) throws Exception {
		Group root = new Group();
		String path = "media/Understanding_SQL_Server_Execution_Plans_c_1000.mp4";
		Media media = new Media(new File(path).toURI().toString());
		MediaPlayer player = new MediaPlayer(media);
		MediaView view = new MediaView(player);
		
		root.getChildren().add(view);
		Scene scene = new Scene(root, 1920, 1080);
		stage.setScene(scene);
		stage.show();
		
		player.play();
	}
}
