package structural.adapter_decorator;

/**
 * Created by Dennis on 15-Dec-17.
 **/
public class UniversalImageViewer implements ImageViewer {

    ImageAdapter imageAdapter;

    public String view(String imageType, String imageName) {

        //inbuilt support to view jpeg files
        if(imageType.equalsIgnoreCase("jpeg")){
            return "Opening JPEG image: " + imageName;
        }

        //imageAdapter is providing support to view other image file formats
        else if(imageType.equalsIgnoreCase("gif") || imageType.equalsIgnoreCase("png")){
            imageAdapter = new ImageAdapter(imageType);
            return imageAdapter.view(imageType, imageName);
        }

        else{
            return "Invalid image. " + imageType + " format not supported.";
        }
    }
}
