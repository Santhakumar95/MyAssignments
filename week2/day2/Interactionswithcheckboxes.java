package week2.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Interactionswithcheckboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		//Click on the "Basic Checkbox.”
		driver.findElement(By.xpath("(//span[@class='ui-chkbox-icon ui-icon ui-icon-blank ui-c']//parent::div)[1]")).click();
		//Click on the "Notification Checkbox."
		driver.findElement(By.xpath("(//*[@id=\"j_idt87:j_idt91\"]/div[2])")).click();		
		//Verify that the expected message is displayed.
		String checkboxMessage=	driver.findElement(By.xpath("//div[@class='ui-growl-message']//span[text()='Checked']")).getText();
		System.out.println("Verified the check box:" +checkboxMessage );		
		// Click on your favorite language (assuming it's related to checkboxes).
		driver.findElement(By.xpath("(//label[text()='Java']//parent::td//div)[1]")).click(); //normal xpath --- //table[@id='j_idt87:basic']//div//div[1]
		// Click on the "Tri-State Checkbox."
		driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']")).click();
		// Verify which tri-state option has been chosen.
		String triStateSelect=	driver.findElement(By.xpath("(//div[@class='ui-growl-message']//span[text()='State has been changed.'])")).getText();
		System.out.println("Trichosen:" +triStateSelect );		
		//  Click on the "Toggle Switch."
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']")).click();
		//  Verify that the expected message is displayed.
		String toggleSwitch=	driver.findElement(By.xpath("//div[@class='ui-growl-message']//span[text()='Checked']")).getText();
		System.out.println("Verified the toggleswitch:" +toggleSwitch );
		// Verify if the Checkbox is disabled.
		Boolean toogleDisabled=driver.findElement(By.xpath("//input[@aria-label='Disabled']")).isEnabled();
		if(toogleDisabled==false)
		{
			System.out.println("Check box is disabled and it is expected");			
		} else
		{
			System.out.println("Check box is enabled and it is not expected");
		}
		// Select multiple options on the page
		driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']")).click();
		driver.findElement(By.xpath("(//div[@class='ui-selectcheckboxmenu-items-wrapper']//div//div)[2]")).click();
		driver.findElement(By.xpath("(//div[@class='ui-selectcheckboxmenu-items-wrapper']//div//div)[6]")).click();
		driver.findElement(By.xpath("(//div[@class='ui-selectcheckboxmenu-items-wrapper']//div//div)[8]")).click();
	    //  Close the web browser when done.
		driver.close();
	}

}
