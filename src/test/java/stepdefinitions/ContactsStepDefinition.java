package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// (*) star is regular Exp
// if import cucumber.api.java.en.*; 
//then no nedd to import all the @Given, @When, @Then
import cucumber.api.java.en.*;
import junit.framework.Assert;

public class ContactsStepDefinition {
	
	WebDriver driver=null;
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe"); 
		driver=new ChromeDriver();
		driver.get("https://www.crmpro.com");
		driver.manage().window().maximize();
	}

	@When("^title of logine page is free crm$")
	public void title_of_logine_page_is_free_crm() {
		 String title=driver.getTitle();
		 System.out.println(title);
		 Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.",title);  
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^user click in login button$")
	public void user_click_in_login_button() {
	    WebElement loginbtn= driver.findElement(By.xpath("//input[@type='submit' and @value='Login' and @class='btn btn-small']"));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
	    js.executeScript("arguments[0].click();",loginbtn);
	}

	@Then("^user is home page$")
	public void user_is_home_page() {
		String title=driver.getTitle();
		System.out.println("Home title is="+title);
		Assert.assertEquals("CRMPRO",title );
	}

	@Then("^user moves to new contacts page$")
	public void user_moves_to_new_contacts_page() {
	 driver.switchTo().frame("mainpanel");
	 Actions action =new Actions(driver);
	 action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
	 driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
	}

	@Then("^user enters contact details\"([^\"]*)\" and \"([^\"]*)\" And \"([^\"]*)\"$")
	public void user_enters_and_And(String firstname, String lastname, String position) {
	   driver.findElement(By.id("first_name")).sendKeys(firstname);
	   driver.findElement(By.name("surname")).sendKeys(lastname);
	   driver.findElement(By.id("company_position")).sendKeys(position);
	   driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/input[2]")).click();
	}

	@Then("^user close the browser$")
	public void close_the_browser() {
	  driver.quit(); 
	}


}
