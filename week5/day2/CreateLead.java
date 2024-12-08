package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week5.day2.ProjectSpecificMethod;

public class CreateLead extends ProjectSpecificMethod {
	
	@DataProvider(name="fetchData")
	public String[][] setValue() {
		
		String[][] data = new String[3][4];
		data[0][0] = "TestLeaf";
		data[0][1] = "vinoth";
		data[0][2] = "s";
		data[0][3] = "1234354";
		
		data[1][0] = "TestLeaf";
		data[1][1] = "vineeth";
		data[1][2] = "s";
		data[1][3] = "7688736487623";
		
		data[2][0] = "TestLeaf";
		data[2][1] = "Priya";
		data[2][2] = "s";
		data[2][3] = "667908788";
		return data;
		
	}

	
@Test(dataProvider="fetchData")
	public void CreateLeadMethod(String cName, String fName, String lName, String phoneNum)
	{
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phoneNum);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("TestLeaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
			driver.close();
		}
		


	}

}
