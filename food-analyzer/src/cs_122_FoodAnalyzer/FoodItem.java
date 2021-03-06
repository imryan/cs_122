package cs_122_FoodAnalyzer;

/*
 * Superclass
 * Luxurious living
 */

public class FoodItem {

	final private int CALORIES_PER_GRAM = 9;
	private int fatGrams;
	protected int servings;

	public FoodItem(int fatGrams, int servings) {
		this.fatGrams = fatGrams;
		this.servings = servings;
	}

	public int calories() {
		return fatGrams * CALORIES_PER_GRAM;
	}

	public double caloriesPerServing() {
		return (double) ((fatGrams * CALORIES_PER_GRAM) / servings);
	}
}
