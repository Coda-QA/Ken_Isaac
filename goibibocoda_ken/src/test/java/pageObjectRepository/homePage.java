package pageObjectRepository;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.baseTest;

/**
 * Class: HomePage
 * Description: Collection of Home Page webelement
 * @author kenisaacd 
 *
 */
public class homePage extends baseTest   {

	public homePage(WebDriver driver)
	{
		this.driver = driver;
	}

	@FindBy(xpath="//input[@id='gosuggest_inputSrc']")
	public WebElement fromTextField;
	

	@FindBy(xpath="//input[@id='gosuggest_inputDest']")
	public WebElement destinationTextField;
	
	@FindBy(xpath="//input[@id='departureCalendar']")
	public WebElement departureTextField;
	
	@FindBy(xpath="(//div[@class='calDate'])[16]")
	public WebElement thirdDay;

	@FindBy(xpath="//button[contains(text(),'SEARCH')]")
	public WebElement searchButton;
	
	
	@FindBy(xpath="//div[@id='IndiGo']")
	public WebElement indioGo;
	
	

}
