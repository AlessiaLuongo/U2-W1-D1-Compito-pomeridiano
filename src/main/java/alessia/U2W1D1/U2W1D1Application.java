package alessia.U2W1D1;


import alessia.U2W1D1.entities.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class U2W1D1Application implements CommandLineRunner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U2W1D1Application.class);
		SpringApplication.run(U2W1D1Application.class, args);
		System.out.println("Benvenuti, cosa prendete?");


		List<IMenu> ordinazione1 = new ArrayList<>();
		ordinazione1.add((IMenu) ctx.getBean("getPizzaMargherita"));
		Tavolo tavolo1 = (Tavolo) ctx.getBean("tavolo1");
		Ordine ordine1 = new Ordine(StatoDellOrdine.IN_CORSO, 3, 3, LocalDate.now(), 36.50, ordinazione1, tavolo1);
		System.out.println(ordine1);





	}


	@Override
	public void run(String... args) throws Exception {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U2W1D1Application.class);
		List<Pizza> pizzas = ctx.getBean("pizzas", List.class);
		List<Topping> toppings = ctx.getBean("toppings", List.class);
		List<Drink> drinks = ctx.getBean("drinks", List.class);


		Menu menu = new Menu(pizzas, toppings, drinks);
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Benvenuti, ecco il nostro Menu");
		System.out.println(menu);
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Accomodatevi");

		List<Tavolo> tavoli = ctx.getBean("tavoli", List.class);
		System.out.println(tavoli);
	}
}
