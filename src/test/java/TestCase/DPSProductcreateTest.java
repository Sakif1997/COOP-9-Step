package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class DPSProductcreateTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @AfterTest
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void dPSProductcreate() throws InterruptedException{
        driver.get("https://stage-coop.rdcd.gov.bd/login");
        Thread.sleep(2000);
        //driver.findElement(By.id("username")).click();
        //driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).click();
        {
            WebElement element = driver.findElement(By.id("username"));
            Actions builder = new Actions(driver);
            builder.doubleClick(element).perform();
        }
        //driver.findElement(By.id("username")).click();
       // driver.findElement(By.cssSelector(".css-dj012s")).click();
        //Thread.sleep(20000);
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("200000054203");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("123");
        {
            WebElement element = driver.findElement(By.cssSelector(".MuiButton-containedSuccess"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".MuiButton-containedSuccess"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".MuiButton-containedSuccess"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.cssSelector(".css-0")).click();
        {
            WebElement dropdown = driver.findElement(By.id("mui-1"));
            dropdown.findElement(By.xpath("//option[. = 'লোন']")).click();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".MuiButton-containedPrimary"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector(".MuiButton-containedPrimary")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".InnerLanding_navItemWrapper__7Af48:nth-child(2) .MuiSvgIcon-root")).click();
       // Thread.sleep(2000);
        //driver.findElement(By.cssSelector(".MuiCollapse-wrapperInner > .InnerLanding_navItemWrapper__7Af48:nth-child(3) .MuiSvgIcon-root")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".InnerLanding_navItemWrapper__7Af48:nth-child(6) > a .MuiTypography-root"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        //Thread.sleep(2000);
        //driver.findElement(By.cssSelector("#menu-savingsType > .MuiBackdrop-root")).click();
        //js.executeScript("window.scrollTo(0,0)");
        //Thread.sleep(2000);

        driver.findElement(By.cssSelector(".InnerLanding_navItemWrapper__7Af48:nth-child(1) .MuiList-root .MuiTypography-root")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".MuiButton-root"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        Thread.sleep(2000);

        driver.findElement(By.cssSelector(".MuiButton-root")).click();
        {
            WebElement element = driver.findElement(By.id("demo-simple-select"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector("#menu-savingsType > .MuiBackdrop-root"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.cssSelector("body")).click();
        driver.findElement(By.cssSelector("#mui-83 > .MuiButtonBase-root:nth-child(2)")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".Mui-focused > #demo-simple-select"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector("#menu-projectId > .MuiBackdrop-root"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.cssSelector("body")).click();
        driver.findElement(By.cssSelector("#mui-85 > .MuiButtonBase-root:nth-child(1)")).click();
        driver.findElement(By.id("productName")).click();
        driver.findElement(By.id("productName")).sendKeys("পেঁয়াজ চাষ ");
        {
            WebElement element = driver.findElement(By.cssSelector(".Mui-focused > #demo-simple-select"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector("#menu-profitPostingPeriod > .MuiBackdrop-root"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.cssSelector("body")).click();
        driver.findElement(By.cssSelector("#mui-86 > .MuiButtonBase-root")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".Mui-focused > #demo-simple-select"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector("#menu-repaymentFrequency > .MuiBackdrop-root"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.cssSelector("body")).click();
        driver.findElement(By.cssSelector("#mui-87 > .MuiButtonBase-root:nth-child(2)")).click();
        driver.findElement(By.id("mui-88")).click();
        driver.findElement(By.id("mui-88")).sendKeys("১");
        driver.findElement(By.id("mui-89")).click();
        driver.findElement(By.id("mui-88")).click();
        driver.findElement(By.id("mui-89")).click();
        driver.findElement(By.id("mui-89")).sendKeys("৩০");
        driver.findElement(By.id("mui-90")).click();
        driver.findElement(By.id("mui-90")).sendKeys("২");
        driver.findElement(By.cssSelector("body")).click();
        driver.findElement(By.cssSelector("#mui-91 > .MuiButtonBase-root:nth-child(2)")).click();
        driver.findElement(By.id("mui-92")).click();
        driver.findElement(By.cssSelector("body")).click();
        driver.findElement(By.cssSelector("#menu-maturityProcess > .MuiBackdrop-root")).click();
        driver.findElement(By.id("mui-92")).click();
        driver.findElement(By.id("mui-92")).sendKeys("৩৫");
        driver.findElement(By.cssSelector("body")).click();
        driver.findElement(By.cssSelector("#mui-93 > .MuiButtonBase-root:nth-child(2)")).click();
        driver.findElement(By.id("mui-94")).click();
        driver.findElement(By.id("mui-94")).sendKeys("১০০০");
        driver.findElement(By.id("mui-95")).click();
        driver.findElement(By.id("mui-95")).sendKeys("১০০০০০");
        driver.findElement(By.id("mui-96")).click();
        driver.findElement(By.id("mui-96")).sendKeys("১০০০");
        driver.findElement(By.cssSelector(".MuiInputBase-fullWidth > #demo-simple-select")).click();
        driver.findElement(By.id("demo-simple-select-option-0")).click();
        driver.findElement(By.id("demo-simple-select2")).click();
        driver.findElement(By.id("demo-simple-select2-option-6")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".MuiButton-root"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".MuiButton-root"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector(".MuiButton-root")).click();
        driver.findElement(By.cssSelector(".css-slyssw > .MuiSvgIcon-root")).click();
        driver.findElement(By.cssSelector(".MuiPickersDay-today")).click();
        driver.findElement(By.id("numberDuration")).click();
        {
            WebElement dropdown = driver.findElement(By.id("numberDuration"));
            dropdown.findElement(By.xpath("//option[. = '১০৮ মাস']")).click();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".MuiButton-root:nth-child(2)"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector(".MuiButton-root:nth-child(2)")).click();
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.id("number")).click();
        driver.findElement(By.id("number")).sendKeys("৫");
        driver.findElement(By.cssSelector(".Mui-focused > #number")).click();
        driver.findElement(By.cssSelector(".Mui-focused > #number")).sendKeys("৫.২৫");
        driver.findElement(By.cssSelector(".Mui-focused > #number")).click();
        driver.findElement(By.cssSelector(".Mui-focused > #number")).sendKeys("৫.৫");
        driver.findElement(By.cssSelector(".Mui-focused > #number")).click();
        driver.findElement(By.cssSelector(".Mui-focused > #number")).sendKeys("৫.৭৫");
        driver.findElement(By.cssSelector(".Mui-focused > #number")).click();
        driver.findElement(By.cssSelector(".Mui-focused > #number")).sendKeys("৬");
        driver.findElement(By.cssSelector(".MuiTableRow-root:nth-child(6) > .MuiTableCell-root:nth-child(2)")).click();
        driver.findElement(By.cssSelector(".MuiTableRow-root:nth-child(6) #number")).click();
        driver.findElement(By.cssSelector(".Mui-focused > #number")).sendKeys("৬.২৫");
        driver.findElement(By.cssSelector(".Mui-focused > #number")).click();
        driver.findElement(By.cssSelector(".Mui-focused > #number")).sendKeys("৬.৫");
        driver.findElement(By.cssSelector(".Mui-focused > #number")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector(".Mui-focused > #number")).click();
        driver.findElement(By.cssSelector(".Mui-focused > #number")).sendKeys("৬.৭৫");
        driver.findElement(By.cssSelector(".Mui-focused > #number")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".MuiGrid-root:nth-child(2) > .MuiButtonBase-root"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector(".Mui-focused > #number")).sendKeys("৭");
        driver.findElement(By.cssSelector(".MuiGrid-root:nth-child(2) > .MuiButtonBase-root")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".MuiGrid-root:nth-child(2) > .MuiButtonBase-root path"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.cssSelector(".MuiGrid-root:nth-child(2) > .MuiButtonBase-root")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".MuiButton-contained:nth-child(1)"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".MuiButton-contained:nth-child(2)"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".MuiButton-contained:nth-child(1)"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".MuiButton-contained:nth-child(2)"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".MuiButton-contained:nth-child(1)"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".MuiButton-contained:nth-child(1)"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector(".MuiButton-contained:nth-child(1)")).click();
        {
            WebElement element = driver.findElement(By.id("mui-p-75013-T-4"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.id("demo-simple-select"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector("#menu-chargeName > .MuiBackdrop-root"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.cssSelector("body")).click();
        driver.findElement(By.cssSelector("#mui-174 > .MuiButtonBase-root:nth-child(2)")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".css-slyssw > .MuiSvgIcon-root"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector(".css-slyssw > .MuiSvgIcon-root")).click();
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.cssSelector(".MuiPickersDay-today")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".Mui-focused > #demo-simple-select"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector("#menu-chargeType > .MuiBackdrop-root"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.cssSelector("body")).click();
        driver.findElement(By.cssSelector("#mui-176 > .MuiButtonBase-root:nth-child(2)")).click();
        driver.findElement(By.id("chargeAmount")).click();
        driver.findElement(By.id("chargeAmount")).sendKeys("৩");
        {
            WebElement element = driver.findElement(By.cssSelector(".Mui-focused > #demo-simple-select"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".MuiButtonBase-root:nth-child(6)"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.cssSelector("body")).click();
        driver.findElement(By.cssSelector(".MuiButtonBase-root:nth-child(9)")).click();
        driver.findElement(By.cssSelector(".btn-save")).click();
        {
            WebElement element = driver.findElement(By.id("mui-p-75013-T-5"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".btn-save"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.cssSelector("body")).click();
        driver.findElement(By.cssSelector(".MuiButtonBase-root:nth-child(8)")).click();
        {
            WebElement element = driver.findElement(By.id("mui-184"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector("#mui-184-label > span:nth-child(1)"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.cssSelector(".MuiAutocomplete-root > .MuiFormControl-root")).click();
        driver.findElement(By.id("mui-184-option-1")).click();
        driver.findElement(By.id("projectName")).click();
        driver.findElement(By.id("mui-184")).click();
        driver.findElement(By.id("mui-184-option-3")).click();
        driver.findElement(By.id("projectName")).click();
        {
            WebElement dropdown = driver.findElement(By.id("projectName"));
            dropdown.findElement(By.xpath("//option[. = 'গৌতম ভৌমিক (যুগ্ম পরিচালক)']")).click();
        }
        driver.findElement(By.cssSelector(".btn-save")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".MuiButton-root"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
    }
}

