package structural.adapter_decorator;

/**
 * Created by Dennis on 15-Dec-17.
 **/
public class JpegViewer implements ImageViewer {

    public String view(String imageType, String imageName) {
        if(imageType.equalsIgnoreCase("jpeg")){
            return "Opening JPEG image: " + imageName;
        }
        else{
            return "Invalid image. " + imageType + " format not supported.";
        }
    }
}
