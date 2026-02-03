package salvoamplo.esercizi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import salvoamplo.esercizi.entities.Menu;

@SpringBootApplication
public class EserciziApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx =
                SpringApplication.run(EserciziApplication.class, args);

        Menu menu = ctx.getBean(Menu.class);
        menu.printMenu();
    }
}
