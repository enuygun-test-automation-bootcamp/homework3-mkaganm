package org.example;
import MKaganM.DriverChrome;
import MKaganM.DriverEdge;
import MKaganM.DriverFirefox;


public class Main {
    public static void main(String[] args) {


        String[] opt = {"--start-maximized", "user-data-dir=C:\\Users\\mkaga\\AppData\\Local\\Google\\Chrome\\User Data"};
        String[] opt2 = {"--start-maximized"};
        String url ="https://www.enuygun.com";


        DriverChrome driver = new DriverChrome(opt2);
        driver.open(url);


        DriverFirefox driver3 = new DriverFirefox(opt2);
        driver3.open(url);


        DriverEdge driver2 = new DriverEdge(opt2);
        driver2.open(url);





    }
}