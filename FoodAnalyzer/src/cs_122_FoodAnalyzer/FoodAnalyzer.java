package cs_122_FoodAnalyzer;

/*
 * Time to analyze...
 */

public class FoodAnalyzer {

	public static void main(String[] args) {
		Pizza pizza = new Pizza(275);

		System.out.println("\nPizza\n--------------------");
		System.out.println("Cal:\t\t" + pizza.calories());
		System.out.println("Cal (serving):\t" + pizza.caloriesPerServing());
	}
}
