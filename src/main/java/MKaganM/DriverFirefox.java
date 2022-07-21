package MKaganM;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFirefox extends Drivers{


    public void DriverFirefox() {
        driver = new FirefoxDriver();
    }

    public void DriverFirefox(String[] options){
        driver = new FirefoxDriver(optionsFirefox(options));
    }

    public FirefoxOptions optionsFirefox(String[] args){
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments(args);
        return options;
    }
}
