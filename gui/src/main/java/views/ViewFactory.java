package views;

import controllers.FxmlLoaderProvider;
import javafx.scene.Node;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Created by Oceanos on 01.02.2017.
 */
public enum  ViewFactory {
    MAIN("/main.fxml");

    public String path;

    private FxmlLoaderProvider provider;
    @Autowired
    public void setProvider(FxmlLoaderProvider provider) {
        this.provider = provider;
    }

    ViewFactory(String path){
        this.path = path;
    }



    public Node get() throws IOException {
        return provider.get(path).load();
    }


}
