package StepDefn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver d1;
@Given("User is on login page")
public void user_is_on_login_page() {
    // Write code here that turns the phrase above into concrete actions
	 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    
		d1=new ChromeDriver();
		d1.get("https://ksrtc.in/oprs-web/login/show.do");
		System.out.println("given done");

    
}

@When("user enters usernsame and password")
public void user_enters_usernsame_and_password() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("when done");

	 
}

@And("clicks on login button")
public void clicks_on_login_button() {
    // Write code here that turns the phrase above into concrete actions
	d1.findElement(By.id("submitBtn")).click();
	System.out.println("when done");
    
}

@Then("user is navigated to the home page")
public void user_is_navigated_to_the_home_page() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("then done");

     
}

}
