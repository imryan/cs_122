package cs_122_Inheritance;

/*
 * Child class of Book
 */

public class Dictionary extends Book {

	private int definitions = 52500;

	public double computeRatio() {
		return (double) definitions / pages;
	}

	public void setDefinitions(int definitions) {
		this.definitions = definitions;
	}

	public int getDefinitions() {
		return definitions;
	}
}
