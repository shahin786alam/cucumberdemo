package stepDefinitions;

import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
// data table with maps: for parameterization of test cases
public class DealsMapWithStepDefinition {
	
	WebDriver driver;
	@Given("^users is already on login page$")
	public void user_is_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe"); 
		driver=new ChromeDriver();
		driver.get("https://www.crmpro.com");
		driver.manage().window().maximize();   
	}

	@When("^title of login page is free crm$")
	public void title_of_login_page_is_free_crm() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.",title); 
	}

	@Then("^user enter username and password$")
	public void user_enter_username_and_password(DataTable credintials) {
		for(Map<String, String> data: credintials.asMaps(String.class,String.class)) {
		driver.findElement(By.name("username")).sendKeys(data.get("username"));
		driver.findElement(By.name("password")).sendKeys(data.get("password"));
	}
	}

	@Then("^user click on logins button$")
	public void user_click_on_login_button() {
		 WebElement loginbtn= driver.findElement(By.xpath("//input[@type='submit' and @value='Login' and @class='btn btn-small']"));
		 JavascriptExecutor js = ((JavascriptExecutor) driver);
		 js.executeScript("arguments[0].click();",loginbtn);
	}

	@Then("^user is on homes page$")
	public void user_is_on_home_page() {
		String title=driver.getTitle();
		System.out.println("Home title is="+title);
		Assert.assertEquals("CRMPRO",title );
	}

	@Then("^user moves to new deals page$")
	public void user_moves_to_new_deals_page() {
		driver.switchTo().frame("mainpanel");
		Actions action =new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	}

	@Then("^user enters deal details$")
	public void user_enters_deal_details(DataTable dealdata) {
		for(Map<String,String> dealvalue: dealdata.asMaps(String.class,String.class)) {
		 driver.findElement(By.id("title")).sendKeys(dealvalue.get("title"));
		 driver.findElement(By.name("amount")).sendKeys(dealvalue.get("amount"));
		 driver.findElement(By.id("probability")).sendKeys(dealvalue.get("probability"));
         driver.findElement(By.id("commission")).sendKeys(dealvalue.get("comission"));
         driver.findElement(By.xpath("//input[@type='submit' and @value='Save' ]")).click();  //click save button
         // move to new deal page:
         Actions action =new Actions(driver);
 		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
 		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	}
	}

	@Then("^user close the browser$")
	public void close_the_browser() {
      driver.quit();
	}


}
