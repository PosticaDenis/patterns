package structural.adapter_decorator;

/**
 * Created by Dennis on 15-Dec-17.
 */
public class ImageAdapter implements ImageViewer {

    AdvancedImageViewer aImageViewer;

    public ImageAdapter(String imageType) {
        if(imageType.equalsIgnoreCase("gif") ){
            aImageViewer = new GifViewer();

        }else if (imageType.equalsIgnoreCase("png")){
            aImageViewer = new PngViewer();
        }
    }

    public String view(String imageType, String fileName) {

        if(imageType.equalsIgnoreCase("gif")){
            return aImageViewer.viewGif(fileName);
        }
        else if(imageType.equalsIgnoreCase("png")){
            return aImageViewer.viewPng(fileName);
        }
        return "";
    }
}
