package structural.adapter_decorator;

/**
 * Created by Dennis on 15-Dec-17.
 **/
public class PngViewer implements AdvancedImageViewer {

    public String viewGif(String imageName) {
        throw new UnsupportedOperationException("Operation not supported.");
    }

    public String viewPng(String imageName){
        return "Opening PNG image: " + imageName;
    }
}
