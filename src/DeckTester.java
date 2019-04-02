/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"ace", "queen", "king"};
		String[] suits = {"spades", "hearts"};
		int[] values = {1,13,12};

		Deck deck = new Deck(ranks, suits, values);

		System.out.println(deck.isEmpty());

		System.out.println(deck.deal());
		System.out.println(deck.deal());
		System.out.println(deck.deal());
		System.out.println(deck.deal());
		System.out.println(deck.deal());
		System.out.println(deck.deal());
		System.out.println(deck.deal());
		System.out.println(deck.deal());
		System.out.println(deck.deal());
	}
}
