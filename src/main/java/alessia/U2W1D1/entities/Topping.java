package alessia.U2W1D1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Topping implements IMenu{

    private String name;
    private int calories;
    private double price;


    public Topping() {
    }

    public Topping(String name, int calories, double price) {

        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    @Override
    public int getCalories() {
        return 0;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
