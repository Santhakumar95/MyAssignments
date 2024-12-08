package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
driver.navigate().to("http://leaftaps.com/opentaps/");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.xpath("//a[text()='Leads']")).click();
driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Santhakumar");
driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Madhavan");
driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("RANE MADRAS");
driver.findElement(By.xpath("//input[@name='generalProfTitle']")).sendKeys("AVENGERS");
driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
System.out.println(driver.getTitle());
System.out.println("Everything works well");
driver.close();
	}

}
