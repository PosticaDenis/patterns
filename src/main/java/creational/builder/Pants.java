package creational.builder;

/**
 * Created by Dennis on 16-Dec-17.
 **/
public abstract class Pants implements PieceOfClothing {

    public Color color() {
        return new Blue();
    }

    public abstract float price();
}
