import com.example.spi.Driver;

import java.util.ServiceLoader;

public class SpiMain {
    public static void main(String[] args) {
        ServiceLoader<Driver> load = ServiceLoader.load(Driver.class);
        load.forEach(driver -> System.out.println(driver.connect()));
    }
}
