import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShopTesting {
    public static void main(String[] args) throws InterruptedException {
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
        chromeDriver.get("https://www.google.com");
        chromeDriver.manage().window().maximize();
        chromeDriver.findElement(By.name("q")).sendKeys("practice automation testing");
        chromeDriver.findElement(By.className("gNO89b")).click();
        chromeDriver.findElement(By.partialLinkText("Automation Practice Site")).click();
        chromeDriver.findElement(By.xpath("//*[@id=\"menu-item-40\"]/a")).click();
        chromeDriver.switchTo().frame("aswift_7");
        chromeDriver.switchTo().frame("ad_iframe");
        chromeDriver.findElement(By.xpath("//span[text()=\"Close\"]")).click();
        chromeDriver.switchTo().defaultContent();
        //chromeDriver.switchTo().frame("//iframe[@title=\"Advertisement\"]");
        //chromeDriver.findElement(By.xpath("//div[@id=\"dismiss-button\"]")).click();
        //Working ^^^^^^
        chromeDriver.findElement(By.xpath("//img[@alt=\"Mastering JavaScript\"]")).click();
        //chromeDriver.findElement(By.xpath("//a[@data-product_id=\"165\"]")).click();
        //chromeDriver.findElement(By.xpath("//a[text()=\"Add to basket\"]")).click();
        chromeDriver.findElement(By.xpath("//button[text()=\"Add to basket\"]")).click();
        chromeDriver.findElement(By.xpath("//a/span[text()=\"1 item\"]")).click();
        //chromeDriver.findElement(By.xpath("//div[contains(@class,'cart_totals')]"));
        JavascriptExecutor js = (JavascriptExecutor) chromeDriver;
        js.executeScript("window.scrollBy(0,250)", "");
        chromeDriver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/div/div/div/a")).click();
        //^^^^Working, Proceed to Checkout^^^^^
        chromeDriver.findElement(By.xpath("//input[@id=\"billing_first_name\"]")).sendKeys("Liji");
        chromeDriver.findElement(By.xpath("//input[@id=\"billing_last_name\"]")).sendKeys("Nishanth");
        chromeDriver.findElement(By.xpath("//input[@id=\"billing_email\"]")).sendKeys("liji.skyview@gmail.com");
        chromeDriver.findElement(By.xpath("//input[@id=\"billing_phone\"]")).sendKeys("123456789");
        chromeDriver.findElement(By.xpath("//input[@id=\"billing_address_1\"]")).sendKeys("121 street");
        chromeDriver.findElement(By.xpath("//input[@id=\"billing_city\"]")).sendKeys("Cochin");
        chromeDriver.findElement(By.xpath("//input[@id=\"billing_postcode\"]")).sendKeys("654321");
        js = (JavascriptExecutor) chromeDriver;
        js.executeScript("window.scrollBy(0,2000)", "");
        chromeDriver.findElement(By.xpath("//input[@data-value=\"Place order\"]")).click();
        //Place Order^^^^^^^
        chromeDriver.close();


    }


    }

