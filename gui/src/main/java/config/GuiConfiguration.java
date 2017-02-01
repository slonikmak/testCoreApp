package config;

import controllers.FxmlLoaderProvider;
import controllers.GuiController;
import controllers.InnerController;
import controllers.MainController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import views.ViewFactory;

/**
 * Created by Oceanos on 23.01.2017.
 */
@Configuration
@ComponentScan("views")
public class GuiConfiguration {
    @Bean
    public MainController getMainController(){
        return new MainController();
    }
    @Bean
    public InnerController getInnerController(){
        return new InnerController();
    }
    @Bean
    public FxmlLoaderProvider getProvider(){
        return new FxmlLoaderProvider();
    }


}
