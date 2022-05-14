package mafiadelprimobanco.focusproject;

import javafx.scene.paint.Color;

public class Tag {

    private String tagName;
    private Color tagColor;

    public Tag(String name, Color color){
        tagName = name;
        tagColor = color;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public Color getTagColor() {
        return tagColor;
    }

    public void setTagColor(Color tagColor) {
        this.tagColor = tagColor;
    }
}
