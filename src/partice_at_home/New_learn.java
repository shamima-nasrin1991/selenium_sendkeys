package partice_at_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class New_learn {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver","C://Users//Imtiaz//eclipse-workspace//Selenium_home_p2//DRIVER//chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		
		System.setProperty("webdriver.gecko.driver","C://Users//Imtiaz//eclipse-workspace//Selenium_home_p2//DRIVER//geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://expedia.com");
		driver.findElement(By.id("header-account-menu")).click();
		driver.findElement(By.id("account-signin")).click();
		driver.findElement(By.id("gss-signin-email")).sendKeys("shamimas102@gmail.com");
		driver.findElement(By.id("gss-signin-password")).sendKeys("Television17");
		driver.findElement(By.id("gss-signin-submit")).click();
		System.out.println("Data update successfully");
		// TODO Auto-generated method stub

	}

}
