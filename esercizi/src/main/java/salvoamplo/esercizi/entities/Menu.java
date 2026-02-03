package salvoamplo.esercizi.entities;

import java.util.List;

public class Menu {

    private List<Pizza> pizzas;
    private List<Topping> toppings;
    private List<Drink> drinks;

    public Menu(List<Pizza> pizzas, List<Topping> toppings, List<Drink> drinks) {
        this.pizzas = pizzas;
        this.toppings = toppings;
        this.drinks = drinks;
    }

    public void printMenu() {
        System.out.println("=== PIZZAS ===");
        pizzas.forEach(System.out::println);

        System.out.println("\n=== TOPPINGS ===");
        toppings.forEach(t ->
                System.out.println(t.getName() + " | Calories: " + t.getCalories() + " | Price: " + t.getPrice())
        );

        System.out.println("\n=== DRINKS ===");
        drinks.forEach(d ->
                System.out.println(d.getName() + " | Calories: " + d.getCalories() + " | Price: " + d.getPrice())
        );
    }
}
