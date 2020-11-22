package Rest.Spicejet;

import static io.restassured.RestAssured.when;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Jet extends Base {
	
	WebDriver driver;

	@Test
	
	public void journey() throws IOException {
		
		this.driver=begins();
		
		driver.get(prop.getProperty("url"));
		
		
		List<WebElement> w3=driver.findElements(By.cssSelector("figcaption[class='game-name']"));
		
		List<WebElement> wx=driver.findElements(By.xpath("//span[@class='count-tournaments']"));
		
		
				  
			for(int i=0;i<w3.size();i++) {
				
			try {
				
				String s3=w3.get(i).getText();
				
				System.out.println("Game Name"+s3);
			
				w3.get(i).click();
				
			}
			
			
			catch(org.openqa.selenium.StaleElementReferenceException ex)
			{
				
				List<WebElement> w4=driver.findElements(By.cssSelector("figcaption[class='game-name']"));
				
				System.out.println("Game Name"+w4.get(i).getText());
				
				w4.get(i).click();
				
			}
			
			
	String s=driver.getCurrentUrl();
	
	String tournaments=driver.findElement(By.xpath("//span[@class='count-tournaments']")).getText();
	
	System.out.println("Tournament-count"+tournaments);
	int kl=when().get(s).getStatusCode();
	
	System.out.println("Page Status"+kl);
	
	
	driver.navigate().back();
			System.out.println("Page URL"+s);
		
				
				
			}
	}
}

	
			
				
		
		
		
		
				
			
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
		
	
