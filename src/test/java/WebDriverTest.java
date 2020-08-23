import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class WebDriverTest {

    private WebDriver driver;

    @Before
    public void setup() {
        String path = System.getProperty("user.dir") +
                "/src/test/resources/drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", path);
         driver = new ChromeDriver();
    }

    @Test
    public void test() {
        System.out.println("Hello World!");
    }

    @Test
    public void open() throws InterruptedException {
        driver.get("https://www.usps.com/");
        driver.findElement(By.xpath("//a[@id='mail-ship-width']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(@href,'find-location.htm')]")).click();
        driver.findElement(By.xpath("//input[@id='city-state-input']")).sendKeys("94538");
        Thread.sleep(3000);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
