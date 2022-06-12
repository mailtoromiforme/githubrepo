package Stepdefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver.Timeouts;
////

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class testho {
	WebDriver driver = null;
	
	@Given("browser is open")
	///
	public void browser_is_open() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rsharma\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");   
		driver = new ChromeDriver();		 
		driver.navigate().to("https://suitsupply.com/en-nl/");
		driver.manage().window().maximize();
	}
	@When("user Clicks Menu and SubMenu")
	public void user_clicks_menu_and_sub_menu() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(("/html/body/div[1]/header/div[1]/button/span"))).click();
		driver.findElement(By.xpath(("/html/body/div[1]/header/nav/div/div[2]/div[1]/div/ul/li[2]/a"))).click();
	}

	

	@When("user is navigated to Next page")
	public void user_is_navigated_to_next_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	@When("user clicks a product and add to cart")
	public void user_clicks_a_product_and_add_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
		
		//driver.findElement(By.xpath(("/html/body/div[1]/div[9]/div[4]/div/div[1]/div/div/div[2]/a/picture/img"))).click();
		//driver.findElement(By.xpath(("/html/body/div[1]/div[5]/div/div[2]/div[2]/div[1]/div[5]/div[2]/div/button"))).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.cssSelector(("div[id='product-sizes-overlayP6488'] div[class='product-sizes__overflow'] div:nth-child(1) div:nth-child(2) div:nth-child(2) button:nth-child(1)"))).click();
		//driver.findElement(By.cssSelector(("body > div:nth-child(25) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > button:nth-child(3)"))).click();
		//driver.findElement(By.xpath("//a[@role='button']"));
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//System.out.println("launch complete");
		//driver.findElement(By.cssSelector("a[role='button']")).click();
		//driver.findElement(By.xpath(("/html/body/div[6]/div[1]/div/div/div/div[1]/div[2]/div[1]/div[2]/div[8]"))).click();
		//driver.navigate().to("https://suitsupply.com/on/demandware.store/Sites-INT-Site/en_NL/Product-Variation?dwvar_P6488_size_suits=46&pid=P6488&quantity=1");
	}
	


}
