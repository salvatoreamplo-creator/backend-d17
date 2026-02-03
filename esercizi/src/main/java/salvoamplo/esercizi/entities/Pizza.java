package salvoamplo.esercizi.entities;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends MenuItem {

    private List<Topping> toppings = new ArrayList<>();

    public Pizza(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
        calories += topping.getCalories();
        price += topping.getPrice();
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    @Override
    public String toString() {
        return name + " " + toppings.stream()
                .map(Topping::getName)
                .toList() +
                " | Calories: " + calories +
                " | Price: " + price;
    }
}
