package mafiadelprimobanco.focusproject;

import io.github.palexdev.materialfx.controls.MFXComboBox;
import io.github.palexdev.materialfx.controls.MFXProgressSpinner;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

import java.io.IOException;
import java.util.List;

public class HomeController {

    @FXML
    private ImageView treeImageViewer;

    @FXML
    private MFXComboBox<Node> tagComboBox;

    @FXML
    private MFXProgressSpinner progressBarTime;

    @FXML
    void initialize(){
        ImageLoader.getInstance().setImageViewer(treeImageViewer);
    }

}
