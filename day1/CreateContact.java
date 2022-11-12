package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Deepa");
		
		//driver.findElement(By.id("createLeadForm_firstNameField")).sendKeys("Deepa");
		driver.findElement(By.id("lastNameField")).sendKeys("Sree");
		String firstName = driver.findElement(By.id("firstNameField")).getAttribute("value");
		driver.findElement(By.name("submitButton")).click();
		
		
		
		
		
		System.out.println(firstName);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();

		

	}

}
