/**
 * 
 */
package NRDA_WaterAndSewerage_Disconnection;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.IAssert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

/**
 * @author Sarvesh.Nellore
 * @Date: 19-09-2017
 * @purpose: ToVerify Payment of NewConnection
 *
 */
public class ToVerifyPaymentDetailsofNewConnection extends CommonLibrary {

	ExcelDataDriver excel = new ExcelDataDriver();

	Logger log = Logger.getLogger("devpinoyLogger");

	WebDriverWait wait = new WebDriverWait(driver, 30);

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "All Fields NAME"
	 * 
	 * @author sarvesh.nellore
	 * @Date: 16-08-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath = "html/body/form/div[1]/table/tbody/tr/td[2]/span/span/span/div/div[2]/table[1]/tbody/tr/td[1]/label")
	// @FindBy(xpath="//table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label")
	private List<WebElement> AllFields_Name;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Application Number"
	 * 
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath = "(//table/tbody/tr/td[2]/label)[1]")
	private WebElement Application_Number;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Applicant Name"
	 * 
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath = "(//table/tbody/tr/td[2]/label)[2]")
	private WebElement Applicant_Name;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Date Of Application"
	 * 
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath = "(//table/tbody/tr[3]/td[2])[1]")
	private WebElement DateOfApplication;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Service Name"
	 * 
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath = "(//table/tbody/tr/td[2]/label)[3]")
	private WebElement Service_Name;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Total Fees"
	 * 
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath = "(//table/tbody/tr/td[2]/label)[4]")
	private WebElement Total_Fees;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Make Payment"
	 * 
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath = "//button[contains(.,'Make Payment') and@type='submit']")
	private WebElement MakePayment_Button;

	public void ToVerifyApplicantable_successfull_makepayment01() throws InterruptedException {

		waitForSomeTime();
		// Assert.assertEquals(true,((WebElement) AllFields_Name).isDisplayed());
		// Assert.assertNotNull(AllFields_Name,"To verify all Text field is displayed");
		for (int index = 0; index < AllFields_Name.size(); index++) {

			String allUploadbuttons = AllFields_Name.get(index).getText();
			// Assert.assertEquals(true,((WebElement) AllFields_Name).isDisplayed());
			Reporter.log("to verify the field is present:" + allUploadbuttons, true);
			log.info("To Verify all the fields are available");
		}

		waitForSomeTime();
		Assert.assertEquals(true, MakePayment_Button.isEnabled());
		HighlightOnElement(MakePayment_Button);
		Reporter.log("MakePayment Button  Application of Water and Sewerage New connection link is Present", true); // print
																													// for
																													// eclipse
																													// console
		waitForSomeTime();

	}

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Card Number"
	 * 
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath = "//input[@id='ccard_number' and @type='text']")
	private WebElement Card_Number;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Card On Name"
	 * 
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath = "//input[@id='cname_on_card' and@type='text']")
	private WebElement Card_Own_Name;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "CVV Number"
	 * 
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath = "//input[@id='ccvv_number' and @type='password']")
	private WebElement Cvv_Number;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "ExperidateMonth"
	 * 
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath = "//select[@id='cexpiry_date_month']")
	private WebElement Card_ExpiryMonth;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "ExperidateYear"
	 * 
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath = "//select[@id='cexpiry_date_year']")
	private WebElement Card_ExpiryYear;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "PayNow Button"
	 * 
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath = "//input[@id='pay_button' and @type='submit']")
	private WebElement PayNow_Button;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "BackTo_PreviousPage"
	 * 
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath = "//a[contains(.,'Click here to go back')]")
	private WebElement BackTo_PreviousPage;

	public void ToVerifyFunctionalityofMakePayment02() throws InterruptedException

	{

		waitForSomeTime();
		Assert.assertEquals(true, MakePayment_Button.isEnabled());
		HighlightOnElement(MakePayment_Button);
		MakePayment_Button.click();
		Reporter.log("MakePayment Button  Application of Water and Sewerage New connection link is Present", true); // print
																													// for
																													// eclipse
																													// console
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();

		waitForSomeTime();
		Assert.assertEquals(true, Card_Number.isEnabled());
		HighlightOnElement(Card_Number);
		Reporter.log("Card Number on  Application of Water and Sewerage New connection link is Present", true); // print
																												// for
																												// eclipse
																												// console
		waitForSomeTime();

		waitForSomeTime();
		Assert.assertEquals(true, Card_Own_Name.isEnabled());
		HighlightOnElement(Card_Own_Name);
		Reporter.log("Card on Name Application of Water and Sewerage New connection link is Present", true); // print
																												// for
																												// eclipse
																												// console
		waitForSomeTime();

		waitForSomeTime();
		Assert.assertEquals(true, Cvv_Number.isEnabled());
		HighlightOnElement(Cvv_Number);
		Reporter.log("CVV Number on  Application of Water and Sewerage New connection link is Present", true); // print
																												// for
																												// eclipse
																												// console
		waitForSomeTime();

		waitForSomeTime();
		Assert.assertEquals(true, Card_ExpiryMonth.isEnabled());
		HighlightOnElement(Card_ExpiryMonth);
		Reporter.log("Card_ExpiryMonth Dropdown on  Application of Water and Sewerage New connection link is Present",
				true); // print for eclipse console
		waitForSomeTime();
		waitForSomeTime();
		Assert.assertEquals(true, Card_ExpiryYear.isEnabled());
		HighlightOnElement(Card_ExpiryYear);
		Reporter.log("Card_ExpiryYear Dropdown on  Application of Water and Sewerage New connection link is Present",
				true); // print for eclipse console
		waitForSomeTime();

		waitForSomeTime();
		Assert.assertEquals(true, PayNow_Button.isEnabled());
		HighlightOnElement(PayNow_Button);
		Reporter.log("PayNow_Button Button on  Application of Water and Sewerage New connection link is Present", true); // print
																															// for
																															// eclipse
																															// console
		waitForSomeTime();

		waitForSomeTime();
		Assert.assertEquals(true, BackTo_PreviousPage.isEnabled());
		HighlightOnElement(BackTo_PreviousPage);
		BackTo_PreviousPage.click();
		waitForSomeTime();
		Reporter.log("BackTo_PreviousPage Link on  Application of Water and Sewerage New connection link is Present",
				true); // print for eclipse console
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();

	}

	public void ApplicationSubmitMakePaymentWith_ValidData03()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		try {
			waitForSomeTime();
			Assert.assertTrue(MakePayment_Button.isEnabled(), "Test case pass");
			HighlightOnElement(MakePayment_Button);
			MakePayment_Button.click();
			Reporter.log("MakePayment Button  Application of Water and Sewerage New connection link is Present", true); // print
																														// for
																														// eclipse
																														// console
			waitForSomeTime();

			Assert.assertEquals(true, Card_Number.isEnabled());
			HighlightOnElement(Card_Number);
			excel.getExcelData(Card_Number, "Card Details", 1, 1);
			Reporter.log("Card Number on  Application of Water and Sewerage New connection link is Present", true); // print
																													// for
																													// eclipse
																													// console

			Assert.assertEquals(true, Card_Own_Name.isEnabled());
			HighlightOnElement(Card_Own_Name);
			excel.getExcelData(Card_Own_Name, "Card Details", 1, 2);
			Reporter.log("Card on Name Application of Water and Sewerage New connection link is Present", true); // print
																													// for
																													// eclipse
																													// console

			Assert.assertEquals(true, Cvv_Number.isEnabled());
			HighlightOnElement(Cvv_Number);
			excel.getExcelData(Cvv_Number, "Card Details", 1, 3);
			Reporter.log("CVV Number on  Application of Water and Sewerage New connection link is Present", true); // print
																													// for
																													// eclipse
																													// console

			Assert.assertEquals(true, Card_ExpiryMonth.isEnabled());
			HighlightOnElement(Card_ExpiryMonth);
			SelectVisibleText(Card_ExpiryMonth, "May (5)");
			Reporter.log(
					"Card_ExpiryMonth Dropdown on  Application of Water and Sewerage New connection link is Present",
					true); // print for eclipse console

			Assert.assertEquals(true, Card_ExpiryYear.isEnabled());
			HighlightOnElement(Card_ExpiryYear);
			SelectByValue(Card_ExpiryYear, "2020");
			Reporter.log(
					"Card_ExpiryYear Dropdown on  Application of Water and Sewerage New connection link is Present",
					true); // print for eclipse console

			waitForSomeTime();
			Assert.assertEquals(true, PayNow_Button.isEnabled());
			HighlightOnElement(PayNow_Button);
			PayNow_Button.click();
			Reporter.log("PayNow_Button Button on  Application of Water and Sewerage New connection link is Present",
					true); // print for eclipse console
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();

		} catch (Exception ex) {
			ex.getMessage();
		}

	}

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "BackTo_PreviousPage"
	 * 
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath = "//label[contains(.,'Invalid credit card number.')]")
	private WebElement Invalid_CardNumber;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Service Name"
	 * 
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath = "(//table/tbody/tr/td[2]/label)[4]")
	private WebElement Transaction_Status;

	@FindBy(xpath = "//span[contains(.,'ONLINE RTI')]/../following-sibling::div[1]/table[1]/tbody/tr/td/select")
	private WebElement Paymentmode_dropdown;

	@FindBy(xpath = ".//*[@id='form0:val_1']/div[2]")
	private WebElement SelectPaymentGateway;

	public void ToVerifypaymenttypes() throws InterruptedException {
		waitForSomeTime();
		Assert.assertEquals(true, Paymentmode_dropdown.isEnabled());
		HighlightOnElement(Paymentmode_dropdown);
		SelectVisibleText(Paymentmode_dropdown, "--- Select ---");
		Reporter.log("MakePayment Button  Application of Water and Sewerage New connection link is Present", true); // print
																													// for
																													// eclipse
																													// console
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();

	}

	@FindBy(xpath = "//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/table/tbody[1]/tr[6]/td[2]/select")
	private WebElement Paymentmode_dropdown1;

	public void ToVerifypaymenttypes1() throws InterruptedException {
		waitForSomeTime();
		Assert.assertEquals(true, Paymentmode_dropdown1.isEnabled());
		HighlightOnElement(Paymentmode_dropdown1);
		SelectVisibleText(Paymentmode_dropdown1, "--- Select ---");
		Reporter.log("MakePayment Button  Application of RTI  is Present", true); // print for eclipse console
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();

	}

	public void ToVerifypaymentasOnline() throws InterruptedException {
		waitForSomeTime();
		waitForSomeTime();
		Assert.assertEquals(true, SelectPaymentGateway.isEnabled());
		HighlightOnElement(SelectPaymentGateway);
		// SelectVisibleText(Paymentmode_dropdown, "Pay Online");
		SelectPaymentGateway.click();
		Reporter.log("MakePayment Button  Application of RTI link is Present", true); // print for eclipse console
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();

	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Payment gateway".
	 * 
	 * @author deepak.saini
	 * 
	 * @since 2018-04-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath = "//span[@id='form0:dynaFormGroup']/div/div/table/tbody/tr/td[1]/label[contains(text(),'Select Payment Gateway')]/../following-sibling::td/span/table/tbody/tr[2]/td/img/../preceding-sibling::td/div")
	private WebElement gateway;

	public void selectPaymentGateway() throws InterruptedException 
	{
		wait.until(ExpectedConditions.visibilityOf(gateway));
		Assert.assertTrue(gateway.isDisplayed());
		HighlightOnElement(gateway);

		wait.until(ExpectedConditions.elementToBeClickable(gateway));
		Assert.assertTrue(gateway.isEnabled());
		gateway.click();
		waitForPageLoad();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Online mode".
	 * 
	 * @author deepak.saini
	 * 
	 * @since 2018-04-12
	 */
	/****************************************************************************************************/

	@FindBy(xpath = "//span[@id='form0:dynaFormGroup']/div/div/table/tbody/tr/td[1]/label[contains(text(),'Select Payment Mode')]/../following-sibling::td/table/tbody/tr/td[1]/div")
	private WebElement onlinemode;

	@FindBy(xpath = "//span[@id='form0:dynaFormGroup']/div/div/table/tbody/tr/td[1]/label[contains(text(),'Select Payment Mode')]/../following-sibling::td/table/tbody/tr/td[3]/div")
	private WebElement ChallanMode;

	@FindBy(xpath = ".//*[@id='paymentsubmit']/div[2]/div[2]/div/ul/li/a")
	private List<WebElement> PaymentModeOptions;

	public void VerifyPaymentOptions() throws InterruptedException 
	{
		HighlightOnElement(MakePayment_Button);
		MakePayment_Button.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		for (WebElement MenuInDashBoard : PaymentModeOptions) 
		{
			if (MenuInDashBoard.isDisplayed()) 
			{
				HighlightOnElement(MenuInDashBoard);
				String DashBoardMenu = MenuInDashBoard.getText();
				Reporter.log("Payment Options Available  Are:" + DashBoardMenu, true);
			}
		}
		//backToPage(driver);
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}

	@FindBy(xpath = "//div[@class='navbar1']/ul/li/a[@href='#creditcard']/../../../../following-sibling::div/div/div[1]/div/div/input[@id='ccCardNo']/following-sibling::select[@id='cexpiry_date_year']")
	private WebElement selectYear;

	@FindBy(xpath = "//div[@class='navbar1']/ul/li/a[@href='#creditcard']/../../../../following-sibling::div/div/div[1]/div/div/input[@id='ccCardNo']/following-sibling::select[@id='cexpiry_date_month']")
	private WebElement selectmonth;

	@FindBy(xpath = "//div[@class='navbar1']/ul/li/a[@href='#creditcard']/../../../../following-sibling::div/div/div[1]/div/div/input[@id='ccard_number']")
	private WebElement creditcardnum;

	@FindBy(xpath = "//div/input[@id='pay_button']")
	private WebElement paynow;

	@FindBy(xpath = "//div[@class='navbar1']/ul/li/a[@href='#creditcard']/../../../../following-sibling::div/div/div[1]/div/div/input[@name='cname_on_card']")
	private WebElement NameOncard;

	@FindBy(xpath = "//div[@class='navbar1']/ul/li/a[@href='#creditcard']/../../../../following-sibling::div/div/div[1]/div/div/input[@name='ccvv_number']")
	private WebElement CvvNumber;

	@FindBy(xpath = "//input[@name='submit' and@value='Simulate Transaction']")
	private WebElement SimulateTransaction_Button;

	public void entervaliddetailsoncreditcard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		HighlightOnElement(creditcardnum);
		Assert.assertTrue(creditcardnum.isEnabled());
		creditcardnum.sendKeys("4012888888881881");
		waitForSomeTime();
		HighlightOnElement(selectmonth);
		SelectVisibleText(selectmonth, "12");
		HighlightOnElement(selectYear);
		SelectVisibleText(selectYear, "2025");
		HighlightOnElement(CvvNumber);
		Assert.assertTrue(CvvNumber.isEnabled());
		CvvNumber.sendKeys("456");
		HighlightOnElement(NameOncard);
		Assert.assertTrue(NameOncard.isEnabled());
		NameOncard.sendKeys("Sarvesh");

	}

	public void enterInvaliddetailsoncreditcard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		wait.until(ExpectedConditions.visibilityOf(creditcardnum));
		Assert.assertTrue(creditcardnum.isDisplayed());
		HighlightOnElement(creditcardnum);

		wait.until(ExpectedConditions.elementToBeClickable(creditcardnum));
		Assert.assertTrue(creditcardnum.isEnabled());
		creditcardnum.sendKeys("4012888888676756");

		wait.until(ExpectedConditions.visibilityOf(selectmonth));
		Assert.assertTrue(selectmonth.isDisplayed());
		HighlightOnElement(selectmonth);

		wait.until(ExpectedConditions.elementToBeClickable(selectmonth));
		Assert.assertTrue(selectmonth.isEnabled());
		SelectVisibleText(selectmonth, "12");

		wait.until(ExpectedConditions.visibilityOf(selectYear));
		Assert.assertTrue(selectYear.isDisplayed());
		HighlightOnElement(selectYear);

		wait.until(ExpectedConditions.elementToBeClickable(selectYear));
		Assert.assertTrue(selectYear.isEnabled());
		SelectVisibleText(selectYear, "2025");

		wait.until(ExpectedConditions.visibilityOf(selectYear));
		Assert.assertTrue(selectYear.isDisplayed());
		HighlightOnElement(CvvNumber);

		wait.until(ExpectedConditions.visibilityOf(CvvNumber));
		Assert.assertTrue(CvvNumber.isEnabled());
		CvvNumber.sendKeys("456");

		wait.until(ExpectedConditions.visibilityOf(NameOncard));
		Assert.assertTrue(NameOncard.isDisplayed());
		HighlightOnElement(NameOncard);

		wait.until(ExpectedConditions.elementToBeClickable(NameOncard));
		Assert.assertTrue(NameOncard.isEnabled());
		NameOncard.sendKeys("Sarvesh");
	}

	@FindBy(xpath = "//div/font[contains(text(),'Please enter a Credit card number.')]")
	private WebElement message;

	public void verifyBlankMsg() throws InterruptedException {
		String actual = "Please enter a Credit card number.";

		Assert.assertTrue(message.isDisplayed());
		HighlightOnElement(message);
		Assert.assertTrue(message.isEnabled());
		String expectedmsg = message.getText();
		Reporter.log("Error Message :" + expectedmsg, true);
		Assert.assertEquals(actual, expectedmsg, "test case pass");
		HighlightOnElement(message);
		waitForSomeTime();
		//backToPage(driver);
	}

	public void clickOnPayNow() throws InterruptedException 
	{
		wait.until(ExpectedConditions.visibilityOf(paynow));
		Assert.assertTrue(paynow.isDisplayed());
		HighlightOnElement(paynow);

		wait.until(ExpectedConditions.elementToBeClickable(paynow));
		Assert.assertTrue(paynow.isEnabled());
		paynow.click();

		//backToPage(driver);
	}

	public void clickOnSimulateTransaction() throws InterruptedException 
	{
		/*Alert simpleAlert=driver.switchTo().alert();
		String alertText=simpleAlert.getText();
		simpleAlert.accept();*/
		wait.until(ExpectedConditions.visibilityOf(SimulateTransaction_Button));
		Assert.assertTrue(SimulateTransaction_Button.isDisplayed());
		HighlightOnElement(SimulateTransaction_Button);
		wait.until(ExpectedConditions.elementToBeClickable(SimulateTransaction_Button));
		Assert.assertTrue(SimulateTransaction_Button.isEnabled());
		SimulateTransaction_Button.click();
		acceptAlert();
		acceptAlert();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
	}

	public void selectPaymentMode() throws InterruptedException 
	{
		wait.until(ExpectedConditions.visibilityOf(onlinemode));
		Assert.assertTrue(onlinemode.isDisplayed());
		HighlightOnElement(onlinemode);

		wait.until(ExpectedConditions.elementToBeClickable(onlinemode));
		Assert.assertTrue(onlinemode.isEnabled());
		onlinemode.click();

		wait.until(ExpectedConditions.visibilityOf(MakePayment_Button));
		Assert.assertTrue(MakePayment_Button.isDisplayed());
		HighlightOnElement(MakePayment_Button);

		wait.until(ExpectedConditions.elementToBeClickable(MakePayment_Button));
		Assert.assertTrue(MakePayment_Button.isEnabled());
		MakePayment_Button.click();
	}
	
	public void selectPaymentModeForTransfer() throws InterruptedException 
	{
		wait.until(ExpectedConditions.visibilityOf(onlinemode));
		Assert.assertTrue(onlinemode.isDisplayed());
		HighlightOnElement(onlinemode);

		wait.until(ExpectedConditions.elementToBeClickable(onlinemode));
		Assert.assertTrue(onlinemode.isEnabled());
		onlinemode.click();		
	}
	
	public void verifyMakePaymentButton()
	{
		wait.until(ExpectedConditions.visibilityOf(MakePayment_Button));
		Assert.assertTrue(MakePayment_Button.isDisplayed());
		HighlightOnElement(MakePayment_Button);

		wait.until(ExpectedConditions.elementToBeClickable(MakePayment_Button));
		Assert.assertTrue(MakePayment_Button.isEnabled());
		MakePayment_Button.click();
		waitForPageLoad();
		waitForPageLoad();
	}

	@FindBy(xpath = "//button/span[contains(text(),'Generate Challan')]")
	private WebElement GenerateChallan;
	
	public void selectPaymentMode1() throws InterruptedException 
	{
		wait.until(ExpectedConditions.visibilityOf(ChallanMode));
		Assert.assertTrue(ChallanMode.isDisplayed());
		HighlightOnElement(ChallanMode);
		
		wait.until(ExpectedConditions.elementToBeClickable(ChallanMode));
		Assert.assertTrue(ChallanMode.isEnabled());
		ChallanMode.click();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(GenerateChallan));
		Assert.assertTrue(GenerateChallan.isDisplayed());
		HighlightOnElement(GenerateChallan);
		
		wait.until(ExpectedConditions.elementToBeClickable(GenerateChallan));
		Assert.assertTrue(GenerateChallan.isEnabled());
		GenerateChallan.click();
		waitForPageLoad();
	}

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "BackTo_PreviousPage"
	 * 
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath = "//label[contains(.,'Invalid CVV number.')]")
	private WebElement Invalid_CVVNumber;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "BackTo_PreviousPage"
	 * 
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Download Receipt')]")
	private WebElement download_receipt_btn;
	public void verifyDownloadReceiptButton()
	{
		wait.until(ExpectedConditions.visibilityOf(download_receipt_btn));
		Assert.assertTrue(download_receipt_btn.isDisplayed());
		HighlightOnElement(download_receipt_btn);
		
		wait.until(ExpectedConditions.elementToBeClickable(download_receipt_btn));
		Assert.assertTrue(download_receipt_btn.isEnabled());
		download_receipt_btn.click();
		waitForPageLoad();
		waitForPageLoad();
	}	

	
	//@FindBy(xpath = "//a[contains(text(),'Water Bill/पानी का बिल')]")
	@FindBy(xpath = "//a[contains(text(),'Water Bill')]")
	private WebElement water_bill_link;
	
	@FindBy(xpath = ".//button/span[contains(.,'Pay Bill')]")
	private WebElement pay_bill_button;
	
	public void verifyWaterBillPayment() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(water_bill_link));
		Assert.assertTrue(water_bill_link.isDisplayed());
		HighlightOnElement(water_bill_link);
		
		wait.until(ExpectedConditions.elementToBeClickable(water_bill_link));
		Assert.assertTrue(water_bill_link.isEnabled());
		water_bill_link.click();
		waitForPageLoad();
		waitForPageLoad();
		
		boolean check=true;
		String application_num = excel.getExcelData1("DisconnectionNumber", 0, 1);

		List<WebElement> allpages = driver.findElements(By.xpath("//td[@class='rightColWithLeftPad']/span/div/div/table/tbody/tr/td/div/div/span[@class='ui-paginator-pages']/span"));

		for(int i=1; i<=allpages.size();i++)
		{
			Reporter.log("Totak No Of Pages:"+allpages.size(),true);
			List<WebElement> allrows = driver.findElements(By.xpath("//td[@class='rightColWithLeftPad']/span/div/div/table/tbody/tr/td/div/div/table/tbody/tr"));
			for(int row = 1; row <= allrows.size(); row++)
			{
				Reporter.log("Total rows :" +allrows.size(),true); 
				String name = driver.findElement(By.xpath("//td[@class='rightColWithLeftPad']/span/div/div/table/tbody/tr/td/div/div/table/tbody/tr["+row+"]/td[2]/center/span")).getText();
				Reporter.log(name,true);
				if(name.equals(application_num))
				{
					Thread.sleep(5000);
					WebElement action = driver.findElement(By.xpath("//td[@class='rightColWithLeftPad']/span/div/div/table/tbody/tr/td/div/div/table/tbody/tr["+row+"]/td[2]/center/span/../../following-sibling::td/center/a/img"));
					HighlightOnElement(action);
					action.click();
					check=false;
					break;
				}
				else
				{
					Reporter.log("Element not exist",true);
				}
			}
			if(check)
			{
				driver.findElement(By.xpath("//td[@class='rightColWithLeftPad']/span/div/div/table/tbody/tr/td/div/div/span[@class='ui-paginator-pages']/span["+i+"]")).click();
				Thread.sleep(5000);
			}
		}
		
		wait.until(ExpectedConditions.visibilityOf(pay_bill_button));
		Assert.assertTrue(pay_bill_button.isDisplayed());
		HighlightOnElement(pay_bill_button);
		
		wait.until(ExpectedConditions.elementToBeClickable(pay_bill_button));
		Assert.assertTrue(pay_bill_button.isEnabled());
		pay_bill_button.click();
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(gateway));
		Assert.assertTrue(gateway.isDisplayed());
		HighlightOnElement(gateway);

		wait.until(ExpectedConditions.elementToBeClickable(gateway));
		Assert.assertTrue(gateway.isEnabled());
		gateway.click();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(onlinemode));
		Assert.assertTrue(onlinemode.isDisplayed());
		HighlightOnElement(onlinemode);

		wait.until(ExpectedConditions.elementToBeClickable(onlinemode));
		Assert.assertTrue(onlinemode.isEnabled());
		onlinemode.click();

		wait.until(ExpectedConditions.visibilityOf(MakePayment_Button));
		Assert.assertTrue(MakePayment_Button.isDisplayed());
		HighlightOnElement(MakePayment_Button);

		wait.until(ExpectedConditions.elementToBeClickable(MakePayment_Button));
		Assert.assertTrue(MakePayment_Button.isEnabled());
		MakePayment_Button.click();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		waitForDomElement();
	}
	
	
	
	/***************** To make payment via Induslnd Bank ****************/
	
	@FindBy(xpath = "//td[@class='rightColWithLeftPad']/span/span/span/div/div[2]/table[1]/tbody/tr[6]/td[2]/span/table/tbody/tr[3]/td[1]/div")
	private WebElement bank_gateway;

	public void selectPaymentGateway_bank() throws InterruptedException 
	{
		wait.until(ExpectedConditions.visibilityOf(bank_gateway));
		Assert.assertTrue(bank_gateway.isDisplayed());
		HighlightOnElement(bank_gateway);

		wait.until(ExpectedConditions.elementToBeClickable(bank_gateway));
		Assert.assertTrue(bank_gateway.isEnabled());
		bank_gateway.click();
		waitForPageLoad();
	}
	
	
	@FindBy(xpath = "//select[@id='ccYear']")
	private WebElement Year;

	@FindBy(xpath = "//select[@id='ccMonth']")
	private WebElement month;

	@FindBy(xpath = "//input[@id='ccCardNo']")
	private WebElement cardnum;

	@FindBy(xpath = "//input[@id='paymentProcess']")
	private WebElement pay_now;

	@FindBy(xpath = "//input[@id='ccCardName']")
	private WebElement cardname;

	@FindBy(xpath = "//input[@id='ccCcv']")
	private WebElement cvv_num;

	/*@FindBy(xpath = "//input[@name='submit' and@value='Simulate Transaction']")
	private WebElement SimulateTransaction_Button;*/
	




}