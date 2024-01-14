package selenium.e_commerceTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor)wd;
		wd.manage().window().maximize();
		//        wd.manage().timeouts().pageLoadTimeout(2000,TimeUnit.MILLISECONDS);
		wd.get("https://www.flipkart.com/");
		wd.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);


		wd.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/a[2]")).click();
		wd.findElement(By.className("_3704LK")).sendKeys("iPhone 13");
		wd.findElement(By.className("L0Z3Pu")).click();
		
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		
		WebDriverManager.edgedriver().setup();
		WebDriver wd1 = new EdgeDriver();
		JavascriptExecutor js1 = (JavascriptExecutor)wd;

		wd1.manage().window().maximize();
		//        wd.manage().timeouts().pageLoadTimeout(2000,TimeUnit.MILLISECONDS);
		wd1.get("https://www.flipkart.com/");
		wd1.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);


		wd1.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/a[2]")).click();
		wd1.findElement(By.className("_3704LK")).sendKeys("iPhone 13");
		wd1.findElement(By.className("L0Z3Pu")).click();
		
		js1.executeScript("window.scrollBy(0, document.body.scrollHeight)");
	}
}
