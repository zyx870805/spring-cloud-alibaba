import com.example.Driver;
import org.apache.dubbo.common.extension.ExtensionLoader;

public class DriverTest {

    public static void main(String[] args) {
        ExtensionLoader<Driver> extensionLoader = ExtensionLoader.getExtensionLoader(Driver.class);
        Driver mysqlDriver = extensionLoader.getExtension("mysqlDriver");
        System.out.println(mysqlDriver.connect());
    }
}
