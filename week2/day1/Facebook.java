package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Santha");
driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Kumar");
driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9789040304");
driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("Aswathi19.");
WebElement ele=driver.findElement(By.xpath("//select[@aria-label='Day']"));
Select day=new Select(ele);
day.selectByVisibleText("1");
WebElement ele1=driver.findElement(By.xpath("//select[@aria-label='Month']"));
Select month=new Select(ele1);
month.selectByVisibleText("Apr");
WebElement ele2=driver.findElement(By.xpath("//select[@aria-label='Year']"));
Select year=new Select(ele2);
year.selectByVisibleText("1995");
driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();
System.out.println("Done");
driver.close();
}}