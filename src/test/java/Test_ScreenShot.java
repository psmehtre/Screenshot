import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Test_ScreenShot {
    @Test

    public void testGuru99TakeScreenShot() throws Exception{

        WebDriver driver ;
        System.setProperty("webdriver.chrome.driver","C:\\selenium files\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        //goto url

        driver.get("https://www.trendyol.com/");

        //Call take screenshot function

        takeSnapShot(driver, "screenshots/test.png") ;

    }


    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

        File DestFile=new File(fileWithPath);

        //Copy file at destination

        FileUtils.copyFile(SrcFile, DestFile);

    }
}
