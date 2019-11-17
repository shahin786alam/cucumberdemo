//package stepDefinitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//public class LoginStepDefinition {
//	
//	WebDriver driver;
//	
//	@Given("^User is already on Login page$")
//	public void user_is_already_on_Login_page(){
//    System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe"); 
//	driver=new ChromeDriver();
//	driver.get("https://www.crmpro.com");
//	driver.manage().window().maximize();
//	}
//	
//	@When("^title of login page is Free CRM$")
//	public void title_of_login_page_is_Free_CRM() {
//	 String title=driver.getTitle();
//	 System.out.println(title);
//	 Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.",title);
//	}
//    //This is hurd coding
////	@Then("^user enter username and password$")
////	public void user_enter_username_and_password() {
////	  driver.findElement(By.name("username")).sendKeys("khamerbari");
////	  driver.findElement(By.name("password")).sendKeys("shahin786");
////	}
//	//one data at a time (datadriven approach)
////	 //Reg Exp:
////	 //1. \"([^\"]*)\"
////	 //2. \"(.*)\"
//	@Then("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enter_username_and_password(String username, String password) {
//	  driver.findElement(By.name("username")).sendKeys(username);
//	  driver.findElement(By.name("password")).sendKeys(password);
//	}
//
//	@Then("^user click on login button$")
//	public void user_click_on_login_button() {
//	    WebElement loginbtn= driver.findElement(By.xpath("//input[@type='submit' and @value='Login' and @class='btn btn-small']"));
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		js.executeScript("arguments[0].click();",loginbtn);
//	}
//
//	@Then("^user is on home page$")
//	public void user_is_on_home_page() {
//	  String title=driver.getTitle();
//	  System.out.println("Home title is="+title);
//	  Assert.assertEquals("CRMPRO",title );
//	}
//	
//	@Then("^close the browser$")
//	public void close_the_browser(){
//	driver.quit();
//	}	
//
//}
