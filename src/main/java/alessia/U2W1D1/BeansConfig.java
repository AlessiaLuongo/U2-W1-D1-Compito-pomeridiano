package alessia.U2W1D1;

import alessia.U2W1D1.entities.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@PropertySource("application.properties")


@Configuration
public class BeansConfig {
    @Primary
    @Bean
    public Pizza getPizzaMargherita(){

        return new Pizza("Margherita", 1104, 4.99);
    }

    @Bean
    Pizza getPizzaHawaii(){
        return new Pizza("Hawaii", 1024, 6.49);
    }

    @Bean
    Pizza getPizzaSalami(){
        return  new Pizza("Salami", 1160, 5.99);
    }



    @Primary
    @Bean
    public Topping getNoTopping(){
        return null;
    }


    @Bean
    public Topping getToppingCheese(){

        return new Topping("Cheese", 92, 0.69);
    }

    @Bean
    public Topping getToppingHam(){
        return  new Topping("Ham", 35, 0.99);
    }

    @Bean
    public Topping getToppingOnions(){
        return  new Topping("Onions", 22, 0.69);
    }

    @Bean
    public Topping getToppingPinapple(){
        return  new Topping("Pinapple", 24, 0.79);
    }

    @Bean
    public Topping getToppingSalami(){
        return  new Topping("Salami", 86, 0.99);
    }


    @Bean
    public Drink getDrinkLemonade(){

        return new Drink("Lemonade", 128, 1.29);
    }


    @Primary
    @Bean
    public Drink getDrinkWater(){

        return new Drink("Water", 0, 1.29);
    }

    @Bean
    public Drink getDrinkWine(){

        return new Drink("Wine", 607, 7.49);
    }


    @Bean
    public List<Pizza> pizzas(Pizza pizza){
       List<Pizza> pizzas = new ArrayList();
       pizzas.add(getPizzaMargherita());
       pizzas.add(getPizzaHawaii());
       pizzas.add(getPizzaSalami());

        return pizzas;
    }

    @Bean
    public  List<Topping> toppings(Topping topping){
        List<Topping> toppings = new ArrayList<>();
        toppings.add(getToppingCheese());
        toppings.add(getToppingHam());
        toppings.add(getToppingPinapple());
        toppings.add(getToppingSalami());
        toppings.add(getToppingOnions());

        return toppings;
    }

    @Bean
    public  List<Drink> drinks(Drink drink){
        List<Drink> drinks = new ArrayList<>();
        drinks.add(getDrinkLemonade());
        drinks.add(getDrinkWater());
        drinks.add(getDrinkWine());
        return drinks;
    }

    @Bean
    public Tavolo tavolo1(@Value("${surplus.coperto}")int coperto){
        return new Tavolo(4, false);
    }
    @Bean
    public Tavolo tavolo2(@Value("${surplus.coperto}")int coperto){
        return new Tavolo(2, true);
    }
    @Bean
    public Tavolo tavolo3(@Value("${surplus.coperto}")int coperto){
        return new Tavolo(6, true);
    }
    @Bean
    public Tavolo tavolo4(@Value("${surplus.coperto}")int coperto){
        return new Tavolo(4, false);
    }




}
