package salvoamplo.esercizi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import salvoamplo.esercizi.entities.Drink;
import salvoamplo.esercizi.entities.Menu;
import salvoamplo.esercizi.entities.Pizza;
import salvoamplo.esercizi.entities.Topping;

import java.util.List;

@Configuration
public class MenuConfig {


    @Bean
    public Topping cheese() {
        return new Topping("Cheese", 92, 0.69);
    }

    @Bean
    public Topping ham() {
        return new Topping("Ham", 35, 0.99);
    }

    @Bean
    public Topping pineapple() {
        return new Topping("Pineapple", 24, 0.79);
    }


    @Bean
    public Pizza margherita() {
        return new Pizza("Pizza Margherita", 1104, 4.99);
    }

    @Bean
    public Pizza hawaiianPizza(Topping ham, Topping pineapple) {
        Pizza pizza = new Pizza("Hawaiian Pizza", 1104, 4.99);
        pizza.addTopping(ham);
        pizza.addTopping(pineapple);
        return pizza;
    }


    @Bean
    public Drink water() {
        return new Drink("Water (0.5l)", 0, 1.29);
    }

    @Bean
    public Drink lemonade() {
        return new Drink("Lemonade (0.33l)", 128, 1.29);
    }


    @Bean
    public Menu menu(
            Pizza margherita,
            Pizza hawaiianPizza,
            Topping cheese,
            Topping ham,
            Topping pineapple,
            Drink water,
            Drink lemonade
    ) {
        return new Menu(
                List.of(margherita, hawaiianPizza),
                List.of(cheese, ham, pineapple),
                List.of(water, lemonade)
        );
    }

}
