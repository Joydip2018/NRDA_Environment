package NRDA_WaterAndSewerage_Disconnection;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;;

/**
 * @author deepak.saini
 * @since 2017-08-11
 */
public class WaterAndSewerageConnection extends CommonLibrary 
{
	Logger log = Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver, 30);
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Water and Sewerage Connection".
	 * 
	 * @author deepak.saini
	 * 
	 * @since 2017-08-11
	 */
	/*****************************************************************************************************/
	//@FindBy(xpath = "//a[contains(.,'Fresh Application/नया आवेदन')]")
	@FindBy(xpath = "//a[contains(.,'Fresh Application')]")
	private WebElement fresh_app_link;
	
	@FindBy(xpath = "//a[contains(text(),'Public Health and Engineering')]")
	private WebElement waterseweargeconnection;

	public void waterAndSewerageConnection() throws InterruptedException 
	{
		wait.until(ExpectedConditions.visibilityOf(fresh_app_link));
		Assert.assertTrue(fresh_app_link.isDisplayed());
		HighlightOnElement(fresh_app_link);
		wait.until(ExpectedConditions.elementToBeClickable(fresh_app_link));
		Assert.assertTrue(fresh_app_link.isEnabled());
		fresh_app_link.click();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(waterseweargeconnection));
		Assert.assertTrue(waterseweargeconnection.isDisplayed());
		HighlightOnElement(waterseweargeconnection);
		wait.until(ExpectedConditions.elementToBeClickable(waterseweargeconnection));
		Assert.assertEquals(true, waterseweargeconnection.isEnabled());
		Assert.assertNotNull(waterseweargeconnection, "Click on waterseweargeconnection link sucessfully");
		waterseweargeconnection.click();
		log.info("Step6: Click on Water and Sewerage Connection link Successfully");
		Reporter.log("Verify Water and Sewerage Connection link is Present", true); // print for eclipse console
	}

	/***************************************
	 * this method is used to get all options under Water and Sewerage Connection
	 * 
	 * @throws InterruptedException
	 *************************/

	@FindBy(xpath = ".//div[@class='ui-accordion-content ui-helper-reset ui-widget-content ui-helper-hidden']/table/tbody/tr/td")
	private List<WebElement> menus_list;
	
	public void verifyAllWaterMenus() 
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(menus_list));
		for(WebElement menu_link : menus_list)
		{
			HighlightOnElement(menu_link);
		}
		waitForDomElement();
	}
}