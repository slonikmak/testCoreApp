package mainApp;

import config.GuiConfiguration;
import controllers.GuiController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Callback;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by Oceanos on 23.01.2017.
 */
@Component
public class GuiApp extends Application {
    public void start(final Stage primaryStage) throws Exception {
        final AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(GuiConfiguration.class);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/main.fxml"));
        loader.setControllerFactory(new Callback<Class<?>, Object>() {
            public Object call(Class<?> param) {
                GuiController controller = (GuiController) ctx.getBean(param);
                controller.setPrimaryStage(primaryStage);
                return controller;
            }
        });
        Parent parent = loader.load();
        Scene scene = new Scene(parent, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    //public static void main(String[] args) {
        //launch(args);
    //}


}
