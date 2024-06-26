package alessia.U2W1D1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Drink implements IMenu{

    private String name;
    private int calories;
    private double price;


    public Drink() {
    }

    public Drink(String name, int calories, double price) {

        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
