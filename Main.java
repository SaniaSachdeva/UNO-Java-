/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * @author dancye
 * @author Sania Sachdeva 2025
 * @author Michael Martino 2025
 * */
public abstract class Card {

    private Color color;
    private Value value;

    public Card(Color color, Value value) {
        this.color = color;
        this.value = value;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    /**
     * Return a String representation of the card,
     * e.g."RED THREE"
     * @return 
     */
    @Override
    public String toString() {
        return color + " " + value;
    }
}
