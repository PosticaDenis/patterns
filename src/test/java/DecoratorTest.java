import structural.adapter_decorator.ImageEditor;
import structural.adapter_decorator.ImageViewer;
import structural.adapter_decorator.UniversalImageViewer;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Dennis on 15-Dec-17.
 **/
public class DecoratorTest {

    @Test
    public void test() {

        String iType = "jpeg";

        ImageViewer universalImageViewer = new UniversalImageViewer();
        ImageViewer imageEditor = new ImageEditor(universalImageViewer);

        System.out.println(imageEditor.view(iType, "File_Name"));
        assertEquals(imageEditor.view(iType, "File_Name"), "Opening " + iType.toUpperCase() + " image: File_Name. File is available for editing.");
    }
}
