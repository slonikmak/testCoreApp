package configs;

import mainApp.GuiApp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Anton on 23.01.2017.
 */
@Configuration
public class CoreConfig {
    @Bean
    public GuiApp getGuiApp(){
        return new GuiApp();
    }
}
