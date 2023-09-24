import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SkyItHomeWork {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver=new ChromeDriver();
        driver.get("file:///C:/Java/webpage/sit.skyschooling/index.html");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Naz");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("Nah");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='pnumber']")).sendKeys("12345");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("naz.gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='adress']")).sendKeys("Bangladesh");
        Thread.sleep(2000);
//        String s = driver.findElement(By.tagName("//img[@src='flower.jpg']")).getTagName();
//        System.out.println("This tag name is "+s);
//        Thread.sleep(2000);
       // driver.findElement(By.xpath("//a[@href='https://microtechna.com']")).click();
       // driver.findElement(By.linkText("For help click here")).click();
       // driver.navigate().back();
        //driver.findElement(By.partialLinkText("click here")).click();
        driver.findElement(By.id("scales")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("horns")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='radio']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("select")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//option[text()='All Topic']")).click();
        Thread.sleep(2000);
       // driver.findElement(By.cssSelector("submit-btn")).click();
        driver.findElement(By.className("submit-btn")).click();
        String B = driver.findElement(By.id("success")).getText();
//        if(B.contains("Submited"))
//            System.out.println("passed");
//        else
//            System.out.println("fail");
        if(B.contains("Submited"))
            System.out.println("passed");
        else
            System.out.println("Fall");


        driver.close();
//        WebElement dropdown=driver.findElement(By.name("select"));
//        dropdown.click();
//        Select select=new Select((dropdown));
//




    }
}
