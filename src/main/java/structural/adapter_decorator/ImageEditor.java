package structural.adapter_decorator;

/**
 * Created by Dennis on 15-Dec-17.
 **/
public class ImageEditor extends ImageViewerDecorator {

    public ImageEditor(ImageViewer decoratedImageViewer) {
        super(decoratedImageViewer);
    }

    @Override
    public String view(String imageType, String imageName) {
        return decoratedImageViewer.view(imageType, imageName) + addEditOption(decoratedImageViewer);
    }

    private String addEditOption(ImageViewer decoratedImageViewer){
        return ". File is available for editing.";
    }
}
