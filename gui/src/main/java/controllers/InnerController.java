package controllers;

import javafx.stage.Stage;
import org.springframework.stereotype.Component;

/**
 * Created by Oceanos on 23.01.2017.
 */
@Component
public class InnerController implements GuiController {
    Stage primaryStage;
    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
}
