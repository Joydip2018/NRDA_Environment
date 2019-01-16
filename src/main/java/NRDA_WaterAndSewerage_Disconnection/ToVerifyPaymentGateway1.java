package NRDA_WaterAndSewerage_Disconnection;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyPaymentGateway1 extends CommonLibrary {
	ExcelDataDriver excel = new ExcelDataDriver();
	WebDriverWait wait = new WebDriverWait(driver, 10);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "enter credit card".
	 * 
	 * @author deepak.saini
	 * 
	 * @since 2018-04-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath = "//input[@id='ccard_number']")
	private WebElement creditcardnum;

	public void enterInvalidCreditCardNumber() throws EncryptedDocumentException, IOException, InvalidFormatException
	{
		wait.until(ExpectedConditions.visibilityOf(creditcardnum));
		Assert.assertTrue(creditcardnum.isDisplayed());
		HighlightOnElement(creditcardnum);
		Assert.assertTrue(creditcardnum.isEnabled());
		excel.getExcelData(creditcardnum, "Card Details", 2, 1);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Pay now".
	 * 
	 * @author deepak.saini
	 * 
	 * @since 2018-04-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath = "//div/input[@id='pay_button']")
	private WebElement paynow;

	public void clickOnPayNow() throws InterruptedException 
	{
		wait.until(ExpectedConditions.visibilityOf(paynow));
		Assert.assertTrue(paynow.isDisplayed());
		HighlightOnElement(paynow);
		Assert.assertTrue(paynow.isEnabled());
		paynow.click();
		
		//backToPage(driver);
	}
	
	
	/********************************************************************************/
	/** Induslnd bank credit card verify */

	@FindBy(xpath = "//input[@id='ccCardNo']")
	private WebElement cardnum;

	public void enterInvalidCreditCardNumber_bank() throws EncryptedDocumentException, IOException, InvalidFormatException
	{
		wait.until(ExpectedConditions.visibilityOf(cardnum));
		Assert.assertTrue(cardnum.isDisplayed());
		HighlightOnElement(cardnum);
		Assert.assertTrue(cardnum.isEnabled());
		excel.getExcelData(cardnum, "Card Details", 2, 1);
	}
	
	
	@FindBy(xpath = "//div/input[@id='paymentProcess']")
	private WebElement pay_now;

	public void clickOnPayNow_bank() throws InterruptedException 
	{
		wait.until(ExpectedConditions.visibilityOf(pay_now));
		Assert.assertTrue(pay_now.isDisplayed());
		HighlightOnElement(pay_now);
		Assert.assertTrue(pay_now.isEnabled());
		pay_now.click();
		
		//backToPage(driver);
	}
	
	
	
	
	
}