import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MyAccount {
    public static void main(String[] args) throws InterruptedException {
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
        chromeDriver.get("https://www.google.com");
        chromeDriver.manage().window().maximize();
        chromeDriver.findElement(By.name("q")).sendKeys("practice automation testing");
        chromeDriver.findElement(By.className("gNO89b")).click();
        chromeDriver.findElement(By.partialLinkText("Automation Practice Site")).click();
        chromeDriver.findElement(By.xpath("//a[text()=\"My Account\"]")).click();
        chromeDriver.switchTo().frame("aswift_7");
        chromeDriver.switchTo().frame("ad_iframe");
        chromeDriver.findElement(By.xpath("//span[text()=\"Close\"]")).click();
        chromeDriver.switchTo().defaultContent();
        chromeDriver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("heera.arshu19@gmail.com");
        chromeDriver.findElement(By.xpath("//input[@id=\"reg_password\"]")).sendKeys("heeranishanth87");
        chromeDriver.findElement(By.xpath("//input[@name=\"register\"]")).click();
        //chromeDriver.switchTo().defaultContent();
        chromeDriver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("heera.arshu19@gmail.com");
        chromeDriver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("heeranishanth87");
        chromeDriver.findElement(By.xpath("//input[@name=\"login\"]")).click();
        chromeDriver.findElement(By.xpath("//a[text()='Sign out']")).click();
        chromeDriver.close();

    }
}
