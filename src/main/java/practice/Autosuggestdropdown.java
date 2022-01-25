package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestdropdown {
	
	public void method2() {
		
		System.out.println("Gitpracticefromprojectversion2");

	}
	public static void main(String[] args) throws InterruptedException {

		//WebDriverManager.chromedriver().setup();

		//ChromeDriver driver = new ChromeDriver();
		
		WebDriverManager.edgedriver().setup();
		
		EdgeDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElementById("autosuggest").sendKeys("Ind");
		Thread.sleep(3000);

		List<WebElement> countries = driver.findElementsByXPath("//li[@class='ui-menu-item']/a");
		
		  for (WebElement country : countries) {
		  
		  if (country.getText().equalsIgnoreCase("indonesia")) {
		  
		  country.click();
		  
		  break; }
		  
		  }
		 

		driver.close();

	}

}
