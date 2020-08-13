package common;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import java.util.ResourceBundle;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import reusables.homePageReusable;

/**
 * Class: Base Test
 * Description: WebDriver initiation and browser close
 * @author kenisaacd
 *
 */

public class baseTest {

	public WebDriver driver = null;
	public static WebDriverWait wait;
	protected JavascriptExecutor js;
	
	public homePageReusable homePage;
	public ResourceBundle bundle;


	@BeforeClass
	public void beforeClass() {
		bundle = ResourceBundle.getBundle("testDataProperties.data");
		System.setProperty("webdriver.chrome.driver", bundle.getString("DriverLocation"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(bundle.getString("URL"));
		js = (JavascriptExecutor) driver;
		
		homePage = PageFactory.initElements(driver, homePageReusable.class);

}
	@AfterClass
	public void afterClass() {
		driver.quit();
	}
	
	
	
	
}
