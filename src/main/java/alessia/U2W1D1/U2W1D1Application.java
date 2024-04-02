package alessia.U2W1D1;


import alessia.U2W1D1.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootApplication
public class U2W1D1Application {

	public static void main(String[] args) {
		SpringApplication.run(U2W1D1Application.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U2W1D1Application.class);


		List<Pizza> pizzas = ctx.getBean("pizzas", List.class);
		List<Topping> toppings = ctx.getBean("toppings", List.class);
		List<Drink> drinks = ctx.getBean("drinks", List.class);

		Menu menu = new Menu(pizzas, toppings, drinks);
		System.out.println(menu);
	}


}
