package one.iterator.pattenr.source;

/**
 * Created by Pankaj Nimgade on 28-04-2016.
 */
public class MenuItem {

    private String name;
    private String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", \t Description: " + this.description +
                ", \t Vegetarian: " + this.vegetarian + ", \t Price:" + this.price;
    }
}
