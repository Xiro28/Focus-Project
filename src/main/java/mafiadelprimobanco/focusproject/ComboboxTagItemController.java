package mafiadelprimobanco.focusproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class ComboboxTagItemController {

    private Tag tag;

    @FXML
    private Circle circleTagColor;

    @FXML
    private Label labelTagName;

    public void initialize(Tag tag){
        this.tag = tag;
        labelTagName.setText(tag.getTagName());
        circleTagColor.setFill(tag.getTagColor());
    }

    public Tag getTag() {
        return tag;
    }
}

