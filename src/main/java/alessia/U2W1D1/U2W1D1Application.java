package alessia.U2W1D1;

import alessia.U2W1D1.entities.Drink;
import alessia.U2W1D1.entities.Menu;
import alessia.U2W1D1.entities.Pizza;
import alessia.U2W1D1.entities.Topping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U2W1D1Application {

	public static void main(String[] args) {
		SpringApplication.run(U2W1D1Application.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeansConfig.class);

		Pizza pizzaHawaii = ctx.getBean("getPizzaHawaii", Pizza.class);
		Topping ham = ctx.getBean("getToppingHam", Topping.class);
		Drink wine = ctx.getBean("getDrinkWine", Drink.class);

		Menu menu2 = ctx.getBean(Menu.class, pizzaHawaii, ham, wine);
		System.out.println(menu2);

	}


}
