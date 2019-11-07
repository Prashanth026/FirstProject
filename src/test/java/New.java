import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {
	
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT-Lenovo\\Prashanth\\MavenFirst\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Travel bags for men");
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		List<WebElement> Count = driver.findElements(By.xpath("//span[@class=\"a-size-base-plus a-color-base a-text-normal\"]"));
		
		int a = Count.size();
		System.out.println(a);
		
		for (WebElement x:Count) {
			
		String text = x.getText();
		
		System.out.println(text);
		
		
		
		
		
		
	}

}
}
