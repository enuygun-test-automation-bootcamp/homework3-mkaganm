package MKaganM;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverChrome extends Drivers {


    public void DriverChrome() {
        driver = new ChromeDriver();
    }

    public void DriverChrome(String[] args){
        driver = new ChromeDriver(optionsChrome(args));
    }

    public ChromeOptions optionsChrome(String[] args){
        ChromeOptions options = new ChromeOptions();
        options.addArguments(args);
        return options;
    }

    public void setupDriver(){
        System.setProperty("webdriver.chrome.driver", FindPath.driverPath(DriverType.CHROME));
    }


}
