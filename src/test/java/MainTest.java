//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//public class MainTest {
//
//    @Test
//    public void testFirstSelenium() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe");
//
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://google.com");
//
//        WebElement searchBox = driver.findElement(By.name("q"));
//        WebElement searchButton = driver.findElement(By.name("btnK"));
//
//        searchBox.sendKeys("Selenium");
//
//        Thread.sleep(1000);
//
//        searchButton.click();
//
//        searchBox = driver.findElement(By.name("q"));
//        Assert.assertEquals(searchBox.getAttribute("value"),"Selenium");
//
//        driver.quit();
//    }
//}
//
//