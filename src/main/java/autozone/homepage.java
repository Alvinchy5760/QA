package autozone;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepage {

    @FindBy(xpath = "//*[@class='az_mFb']/div[2]/a/div/div/div/div/h3")
    WebElement getItfast;

    @FindBy(xpath = "//*[@class=\"az_L6\"]/li[3]/a")
    WebElement prestonoil;
    @FindBy(css = "[class=\"az_x5 az_V5 az_R5 az_U5\"]")
    WebElement addcart;
    @FindBy(css = "[class=\"az_tlb\"]")
    WebElement cntshop;
    @FindBy(xpath = "//*[@data-testid=\"vehicle-menu-lg\"]/div")
    WebElement see;

    public String showtext() {
        return getItfast.getText();


    }

    public void oil() throws InterruptedException {
        prestonoil.click();
        Thread.sleep(4000);
        addcart.click();
        Thread.sleep(2000);
        cntshop.click();

    }

    public boolean see1(){
      return   see.isDisplayed();

    }
    public String see2(){
        return see.getText();
    }













}
