package NRDA_WaterAndSewerage_Disconnection;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;


public class ToVerifyWaterAndSewerageConnection extends CommonLibrary
{
	Logger log = Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver, 30);
	
	ExcelDataDriver excel = new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Application for water and sewerage connection under Water and Sewerage Connection".
	 * @author deepak.saini
	 * @since 2017-08-11
	 */
	/****************************************************************************************************/
		
	@FindBy(xpath=".//label[contains(text(),'WATER AND SEWERAGE CONNECTION')]/../following-sibling::td/span/a/img[@src='/NRDAuthorityPreUAT/javax.faces.resource/applyNow.png.xhtml?ln=img']")
	private WebElement toverifyNewconnection;


	/***************************click on Application for water and sewerage connection*************************************************************************/
	public void clickOnToVerifyNewConnection() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(toverifyNewconnection));
		Assert.assertEquals(true, toverifyNewconnection.isDisplayed());
		HighlightOnElement(toverifyNewconnection);
		
		wait.until(ExpectedConditions.elementToBeClickable(toverifyNewconnection));
		Assert.assertEquals(true,toverifyNewconnection.isEnabled());
		Assert.assertNotNull(toverifyNewconnection,"Click on Application of Water and Sewerage New connection link sucessfully");
		toverifyNewconnection.click();
		Reporter.log("Verify Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
		waitForPageLoad();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on Select Associate Serivce Application for water and sewerage  new connection under Water and Sewerage Connection".
	 * @author deepak.saini
	 * @since 2017-08-16
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Apply New Water Connection')]")
	private WebElement clickonapplyfornewconnection;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on Proceed button".
	 * @author deepak.saini
	 * @since 2017-08-16
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Proceed')]")
	private WebElement proceed;


	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on alert Yes/NO button".
	 * @author deepak.saini
	 * @since 2017-08-16
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:confirmDlg']/div[2]/div/div/center/table/tbody/tr/td/button")
	private List<WebElement> button;

	@FindBy(xpath="//div[@class='wrapper']/table/tbody/tr/td/span/div/div/div/div/b")
	private List<WebElement> displaylink;

	@FindBy(xpath="//div[@class='wrapper']/table/tbody/tr/td/span/div/div/div/ul/li/a")
	private List<WebElement> displaylink1;

	@FindBy(xpath="//div[@class='wrapper']/table/tbody/tr/td/span/span/span/div/div/div/ul/li/a")
	private List<WebElement> displaylink2;



	public void clickOnProceedBtn() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Assert.assertEquals(true,clickonapplyfornewconnection.isEnabled());
		Assert.assertNotNull(clickonapplyfornewconnection,"Click on Apply for new connection sucessfully");
		HighlightOnElement(clickonapplyfornewconnection);
		clickonapplyfornewconnection.click();//click on Associate Services dropdown
		Reporter.log("Verify Apply for new connection is Present",true); //print for eclipse console 

		waitForSomeTime();
		HighlightOnElement(proceed);//click on proceed button
		proceed.click();
		waitForSomeTime();

		for(int index=0;index<button.size();index++)
		{
			String buttone=button.get(index).getText();
			System.out.println(buttone);
			if( buttone.trim().equalsIgnoreCase("yes"))
			{
				button.get(index).click();
				waitForSomeTime();
			}
		}

		for(WebElement link:displaylink)
		{
			HighlightOnElement(link);
			Assert.assertNotNull(link.isDisplayed());
			Reporter.log("Expected result:"+link.getText(),true);
		}

		for(WebElement link1:displaylink1)
		{
			HighlightOnElement(link1);
			Assert.assertNotNull(link1.isDisplayed());
			Reporter.log("Expected result:"+link1.getText(),true);
		}

		for(WebElement link2:displaylink2)
		{
			HighlightOnElement(link2);
			Assert.assertNotNull(link2.isDisplayed());
			Reporter.log("Expected result:"+link2.getText(),true);
		}
	}

	//@FindBy(xpath = ".//a[contains(text(),'Pending For Payment/भुगतान हेतु अपूर्ण')]")
	@FindBy(xpath = ".//a[contains(text(),'Pending For Payment')]")
	private WebElement pending_payment_link;
	
	public void verifyPendingForPaymentLink()
	{
		wait.until(ExpectedConditions.visibilityOf(pending_payment_link));
		Assert.assertTrue(pending_payment_link.isDisplayed());
		HighlightOnElement(pending_payment_link);
		
		wait.until(ExpectedConditions.elementToBeClickable(pending_payment_link));
		Assert.assertTrue(pending_payment_link.isEnabled());
		pending_payment_link.click();
		waitForPageLoad();
		waitForPageLoad();
	}
	
	@FindBy(xpath = ".//span[contains(text(),'Enter Application Number')]/../following-sibling::td[1]/input")
	private WebElement search_txt_box;
	
	public void verifySearchTextBox() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(search_txt_box));
		Assert.assertTrue(search_txt_box.isDisplayed());
		HighlightOnElement(search_txt_box);
		
		wait.until(ExpectedConditions.elementToBeClickable(search_txt_box));
		Assert.assertTrue(search_txt_box.isEnabled());
		excel.getExcelData(search_txt_box, "DisconnectionNumber", 0, 1);
		//excel.getExcelData(search_txt_box, "TransferApplicationNumber", 1, 0);
	}
	
	@FindBy(xpath=".//span[contains(text(),'Enter Application Number')]/../following-sibling::td[3]/button")
	private WebElement reset_button;
	
	public void verifyResetButton()
	{
		wait.until(ExpectedConditions.visibilityOf(reset_button));
		Assert.assertTrue(reset_button.isDisplayed());
		HighlightOnElement(reset_button);
		
		wait.until(ExpectedConditions.elementToBeClickable(reset_button));
		Assert.assertTrue(reset_button.isEnabled());
		reset_button.click();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
	}
	
	@FindBy(xpath=".//span[contains(text(),'Enter Application Number')]/../following-sibling::td[2]/button")
	private WebElement search_button;
	
	public void verifySearchButton()
	{
		wait.until(ExpectedConditions.visibilityOf(search_button));
		Assert.assertTrue(search_button.isDisplayed());
		HighlightOnElement(search_button);
		
		wait.until(ExpectedConditions.elementToBeClickable(search_button));
		Assert.assertTrue(search_button.isEnabled());
		search_button.click();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
	}
	
	@FindBy(xpath = ".//span[@class='ui-icon ui-icon-triangle-1-e']/following-sibling::a[contains(text(),'DISCONNECTION OF WATER CONNECTION')]")
	private WebElement disconnection_section;
	
	public void verifyDisconnectionOfWaterConnection()
	{
		wait.until(ExpectedConditions.visibilityOf(disconnection_section));
		Assert.assertTrue(disconnection_section.isDisplayed());
		HighlightOnElement(disconnection_section);
		
		wait.until(ExpectedConditions.elementToBeClickable(disconnection_section));
		Assert.assertTrue(disconnection_section.isEnabled());
		disconnection_section.click();
	}
	
	@FindBy(xpath = ".//span[@class='ui-icon ui-icon-triangle-1-e']/following-sibling::a[contains(text(),'WATER CONNECTION TRANSFER FORM')]")
	private WebElement transfer_section;
	
	public void verifyTransferOfConnection()
	{
		wait.until(ExpectedConditions.visibilityOf(transfer_section));
		Assert.assertTrue(transfer_section.isDisplayed());
		HighlightOnElement(transfer_section);
		
		wait.until(ExpectedConditions.elementToBeClickable(transfer_section));
		Assert.assertTrue(transfer_section.isEnabled());
		transfer_section.click();
	}
	
	@FindBy(xpath=".//button/span[contains(text(),'Proceed to Payment')]")
	private WebElement proceed_to_payment;
	
	public void verifyProceedToPaymentBtn()
	{
		wait.until(ExpectedConditions.visibilityOf(proceed_to_payment));
		Assert.assertTrue(proceed_to_payment.isDisplayed());
		HighlightOnElement(proceed_to_payment);
		
		wait.until(ExpectedConditions.elementToBeClickable(proceed_to_payment));
		Assert.assertTrue(proceed_to_payment.isEnabled());
		proceed_to_payment.click();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
	}
}