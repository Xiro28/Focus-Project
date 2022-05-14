package mafiadelprimobanco.focusproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class BaseController {

	@FXML
	private BorderPane BaseBorderPane;

	@FXML
	void onNavHomeClick(ActionEvent ignoredEvent) {
		System.exit(0);
	}
	
	@FXML
	void onNavProgressClick(ActionEvent ignoredEvent) {
	
	}
	
	@FXML
	void onNavStatisticsClick(ActionEvent ignoredEvent) {
	
	}
	
	@FXML
	void onNavTagClick(ActionEvent ignoredEvent) {
	
	}
	
	@FXML
	void onNavInfoClick(ActionEvent ignoredEvent) {
	
	}
	
	@FXML
	void onNavUserClick(ActionEvent ignoredEvent) {
	
	}
	
	@FXML
	void onNavSettingsClick(ActionEvent ignoredEvent) {
	
	}

	@FXML
	void initialize() {
		BaseBorderPane.setCenter(SceneHandler.getInstance().loadScene("Home-view.fxml"));
		//ImageLoader.getInstance().loadImage("albero.png");
	}
	
	
}
