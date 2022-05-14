package mafiadelprimobanco.focusproject;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class ImageLoader {
    private static final ImageLoader instance = new ImageLoader();

    private ImageView imgView;

    private ImageLoader() { }

    public static ImageLoader getInstance()
    {
        return instance;
    }

    public void setImageViewer(ImageView imgView)
    {
        this.imgView = imgView;
    }


    public void loadImage(String ImageName)
    {
        if (ImageName.isEmpty()) return;
        if (ImageName.isBlank()) return;
        imgView.setImage(new Image(ImageName));
    }
}
