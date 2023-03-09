import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AccountStep {
    WebDriver chromeDriver = null;
    @Given("user open the browser and navigate to {string}")
    public void userOpenTheBrowserAndNavigateTo(String url) {
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
        chromeDriver.get("https://www.google.com");
        chromeDriver.manage().window().maximize();

    }

    @Then("user enter {string}")
    public void userEnter(String string) {
        chromeDriver.findElement(By.name("q")).sendKeys("practice automation testing");


    }

    @And("user clicks on google search button")
    public void userClicksOnGoogleSearchButton() {
        chromeDriver.findElement(By.className("gNO89b")).click();

    }

    @Then("user clicks {string}")
    public void userClicks(String string) {
        chromeDriver.findElement(By.partialLinkText("Automation Practice Site")).click();

    }

    @Then("user clicks on my account")
    public void userClicksOnMyAccount() {
        chromeDriver.findElement(By.xpath("//a[text()=\"My Account\"]")).click();
    }

    @Then("user gets ad window")
    public void userGetsAdWindow() {
        chromeDriver.switchTo().frame("aswift_7");
        chromeDriver.switchTo().frame("ad_iframe");
    }

    @Then("user closes the ad window")
    public void userClosesTheAdWindow() {
        chromeDriver.findElement(By.xpath("//span[text()=\"Close\"]")).click();
        chromeDriver.switchTo().defaultContent();

    }

    @Then("user enters register account page with valid credentials")
    public void userEntersRegisterAccountPageWithValidCredentials() {
        chromeDriver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("heera.arshu19@gmail.com");
        chromeDriver.findElement(By.xpath("//input[@id=\"reg_password\"]")).sendKeys("heeranishanth87");
    }

    @And("user clicks on register")
    public void userClicksOnRegister() {
        chromeDriver.findElement(By.xpath("//input[@name=\"register\"]")).click();
    }

    @Then("user enters login field with valid credentials")
    public void userEntersLoginFieldWithValidCredentials() {
        chromeDriver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("heera.arshu19@gmail.com");
        chromeDriver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("heeranishanth87");
    }

    @And("clicks on login button")
    public void clicksOnLoginButton() {
        chromeDriver.findElement(By.xpath("//input[@name=\"login\"]")).click();
    }

    @Then("user clicks on sign out")
    public void userClicksOnSignOut() {
        chromeDriver.findElement(By.xpath("//a[text()='Sign out']")).click();
    }

    @Then("user closes the browser window")
    public void userClosesTheBrowserWindow() {
        chromeDriver.close();
    }
}
