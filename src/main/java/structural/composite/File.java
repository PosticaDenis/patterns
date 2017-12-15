package structural.composite;

/**
 * Created by Dennis on 15-Dec-17.
 */
class File implements AbstractFile {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void ls() {
        System.out.println(CompositeDemo.compositeBuilder + name);
    }
}
