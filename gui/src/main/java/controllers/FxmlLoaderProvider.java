package controllers;

import javafx.fxml.FXMLLoader;
import javafx.fxml.LoadException;
import javafx.util.Callback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by Oceanos on 01.02.2017.
 */
@Component
public class FxmlLoaderProvider {
    ApplicationContext ctx;

    @Autowired
    public void setCtx(ApplicationContext ctx){
        this.ctx = ctx;
    }

    public FXMLLoader get(String path){
        FXMLLoader loader = new FXMLLoader(getClass().getResource(path));
        loader.setControllerFactory(new Callback<Class<?>, Object>() {
            public Object call(Class<?> param) {
                return ctx.getBean(param);
            }
        });

        return loader;
    }
}
