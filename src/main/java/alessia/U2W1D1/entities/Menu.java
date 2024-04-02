package alessia.U2W1D1.entities;

public class Menu {
    private final IMenu pizza;
    private final IMenu topping;
    private final IMenu drink;

    public Menu (IMenu pizza, IMenu topping, IMenu drink){
        this.pizza = pizza;
        this.topping = topping;
        this.drink = drink;
    }

    public String toString() {
        return "Menu{" +
                "Pizza=" + pizza +
                ", Topping=" + (topping != null ? topping : "No topping") +
                ", Drink=" + drink +
                '}';
    }
}
