package mafiadelprimobanco.focusproject;

import io.github.palexdev.materialfx.controls.MFXComboBox;
import javafx.scene.Node;
import javafx.scene.paint.Color;

import java.util.List;
import java.util.Vector;

public class TestTagHandler {

    private static final TestTagHandler instance = new TestTagHandler();

    private List<Tag> tagArray = new Vector<>();

    private TestTagHandler() {}

    public static TestTagHandler getInstance() { return instance; }

    public List<Tag> getTags(){
       return tagArray;
    }

    public void addTags(String tagName, Color tagColor){
        tagArray.add(new Tag(tagName, tagColor));
    }

    public void initialize(){

    }
}
