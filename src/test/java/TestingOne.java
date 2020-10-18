import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingOne {

	public static WebDriver driver;

	@BeforeMethod
	public void driverscript() {

		System.out.println("Start Driver Script");
		
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe" );
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
				
		
	}

	@Test
	public void TestCase1() {

		
		System.out.println("Test 1 : Pass" + driver.getCurrentUrl());
			
	}

	@Test
	public void TestCase2() {
		
		System.out.println("Test 2 : Pass" + driver.getCurrentUrl());
	
	}

	@Test
	public void TestCase3() {
		
		
		System.out.println("Test 3 : Pass" + driver.getCurrentUrl());
	
	}

	@AfterMethod
	public void closedriver() {
		
		driver.quit();

	}

}
