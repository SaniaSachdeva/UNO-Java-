
package ca.sheridancollege.project;

/**
 *
 * @author Sania Sachdeva 2025
 */
public class Deck extends GroupOfCards {

    public Deck(int size) {
        super(size);
    }

    /** Draw the top card from the deck (simple version: index 0). */
    public Card draw() {
        if (getCards().isEmpty()) {
            return null;
        }
        return getCards().remove(0);
    }

    /** Add a card to the deck if there is room. */
    public void addCard(Card card) {
        if (getCards().size() < getSize()) {
            getCards().add(card);
        }
    }
}