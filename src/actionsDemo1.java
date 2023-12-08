import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\java-eclipse\\eclipse\\Introduction\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/events/greatindianfestival/?_encoding=UTF8&ref_=ine_gw_h_ksd_ds_alc_gif_en&pd_rd_w=OYlG7&content-id=amzn1.sym.d550c71f-5058-4f1b-ba50-35b688247f07&pf_rd_p=d550c71f-5058-4f1b-ba50-35b688247f07&pf_rd_r=04VATEDWYV9W57RPA0XZ&pd_rd_wg=WxkOJ&pd_rd_r=7961ff86-2806-4bc8-941d-c147e4818ed1");
		Actions d = new Actions(driver);
		Thread.sleep(2000);
		d.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
		
		d.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

	}

}
