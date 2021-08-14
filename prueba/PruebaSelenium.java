package prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class PruebaSelenium {

    private static String AIRBNB_BASE_URL = "https://airbnb.com/";
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(AIRBNB_BASE_URL);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

    }

    // Un test que va a utilizar el data provider "people" de la clase DataProviderPeople
    @Test(dataProviderClass = DataProviderFactory.class, dataProvider = "acommodation")
    public void searchAcommodation(String lugar, int huespedes) throws InterruptedException {

        driver.findElement(By.xpath("//*[@placeholder='¿A dónde viajas?']")).sendKeys(lugar);
        driver.findElement(By.xpath("//div[contains(text(), '¿Cuántos?')]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[contains(text(), '¿Cuándo?')]")).click();

        for (int i = 0; i < huespedes; i++) {
            driver.findElement(By.xpath("//button[@aria-label='aumentar valor']")).click();
        }

    }

    @Test(dataProviderClass = DataProviderFactory.class, dataProvider = "acommodation")
    public void searchExperiences(String lugar, int huespedes) {
        driver.findElement(By.xpath("//button[@id='search-block-tab-false-EXPERIENCES']")).click();
        driver.findElement(By.xpath("//*[@placeholder='¿A dónde viajas?']")).sendKeys(lugar);

    }


    @AfterMethod
    public void tearDown() {
        // driver.close();
    }

}
