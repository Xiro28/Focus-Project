package mafiadelprimobanco.focusproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class MainApplication extends Application {
	@Override
	public void start(Stage stage) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("Base-view.fxml"));
		Scene scene = new Scene(fxmlLoader.load(), 1024, 600);
		//stage.setFullScreen(true);
		stage.setScene(scene);

		scene.getStylesheets().add("style.css");
		scene.setFill(Color.TRANSPARENT);

		stage.show();
	}
	
	public static void main(String[] args) {
		launch();
	}
}