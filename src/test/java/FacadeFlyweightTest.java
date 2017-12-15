import structural.facade_flyweight.Machine;
import structural.facade_flyweight.OperatingSystemsInstaller;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Dennis on 15-Dec-17.
 **/
public class FacadeFlyweightTest {

    @Test
    public void test() {

        OperatingSystemsInstaller osManager = new OperatingSystemsInstaller();

        assertEquals(osManager.installLinux(), "Installing Linux...");
        assertEquals(osManager.installMacOS(), "Installing MacOS...");
        assertEquals(osManager.installWindows(), "Installing Windows...");

        Machine devMachine = new Machine("Dev_VM");
        Machine qaMachine = new Machine("QA_VM");
        assertEquals(devMachine.installOS(osManager.installLinux()), "Dev_VM: Installing Linux...");
        assertEquals(qaMachine.installOS(osManager.installLinux()), "QA_VM: Installing Linux...");
    }
}
