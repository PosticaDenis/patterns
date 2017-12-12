/**
 * Created by c-denipost on 12-Dec-17.
 **/
public class SingletonPrototype {

    private static SingletonPrototype instance = null;
    private static Hashtable<String, Shape> shapeMap  = new Hashtable<String, Shape>();

    private SingletonPrototype() {
        // Exists only to defeat instantiation.
    }

    public static SingletonPrototype getInstance() {
        if(instance == null) {
            instance = new SingletonPrototype();
        }
        return instance;
    }

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // for each shape run database query and create shape
    // shapeMap.put(shapeKey, shape);
    // for example, we are adding three shapes

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }


}