package structural.adapter_decorator;

/**
 * Created by Dennis on 15-Dec-17.
 **/
public abstract class ImageViewerDecorator implements ImageViewer {

    protected ImageViewer decoratedImageViewer;

    public ImageViewerDecorator(ImageViewer decoratedViewer){
        this.decoratedImageViewer = decoratedViewer;
    }

    public String view(String imageType, String imageName){
        return decoratedImageViewer.view(imageType, imageName);
    }
}
