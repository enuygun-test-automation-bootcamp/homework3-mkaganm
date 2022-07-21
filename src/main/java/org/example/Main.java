package org.example;
import MKaganM.DriverChrome;
import MKaganM.DriverType;
import org.openqa.selenium.WebDriver;

import static MKaganM.DriverType.*;
import static MKaganM.FindPath.driverPath;

public class Main {
    public static void main(String[] args) {

        WebDriver driver = new DriverChrome().driver;

    }
}