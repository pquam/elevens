package elevens;
/**
 * Card.java
 *
 * <code>Card</code> represents a playing card.
 */
public class Card {

	/**
	 * String value that holds the suit of the card
	 * 
	 * suit is diamonds, hearts, spades, clubs
	 */
	private String suit = "";
	
	/**
	 * String value that holds the rank of the card
	 * rank is 2-10, ace, jack, queen, king
	 */
	private String rank = "";

	/**
	 * int value that holds the point value.
	 * 
	 * points are a cards worth:
	 * numbers are worth their rank, aces are 1, use jack, queen, & king.
	 */
	private int pointValue = 0;


   /**
	 * Creates a new <code>Card</code> instance.
	 *
	 * @param cardRank  a <code>String</code> value
	 *                  containing the rank of the card
	 * @param cardSuit  a <code>String</code> value
	 *                  containing the suit of the card
	 * @param cardPointValue an <code>int</code> value
	 *                  containing the point value of the card
	 */
	
	//TODO: method called from???
	public Card(String cardRank, String cardSuit, int cardPointValue) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		//rank, suit, and pointValue declared above
		rank = cardRank;
		suit = cardSuit;
		pointValue = cardPointValue;
	}


	/**
	 * Accesses this <code>Card's</code> suit.
	 * @return this <code>Card's</code> suit.
	 */
	
	//method to return cards suit, TODO: called from???
	public String suit() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
		return suit;
   }

	/**
	 * Accesses this <code>Card's</code> rank.
	 * @return this <code>Card's</code> rank.
	 */
	public String rank() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
		return rank;
	}

   /**
	 * Accesses this <code>Card's</code> point value.
	 * @return this <code>Card's</code> point value.
	 */
	public int pointValue() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
		return pointValue;
	}

	/** Compare this card with the argument.
	 * @param otherCard the other card to compare to this
	 * @return true if the rank, suit, and point value of this card
	 *              are equal to those of the argument;
	 *         false otherwise.
	 */
	
	//where is matches being called from???
	public boolean matches(Card otherCard) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
		boolean match = false;
		
		//what is otherCard and this.ect
		if (otherCard.suit().equals(this.suit) && otherCard.rank().equals(this.rank()) && otherCard.pointValue() == this.pointValue()) {
			
			match = true;
		}
		return match;
	}

	/**
	 * Converts the rank, suit, and point value into a string in the format
	 *     "[Rank] of [Suit] (point value = [PointValue])".
	 * This provides a useful way of printing the contents
	 * of a <code>Deck</code> in an easily readable format or performing
	 * other similar functions.
	 *
	 * @return a <code>String</code> containing the rank, suit,
	 *         and point value of the card.
	 */
	@Override
	public String toString() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
		String _return = rank + " of " + " suit " + " (point value: " + pointValue + ")";
		return _return;
	}
}
