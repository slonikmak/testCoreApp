import config.GuiConfiguration;
import mainApp.GuiApp;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by Oceanos on 23.01.2017.
 */
public class DesctopApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(GuiConfiguration.class);
        GuiApp.main(args);
    }
}
