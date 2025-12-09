package model;

public class Meal extends MenuItem {

    public Meal(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Meal: " + name + " - " + price + "₺";
    }
}
