package stepDefo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplementFeaturefile {
	
	WebDriver driver;
	
	@Given ("^The user enter the \"(.*)\"$")
	
	public void testcase1(String url) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("Thread-count :"+ Thread.currentThread().getId());
	}
	
	@When ("^the user enter userID \"(.*)\"$")
	public void testcase2(String uname) {
		
		driver.findElement(By.id("email")).sendKeys(uname);
		System.out.println("Thread-count :"+ Thread.currentThread().getId());
	}
	@Then ("^the user enter pwd \"(.*)\"$")
	public void testcase3(String pwd) {

		
		driver.findElement(By.id("pass")).sendKeys(pwd);
		System.out.println("Thread-count :"+ Thread.currentThread().getId());
	}
	@And ("^the user enter the login button$")
	public void testcase4() {
		driver.findElement(By.id("u_0_b")).sendKeys(Keys.ENTER);
		System.out.println("Thread-count :"+ Thread.currentThread().getId());
	}

}
