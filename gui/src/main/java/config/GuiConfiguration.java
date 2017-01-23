package config;

import controllers.GuiController;
import controllers.InnerController;
import controllers.MainController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Oceanos on 23.01.2017.
 */
@Configuration
public class GuiConfiguration {
    @Bean
    public MainController getMainController(){
        return new MainController();
    }
    @Bean
    public InnerController getInnerController(){
        return new InnerController();
    }

}
