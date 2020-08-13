package reusables;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ResourceBundle;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageObjectRepository.homePage;

/**
 * Class: Home Page Reusable
 * Description: Collection of Home Page Methods
 * @author kenisaacd
 *
 */

public class homePageReusable extends homePage {

	public homePageReusable(WebDriver driver) {
		super(driver);
	}
	public homePage homePage;


	ResourceBundle bundle = ResourceBundle.getBundle("testDataProperties.data");

	public void flight() {	
		homePage = PageFactory.initElements(driver, homePage.class);

		homePage.fromTextField.sendKeys("Chennai");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		homePage.fromTextField.sendKeys(Keys.DOWN);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		homePage.fromTextField.sendKeys(Keys.ENTER);
		
		
		homePage.destinationTextField.sendKeys("Delhi");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		homePage.destinationTextField.sendKeys(Keys.DOWN);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		homePage.destinationTextField.sendKeys(Keys.ENTER);

homePage.departureTextField.click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

homePage.thirdDay.click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
homePage.searchButton.click();

try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	

homePage.indioGo.click();

 
		System.out.println("Test Case Pass");
		

	}

				
	public static void exceldata(String flightdetails) throws IOException
	{
		 FileInputStream fis = new FileInputStream("/Users/kenisaacd/git/repository5/sample/testdata/excel.xlsx");
		 XSSFWorkbook workbook = new XSSFWorkbook(fis);
		 
		 XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		                Row row = sheet.createRow(1);
		 Cell cell = row.createCell(1);
		 
		 cell.setCellType(cell.CELL_TYPE_STRING);
		 cell.setCellValue(flightdetails);
		 FileOutputStream fos = new FileOutputStream("/Users/kenisaacd/git/repository5/sample/testdata/excel.xlsx");
		 workbook.write(fos);
		 fos.close();

	}
}
