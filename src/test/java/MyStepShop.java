import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MyStepShop {
    WebDriver chromeDriver = null;
    JavascriptExecutor js=(JavascriptExecutor) chromeDriver;

    @Given("user opens the browser and navigate to {string}")
    public void userOpensTheBrowserAndNavigateTo(String url) {
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
        chromeDriver.get("https://www.google.com");
        chromeDriver.manage().window().maximize();
    }

    @Then("user enters {string}")
    public void userEnters(String string) {
        chromeDriver.findElement(By.name("q")).sendKeys("practice automation testing");
    }

    @Then("user user clicks on google search button")
    public void userUserClicksOnGoogleSearchButton() {
        chromeDriver.findElement(By.className("gNO89b")).click();
    }

    @Then("user clicks on {string}")
    public void userClicksOn(String string) {
        chromeDriver.findElement(By.partialLinkText("Automation Practice Site")).click();
    }


    @Then("user clicks on shop")
    public void userClicksOnShop() {
        chromeDriver.findElement(By.xpath("//*[@id=\"menu-item-40\"]/a")).click();
    }

    @Then("user gets ad")
    public void userGetsAd() {
        chromeDriver.switchTo().frame("aswift_7");
        chromeDriver.switchTo().frame("ad_iframe");
    }

    @Then("user closes the ad")
    public void userClosesTheAd() {
        chromeDriver.findElement(By.xpath("//span[text()=\"Close\"]")).click();

    }

    @Then("user reach the shop page")
    public void userReachTheShopPage() {
        chromeDriver.switchTo().defaultContent();
    }


    @Then("user clicks on mastering java script item")
    public void userClicksOnMasteringJavaScriptItem() {
        chromeDriver.findElement(By.xpath("//img[@alt=\"Mastering JavaScript\"]")).click();
    }

    @Then("user clicks on {string} for the item")
    public void userClicksOnForTheItem(String string) {
        chromeDriver.findElement(By.xpath("//button[text()=\"Add to basket\"]")).click();

    }


    @Then("user clicks on cart")
    public void userClicksOnCart() {
        chromeDriver.findElement(By.xpath("//a/span[text()=\"1 item\"]")).click();

    }


    @Then("user reach the cart page and scroll down")
    public void userReachTheCartPageAndScrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) chromeDriver;
        js.executeScript("window.scrollBy(0,250)", "");

    }


    @Then("user clicks on proceed to checkout button")
    public void userClicksOnProceedToCheckoutButton() {
        chromeDriver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/div/div/div/a")).click();
    }

    @Then("user enters billing details field")
    public void userEntersBillingDetailsField() {
        chromeDriver.findElement(By.xpath("//input[@id=\"billing_first_name\"]")).sendKeys("Liji");
        chromeDriver.findElement(By.xpath("//input[@id=\"billing_last_name\"]")).sendKeys("Nishanth");
        chromeDriver.findElement(By.xpath("//input[@id=\"billing_email\"]")).sendKeys("liji.skyview@gmail.com");
        chromeDriver.findElement(By.xpath("//input[@id=\"billing_phone\"]")).sendKeys("123456789");
        chromeDriver.findElement(By.xpath("//input[@id=\"billing_address_1\"]")).sendKeys("121 street");
        chromeDriver.findElement(By.xpath("//input[@id=\"billing_city\"]")).sendKeys("Cochin");
        chromeDriver.findElement(By.xpath("//input[@id=\"billing_postcode\"]")).sendKeys("654321");
    }

    @Then("user scroll the page")
    public void userScrollThePage() {
        js = (JavascriptExecutor) chromeDriver;
        js.executeScript("window.scrollBy(0,2000)", "");
    }

    @And("user place the order")
    public void userPlaceTheOrder() {
        chromeDriver.findElement(By.xpath("//input[@data-value=\"Place order\"]")).click();
    }

    @Then("user closes the browser")
    public void userClosesTheBrowser() {
        chromeDriver.close();
    }


}
