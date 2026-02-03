package salvoamplo.esercizi.entities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OrdineRunner {

    private static final Logger logger = LoggerFactory.getLogger(OrdineRunner.class);

    @Value("${coperto.costo}")
    private double costoCoperto;

    @Bean
    CommandLineRunner run() {
        return args -> {

            Tavolo tavolo1 = new Tavolo(1, 4);

            MenuItem pizza = new Pizza("Margherita", 6.50);
            MenuItem drink = new Drink("Cola", 2.50);

            List<MenuItem> elementi = List.of(pizza, drink);

            Ordine ordine = new Ordine(
                    1,
                    tavolo1,
                    2,
                    elementi,
                    costoCoperto
            );

            logger.info("MENU:");
            elementi.forEach(e -> logger.info(e.getNome() + " - " + e.getPrezzo() + "€"));

            logger.info("ORDINE CREATO:");
            logger.info(ordine.toString());
        };
    }
}

