import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\java-eclipse\\eclipse\\Introduction\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String>it = windows.iterator();
		
		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		
		System.out.println(driver.findElement(By.cssSelector("p.red")).getText());
		
		String[] names = driver.findElement(By.cssSelector("p.red")).getText().split("at");
		String[] names2 = names[1].split("with");
		String originalId = names2[0].trim();
		
		System.out.print(originalId);
		
		driver.switchTo().window(parentId);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys(originalId);
		
		

	}

}
