import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MavenTestng {
    @Test
    public void test1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_testng\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.one.co.il");
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void test2(){
        Assert.fail("Fail test for maven");
//        System.out.println("Test");
    }
}
