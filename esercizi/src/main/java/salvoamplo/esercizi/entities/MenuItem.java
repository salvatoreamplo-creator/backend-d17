package salvoamplo.esercizi.entities;

public abstract class MenuItem {
    protected String name;
    protected int calories;
    protected double price;

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public double getPrice() {
        return price;
    }
}
