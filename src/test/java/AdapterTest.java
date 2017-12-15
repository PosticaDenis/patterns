import structural.adapter_decorator.JpegViewer;
import structural.adapter_decorator.UniversalImageViewer;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

/**
 * Created by Dennis on 15-Dec-17.
 **/
public class AdapterTest {

    @Test
    public void test() {


        String basicImageTyep = "jpeg";
        List<String> supportedAfterUsingAdapterImageTypes = Arrays.asList("gif", "png");

        UniversalImageViewer uImageViewer = new UniversalImageViewer();
        JpegViewer jpegViewer = new JpegViewer();

        // testing the imageViewer w/ and w/o structural.adapter_decorator, for basic image type (jpeg)
        assertEquals(jpegViewer.view(basicImageTyep, "File_Name"), "Opening " + basicImageTyep.toUpperCase() + " image: File_Name");
        assertEquals(uImageViewer.view(basicImageTyep, "File_Name"), "Opening " + basicImageTyep.toUpperCase() + " image: File_Name");

        // testing the imageViewer w/ and w/o structural.adapter_decorator, after using structural.adapter_decorator
        for (String iType: supportedAfterUsingAdapterImageTypes) {

            assertEquals(uImageViewer.view(iType, "File_Name"), "Opening " + iType.toUpperCase() + " image: File_Name");
            assertEquals(jpegViewer.view(iType, "File_Name"), "Invalid image. " + iType + " format not supported.");
        }
    }
}
