package structural.adapter_decorator;

/**
 * Created by Dennis on 15-Dec-17.
 **/
public class GifViewer implements AdvancedImageViewer {

    public String viewGif(String imageName) {
        return "Opening GIF image: " + imageName;
    }

    public String viewPng(String imageName){
        throw new UnsupportedOperationException("Operation not supported.");
    }
}
