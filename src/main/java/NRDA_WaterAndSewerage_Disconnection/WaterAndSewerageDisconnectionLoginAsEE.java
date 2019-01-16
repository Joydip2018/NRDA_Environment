package NRDA_WaterAndSewerage_Disconnection;

import java.awt.AWTException;
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


/**
 * @author Sarvesh.Nellore
 * @Date: 05-10-2017
 *  @Purpose: WATER AND SEWERAGE DISCONNECTION LOGIN BY EXECUTIVE ENGINEER
 */
public class WaterAndSewerageDisconnectionLoginAsEE  extends CommonLibrary
{

	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	
	WebDriverWait wait = new WebDriverWait(driver, 30);
	
	static int pendcountList=0;
	static int rejectcountList=0;
	static int ApprovecountList=0;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Home page menu".
	 * @author deepak saini
	 * @since 2017-09-21
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'Home')]")
	private WebElement Home_Icon;

	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'Pending Application')]")
	private WebElement PendingApplication_Icon;

	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'Approve/Reject Application')]")
	private WebElement ApproveorRejectApplication_Icon;

	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'Payment Collection')]")
	private WebElement PaymentCollection_Icon;


	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'Invoice Collection')]")
	private WebElement InvoiceCollection_Icon;


	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'Application Form')]")
	private WebElement ApplicationForm_Icon;

	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'MIS Reports')]")
	private WebElement MisReport_Icon;

	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'Generate Bill')]")
	private WebElement GenerateBill_Icon;

	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'Manage Water Reading')]")
	private WebElement ManageWaterReading_Icon;

	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'Meeting Management')]")
	private WebElement MeetingManagement_Icon;

	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'File Management')]")
	private WebElement FileManagement_Icon;

	@FindBy(xpath="//div[@class='ui-accordion ui-widget ui-helper-reset ui-hidden-container Accordian-Header-Black']/h3")
	private  List<WebElement> homepagedisplay;


	@FindBy(xpath = ".//tr[@class='ui-widget-content']/td/div/div/div[2]")
	private WebElement phe_dashboard;
	public void verifyEEDashboard() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(phe_dashboard));
		Assert.assertTrue(phe_dashboard.isDisplayed());
		HighlightOnElement(phe_dashboard);
		Assert.assertEquals(true,phe_dashboard.isEnabled());
		Reporter.log(" To Verify WaterIcon_Menu Link in Application of Water&Sewerage link is Present",true);
	}
	
	@FindBy(xpath="//a[contains(.,'Public Health and Engineering ')]")
	private WebElement PublicHealthEngineeringMenu;
	
	@FindBy(xpath="//a[contains(.,'Public Health and Engineering ')]/../following-sibling::div/ul/li")
	private List <WebElement> MenuInPublicHealthEngineering;
	
	public void toverifythePublicHealthEngineeringMenu() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(PublicHealthEngineeringMenu));
		Assert.assertTrue(PublicHealthEngineeringMenu.isDisplayed());
		HighlightOnElement(PublicHealthEngineeringMenu);
		
		wait.until(ExpectedConditions.elementToBeClickable(PublicHealthEngineeringMenu));
		Assert.assertTrue(PublicHealthEngineeringMenu.isEnabled());
		PublicHealthEngineeringMenu.click();
				
		for(WebElement menulist:MenuInPublicHealthEngineering)
		{
			HighlightOnElement(menulist);
			Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
			if(menulist.isDisplayed())
			{
				String menu = menulist.getText();
				System.out.println(" Menu list in PublicHealthEngineering are: " + menu );
			}
		}		
	}
	
	@FindBy(xpath="//a[contains(.,'Public Health and Engineering ')]/../following-sibling::div/ul/li[contains(.,'DISCONNECTION OF WATER CONNECTION')]")
	private WebElement disconnectionofwaterConnection;
	
	public void toVerifyPendingApplicationMenulist() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(disconnectionofwaterConnection));
		Assert.assertTrue(disconnectionofwaterConnection.isDisplayed());
		HighlightOnElement(disconnectionofwaterConnection);
		
		wait.until(ExpectedConditions.elementToBeClickable(disconnectionofwaterConnection));
		Assert.assertTrue(disconnectionofwaterConnection.isEnabled());
		disconnectionofwaterConnection.click();
		waitForPageLoad();
		waitForPageLoad();
		
		/*for(WebElement menulist:disconnectionmenu)
		{
			HighlightOnElement(menulist);
			Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
			if(menulist.isDisplayed())
			{
				String Menu = menulist.getText();
				System.out.println(" Menu list Pending Application Is:"+Menu );
			}
		}*/
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Verify water menu".
	 * @author deepak saini
	 * @since 2017-09-21
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//form[@id='inboxForm']/div[1]/div[2]/div/ul[1]/li[1]/a")
	private WebElement approved;

	@FindBy(xpath="//form[@id='inboxForm']/div[1]/div[2]/div/ul[1]/li[2]/a")
	private WebElement pendings;

	@FindBy(xpath="//form[@id='inboxForm']/div[1]/div[2]/div/ul[1]/li[3]/a")
	private WebElement rejected;


	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Pending Application Link".
	 * @author birbal.tahim
	 * @since 2017-09-06
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@class='dash-wraper water']/div[2]/div[1]/ul[2]/li[3]/a")
	private WebElement Pending_count;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Pending Application Link".
	 * @author birbal.tahim
	 * @since 2017-09-06
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@class='dash-wraper water']/div[2]/div[1]/ul[2]/li[1]/a")
	private WebElement Approve_count;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Pending Application Link".
	 * @author birbal.tahim
	 * @since 2017-09-06
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@class='dash-wraper water']/div[2]/div[1]/ul[2]/li[2]/a")
	private WebElement Reject_count;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Water Icon"
	 * @author sarvesh.nellore
	 * @Date: 21-09-2017
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="//div[@class='dash-wraper water']")
	private WebElement Water_Icon;

	public void toverifyfunctionalityofWaterStatistics_Icon02() throws InterruptedException
	{

		waitForSomeTime();
		//HighlightOnElement(Water_Icon);
		//Assert.assertEquals(true,Water_Icon.isEnabled());
		//Reporter.log(" To Verify Water_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console

		waitForSomeTime();
		HighlightOnElement(Approve_count);
		Assert.assertEquals(true,Approve_count.isEnabled());
		String Approvecount=Approve_count.getText();
		Reporter.log("Approve count on WaterMenu:"+Approvecount,true);
		Reporter.log(" To Verify Approve_count  in Water_Icon  Water&Sewerage link is Present",true); //print for eclipse console

		waitForSomeTime();
		HighlightOnElement(Reject_count);
		Assert.assertEquals(true,Reject_count.isEnabled());
		String Rejectcount=Reject_count.getText();
		Reporter.log("Reject count on WaterMenu:"+Rejectcount,true);
		Reporter.log(" To Verify Reject_count  in Water_Icon  Water&Sewerage link is Present",true); //print for eclipse console

		waitForSomeTime();
		HighlightOnElement(Pending_count);
		Assert.assertEquals(true,Pending_count.isEnabled());
		String Pendingcount=Pending_count.getText();
		Reporter.log("Pending count on WaterMenu:"+Pendingcount,true);
		Reporter.log(" To Verify Pending_count  in Water_Icon  Water&Sewerage link is Present",true); //print for eclipse console

	}


	@FindBy(xpath="(.//div/p[contains(.,'My Inbox')])[2]/following-sibling::span/a")
	private WebElement myinbox_app_count;
	
	@FindBy(xpath = "(.//a[contains(.,'DISCONNECTION OF WATER CONNECTION')])[2]")
	private WebElement pending_app_sec;
	
	@FindBy(xpath = "(.//span[contains(text(),'Application')]/following-sibling::a/span)[1]")
	private WebElement close_popup_btn;

	public void verifyMyInboxCountLink() throws InterruptedException
	{	
		wait.until(ExpectedConditions.visibilityOf(myinbox_app_count));
		Assert.assertTrue(myinbox_app_count.isDisplayed());
		HighlightOnElement(myinbox_app_count);
		
		wait.until(ExpectedConditions.elementToBeClickable(myinbox_app_count));
		Assert.assertEquals(true,myinbox_app_count.isEnabled());
		String PendingCount1 = myinbox_app_count.getText();
		int pendingcount = Integer.parseInt(PendingCount1);
		Reporter.log("Pending Count On Water Icon Is:" +pendingcount);
		myinbox_app_count.click();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(pending_app_sec));
		Assert.assertTrue(pending_app_sec.isDisplayed());
		HighlightOnElement(pending_app_sec);
		
		wait.until(ExpectedConditions.elementToBeClickable(pending_app_sec));
		Assert.assertTrue(pending_app_sec.isEnabled());
		pending_app_sec.click();
		waitForDomElement();
		
		wait.until(ExpectedConditions.visibilityOf(close_popup_btn));
		Assert.assertTrue(close_popup_btn.isDisplayed());
		HighlightOnElement(close_popup_btn);
		
		wait.until(ExpectedConditions.elementToBeClickable(close_popup_btn));
		Assert.assertTrue(close_popup_btn.isEnabled());
		close_popup_btn.click();
	}
	
	@FindBy(xpath="//span[@class='ui-icon ui-icon-seek-first']")
	private WebElement SeekFirst_PendingList;

	@FindBy(xpath="//span[@class='ui-icon ui-icon-seek-prev']")
	private WebElement SeekPrevious_PendingList;

	@FindBy(xpath="//span[@class='ui-icon ui-icon-seek-end']")
	private WebElement Seekend_PendingList;

	@FindBy(xpath="//span[@class='ui-icon ui-icon-seek-next']")
	private WebElement Seeknext_PendingList;

	public void verifyPaginationFunctionality() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(SeekFirst_PendingList));
		Assert.assertTrue(SeekFirst_PendingList.isDisplayed());
		HighlightOnElement(SeekFirst_PendingList);
		
		wait.until(ExpectedConditions.visibilityOf(SeekPrevious_PendingList));
		Assert.assertTrue(SeekPrevious_PendingList.isDisplayed());
		HighlightOnElement(SeekPrevious_PendingList);
		
		wait.until(ExpectedConditions.visibilityOf(Seeknext_PendingList));
		Assert.assertTrue(Seeknext_PendingList.isDisplayed());
		HighlightOnElement(Seeknext_PendingList);
		
		wait.until(ExpectedConditions.visibilityOf(Seekend_PendingList));
		Assert.assertTrue(Seekend_PendingList.isDisplayed());
		HighlightOnElement(Seekend_PendingList);

		if(Seeknext_PendingList.isEnabled())
		{
			Assert.assertTrue(Seeknext_PendingList.isDisplayed(),"TestCase Pass");
			Reporter.log("Test case pass: Pagination is Displayed in PendingList Application",true);
			wait.until(ExpectedConditions.elementToBeClickable(Seeknext_PendingList));
			Assert.assertTrue(Seeknext_PendingList.isEnabled());
			Seeknext_PendingList.click();
			waitForPageLoad();
			waitForPageLoad();
			wait.until(ExpectedConditions.elementToBeClickable(SeekPrevious_PendingList));
			Assert.assertTrue(SeekPrevious_PendingList.isEnabled());
			SeekPrevious_PendingList.click();
			waitForPageLoad();
			waitForPageLoad();
		}
		else 
		{
			Assert.assertFalse(Seeknext_PendingList.isDisplayed(),"Test Case Fail");
			Reporter.log("Test case pass: Pagination is Not Working in PendingList Application",true);
		}
	}	
	
	@FindBy(xpath=".//span[contains(.,'Application No.')]/following-sibling::input")
	private WebElement entervalueinsearchbox;
	
	@FindBy(xpath = ".//tbody[@id='inboxForm:j_id1583889823_159c1e7f:serviceWisedata_data']/tr/td[contains(text(),'No record found with given criteria')]")
	private WebElement message_lable;
	
	public void verifyInvalidApplicationNumberSearch() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(entervalueinsearchbox));
		Assert.assertTrue(entervalueinsearchbox.isDisplayed());
		HighlightOnElement(entervalueinsearchbox);
		
		wait.until(ExpectedConditions.elementToBeClickable(entervalueinsearchbox));
		Assert.assertTrue(entervalueinsearchbox.isEnabled());
		String invalidnumber = excel.getExcelData(entervalueinsearchbox, "DisconnectionNumber",0, 7);
		Reporter.log("Invalid Application Number:"+invalidnumber,true);
		waitForPageLoad();
		waitForDomElement();
		
		String message = "No record found with given criteria";
		wait.until(ExpectedConditions.visibilityOf(message_lable));
		HighlightOnElement(message_lable);
		String msg = message_lable.getText();
		Assert.assertEquals(msg, message);
		System.out.println("Message is: " + msg);
	}
	
	public void verifyApplicationSearchWithSpecialCharacters() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(entervalueinsearchbox));
		Assert.assertTrue(entervalueinsearchbox.isDisplayed());
		HighlightOnElement(entervalueinsearchbox);
		
		wait.until(ExpectedConditions.elementToBeClickable(entervalueinsearchbox));
		Assert.assertTrue(entervalueinsearchbox.isEnabled(),"Test Case Pass: entervalueinsearchbox");
		excel.getExcelData(entervalueinsearchbox, "DisconnectionNumber", 0, 5);
		waitForPageLoad();
		waitForDomElement();
		
		String message = "No record found with given criteria";
		wait.until(ExpectedConditions.visibilityOf(message_lable));
		HighlightOnElement(message_lable);
		String msg = message_lable.getText();
		Assert.assertEquals(msg, message);
		System.out.println("Message is: " + msg);
	}
	
	@FindBy(xpath=".//a/img[@src='/NRDAuthorityPreUAT/resources/images/view-new.png']")
	private WebElement action;
	
	public void toVerifyValidApplicationNumber()throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(entervalueinsearchbox));
		Assert.assertTrue(entervalueinsearchbox.isDisplayed());
		HighlightOnElement(entervalueinsearchbox);
		
		wait.until(ExpectedConditions.elementToBeClickable(entervalueinsearchbox));
		Assert.assertTrue(entervalueinsearchbox.isEnabled(),"Test Case Pass: ApplicationNumberField");
		excel.getExcelData(entervalueinsearchbox, "DisconnectionNumber", 0, 1);
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		wait.until(ExpectedConditions.visibilityOf(action));
		Assert.assertTrue(action.isDisplayed());
		HighlightOnElement(action);
		waitForDomElement();
	}	

	public void verifyActionButtonFunctionality() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		wait.until(ExpectedConditions.visibilityOf(action));
		Assert.assertTrue(action.isDisplayed());
		HighlightOnElement(action);
		
		wait.until(ExpectedConditions.elementToBeClickable(action));
		Assert.assertTrue(action.isEnabled());
		action.click();
		waitForPageLoad();
		waitForDomElement();
	}
	
	@FindBy(xpath = ".//div[@class='name-date-wrapper']/label")
	private List<WebElement> subject_fileno_lbl;
	
	public void verifySubjectAndFileNo()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(subject_fileno_lbl));
		for(WebElement label_elm:subject_fileno_lbl) 
		{
			Assert.assertTrue(label_elm.isDisplayed());
			HighlightOnElement(label_elm);	
		}		
	}
	
	@FindBy(xpath="//textarea[@id='inboxForm:todolist']")
	private WebElement entercommentbox;
	
	@FindBy(xpath=".//*[@id='inboxForm:msg_container']/div/div/div[2]/span")
	private WebElement ErrorMessag_Popup;

	@FindBy(xpath="(//button[contains(.,'Submit') and@role='button'])[1]")
	private WebElement Submit_Button;
	
	public void verifyFormSubmissionWithoutAction() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		ScroolDown();
		wait.until(ExpectedConditions.visibilityOf(entercommentbox));
		Assert.assertTrue(entercommentbox.isDisplayed());
		HighlightOnElement(entercommentbox);
		Assert.assertTrue(entercommentbox.isEnabled());
		excel.getExcelData(entercommentbox, "WaterConnectionDetails", 1, 8);
		
		wait.until(ExpectedConditions.visibilityOf(Submit_Button));
		Assert.assertTrue(Submit_Button.isDisplayed());
		HighlightOnElement(Submit_Button);
		
		wait.until(ExpectedConditions.elementToBeClickable(Submit_Button));
		Assert.assertEquals(Submit_Button.isEnabled(),true);		
		Submit_Button.click();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		/*
		wait.until(ExpectedConditions.visibilityOf(ErrorMessag_Popup));
		Assert.assertTrue(ErrorMessag_Popup.isDisplayed());
		HighlightOnElement(ErrorMessag_Popup);

		String Expected_Message = "Action required !";
		String Actual_Message = ErrorMessag_Popup.getText();
		Reporter.log("POP-UP Message Is:"+ Actual_Message,true);
		Assert.assertEquals(Expected_Message, Actual_Message);
		waitForDomElement();
		Reporter.log("Click on Submit button Successfully",true);
		*/
	}
	
	@FindBy(xpath=".//label[contains(text(),'Select Action')]/../following-sibling::td[1]/div")
	private WebElement clickonselectactiondrop;
	public void verifyFormSubmissionWithoutRemarks() throws InterruptedException
	{
		ScroolDown();
		wait.until(ExpectedConditions.visibilityOf(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isDisplayed());
		HighlightOnElement(clickonselectactiondrop);
		
		wait.until(ExpectedConditions.elementToBeClickable(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isEnabled());
		clickonselectactiondrop.click();
		selectValueFromDropdown("Approved");
		
		waitForPageLoad();
		waitForPageLoad();
		
		//wait.until(ExpectedConditions.visibilityOf(entercommentbox));
		//Assert.assertTrue(entercommentbox.isDisplayed());
		//HighlightOnElement(entercommentbox);
		
		wait.until(ExpectedConditions.visibilityOf(Submit_Button));
		Assert.assertTrue(Submit_Button.isDisplayed());
		HighlightOnElement(Submit_Button);
		
		wait.until(ExpectedConditions.elementToBeClickable(Submit_Button));
		Assert.assertEquals(Submit_Button.isEnabled(),true);		
		Submit_Button.click();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		/*
		wait.until(ExpectedConditions.visibilityOf(ErrorMessag_Popup));
		Assert.assertTrue(ErrorMessag_Popup.isDisplayed());
		HighlightOnElement(ErrorMessag_Popup);

		String Expected_Message = "Please enter comments !";
		String Actual_Message = ErrorMessag_Popup.getText();
		Reporter.log("POP-UP Message Is:"+ Actual_Message,true);
		Assert.assertEquals(Expected_Message, Actual_Message);
		waitForDomElement();
		Reporter.log("Click on Submit button Successfully",true);
		*/
	}
	
	@FindBy(xpath=".//table[@class='main-uploadDoc']/tbody/tr[1]/td/div/div[1]/label")
	private WebElement uploaddocument;
	
	@FindBy(xpath = ".//span[contains(text(),'Upload only jpg, png or pdf file')]")
	private WebElement file_error_msg_lbl;
	public void verifyFormSubmissionWithInvalidFile() throws InterruptedException, AWTException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		ScroolDown();
		wait.until(ExpectedConditions.visibilityOf(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isDisplayed());
		HighlightOnElement(clickonselectactiondrop);
		
		wait.until(ExpectedConditions.elementToBeClickable(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isEnabled());
		clickonselectactiondrop.click();
		selectValueFromDropdown("Approved");
		
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(entercommentbox));
		Assert.assertTrue(entercommentbox.isDisplayed());
		HighlightOnElement(entercommentbox); 
		Assert.assertTrue(entercommentbox.isEnabled());
		excel.getExcelData(entercommentbox, "WaterConnectionDetails", 1, 8);
		
		wait.until(ExpectedConditions.visibilityOf(uploaddocument));
		Assert.assertTrue(uploaddocument.isDisplayed());
		HighlightOnElement(uploaddocument);
		
		wait.until(ExpectedConditions.elementToBeClickable(uploaddocument));
		Assert.assertTrue(uploaddocument.isEnabled());
		uploaddocument.click();
		waitForSomeTime();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\System.logs.1");
		waitForPageLoad();
		waitForPageLoad();
		/*
		String Expected = file_error_msg_lbl.getText();
		String Actual = "Upload only jpg, png or pdf file";
		Assert.assertEquals(Expected,Actual,"Test case pass");
		Reporter.log("Expected result:"+Expected,true);
		waitForDomElement();
		*/
	}
			
	@FindBy(xpath = ".//button/span[contains(text(),'Close')]")
	private WebElement close_button;
	public void verifyCloseButtonFunctionality() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(close_button));
		Assert.assertTrue(close_button.isDisplayed());
		HighlightOnElement(close_button);
		
		String currenturl = driver.getCurrentUrl();
		Reporter.log("Current Url: " + currenturl, true);
		wait.until(ExpectedConditions.elementToBeClickable(close_button));
		Assert.assertTrue(close_button.isEnabled());
		close_button.click();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		String previousurl = driver.getCurrentUrl();
		Reporter.log("Previous Url: " + previousurl, true);
		Assert.assertNotEquals(currenturl, previousurl, "Test case not pass");
		waitForDomElement();
	}
	
	@FindBy(xpath = "(.//button/span[contains(text(),'Save as draft')])[1]")
	private WebElement save_as_draft_btn;
	public void verifySaveAsDraftButton() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		ScroolDown();
		wait.until(ExpectedConditions.visibilityOf(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isDisplayed());
		HighlightOnElement(clickonselectactiondrop);
		
		wait.until(ExpectedConditions.elementToBeClickable(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isEnabled());
		selectValueFromDropdown("Approved");
		
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(entercommentbox));
		Assert.assertTrue(entercommentbox.isDisplayed());
		HighlightOnElement(entercommentbox);
		
		wait.until(ExpectedConditions.elementToBeClickable(entercommentbox));
		Assert.assertTrue(entercommentbox.isEnabled());
		excel.getExcelData(entercommentbox, "WaterConnectionDetails", 1, 8);
		
		wait.until(ExpectedConditions.visibilityOf(save_as_draft_btn));
		Assert.assertTrue(save_as_draft_btn.isDisplayed());
		HighlightOnElement(save_as_draft_btn);
		
		wait.until(ExpectedConditions.elementToBeClickable(save_as_draft_btn));
		Assert.assertTrue(save_as_draft_btn.isEnabled());
		save_as_draft_btn.click();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		waitForDomElement();
	}
	
	@FindBy(xpath = ".//button/span[contains(text(),'Remove draft')]")
	private WebElement remove_draft_btn;
	public void verifyRemoveDraftButton()
	{
		ScroolDown();
		wait.until(ExpectedConditions.visibilityOf(remove_draft_btn));
		Assert.assertTrue(remove_draft_btn.isDisplayed());
		HighlightOnElement(remove_draft_btn);
		
		wait.until(ExpectedConditions.elementToBeClickable(remove_draft_btn));
		Assert.assertTrue(remove_draft_btn.isEnabled());
		remove_draft_btn.click();
		waitForPageLoad();
		waitForDomElement();
	}
	
	public void verifyFormWithSubmissionWithValidData() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		ScroolDown();
		wait.until(ExpectedConditions.visibilityOf(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isDisplayed());
		HighlightOnElement(clickonselectactiondrop);
		
		wait.until(ExpectedConditions.elementToBeClickable(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isEnabled());
		clickonselectactiondrop.click();
		selectValueFromDropdown("Approved");
		
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(entercommentbox));
		Assert.assertTrue(entercommentbox.isDisplayed());
		HighlightOnElement(entercommentbox);
		Assert.assertTrue(entercommentbox.isEnabled());
		excel.getExcelData(entercommentbox, "WaterConnectionDetails", 1, 8);
		
		wait.until(ExpectedConditions.visibilityOf(uploaddocument));
		Assert.assertTrue(uploaddocument.isDisplayed());
		HighlightOnElement(uploaddocument);
		
		wait.until(ExpectedConditions.elementToBeClickable(uploaddocument));
		Assert.assertTrue(uploaddocument.isEnabled());
		uploaddocument.click();
		waitForSomeTime();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\download.jpg");
		waitForPageLoad();
		waitForPageLoad();
	}
	
	public void verifySubmitButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		wait.until(ExpectedConditions.visibilityOf(Submit_Button));
		Assert.assertTrue(Submit_Button.isDisplayed());
		HighlightOnElement(Submit_Button);
		
		wait.until(ExpectedConditions.elementToBeClickable(Submit_Button));
		Assert.assertEquals(Submit_Button.isEnabled(),true);
		Submit_Button.click();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		waitForDomElement();
		Reporter.log("Click on Submit button Successfully",true);
	}
}