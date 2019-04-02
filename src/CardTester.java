/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card one = new Card( "King", "Hearts", 13);
		Card two = new Card("Queen", "Spades", 12);
		Card three = new Card("Jack", 'Spades', 11);

		one.matches(two);
	}
}
