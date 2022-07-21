package MKaganM;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class DriverEdge extends Drivers{

    public void DriverEdge() {
        driver = new EdgeDriver();
    }

    public void DriverChrome(String[] options){

    }

    public EdgeOptions optionsEdge(String[] args){
        EdgeOptions options = new EdgeOptions();
        options.addArguments(args);
        return options;
    }
}
