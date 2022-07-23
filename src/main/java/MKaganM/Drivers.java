package MKaganM;

import org.openqa.selenium.WebDriver;

public abstract class Drivers {


    // * webdriver variable for all drivers
    public WebDriver driver;
    // * this method for opening url
    // * All driver class using this method
    public void open(String url){
        try{
            driver.get(url);
        } catch (IllegalStateException e){
            System.out.println("11111111111");
        } catch (Exception e){
            System.out.println("222222222222");
        }
    }
    // * It is used by overwriting inside driver classes.
    public abstract void setupDriver();
}
