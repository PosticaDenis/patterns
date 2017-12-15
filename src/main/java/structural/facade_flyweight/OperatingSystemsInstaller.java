package structural.facade_flyweight;

import java.util.HashMap;

/**
 * Created by Dennis on 15-Dec-17.
 **/
public class OperatingSystemsInstaller {
    private static final HashMap<String, OperatingSystem> osMap = new HashMap<String, OperatingSystem>();

    public OperatingSystemsInstaller() {
        osMap.put("macos", new MacOS());
        osMap.put("linux", new Linux());
        osMap.put("windows", new Windows());
    }

    public String installMacOS() {
        return osMap.get("macos").install();
    }

    public String installLinux() {
        return osMap.get("linux").install();
    }

    public String installWindows() {
        return osMap.get("windows").install();
    }

    //just for test purpose
    public OperatingSystem getOsInstallationPackage(String type) {
        return osMap.get(type);
    }
}
