package NRDA_WaterAndSewerage_Disconnection;

import java.io.IOException;
import java.util.logging.Logger;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyPaymentGateway3 extends CommonLibrary 
{
	ExcelDataDriver excel = new ExcelDataDriver();
	Logger log = Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);	
	/****************************************************************************************************/
	/*
	* This is the xpath of the WebElement "cvv number".
	* @author deepak.saini
	* @since 2018-04-12
	*/
	/****************************************************************************************************/
	@FindBy(xpath="//input[@id='ccvv_number']")
	private WebElement cvv;

	public void enterInvalidCVVNumber() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(cvv));
		Assert.assertTrue(cvv.isDisplayed());
		HighlightOnElement(cvv);
		Assert.assertTrue(cvv.isEnabled());
		excel.getExcelData(cvv,"Card Details",2,3);
	}
	
	@FindBy(xpath = "//input[@id='ccard_number']")
	private WebElement creditcardnum;	
	public void enterValidCreditCardNumber() throws EncryptedDocumentException, IOException, InvalidFormatException
	{
		wait.until(ExpectedConditions.visibilityOf(creditcardnum));
		Assert.assertTrue(creditcardnum.isDisplayed());
		HighlightOnElement(creditcardnum);
		Assert.assertTrue(creditcardnum.isEnabled());
		excel.getExcelData(creditcardnum, "Card Details", 1, 1);
	}
	
	@FindBy(xpath="//select[@id='cexpiry_date_month']")
	private WebElement expiry_month;
	public void selectCardExpiryMonth() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(expiry_month));
		Assert.assertTrue(expiry_month.isDisplayed());
		HighlightOnElement(expiry_month);
		wait.until(ExpectedConditions.elementToBeClickable(expiry_month));
		Assert.assertTrue(expiry_month.isEnabled());
		SelectVisibleText(expiry_month, "Mar (3)");
	}
	
	@FindBy(xpath="//select[@id='cexpiry_date_year']")
	private WebElement expiry_year;
	public void selectCardExpiryYear() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(expiry_year));
		Assert.assertTrue(expiry_year.isDisplayed());
		HighlightOnElement(expiry_year);
		wait.until(ExpectedConditions.elementToBeClickable(expiry_year));
		Assert.assertTrue(expiry_year.isEnabled());
		SelectVisibleText(expiry_year, "2021");
	}
	
	public void enterValidCVVNumber() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(cvv));
		Assert.assertTrue(cvv.isDisplayed());
		HighlightOnElement(cvv);
		wait.until(ExpectedConditions.elementToBeClickable(cvv));
		Assert.assertTrue(cvv.isEnabled());
		excel.getExcelData(cvv,"Card Details",1,3);
	}
	
	@FindBy(xpath = "//input[@id='cname_on_card']")
	private WebElement cardholdername;	
	public void enterCardHolderName() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(cardholdername));
		Assert.assertTrue(cardholdername.isDisplayed());
		HighlightOnElement(cardholdername);
		Assert.assertTrue(cardholdername.isEnabled());
		excel.getExcelData(cardholdername,"Card Details",1,2);
	}


	/****************************************************************************************************/
	/*
	* This is the xpath of the WebElement "Pay now".
	* @author deepak.saini
	* @since 2018-04-12
	*/
	/****************************************************************************************************/
	@FindBy(xpath="//div/input[@id='pay_button']")
	private WebElement paynow;

	public void clickOnPayNow() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(paynow));
		Assert.assertTrue(paynow.isDisplayed());
		HighlightOnElement(paynow);
		Assert.assertTrue(paynow.isEnabled());
		paynow.click();
	}
	
	
	/*******************************************************************************/
	/*
	 * Payment made via Induslnd Bank
	 * 
	 * made by Neha Sharma
	 * 
	 * 
	 */
	
	@FindBy(xpath = "//input[@id='ccCardNo']")
	private WebElement card_num;	
	public void validCreditCardNumber_bank() throws EncryptedDocumentException, IOException, InvalidFormatException
	{
		wait.until(ExpectedConditions.visibilityOf(card_num));
		Assert.assertTrue(card_num.isDisplayed());
		HighlightOnElement(card_num);
		Assert.assertTrue(card_num.isEnabled());
		excel.getExcelData(card_num, "Card Details", 1, 1);
	}
	
	
	@FindBy(xpath="//select[@id='ccMonth']")
	private WebElement expirymonth;
	public void selectCardExpiryMonth_bank() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(expirymonth));
		Assert.assertTrue(expirymonth.isDisplayed());
		HighlightOnElement(expirymonth);
		wait.until(ExpectedConditions.elementToBeClickable(expirymonth));
		Assert.assertTrue(expirymonth.isEnabled());
		SelectVisibleText(expirymonth, "11");
	}
	
	@FindBy(xpath="//select[@id='ccYear']")
	private WebElement expiryyear;
	public void selectCardExpiryYear_bank() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(expiryyear));
		Assert.assertTrue(expiryyear.isDisplayed());
		HighlightOnElement(expiryyear);
		wait.until(ExpectedConditions.elementToBeClickable(expiryyear));
		Assert.assertTrue(expiryyear.isEnabled());
		SelectVisibleText(expiryyear, "2018");
	}
	
	
	@FindBy(xpath="//input[@id='ccCcv']")
	private WebElement cvnum;
	public void enterValidCVVNumber_bank() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(cvnum));
		Assert.assertTrue(cvnum.isDisplayed());
		HighlightOnElement(cvnum);
		wait.until(ExpectedConditions.elementToBeClickable(cvnum));
		Assert.assertTrue(cvnum.isEnabled());
		excel.getExcelData(cvnum,"Card Details",1,3);
	}
	
	@FindBy(xpath = "//input[@id='ccCardName']")
	private WebElement cardname;	
	public void enterCardHolderName_bank() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(cardname));
		Assert.assertTrue(cardname.isDisplayed());
		HighlightOnElement(cardname);
		Assert.assertTrue(cardname.isEnabled());
		excel.getExcelData(cardname,"Card Details",1,2);
	}


	@FindBy(xpath="//input[@id='paymentProcess']")
	private WebElement pay_now;

	public void clickOnPayNow_bank() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(pay_now));
		Assert.assertTrue(pay_now.isDisplayed());
		HighlightOnElement(pay_now);
		Assert.assertTrue(pay_now.isEnabled());
		pay_now.click();
	}
	
	
	
}