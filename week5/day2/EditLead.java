package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EditLead extends ProjectSpecificMethod {
	
	@DataProvider(name="fetchData")
	public String[][] setValue() {
		
		String[][] data = new String[3][2];
		data[0][0] = "123456";
		data[0][1] = "CTS";
		
		data[1][0] = "67862364";
		data[1][1] = "TCS";
		
		data[2][0] = "384846634";
		data[2][1] = "Wipro";

		return data;
		
	}

	@Test(dataProvider="fetchData")
	public void EditLeadMethod(String phoneNum, String cName) throws InterruptedException {
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNum);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys(cName);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cName)) {
			System.out.println("Lead is editted successfully");
		}
		else {
			System.out.println("Lead is not editted");
			driver.close();
		}
		
		

	}
	
}
