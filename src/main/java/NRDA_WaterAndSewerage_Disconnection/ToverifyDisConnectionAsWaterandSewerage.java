package NRDA_WaterAndSewerage_Disconnection;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

/**
 * @author Sarvesh.Nellore
 * @Date: 25-09-2017
 * @Purpose: ToVerify Disconnection In WaterAndSewerage
 */
public class ToverifyDisConnectionAsWaterandSewerage extends CommonLibrary 
{
	ExcelDataDriver excel = new ExcelDataDriver();
	WebDriverWait wait = new WebDriverWait(driver, 50);

	Logger log = Logger.getLogger("devpinoyLogger");

	public void toverifyDisconnectionIcon() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	{
		String Application_Number = excel.getExcelData1("Disconnection", 1, 0);
		System.out.println("Application Number Is:" + Application_Number);
		List<WebElement> allpages = driver.findElements(By.xpath("//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-shadow ui-overlay-visible']/div[2]/div/div/div/div[2]/span[4]/span"));
		System.out.println("Total pages :" + allpages.size());

		boolean check = true;
		for (int i = 1; i <= (allpages.size()); i++) 
		{
			List<WebElement> allrows = driver.findElements(By.xpath("//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-shadow ui-overlay-visible']/div[2]/div/div/div/div[1]/table/tbody/tr"));
			for (int row = 1; row <= allrows.size(); row++) 
			{
				System.out.println("Total rows :" + allrows.size());
				String name = driver.findElement(By.xpath("//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-shadow ui-overlay-visible']/div[2]/div/div/div/div[1]/table/tbody/tr["+ row + "]/td[2]/label")).getText();
				// System.out.println(name);
				System.out.println("Row loop");
				if (name.equals(Application_Number)) 
				{
					WebElement Action = driver.findElement(By.xpath("//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-shadow ui-overlay-visible']/div[2]/div/div/div/div[1]/table/tbody/tr["+ row + "]/td[6]/a[@title='Disconnection']/img"));
					HighlightOnElement(Action);
					waitForSomeTime();
					waitForSomeTime();
					Action.click();
					waitForSomeTime();
					waitForSomeTime();
					System.out.println("Element  exist");
					check = false;
					break;
				} else {
					System.out.println("Element doesn't exist");
				}
			}
			/*if (check) {
				allpages.get(i).click();
			}*/
		}
	}

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "DisConnection_Icon"
	 * 
	 * @author sarvesh.nellore
	 * @Date: 25-09-2016
	 */
	/****************************************************************************************************/
	@FindBy(xpath = "//img[@src='/NRDAuthority1/resources/images/disconnection.png']")
	private WebElement DisConnection_Icon;

	/*
	 * public void toverifyDisconnection_Icon01() throws InterruptedException {
	 * waitForSomeTime(); HighlightOnElement(DisConnection_Icon);
	 * Assert.assertEquals(true,DisConnection_Icon.isEnabled());
	 * Assert.assertNotNull(
	 * DisConnection_Icon,"Click on DisConnection_Icon in Application of Water and Sewerage sucessfully"
	 * ); DisConnection_Icon.click(); waitForSomeTime(); System.out.
	 * println(" To Verify DisConnection_Icon Link in Application of Water&Sewerage link is Present"
	 * ); //print for eclipse console
	 * 
	 * }
	 */
	/*****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "MultipleDetailsTab".
	 * 
	 * @author Sarvesh.Nellore
	 * @since 25-09-2016
	 */
	/*****************************************************************************************************/
	@FindBy(xpath = "//*[@id='form0:tabView']/ul/li/a")
	private List<WebElement> MultipleDetailsTab;

