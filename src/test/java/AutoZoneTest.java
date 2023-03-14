import autozone.homepage;
import autozone.setup;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutoZoneTest extends setup {





        homepage home;
        @BeforeMethod
        void setuptst() {
            setupdriver("https:autozone.com");
            home = PageFactory.initElements(driver, homepage.class);
        }
        @AfterMethod
       void closewindow() throws InterruptedException {
           quitebrowser();
       }



        @Test
        void tst1(){
            String actualtext= home.showtext();
            Assert.assertEquals(actualtext,"GET IT FAST");
        }
        @Test
        void tst2() throws InterruptedException {
            home.oil();
            String actualurl= driver.getCurrentUrl();
Assert.assertEquals(actualurl,"https://www.autozone.com/antifreeze-radiator-additives-and-windshield-wash-fluid/antifreeze-coolant/p/prestone-antifreeze-coolant-universal-concentrate-10-year-300k-mile-protection-1-gallon/525501_0?rrec=true");
        }
        @Test
        void tst3(){
            Assert.assertTrue(home.see1());

        }
        @Test
        void tst4(){
            String actualtxt=home.see2();
            Assert.assertEquals(actualtxt,"Add Vehicle");
        }

    }


