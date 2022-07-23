# HOMEWORK3

## PROFİL İLE DRİVER BAŞLATMA

Başlatmak istediğiniz profil yolunu options a tanımlayarak tarayıcıyı bir profil ile başlatabilirsiniz.

```JAVA
        // * chrome options
        ChromeOptions options = new ChromeOptions();
        // * options for chrome window start maximized
        options.addArguments("--start-maximized");
        // * path of profile
        String profilePath = "C:\\Users\\mkaga\\AppData\\Local\\Google\\Chrome\\User Data";
        // * path of profile added to options
        options.addArguments("user-data-dir=" + profilePath);
        // * The settings added to the options variable were given to the driver when defining the driver.
        WebDriver driver = new ChromeDriver(options);
```

[Buraya tıklayarak örneğe gidebilirsiniz.](https://github.com/enuygun-test-automation-bootcamp/homework3-mkaganm/blob/main/src/main/java/org/example/OpenWithProfile.java)

## QUICK START PACKAGE

Aşağıdaki linklere tıklayarak oluşturduğum quick-start paketime göz atabilirsiniz.

[Tüm paket](https://github.com/enuygun-test-automation-bootcamp/homework3-mkaganm/tree/main/src/main/java/MKaganM)

## LOGIN PAGE TEST
