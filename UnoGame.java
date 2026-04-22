
package ca.sheridancollege.project;

/**
 *
 * @author Sania Sachdeva
 */
public class DiscardPile extends GroupOfCards {

    public DiscardPile(int size) {
        super(size);
    }

    public void discard(Card card) {
        getCards().add(card);
    }

    public Card peekTop() {
        if (getCards().isEmpty()) {
            return null;
        }
        return getCards().get(getCards().size() - 1);
    }
}