	public void toverifyAllDisConnectionDetailsTab() throws InterruptedException 
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(MultipleDetailsTab));
		
		for (WebElement menulist : MultipleDetailsTab) 
		{
			Assert.assertNotNull(menulist.isDisplayed(), "Test case pass");
			if (menulist.isDisplayed()) 
			{
				HighlightOnElement(menulist);
				String Menu = menulist.getText();
				Reporter.log(" Menu list under Application Is:" + Menu, true);
			}
		}
	}

	/*****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "WaterConnectionDetailsTab".
	 * 
	 * @author Sarvesh.Nellore
	 * @since 25-09-2016
	 */
	/*****************************************************************************************************/
	@FindBy(xpath = "//a[contains(.,'Water Disconnection Details')]")
	//@FindBy(xpath = "//a[contains(.,'Water Disconnection Details')]")
	private WebElement WaterDisConnectionDetailTab;

	/*****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "WaterConnectionDetailsTab".
	 * 
	 * @author Sarvesh.Nellore
	 * @since 25-09-2016
	 */
	/*****************************************************************************************************/
	@FindBy(xpath = "//input[@title='Reason' and @type='text']")
	private WebElement Reason_Field;

	/*****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "WaterConnectionDetailsTab".
	 * 
	 * @author Sarvesh.Nellore
	 * @since 25-09-2016
	 */
	/*****************************************************************************************************/
	@FindBy(xpath = "//div[@class='ui-tabs ui-widget ui-widget-content ui-corner-all ui-hidden-container ui-tabs-top']/div/div[4]/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/span/div/div[1]/label")
	private WebElement Upload_Document;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "SubmitButton"
	 * 
	 * @author sarvesh.nellore
	 * @Date: 18-08-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath = "//div[@class='ui-tabs ui-widget ui-widget-content ui-corner-all ui-hidden-container ui-tabs-top']/div/div[5]/span/center/table/tbody/tr/td/span/button[contains(.,'Submit')]")
	private WebElement Submit_Button;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Save As Draft"
	 * 
	 * @author sarvesh.nellore
	 * @Date: 18-08-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath = "(//button/span[contains(.,'Save As Draft')])[4]")
	private WebElement SaveAsDraftButton;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Reset"
	 * 
	 * @author sarvesh.nellore
	 * @Date: 18-08-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath = "//div[@class='ui-tabs ui-widget ui-widget-content ui-corner-all ui-hidden-container ui-tabs-top']/div/div[4]/span/center/table/tbody/tr/td/span/button[contains(.,'Back')]")
	private WebElement BackButton;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Close"
	 * 
	 * @author sarvesh.nellore
	 * @Date: 18-08-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath = "//div[@class='ui-tabs ui-widget ui-widget-content ui-corner-all ui-hidden-container ui-tabs-top']/div/div[4]/span/center/table/tbody/tr/td/span/button[contains(.,'Close')]")
	private WebElement CloseButton;

	/*****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "MultipleDetailsTab".
	 * 
	 * @author Sarvesh.Nellore
	 * @since 25-09-2016
	 */
	/*****************************************************************************************************/
	@FindBy(xpath = "//table[@style='width: 100%;border-collapse: collapse;border: 0;']/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[1]/table/tbody/tr/td/span/label")
	private List<WebElement> AllFields;

	public void verifyWaterDisConnectionDetailsTab() throws InterruptedException 
	{
		wait.until(ExpectedConditions.visibilityOf(WaterDisConnectionDetailTab));
		Assert.assertTrue(WaterDisConnectionDetailTab.isDisplayed());
		HighlightOnElement(WaterDisConnectionDetailTab);
		
		wait.until(ExpectedConditions.elementToBeClickable(WaterDisConnectionDetailTab));
		Assert.assertTrue(WaterDisConnectionDetailTab.isEnabled());
		WaterDisConnectionDetailTab.click();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(Reason_Field));
		Assert.assertTrue(Reason_Field.isDisplayed());
		HighlightOnElement(Reason_Field);

		Assert.assertNotNull(WaterDisConnectionDetailTab, "Click on WaterConnectionDetailTab in Application of Water and Sewerage sucessfully");																															
	}

	@FindBy(xpath = "//a[contains(.,'Connection Details/कनेक्शन विवरण')]")
	//@FindBy(xpath = "//a[contains(.,'Connection Details')]")
	private WebElement ConnectionDetailTab;

	@FindBy(xpath = "//input[@title='Number of Flats']")
	private WebElement NoofFlats;

	@FindBy(xpath = "//input[@title='Number of Students/Seat/Employees']")
	private WebElement NoofStudentsEmployees;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Error Message"
	 * 
	 * @author sarvesh.nellore
	 * @Date: 16-08-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath = "//span[contains(.,'Mandatory Field : Reason')]")
	private WebElement ErrorMsg_ReasonField;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Close Child Window"
	 * 
	 * @author sarvesh.nellore
	 * @Date: 16-08-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath = ".//*[@id='form0:growl_container']/div/div/div[1]")
	private WebElement ErrorMsg_Close;

	public void verifyReasonTextField() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	{
		wait.until(ExpectedConditions.visibilityOf(Reason_Field));
		Assert.assertTrue(Reason_Field.isDisplayed());
		HighlightOnElement(Reason_Field);
		
		wait.until(ExpectedConditions.elementToBeClickable(Reason_Field));
		Assert.assertTrue(Reason_Field.isEnabled());
		excel.getExcelData(Reason_Field, "WaterConnectionDetails", 1, 0);
		System.out.println("To Verify Reason_Field in Application of Water & Sewerage link is Present"); 
		//Reason_Field.clear();
	}

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Error Message"
	 * 
	 * @author sarvesh.nellore
	 * @Date: 16-08-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath = ".//*[@id='form0:growl_container']/div/div/div[2]/span")
	private WebElement ErrorMsg_UploadDocument;

	public void verifyInvalidFileUpload() throws InterruptedException, AWTException 
	{
		wait.until(ExpectedConditions.visibilityOf(Upload_Document));
		Assert.assertEquals(true, Upload_Document.isDisplayed());
		HighlightOnElement(Upload_Document);
		Assert.assertEquals(true, Upload_Document.isEnabled());
		Assert.assertNotNull(Upload_Document, "Click on Upload_Document in Application of Water and Sewerage sucessfully");
		Upload_Document.click();
		waitForSomeTime();
		waitForSomeTime();
		System.out.println(" To Verify Upload Document Application of Water&Sewerage link is Present"); 
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\System.logs.1");
		waitForPageLoad();
		waitForPageLoad();
		waitForDomElement();
	}

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Error Message"
	 * 
	 * @author sarvesh.nellore
	 * @Date: 16-08-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath = "//a[contains(.,'Drafted Application/प्रारूपित आवेदन')]")
	private WebElement Drafted_Application;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "HomePageMenu".
	 * 
	 * @author birbal.tahim
	 * 
	 * @since 2017-09-06
	 */
	/*****************************************************************************************************/
	@FindBy(xpath = "//div[@class='ui-accordion ui-widget ui-helper-reset ui-hidden-container']/h3/a[contains(.,'DISCONNECTION OF WATER CONNECTION')]")
	private WebElement DisConnectionoFWaterandSewerage;

	@FindBy(xpath = "//div[@class='ui-accordion-content ui-helper-reset ui-widget-content ui-helper-hidden']/div/div/div/table/tbody/tr/td[4]/span")
	private WebElement Application_NUMBER;

	public void verifySaveAsDraftFunctionality() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException 
	{
		wait.until(ExpectedConditions.visibilityOf(Reason_Field));
		Assert.assertTrue(Reason_Field.isDisplayed());
		HighlightOnElement(Reason_Field);
		
		wait.until(ExpectedConditions.elementToBeClickable(Reason_Field));
		excel.getExcelData(Reason_Field, "WaterConnectionDetails", 1, 0);
		
		wait.until(ExpectedConditions.elementToBeClickable(Upload_Document));
		Upload_Document.click();
		waitForSomeTime();
		System.out.println(" To Verify Upload Document Application of Water&Sewerage link is Present"); 
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur1.jpg");
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(SaveAsDraftButton));
		Assert.assertTrue(SaveAsDraftButton.isDisplayed());
		HighlightOnElement(SaveAsDraftButton);
		
		wait.until(ExpectedConditions.elementToBeClickable(SaveAsDraftButton));
		Assert.assertEquals(true, SaveAsDraftButton.isEnabled());
		//SaveAsDraftButton.click();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
	}

	/*****************************************************************************************************/
	@FindBy(xpath = "//div[@class='ui-accordion ui-widget ui-helper-reset ui-hidden-container Accordian-Header-Black']/h3/a")
	private List<WebElement> HomePage_Fields;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on alert Yes/NO button".
	 * 
	 * @author deepak.saini
	 * 
	 * @since 2017-08-16
	 */
	/****************************************************************************************************/
	@FindBy(xpath = "//div[@id='form0:confirmDlg']/div[2]/div/div/center/table/tbody/tr/td/button")
	private List<WebElement> button;
	
	@FindBy(xpath = "(.//button/span[contains(text(),'Close')])[4]")
	private WebElement closebutton;

	public void verifyCloseButton() throws InterruptedException 
	{
		close(closebutton);
	}

	@FindBy(xpath = "(//button/span[contains(text(),'Yes')])[2]")
	private WebElement yes;

	public void clickOnYes() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(yes));
		Assert.assertTrue(yes.isDisplayed());
		HighlightOnElement(yes);
		Assert.assertTrue(yes.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(yes));
		for (int index = 0; index <= 4; index++) {
			try {
				yes.click();
				break;
			} catch (ElementNotVisibleException e) {
				Reporter.log(e.getMessage());
			}
		}
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		waitForDomElement();
	}

	@FindBy(xpath = "(//button/span[contains(text(),'No')])[2]")
	private WebElement no;

	public void clickOnNo() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(no));
		Assert.assertTrue(no.isDisplayed());
		HighlightOnElement(no);
		Assert.assertTrue(no.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(no));
		for (int index = 0; index <= 4; index++) {
			try {
				no.click();
				break;
			} catch (ElementNotVisibleException e) {
				Reporter.log(e.getMessage());
			}
		}
		waitForPageLoad();
		waitForPageLoad();
		waitForDomElement();
		waitForDomElement();
		waitForPageLoad();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "HomePageMenu".
	 * 
	 * @author birbal.tahim
	 * 
	 * @since 2017-09-06
	 */
	/*****************************************************************************************************/
	@FindBy(xpath = "//table/tbody/tr/td[1]/label")
	private List<WebElement> All_Fields;

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

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Application Number"
	 * 
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath = ".//table/tbody/tr/td/label[contains(text(),'Application Number')]/../following-sibling::td/label")
	private WebElement Application_Number;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Pending Payments"
	 * 
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath = "//a[contains(.,'Pending For Payment/भुगतान हेतु अपूर्ण')]")
	private WebElement Pending_Payments;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Search Field"
	 * 
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath = "(//table/tbody/tr/td[2]/input)[1]")
	private WebElement Search_Field;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Search Button"
	 * 
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath = "//button[contains(.,'Search') and@type='submit']")
	private WebElement Search_Button;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Search Button"
	 * 
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath = "//div[@class='ui-accordion ui-widget ui-helper-reset ui-hidden-container']/h3/a")
	private WebElement Disconnection_Menu;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Application Number"
	 * 
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath = "//div[@class='ui-datatable ui-widget']/div/table/tbody/tr")
	private WebElement Applicationrow;

	@FindBy(xpath = "//div[@id='form0:tabView']/div/div/span/table/tbody/tr/td/div/div/table/tbody/tr/td/div/following-sibling::a/img/../preceding-sibling::div/div/label")
	private WebElement Upload_Button1;

	@FindBy(xpath = "//a[contains(.,'Upload Document/दस्तावेज़ अपलोड करें')]")
	private WebElement Upload_DocumentTab;
	
	@FindBy(xpath = "//a[contains(.,'Connection Details')]")
	private WebElement ConnectionDetailsTab;
	
	@FindBy(xpath = "//a[contains(.,'Building Details')]")
	private WebElement BuildingDetailsTab;

	@FindBy(xpath = "//select[@title='Is Applicant Owner or Tenant?']")
	private WebElement ISApplicantOwnerorTenant;

	@FindBy(xpath = "//input[@title='Name of Owner of Building']")
	private WebElement NameofOwnerofBuilding_Field;

	@FindBy(xpath = "//select[@title='Document Name']")
	private WebElement ServicerelatedDocument_Dropdown;
	
	@FindBy(xpath = ".//span/label[contains(.,'Site Plan')]/../../../../../../following-sibling::td/table/tbody/tr[1]/td/span/div/div[1]/label")
	private WebElement site_plan_upload;

	public void verifyDisconnectionRequestSubmission() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		/*waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		wait.until(ExpectedConditions.visibilityOf(ConnectionDetailTab));
		Assert.assertTrue(ConnectionDetailTab.isDisplayed());		
		HighlightOnElement(ConnectionDetailTab);
		wait.until(ExpectedConditions.elementToBeClickable(ConnectionDetailTab));
		Assert.assertTrue(ConnectionDetailTab.isEnabled());
		ConnectionDetailTab.click();
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(site_plan_upload));
		Assert.assertTrue(site_plan_upload.isDisplayed());		
		HighlightOnElement(site_plan_upload);
		
		wait.until(ExpectedConditions.elementToBeClickable(site_plan_upload));
		Assert.assertTrue(site_plan_upload.isEnabled());
		site_plan_upload.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur1.jpg");
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(BuildingDetailsTab));
		Assert.assertTrue(BuildingDetailsTab.isDisplayed());		
		HighlightOnElement(BuildingDetailsTab);
		
		wait.until(ExpectedConditions.elementToBeClickable(BuildingDetailsTab));
		Assert.assertTrue(BuildingDetailsTab.isEnabled());
		BuildingDetailsTab.click();
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(ISApplicantOwnerorTenant));
		Assert.assertTrue(ISApplicantOwnerorTenant.isDisplayed());
		HighlightOnElement(ISApplicantOwnerorTenant);
		SelectVisibleText(ISApplicantOwnerorTenant, "Tenant / किराएदार");
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(NameofOwnerofBuilding_Field));
		Assert.assertTrue(NameofOwnerofBuilding_Field.isDisplayed());
		HighlightOnElement(NameofOwnerofBuilding_Field);
		Assert.assertTrue(NameofOwnerofBuilding_Field.isEnabled());
		NameofOwnerofBuilding_Field.sendKeys("Sarvesh");*/
		
		
		wait.until(ExpectedConditions.visibilityOf(Upload_DocumentTab));
		Assert.assertTrue(Upload_DocumentTab.isDisplayed());
		HighlightOnElement(Upload_DocumentTab);
		wait.until(ExpectedConditions.elementToBeClickable(Upload_DocumentTab));
		Assert.assertTrue(Upload_DocumentTab.isEnabled());
		Upload_DocumentTab.click();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		Reporter.log("Verify Application of NRDA Disconnection Upload_DocumentTab  is Present", true);
		
		wait.until(ExpectedConditions.visibilityOf(ServicerelatedDocument_Dropdown));
		Assert.assertTrue(ServicerelatedDocument_Dropdown.isDisplayed());
		HighlightOnElement(ServicerelatedDocument_Dropdown);
		
		wait.until(ExpectedConditions.elementToBeClickable(ServicerelatedDocument_Dropdown));
		Assert.assertTrue(ServicerelatedDocument_Dropdown.isEnabled());
		ServicerelatedDocument_Dropdown.click();
		SelectVisibleText(ServicerelatedDocument_Dropdown, "Other Document / अन्य दस्तावेज");
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(Upload_Button1));
		Assert.assertTrue(Upload_Button1.isDisplayed());
		HighlightOnElement(Upload_Button1);
		
		//wait.until(ExpectedConditions.elementToBeClickable(Upload_Button1));
		//Assert.assertTrue(Upload_Button1.isEnabled());
		//Upload_Button1.click();
		//waitForSomeTime();
		//UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur1.jpg");
		//waitForPageLoad();
		//waitForPageLoad();
		//waitForDomElement();
		
		wait.until(ExpectedConditions.visibilityOf(Submit_Button));
		Assert.assertTrue(Submit_Button.isDisplayed());
		HighlightOnElement(Submit_Button);

		wait.until(ExpectedConditions.elementToBeClickable(Submit_Button));
		Assert.assertTrue(Submit_Button.isEnabled());
		Submit_Button.click();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		waitForDomElement();
	}

	public void saveApplicationNumberIntoExcelSheet() throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		HighlightOnElement(Application_Number);
		String ApllicationNumber1 = Application_Number.getText();
		excel.updateexcelData(ApllicationNumber1);
		System.out.println("Application Number is:  " + ApllicationNumber1);
	}

	@FindBy(xpath = "//span[contains(.,'DISCONNECTION OF WATER CONNECTION')]/../following-sibling::div[1]/table[1]/tbody/tr/td/select")
	private WebElement SelectPaymentMode;

	@FindBy(xpath = "//span[@id='form0:dynaFormGroup']/div/div/table/tbody/tr/td[1]/label[contains(text(),'Select Payment Gateway')]/../following-sibling::td/span/table/tbody/tr[2]/td/img/../preceding-sibling::td/div")
	private WebElement gateway;

	public void selectPaymentGateway() throws InterruptedException {

		HighlightOnElement(gateway);
		Assert.assertTrue(gateway.isEnabled());
		gateway.click();
		waitForSomeTime();
		waitForSomeTime();
	}

	@FindBy(xpath = "//span[@id='form0:dynaFormGroup']/div/div/table/tbody/tr/td[1]/label[contains(text(),'Select Payment Mode')]/../following-sibling::td/table/tbody/tr/td[1]/div")
	private WebElement onlinemode;

	public void selectPaymentMode() throws InterruptedException {

		HighlightOnElement(onlinemode);
		Assert.assertTrue(onlinemode.isEnabled());
		onlinemode.click();
		waitForSomeTime();
		HighlightOnElement(MakePayment_Button);
	}

	public void writeApplicationNoOnExcel() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	{
		wait.until(ExpectedConditions.visibilityOf(Application_Number));
		Assert.assertTrue(Application_Number.isDisplayed());
		HighlightOnElement(Application_Number);
		String app_no = Application_Number.getText();
		System.out.println("Application Number is:  " + app_no);
		Reporter.log("Application Number:" + Application_Number, true);
		excel.updateexcelDataDisconnectionNumber(app_no);
		waitForDomElement();
	}

	public void verifyFormSubmissionWithoutMandatoryInfo() throws InterruptedException, AWTException 
	{
		wait.until(ExpectedConditions.visibilityOf(BuildingDetailsTab));
		Assert.assertTrue(BuildingDetailsTab.isDisplayed());		
		HighlightOnElement(BuildingDetailsTab);
		
		wait.until(ExpectedConditions.elementToBeClickable(BuildingDetailsTab));
		Assert.assertTrue(BuildingDetailsTab.isEnabled());
		BuildingDetailsTab.click();
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(ISApplicantOwnerorTenant));
		Assert.assertTrue(ISApplicantOwnerorTenant.isDisplayed());
		HighlightOnElement(ISApplicantOwnerorTenant);
		SelectVisibleText(ISApplicantOwnerorTenant, "Tenant / किराएदार");
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(NameofOwnerofBuilding_Field));
		Assert.assertTrue(NameofOwnerofBuilding_Field.isDisplayed());
		HighlightOnElement(NameofOwnerofBuilding_Field);
		
		Assert.assertTrue(NameofOwnerofBuilding_Field.isEnabled());
		NameofOwnerofBuilding_Field.sendKeys("");
		
		wait.until(ExpectedConditions.visibilityOf(Upload_DocumentTab));
		Assert.assertTrue(Upload_DocumentTab.isDisplayed());
		HighlightOnElement(Upload_DocumentTab);
		
		wait.until(ExpectedConditions.elementToBeClickable(Upload_DocumentTab));
		Assert.assertTrue(Upload_DocumentTab.isEnabled());
		Upload_DocumentTab.click();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();

		wait.until(ExpectedConditions.visibilityOf(Submit_Button));
		Assert.assertTrue(Submit_Button.isDisplayed());
		HighlightOnElement(Submit_Button);
		
		wait.until(ExpectedConditions.elementToBeClickable(Submit_Button));
		Assert.assertTrue(Submit_Button.isEnabled());
		Submit_Button.click();
		waitForDomElement();
		System.out.println(" To Verify Submit Button Application of Water&Sewerage link is Present");
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
	private WebElement Cardon_Name;

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

	public void applicationSubmitMakePaymentWith_InValidDetails15()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		try {

			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(SelectPaymentMode);
			SelectVisibleText(SelectPaymentMode, "Pay Online");
			waitForSomeTime();

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
			excel.getExcelData(Card_Number, "Card Details", 1, 1);
			Reporter.log("Card Number on  Application of Water and Sewerage New connection link is Present", true); // print
																													// for
																													// eclipse
																													// console
			waitForSomeTime();

			waitForSomeTime();
			Assert.assertEquals(true, Cardon_Name.isEnabled());
			HighlightOnElement(Cardon_Name);
			excel.getExcelData(Cardon_Name, "Card Details", 2, 2);
			Reporter.log("Card on Name Application of Water and Sewerage New connection link is Present", true); // print
																													// for
																													// eclipse
																													// console
			waitForSomeTime();

			waitForSomeTime();
			Assert.assertEquals(true, Cvv_Number.isEnabled());
			HighlightOnElement(Cvv_Number);
			excel.getExcelData(Cvv_Number, "Card Details", 2, 3);
			Reporter.log("CVV Number on  Application of Water and Sewerage New connection link is Present", true); // print
																													// for
																													// eclipse
																													// console
			waitForSomeTime();

			waitForSomeTime();
			Assert.assertEquals(true, Card_ExpiryMonth.isEnabled());
			HighlightOnElement(Card_ExpiryMonth);
			SelectVisibleText(Card_ExpiryMonth, "Jul (7)");
			Reporter.log(
					"Card_ExpiryMonth Dropdown on  Application of Water and Sewerage New connection link is Present",
					true); // print for eclipse console
			waitForSomeTime();
			waitForSomeTime();
			Assert.assertEquals(true, Card_ExpiryYear.isEnabled());
			HighlightOnElement(Card_ExpiryYear);
			SelectByValue(Card_ExpiryYear, "2019");
			Reporter.log(
					"Card_ExpiryYear Dropdown on  Application of Water and Sewerage New connection link is Present",
					true); // print for eclipse console
			waitForSomeTime();

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

			HighlightOnElement(Transaction_Status);
			String Expected_Message1 = "Failed";
			String Actual_Message1 = Transaction_Status.getText();
			Assert.assertEquals(Expected_Message1, Actual_Message1);
			waitForSomeTime();
			waitForSomeTime();

		} catch (Exception ex) {
			ex.getMessage();
		}

	}

	public void applicationSubmitMakePaymentWith_ValidData12()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		try {

			HighlightOnElement(Application_Number);
			String ApllicationNumber = Application_Number.getText().trim();
			System.out.println("Apploication Number is:  " + ApllicationNumber);
			excel.updateexcelDataDisconnectionNumber(ApllicationNumber);

			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(SelectPaymentMode);
			SelectVisibleText(SelectPaymentMode, "Pay Online");
			waitForSomeTime();
			waitForSomeTime();

			waitForSomeTime();
			Assert.assertEquals(true, MakePayment_Button.isEnabled());
			HighlightOnElement(MakePayment_Button);
			MakePayment_Button.click();
			System.out.println("MakePayment Button  Application of Water and Sewerage New connection link is Present"); // print
																														// for
																														// eclipse
																														// console
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();

			waitForSomeTime();
			Assert.assertEquals(true, Card_Number.isEnabled());
			HighlightOnElement(Card_Number);
			excel.getExcelData(Card_Number, "Card Details", 1, 1);
			System.out.println("Card Number on  Application of Water and Sewerage New connection link is Present"); // print
																													// for
																													// eclipse
																													// console
			waitForSomeTime();

			waitForSomeTime();
			Assert.assertEquals(true, Cardon_Name.isEnabled());
			HighlightOnElement(Cardon_Name);
			excel.getExcelData(Cardon_Name, "Card Details", 1, 2);
			System.out.println("Card on Name Application of Water and Sewerage New connection link is Present"); // print
																													// for
																													// eclipse
																													// console
			waitForSomeTime();

			waitForSomeTime();
			Assert.assertEquals(true, Cvv_Number.isEnabled());
			HighlightOnElement(Cvv_Number);
			excel.getExcelData(Cvv_Number, "Card Details", 1, 3);
			System.out.println("CVV Number on  Application of Water and Sewerage New connection link is Present"); // print
																													// for
																													// eclipse
																													// console
			waitForSomeTime();

			waitForSomeTime();
			Assert.assertEquals(true, Card_ExpiryMonth.isEnabled());
			HighlightOnElement(Card_ExpiryMonth);
			SelectVisibleText(Card_ExpiryMonth, "May (5)");
			System.out.println(
					"Card_ExpiryMonth Dropdown on  Application of Water and Sewerage New connection link is Present"); // print
																														// for
																														// eclipse
																														// console
			waitForSomeTime();
			waitForSomeTime();
			Assert.assertEquals(true, Card_ExpiryYear.isEnabled());
			HighlightOnElement(Card_ExpiryYear);
			SelectByValue(Card_ExpiryYear, "2020");
			System.out.println(
					"Card_ExpiryYear Dropdown on  Application of Water and Sewerage New connection link is Present"); // print
																														// for
																														// eclipse
																														// console
			waitForSomeTime();

			waitForSomeTime();
			Assert.assertEquals(true, PayNow_Button.isEnabled());
			HighlightOnElement(PayNow_Button);
			PayNow_Button.click();
			System.out.println(
					"PayNow_Button Button on  Application of Water and Sewerage New connection link is Present"); // print
																													// for
																													// eclipse
																													// console
			waitForSomeTime();
			fluentWait(DownloadReceipt);
			waitForSomeTime();

		} catch (Exception ex) {
			ex.getMessage();
		}

	}

	public void applicationSubmitMakePaymentWith_BlankFields14()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		try {
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(SelectPaymentMode);
			SelectVisibleText(SelectPaymentMode, "Pay Online");
			waitForSomeTime();
			waitForSomeTime();

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
			// excel.getExcelData(Card_Number, "Card Details", 2, 1);
			Reporter.log("Card Number on  Application of Water and Sewerage New connection link is Present", true); // print
																													// for
																													// eclipse
																													// console
			waitForSomeTime();

			waitForSomeTime();
			Assert.assertEquals(true, Cardon_Name.isEnabled());
			HighlightOnElement(Cardon_Name);
			// excel.getExcelData(Cardon_Name, "Card Details", 2, 2);
			Reporter.log("Card on Name Application of Water and Sewerage New connection link is Present", true); // print
																													// for
																													// eclipse
																													// console
			waitForSomeTime();

			waitForSomeTime();
			Assert.assertEquals(true, Cvv_Number.isEnabled());
			HighlightOnElement(Cvv_Number);
			// excel.getExcelData(Cvv_Number, "Card Details", 2, 3);
			Reporter.log("CVV Number on  Application of Water and Sewerage New connection link is Present", true); // print
																													// for
																													// eclipse
																													// console
			waitForSomeTime();

			waitForSomeTime();
			Assert.assertEquals(true, Card_ExpiryMonth.isEnabled());
			HighlightOnElement(Card_ExpiryMonth);
			// SelectVisibleText(Card_ExpiryMonth, "May (5)");
			Reporter.log(
					"Card_ExpiryMonth Dropdown on  Application of Water and Sewerage New connection link is Present",
					true); // print for eclipse console
			waitForSomeTime();
			waitForSomeTime();
			Assert.assertEquals(true, Card_ExpiryYear.isEnabled());
			HighlightOnElement(Card_ExpiryYear);
			// SelectByValue(Card_ExpiryYear, "2020");
			Reporter.log(
					"Card_ExpiryYear Dropdown on  Application of Water and Sewerage New connection link is Present",
					true); // print for eclipse console
			waitForSomeTime();

			waitForSomeTime();
			Assert.assertEquals(true, PayNow_Button.isEnabled());
			HighlightOnElement(PayNow_Button);
			PayNow_Button.click();
			Reporter.log("PayNow_Button Button on  Application of Water and Sewerage New connection link is Present",
					true); // print for eclipse console
			waitForSomeTime();

			HighlightOnElement(Invalid_CardNumber);
			Assert.assertEquals(true, Invalid_CardNumber.isEnabled());
			String Expected_Message = "Invalid credit card number.";
			String Actual_Message = Invalid_CardNumber.getText();
			Assert.assertEquals(Expected_Message, Actual_Message);
			waitForSomeTime();

			HighlightOnElement(Invalid_CVVNumber);
			Assert.assertEquals(true, Invalid_CVVNumber.isEnabled());
			String Expected_Message2 = "Invalid CVV number.";
			String Actual_Message2 = Invalid_CVVNumber.getText();
			Assert.assertEquals(Expected_Message2, Actual_Message2);
			waitForSomeTime();

			HighlightOnElement(PleaseSelectDate);
			Assert.assertEquals(true, PleaseSelectDate.isEnabled());
			String Expected_Message4 = "Please select date";
			String Actual_Message4 = PleaseSelectDate.getText();
			Assert.assertEquals(Expected_Message4, Actual_Message4);
			waitForSomeTime();

			waitForSomeTime();
			Assert.assertEquals(true, BackTo_PreviousPage.isEnabled());
			HighlightOnElement(BackTo_PreviousPage);
			BackTo_PreviousPage.click();
			waitForSomeTime();
			Reporter.log(
					"BackTo_PreviousPage Link on  Application of Water and Sewerage New connection link is Present",
					true); // print for eclipse console
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();

			HighlightOnElement(Transaction_Status);
			String Expected_Message1 = "Failed";
			String Actual_Message1 = Transaction_Status.getText();
			Assert.assertEquals(Expected_Message1, Actual_Message1);
			waitForSomeTime();
			waitForSomeTime();

		} catch (Exception ex) {
			ex.getMessage();
		}

	}

	@FindBy(xpath = "//label[contains(.,'Invalid credit card number.')]")
	private WebElement Invalid_CardNumber;

	@FindBy(xpath = "//label[contains(.,'Invalid CVV number.')]")
	private WebElement Invalid_CVVNumber;

	@FindBy(xpath = "//label[contains(.,'Please select date')]")
	private WebElement PleaseSelectDate;

	@FindBy(xpath = "(//table/tbody/tr/td[2]/label)[4]")
	private WebElement Transaction_Status;

	@FindBy(xpath = "//span[contains(.,'DISCONNECTION OF WATER CONNECTION')]/../following-sibling::div[1]/table[1]/tbody/tr[7]/td/select")
	private WebElement SelectChallan;

	@FindBy(xpath = "//button[contains(.,'Generate Challan')]")
	private WebElement Generate_Challan;

	public void verifyGenerateChallanButtonSelectedPaymentasOffline17() throws InterruptedException {

		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(SelectPaymentMode);
		SelectVisibleText(SelectPaymentMode, "Pay Offline");
		waitForSomeTime();
		HighlightOnElement(SelectChallan);
		SelectVisibleText(SelectChallan, "Via Challan@Bank");
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(Generate_Challan);
		Generate_Challan.click();
		waitForSomeTime();

	}

	public void applicationSubmitMakePaymentWith_InValidCardNumber13()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		try {
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(SelectPaymentMode);
			SelectVisibleText(SelectPaymentMode, "Pay Online");
			waitForSomeTime();

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
			excel.getExcelData(Card_Number, "Card Details", 2, 1);
			Reporter.log("Card Number on  Application of Water and Sewerage New connection link is Present", true); // print
																													// for
																													// eclipse
																													// console
			waitForSomeTime();

			waitForSomeTime();
			Assert.assertEquals(true, Cardon_Name.isEnabled());
			HighlightOnElement(Cardon_Name);
			excel.getExcelData(Cardon_Name, "Card Details", 2, 2);
			Reporter.log("Card on Name Application of Water and Sewerage New connection link is Present", true); // print
																													// for
																													// eclipse
																													// console
			waitForSomeTime();

			waitForSomeTime();
			Assert.assertEquals(true, Cvv_Number.isEnabled());
			HighlightOnElement(Cvv_Number);
			excel.getExcelData(Cvv_Number, "Card Details", 2, 3);
			Reporter.log("CVV Number on  Application of Water and Sewerage New connection link is Present", true); // print
																													// for
																													// eclipse
																													// console
			waitForSomeTime();

			waitForSomeTime();
			Assert.assertEquals(true, Card_ExpiryMonth.isEnabled());
			HighlightOnElement(Card_ExpiryMonth);
			SelectVisibleText(Card_ExpiryMonth, "May (5)");
			Reporter.log(
					"Card_ExpiryMonth Dropdown on  Application of Water and Sewerage New connection link is Present",
					true); // print for eclipse console
			waitForSomeTime();
			waitForSomeTime();
			Assert.assertEquals(true, Card_ExpiryYear.isEnabled());
			HighlightOnElement(Card_ExpiryYear);
			SelectByValue(Card_ExpiryYear, "2020");
			Reporter.log(
					"Card_ExpiryYear Dropdown on  Application of Water and Sewerage New connection link is Present",
					true); // print for eclipse console
			waitForSomeTime();

			waitForSomeTime();
			Assert.assertEquals(true, PayNow_Button.isEnabled());
			HighlightOnElement(PayNow_Button);
			PayNow_Button.click();
			Reporter.log("PayNow_Button Button on  Application of Water and Sewerage New connection link is Present",
					true); // print for eclipse console
			waitForSomeTime();

			HighlightOnElement(Invalid_CardNumber);
			Assert.assertEquals(true, Invalid_CardNumber.isEnabled());
			String Expected_Message = "Invalid credit card number.";
			String Actual_Message = Invalid_CardNumber.getText();
			Assert.assertEquals(Expected_Message, Actual_Message);
			waitForSomeTime();

			waitForSomeTime();
			Assert.assertEquals(true, BackTo_PreviousPage.isEnabled());
			HighlightOnElement(BackTo_PreviousPage);
			BackTo_PreviousPage.click();
			waitForSomeTime();
			Reporter.log(
					"BackTo_PreviousPage Link on  Application of Water and Sewerage New connection link is Present",
					true); // print for eclipse console
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();

			HighlightOnElement(Transaction_Status);
			String Expected_Message1 = "Failed";
			String Actual_Message1 = Transaction_Status.getText();
			Assert.assertEquals(Expected_Message1, Actual_Message1);
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
	@FindBy(xpath = "//a[contains(.,'Submitted Application/प्रस्तुत आवेदन')]")
	private WebElement Submitted_Application;

	public void verifyapplicationStatusShowingPendingJEinSubmittedApplication12() throws InterruptedException {

		HighlightOnElement(Application_Number);
		String ApllicationNumber = Application_Number.getText().trim();
		System.out.println("Apploication Number is:  " + ApllicationNumber);
		HighlightOnElement(Submitted_Application);
		Assert.assertEquals(true, Submitted_Application.isEnabled());
		Assert.assertNotNull(Submitted_Application, "Click on Submitted Application of Water and Sewerage sucessfully");
		Submitted_Application.click();
		System.out.println(" To Verify PSubmitted_Application of Water&Sewerage link is Present"); // print for eclipse
																									// console
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(Search_Field);
		Search_Field.sendKeys(ApllicationNumber);
		HighlightOnElement(Search_Button);
		Assert.assertEquals(true, Search_Button.isEnabled());
		Assert.assertNotNull(Search_Button, "Click on Search Button Application of Water and Sewerage sucessfully");
		Search_Button.click();
		waitForSomeTime();
		System.out.println(" To Verify Search button of Water&Sewerage link is Present"); // print for eclipse console
		waitForSomeTime();
		HighlightOnElement(Disconnection_Menu);
		Disconnection_Menu.click();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(Applicationrow);
		Assert.assertTrue(Applicationrow.isEnabled());
		System.out.println(" To Verify Application row of Water&Sewerage link is Present"); // print for eclipse console
		waitForSomeTime();
		waitForSomeTime();

	}

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "BackTo_PreviousPage"
	 * 
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath = "//button[@id='form0:j_id744245441_787dc718']")
	private WebElement DownloadReceipt;
	
	@FindBy(xpath = "//button[@id='form0:j_id1038530634_3f95ae3a']")
	private WebElement DownloadReceipt1;
	public void verifyDownloadReciept13() throws InterruptedException, AWTException

	{
		//System.out.println("Joydip bhattaCHARJEE");
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(DownloadReceipt);
		Assert.assertTrue(DownloadReceipt.isEnabled());
		waitForSomeTime();
		waitForSomeTime();
		DownloadReceipt.click();
		System.out.println(" To Verify Download Reciept button of Water&Sewerage link is Present"); // print for eclipse																									// console
		Robot robot = new Robot();
		//robot.keyPress(KeyEvent.VK_ENTER);
		//robot.keyRelease(KeyEvent.VK_ENTER);
		waitForSomeTime();
		waitForSomeTime();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		//robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void verifyDownloadReciept14() throws InterruptedException, AWTException

	{
		//System.out.println("Joydip bhattaCHARJEE");
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(DownloadReceipt1);
		Assert.assertTrue(DownloadReceipt1.isEnabled());
		waitForSomeTime();
		waitForSomeTime();
		DownloadReceipt1.click();
		System.out.println(" To Verify Download Reciept button of Water&Sewerage link is Present"); // print for eclipse																									// console
		Robot robot = new Robot();
		//robot.keyPress(KeyEvent.VK_ENTER);
		//robot.keyRelease(KeyEvent.VK_ENTER);
		waitForSomeTime();
		waitForSomeTime();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		//robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
