package creational.builder;

/**
 * Created by Dennis on 16-Dec-17.
 **/
public abstract class Shirt implements PieceOfClothing{

    public Color color() {
        return new Black();
    }

    public abstract float price();
}
