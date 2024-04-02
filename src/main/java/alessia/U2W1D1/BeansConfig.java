package alessia.U2W1D1;

import alessia.U2W1D1.entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


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
    public Menu getMenu(Pizza pizza,Topping topping,  Drink drink){
        return new Menu(pizza, topping, drink);
    }
}
