package autozone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setup {

     public WebDriver driver;

     public void setupdriver(String url) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
    }
    public void quitebrowser() throws InterruptedException {
         Thread.sleep(3000);
         driver.quit();
    }
}