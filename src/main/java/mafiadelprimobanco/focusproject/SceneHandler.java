package mafiadelprimobanco.focusproject;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;

import java.io.IOException;
import java.util.Objects;

public class SceneHandler
{
    private static final SceneHandler instance = new SceneHandler();

    private SceneHandler() { }

    /*"nometag1" {
        "colore" : "val"
    }
    "nometag2" {
        "colore" : "val"
    }*/

    public static SceneHandler getInstance()
    {
        return instance;
    }

    public Node loadScene(String SceneName)
    {
        if (SceneName.isEmpty()) return null;
        if (SceneName.isBlank()) return null;
        try
        {
            return FXMLLoader.load(Objects.requireNonNull(getClass().getResource(SceneName)));
        } catch (IOException e)
        {
            //e.printStackTrace();
        }
        return null;
    }
}
