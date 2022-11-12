package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Deepa");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sree");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Deepa");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Automationtesting");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rdeeps83@gmail.com");
		
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
	}

}
