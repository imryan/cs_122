package cs_122_Inheritance;

/*
 * Tester class for Dictionary
 */

public class Words {

	public static void main(String[] args) {

		Dictionary dict = new Dictionary();

		System.out.println("\nDictionary\n---------------------");
		System.out.println("Pages:\t\t" + dict.getPages());
		System.out.println("Definitions:\t" + dict.getDefinitions());
		System.out.println("Ratio:\t\t" + dict.computeRatio());
	}
}
