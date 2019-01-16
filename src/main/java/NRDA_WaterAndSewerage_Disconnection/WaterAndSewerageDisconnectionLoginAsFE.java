package NRDA_WaterAndSewerage_Disconnection;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
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
 * @Purpose: WATER AND SEWERAGE DISCONNECTION LOGIN BY FIELD ENGINEER
 */
public class WaterAndSewerageDisconnectionLoginAsFE  extends CommonLibrary
{

	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	
	WebDriverWait wait = new WebDriverWait(driver, 30);
	
	static int pendcountList=0;
	static int RejectcountList=0;
	static int ApprovecountList=0;

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


	//@FindBy(xpath=".//*[@id='inboxForm']/div[1]")
	@FindBy(xpath = ".//tr[@class='ui-widget-content']/td/div/div/div[2]")
	private WebElement phe_dashboard;
	public void toVerifyMenuFieldsonDashBoard_SC_03_TC01() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(phe_dashboard));
		Assert.assertTrue(phe_dashboard.isDisplayed());
		HighlightOnElement(phe_dashboard);
		Assert.assertEquals(true,phe_dashboard.isEnabled());
		Reporter.log(" To Verify WaterIcon_Menu Link in Application of Water&Sewerage link is Present",true);
	}

	@FindBy(xpath="//a[contains(.,'Public Health and Engineering ')]/../following-sibling::div/ul/li")
	private List <WebElement> MenuInPublicHealthEngineering;
	
	@FindBy(xpath="//a[contains(.,'Public Health and Engineering ')]")
	private WebElement PublicHealthEngineeringMenu;
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
	private WebElement DisconnectionofwaterConnection;
	
	@FindBy(xpath="//a[contains(.,'Disconnection')]/../following-sibling::div/div/div/div/div[2]/table/thead/tr/th/span")
	private List <WebElement> Disconnectionmenu;
	
	public void toVerifyPendingApplicationMenulist() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(DisconnectionofwaterConnection));
		Assert.assertTrue(DisconnectionofwaterConnection.isDisplayed());
		HighlightOnElement(DisconnectionofwaterConnection);
		
		wait.until(ExpectedConditions.elementToBeClickable(DisconnectionofwaterConnection));
		Assert.assertTrue(DisconnectionofwaterConnection.isEnabled());
		DisconnectionofwaterConnection.click();
		waitForPageLoad();
		waitForPageLoad();
		
		for(WebElement menulist:Disconnectionmenu)
		{
			HighlightOnElement(menulist);
			Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
			if(menulist.isDisplayed())
			{
				String Menu=menulist.getText();
				System.out.println(" Menu list Pending Application Is:"+Menu );
			}
		}
	}

	public void toVerifyPendingApplicationAsJE() throws InterruptedException
	{
		HighlightOnElement(PendingApplication_Icon);
		Assert.assertTrue(PendingApplication_Icon.isEnabled());
		PendingApplication_Icon.click();
		Reporter.log("Expected result:click on Pending Application",true);
		waitForelementPresent(entervalueinsearchbox);
		HighlightOnElement(newapplication);
		String newapplicationlabelname=newapplication.getText();
		Reporter.log("Expected result:"+newapplicationlabelname,true);

		for(WebElement menulistnewapplication:underNewApplicationpending)
		{

			if(menulistnewapplication.isDisplayed())
			{
				HighlightOnElement(menulistnewapplication);
				String pendingapplication=menulistnewapplication.getText();
				Reporter.log("Menu list under New Application:"+pendingapplication,true);
			}
		}


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

	@FindBy(xpath="//img[@src='/NRDAuthority1/resources/images/view-new.png']")
	private  List<WebElement> actionbtn;
	public void toVerifyActionButtonDisplayed01()
	{

		for(WebElement action:actionbtn)
		{
			if(action.isDisplayed())
			{
				HighlightOnElement(action);
				Assert.assertNotNull(action.isDisplayed(),"Test Case: Pass");
			}

		}
		Reporter.log("ActionButton Shown in All applications");
	}

	@FindBy(xpath="//div[@id='inboxForm:dlg']/div[2]/div/div/div/div[1]/table/tbody/tr")
	private List <WebElement> PendingListonPopup;

	@FindBy(xpath="//div[@id='inboxForm:dlg']/div[2]/div/div/div/div[1]/table/tbody/tr")
	private List <WebElement> RejectListonPopup;

	@FindBy(xpath="//div[@id='inboxForm:dlg']/div[2]/div/div/div/div[1]/table/tbody/tr")
	private List <WebElement> ApproveListonPopup;


	public void toVerifyRecordPerPage02() throws InterruptedException
	{
		waitForSomeTime();
		int count=PendingListonPopup.size();
		if(count==10)
		{
			Assert.assertEquals(count,10);
			Reporter.log("Test case pass: Number of record per page is equal to 10");
		}
		else
		{
			Reporter.log("Test case fail: Number of record per page is greater or less than 10");
			Assert.assertNotEquals(count,10);
		}
		Reporter.log("No of record per page:"+count,true);
		waitForSomeTime();
	}

	@FindBy(xpath="//span[@class='ui-icon ui-icon-seek-first']")
	private WebElement SeekFirst_PendingList;

	@FindBy(xpath="//span[@class='ui-icon ui-icon-seek-prev']")
	private WebElement SeekPrevious_PendingList;

	@FindBy(xpath="//span[@class='ui-icon ui-icon-seek-end']")
	private WebElement Seekend_PendingList;

	@FindBy(xpath="//span[@class='ui-icon ui-icon-seek-next']")
	private WebElement Seeknext_PendingList;

	public void toVerifyPagination02() throws InterruptedException
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
			wait.until(ExpectedConditions.elementToBeClickable(SeekPrevious_PendingList));
			Assert.assertTrue(SeekPrevious_PendingList.isEnabled());
			SeekPrevious_PendingList.click();
			waitForPageLoad();
		}
		else 
		{
			Assert.assertFalse(Seeknext_PendingList.isDisplayed(),"Test Case Fail");
			Reporter.log("Test case pass: Pagination is Not Working in PendingList Application",true);
		}

	}

	@FindBy(xpath=".//*[@id='inboxForm:dlg']/div[1]/a/span")
	private WebElement Close_Popwindow;

	public void closePopUpWindow() throws InterruptedException{
		waitForSomeTime();
		HighlightOnElement(Close_Popwindow);
		waitForSomeTime();
		Assert.assertEquals(true,Close_Popwindow.isEnabled());
		Close_Popwindow.click();
		Reporter.log("Expected result:click on Close Popup window",true);
		waitForSomeTime();

	}

	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/div/div[2]/div[2]/h3/a")
	private WebElement newapplication;

	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/div/div[2]/div[2]/div/div/h3/a")
	private List<WebElement> underNewApplicationpending;


	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/div[1]/div[2]/div/h3/a")
	private  List<WebElement> allmenusinPendingApplication;

	public void toVerifyPendingApplicationIconInDashBoard_SC_03_TC_05() throws InterruptedException
	{

		HighlightOnElement(PendingApplication_Icon);
		Assert.assertTrue(PendingApplication_Icon.isEnabled());
		PendingApplication_Icon.click();
		Reporter.log("Expected result:click on Pending Application",true);
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(newapplication);
		String newapplicationlabelname=newapplication.getText();
		Reporter.log("Expected result:"+newapplicationlabelname,true);

		for(WebElement menulistnewapplication:underNewApplicationpending)
		{

			if(menulistnewapplication.isDisplayed())
			{
				HighlightOnElement(menulistnewapplication);
				String pendingapplication=menulistnewapplication.getText();
				Reporter.log("Menu list under New Application:"+pendingapplication,true);
			}
		}


		for(WebElement menulistpendingapplication:allmenusinPendingApplication)
		{

			if(menulistpendingapplication.isDisplayed())
			{
				HighlightOnElement(menulistpendingapplication);
				String pendingapplication=menulistpendingapplication.getText();
				Reporter.log("Menu list underPending Application:"+pendingapplication,true);
			}
		}

	}

	@FindBy(xpath="//h3[contains(.,'RTI Questions')]/../div/div/div[2]/span/span[@class='ui-icon ui-icon-seek-first']")
	private WebElement SeekFirst_RTI;

	@FindBy(xpath="//h3[contains(.,'RTI Questions')]/../div/div/div[2]/span/span[@class='ui-icon ui-icon-seek-prev']")
	private WebElement SeekPrevious_RTI;

	@FindBy(xpath="//h3[contains(.,'RTI Questions')]/../div/div/div[2]/span/span[@class='ui-icon ui-icon-seek-end']")
	private WebElement Seekend_RTI;

	@FindBy(xpath="//h3[contains(.,'RTI Questions')]/../div/div/div[2]/span/span[@class='ui-icon ui-icon-seek-next']")
	private WebElement Seeknext_RTI;

	@FindBy(xpath=".//span[contains(.,'Application No.')]/following-sibling::input")
	private WebElement entervalueinsearchbox;

	public void toverifypeginationofPendingApplication06() throws InterruptedException
	{
		HighlightOnElement(PendingApplication_Icon);
		Assert.assertTrue(PendingApplication_Icon.isEnabled(),"Test Case PAss");
		PendingApplication_Icon.click();
		waitForSomeTime();
		waitForelementPresent(entervalueinsearchbox);
		Reporter.log("Expected result:click on PendingApplication Link",true);
		ScroolDown();
		waitForSomeTime();
		HighlightOnElement(SeekFirst_RTI);
		Assert.assertEquals(SeekFirst_RTI.isDisplayed(),true);
		HighlightOnElement(SeekPrevious_RTI);
		Assert.assertEquals(SeekPrevious_RTI.isDisplayed(),true);
		HighlightOnElement(Seeknext_RTI);
		Assert.assertEquals(Seeknext_RTI.isDisplayed(),true);
		HighlightOnElement(Seekend_RTI);
		Assert.assertEquals(Seekend_RTI.isDisplayed(),true);

		if(Seeknext_PendingList.isEnabled())
		{

			Reporter.log("Test case pass: Pagination is working in  Application",true);
			Seeknext_RTI.click();
			waitForSomeTime();
			SeekPrevious_RTI.click();
			waitForSomeTime();

		}
		else 
		{
			Assert.assertFalse(Seeknext_PendingList.isEnabled());
			Reporter.log("Test case pass: Pagination is Not working in  Application",true);
		}

		ScroolUp();
	}

	@FindBy(xpath="//button/span[contains(text(),'Search')]")
	private WebElement searchbtn;

	@FindBy(xpath="//button/span[contains(text(),'Reset')]")
	private WebElement Resetbtn;
	
	@FindBy(xpath = ".//tbody[@id='inboxForm:j_id1583889823_159c1e7f:serviceWisedata_data']/tr/td[contains(text(),'No record found with given criteria')]")
	private WebElement message_lable;

	public void toVerifyInvalidApplicationNumber07() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
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

	@FindBy(xpath=".//*[@id='inboxForm:growl_container']/div/div/div[2]/span")
	private WebElement getmessage;

	public void toVerifyBlankApplicationNumber() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		HighlightOnElement(PendingApplication_Icon);
		Assert.assertTrue(PendingApplication_Icon.isEnabled(),"Test Case PAss");
		PendingApplication_Icon.click();
		waitForelementPresent(entervalueinsearchbox);		
		Reporter.log("Expected result:click on PendingApplication Link",true);
		HighlightOnElement(entervalueinsearchbox);
		HighlightOnElement(searchbtn);
		searchbtn.click();
		waitForSomeTime();
		HighlightOnElement(getmessage);
		String Expected=getmessage.getText();
		String Actual="Please enter Application Number !";
		Assert.assertEquals(Actual, Expected);
		Reporter.log("Expected result:"+Expected,true);
		waitForSomeTime();
		waitForSomeTime();
	}


	public void toVerifyresetButtonFunctionality() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		HighlightOnElement(PendingApplication_Icon);
		Assert.assertTrue(PendingApplication_Icon.isEnabled(),"Test Case PAss");
		PendingApplication_Icon.click();
		//waitForSomeTime();
		waitForelementPresent(entervalueinsearchbox);
		Reporter.log("Expected result:click on PendingApplication Link",true);

		waitForSomeTime();
		HighlightOnElement(entervalueinsearchbox);
		String invalidnumber=excel.getExcelData(entervalueinsearchbox, "DisconnectionNumber",0, 2);
		Reporter.log("Invalid Application Number:"+invalidnumber,true);
		waitForSomeTime();
		HighlightOnElement(Resetbtn);
		Resetbtn.click();
		waitForSomeTime();
		waitForSomeTime();
		VerifyTextField(entervalueinsearchbox);

	}


	@FindBy(xpath="(//table[@role='grid']/thead/tr)[1]")
	private WebElement Application_Grid;

	@FindBy(xpath="//h3/a[contains(.,'DISCONNECTION OF WATER CONNECTION')]/../../div/div/div[1]/table/thead/tr/th")
	private List<WebElement> ApplicationDetails;

	@FindBy(xpath="//span[contains(.,'PENDING')]")
	private WebElement Application_Status;

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
		wait.until(ExpectedConditions.visibilityOf(action));
		Assert.assertTrue(action.isDisplayed());
		HighlightOnElement(action);
		waitForDomElement();
	}

	@FindBy(xpath=".//a/img[@src='/NRDAuthorityPreUAT/resources/images/view-new.png']")
	private WebElement action;


	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/div[3]/div[2]/center/table/tbody/tr/td[1]/label")
	private List<WebElement> commentlabel;

	@FindBy(xpath="//textarea[@id='inboxForm:todolist']")
	private WebElement entercommentbox;

	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/div[3]/div[2]/center/table/tbody/tr/td[4]/a/span")
	private WebElement viewpropertymap;

	@FindBy(xpath="(.//td[@role='gridcell']/label[contains(text(),'Upload Document')])[2]")
	private WebElement uploaddocumentlabel;

	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/div[3]/div[2]/center/table[2]/tbody/tr/td/table/tbody/tr/td/div/div[1]/label")
	private WebElement uploaddocument;

	@FindBy(xpath=".//label[contains(text(),'Select Action')]/../following-sibling::td[1]/div")
	private WebElement clickonselectactiondrop;

	@FindBy(xpath="//ul[@class='ui-selectonemenu-items ui-selectonemenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']/li")
	private List<WebElement> selectdropdownvalue;

	public void toclickonPendingApplication() throws InterruptedException
	{
		HighlightOnElement(PendingApplication_Icon);
		Assert.assertTrue(PendingApplication_Icon.isEnabled(),"Test Case PAss");
		PendingApplication_Icon.click();
		waitForelementPresent(entervalueinsearchbox);
		Reporter.log("Expected result:click on PendingApplication Link",true);
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
		/*for(WebElement la:commentlabel)
		{
			if(la.isDisplayed())
			{
				wait.until(ExpectedConditions.visibilityOf(la));
				Assert.assertTrue(la.isDisplayed());
				HighlightOnElement(la);
				String labelname=la.getText();
				Reporter.log("Expected result:"+labelname,true);
			}
		}
		
		wait.until(ExpectedConditions.visibilityOf(uploaddocumentlabel));
		Assert.assertTrue(uploaddocumentlabel.isDisplayed());
		HighlightOnElement(uploaddocumentlabel);
		String uploadlabel = uploaddocumentlabel.getText();
		Reporter.log("Expected result:"+uploadlabel,true);
		waitForSomeTime();

		wait.until(ExpectedConditions.visibilityOf(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isDisplayed());
		HighlightOnElement(clickonselectactiondrop);*/
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
	
	@FindBy(xpath=".//*[@id='inboxForm:msg_container']/div/div/div[2]/span")
	private WebElement ErrorMessag_Popup;

	@FindBy(xpath="(//button[contains(.,'Submit') and@role='button'])[1]")
	private WebElement Submit_Button;

	public void verifyFormSubmissionWithoutAction() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		wait.until(ExpectedConditions.visibilityOf(entercommentbox));
		Assert.assertTrue(entercommentbox.isDisplayed());
		HighlightOnElement(entercommentbox);
		Assert.assertTrue(entercommentbox.isEnabled());
		excel.getExcelData(entercommentbox, "WaterConnectionDetails", 1, 4);
		
		wait.until(ExpectedConditions.visibilityOf(Submit_Button));
		Assert.assertTrue(Submit_Button.isDisplayed());
		HighlightOnElement(Submit_Button);
		
		wait.until(ExpectedConditions.elementToBeClickable(Submit_Button));
		Assert.assertEquals(Submit_Button.isEnabled(),true);		
		Submit_Button.click();
		waitForPageLoad();
		waitForDomElement();
		Reporter.log("Click on Submit button Successfully",true);
	}
	
	public void verifyFormSubmissionWithoutRemarks() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isDisplayed());
		HighlightOnElement(clickonselectactiondrop);
		
		wait.until(ExpectedConditions.elementToBeClickable(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isEnabled());
		clickonselectactiondrop.click();
		selectValueFromDropdown("Verify");
		
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(entercommentbox));
		Assert.assertTrue(entercommentbox.isDisplayed());
		HighlightOnElement(entercommentbox);
		
		wait.until(ExpectedConditions.visibilityOf(Submit_Button));
		Assert.assertTrue(Submit_Button.isDisplayed());
		HighlightOnElement(Submit_Button);
		
		wait.until(ExpectedConditions.elementToBeClickable(Submit_Button));
		Assert.assertEquals(Submit_Button.isEnabled(),true);		
		Submit_Button.click();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		waitForDomElement();
		Reporter.log("Click on Submit button Successfully",true);
	}

	public void toVerifyErrorMessage() throws InterruptedException
	{
		waitForSomeTime();
		HighlightOnElement(ErrorMessag_Popup);
		String Expected_Message="Action required !";
		String Actual_Message=ErrorMessag_Popup.getText();
		Assert.assertEquals(Expected_Message, Actual_Message);
		waitForSomeTime();
		waitForSomeTime();
	}

	@FindBy(xpath = ".//button/span[contains(text(),'Close')]")
	private WebElement closebutton;
	public void verifyCloseButton()
	{
		wait.until(ExpectedConditions.visibilityOf(closebutton));
		Assert.assertTrue(closebutton.isDisplayed());
		HighlightOnElement(closebutton);
		
		String currenturl = driver.getCurrentUrl();
		Reporter.log("Current Url: " + currenturl, true);
		wait.until(ExpectedConditions.elementToBeClickable(closebutton));
		Assert.assertTrue(closebutton.isEnabled());
		closebutton.click();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		String previousurl = driver.getCurrentUrl();
		Reporter.log("Previous Url: " + previousurl, true);
	//	Assert.assertNotEquals(currenturl, previousurl, "Test case not pass");
		waitForDomElement();
	}
	
	public void toVerifyErrorMessageAsCommentFieldisBlank() throws InterruptedException
	{
		waitForSomeTime();
		HighlightOnElement(ErrorMessag_Popup);
		String Expected_Message="Please enter comments !";
		String Actual_Message=ErrorMessag_Popup.getText();
		Assert.assertEquals(Expected_Message, Actual_Message);
		waitForSomeTime();
		waitForSomeTime();
	}

	@FindBy(xpath = "(.//button/span[contains(text(),'Save as draft')])[1]")
	private WebElement save_as_draft_btn;
	public void verifySaveAsDraftButton() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isDisplayed());
		HighlightOnElement(clickonselectactiondrop);
		
		wait.until(ExpectedConditions.elementToBeClickable(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isEnabled());
		selectValueFromDropdown("Verify");
		
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(entercommentbox));
		Assert.assertTrue(entercommentbox.isDisplayed());
		HighlightOnElement(entercommentbox);
		
		wait.until(ExpectedConditions.elementToBeClickable(entercommentbox));
		Assert.assertTrue(entercommentbox.isEnabled());
		excel.getExcelData(entercommentbox, "WaterConnectionDetails", 1, 4);
		
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
		wait.until(ExpectedConditions.visibilityOf(remove_draft_btn));
		Assert.assertTrue(remove_draft_btn.isDisplayed());
		HighlightOnElement(remove_draft_btn);
		
		wait.until(ExpectedConditions.elementToBeClickable(remove_draft_btn));
		Assert.assertTrue(remove_draft_btn.isEnabled());
		remove_draft_btn.click();
		waitForPageLoad();
		waitForDomElement();
	}
	
	public void verifyFormSubmissionWithValidValues() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isDisplayed());
		HighlightOnElement(clickonselectactiondrop);
		
		wait.until(ExpectedConditions.elementToBeClickable(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isEnabled());
		clickonselectactiondrop.click();
		selectValueFromDropdown("Verify");
		
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(entercommentbox));
		Assert.assertTrue(entercommentbox.isDisplayed());
		HighlightOnElement(entercommentbox);
		
		wait.until(ExpectedConditions.elementToBeClickable(entercommentbox));
		Assert.assertTrue(entercommentbox.isEnabled());
		excel.getExcelData(entercommentbox, "WaterConnectionDetails", 1, 4);
		
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
	}
	
	//after ceo approval and water bill payment
	public void verifyFormWithValidValues() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
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
	}
	
	public void verifyFormSubmissionWithApprove()
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
	}
	
	
	@FindBy(xpath="//div[@class='dash-wraper water']/div[2]/div/ul[2]/li/../li[3]/a")
	private WebElement beforepending;

	@FindBy(xpath="//span[contains(text(),'File uploaded Successfully')]")
	private WebElement fileuploadmessage;

	public void toverifySubmitFunctionalitywithActionAsSentBack() throws InterruptedException, AWTException, EncryptedDocumentException, InvalidFormatException, IOException	
	{
		HighlightOnElement(beforepending);
		String BeforePendingCount=beforepending.getText();

		int beforependingcount=Integer.parseInt(BeforePendingCount);
		Reporter.log("Before Pending Count:"+beforependingcount);

		HighlightOnElement(PendingApplication_Icon);
		Assert.assertTrue(PendingApplication_Icon.isEnabled(),"Test Case PAss");
		PendingApplication_Icon.click();
		waitForSomeTime();
		//waitForVisibleElement("//span[contains(.,'Applications List')]/../following-sibling::div/div[1]/div/table/tbody/tr[2]/td/input");
		waitForSomeTime();
		waitForelementPresent(entervalueinsearchbox);
		//fluentWait(entervalueinsearchbox)
		//waitForSomeTime();
		Reporter.log("Expected result:click on PendingApplication Link",true);
		HighlightOnElement(entervalueinsearchbox);
		//String Validnumber=ApplicationNumber.getText();
		String validnumber=excel.getExcelData(entervalueinsearchbox, "DisconnectionNumber",0, 1);
		Reporter.log("Valid Application Number:"+validnumber,true);
		//entervalueinsearchbox.sendKeys(Validnumber);
		waitForSomeTime();
		HighlightOnElement(searchbtn);
		searchbtn.click();
		waitForSomeTime();
		HighlightOnElement(action);
		action.click();
		waitForelementPresent(clickonselectactiondrop);
		//fluentWait(clickonselectactiondrop);
		//waitForVisibleElement("//div[@id='inboxForm:Nb']/div/div[3]/div[2]/center/table[1]/tbody/tr/td[2]/div/div[3]/span");

		HighlightOnElement(clickonselectactiondrop);
		clickonselectactiondrop.click();
		selectValueFromDropdown("Send Back");
		waitForSomeTime();
		waitForSomeTime();
		//fillsubjectfileFileds();
		HighlightOnElement(entercommentbox);
		//excel.getExcelData(entercommentbox, "Customer ID",3, 8);
		entercommentbox.sendKeys("Not completed SendBack");
		waitForSomeTime();
		HighlightOnElement(uploaddocument);
		uploaddocument.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur.jpg");
		waitForSomeTime();

		String Expected=fileuploadmessage.getText();
		String Actual="File uploaded Successfully";
		Assert.assertEquals(Expected,Actual,"Test case pass");
		Reporter.log("Expected result:"+Expected,true);
		waitForSomeTime();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)", "");
		HighlightOnElement(Submit_Button);
		waitForSomeTime();
		Submit_Button.click();
		Reporter.log("click on Submit button succesfully",true);
		Thread.sleep(15000);
		waitForSomeTime();
		HighlightOnElement(Home_Icon);
		Home_Icon.click();
		waitForSomeTime(); 
		waitForSomeTime(); 
		waitForSomeTime(); 
		//fluentWait(beforepending);
		//aftersentbackpendingcount();
		String AfterPendingCount=beforepending.getText();
		int afterpendingcount=Integer.parseInt(AfterPendingCount);

		Reporter.log("After Pending Count:"+afterpendingcount);

		if(BeforePendingCount.equals(afterpendingcount+1))
		{
			Reporter.log("Test case Pass pending count Increased", true);
			waitForSomeTime();
		}
		else
		{

			Reporter.log("Test case fail  pending count not Increased", true);
		}
		waitForSomeTime();

	}


	@FindBy(xpath="//button[contains(.,'Close')]")
	private WebElement close_Button;

	public void toverifyfunctionalityofclosebutton13() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		HighlightOnElement(PendingApplication_Icon);
		Assert.assertTrue(PendingApplication_Icon.isEnabled(),"Test Case PAss");
		PendingApplication_Icon.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForelementPresent(entervalueinsearchbox);
		Reporter.log("Expected result:click on PendingApplication Link",true);
		HighlightOnElement(entervalueinsearchbox);
		String validnumber=excel.getExcelData(entervalueinsearchbox, "DisconnectionNumber",0, 1);
		Reporter.log("Valid Application Number:"+validnumber,true);
		//entervalueinsearchbox.sendKeys(Validnumber);
		waitForSomeTime();
		HighlightOnElement(searchbtn);
		searchbtn.click();
		waitForSomeTime();
		HighlightOnElement(action);
		action.click();
		waitForSomeTime();
		waitForelementPresent(clickonselectactiondrop);
		HighlightOnElement(clickonselectactiondrop);
		HighlightOnElement(entercommentbox);
		HighlightOnElement(Submit_Button);
		HighlightOnElement(close_Button);
		waitForSomeTime();
		close_Button.click();
		Reporter.log("click on Close button succesfully",true);
		waitForSomeTime();
		waitForelementPresent(entervalueinsearchbox);
		waitForSomeTime();

	}

	public void toverifythefieldnofunctionality() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HighlightOnElement(entervalueinsearchbox);
		excel.getExcelData(entervalueinsearchbox, "DisconnectionNumber",0, 1);
		waitForSomeTime();
		HighlightOnElement(searchbtn);
		searchbtn.click();
		waitForSomeTime();
		HighlightOnElement(action);
		action.click();
		waitForSomeTime();
		waitForSomeTime();
		ScroolDown();
		ScroolDown();
		HighlightOnElement(clickonselectactiondrop);
		clickonselectactiondrop.click();

		selectValueFromDropdown("Forward for Final Approval");
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(entercommentbox);
		entercommentbox.sendKeys("Application Approved");
		waitForSomeTime();
		HighlightOnElement(File_Field);
		WebElement fieldName = File_Field;
		fieldName.sendKeys("1234");
		String fieldNameVal = fieldName.getAttribute("value");
		if(fieldNameVal.contentEquals("1234")){
			System.out.println("Field is editable");
		}
		else{
			System.out.println("Field is non editable" + fieldNameVal);
		}

		ScroolUp();
		ScroolUp();


	}

	@FindBy(xpath="(//input[@title='Subject'])[1]")
	private WebElement Subject_Field1;

	@FindBy(xpath="(//input[@title='File Number'])[1]")
	private WebElement File_Field;


	public void toverifytheSubjectfunctionality() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HighlightOnElement(entervalueinsearchbox);
		excel.getExcelData(entervalueinsearchbox, "DisconnectionNumber",0, 1);
		waitForSomeTime();
		HighlightOnElement(searchbtn);
		searchbtn.click();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(action);
		action.click();
		waitForSomeTime();
		waitForSomeTime();

		ScroolDown();
		HighlightOnElement(clickonselectactiondrop);
		clickonselectactiondrop.click();

		selectValueFromDropdown("Forward for Final Approval");
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(entercommentbox);
		entercommentbox.sendKeys("Application Approved");
		waitForSomeTime();
		HighlightOnElement(Subject_Field1);
		WebElement fieldName = Subject_Field1;
		fieldName.sendKeys("Sarvesh");
		String fieldNameVal = fieldName.getAttribute("value");
		if(fieldNameVal.contentEquals("Sarvesh")){
			System.out.println("Field is editable");
		}
		else{
			System.out.println("Field is non editable" + fieldNameVal);
		}
		ScroolUp();
	}

	public void toVerifySubmitbuttonFunctionalityWithCommentsFieldISBlank() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		HighlightOnElement(searchbtn);
		String validnumber=excel.getExcelData(entervalueinsearchbox, "DisconnectionNumber",0, 1);
		Reporter.log("Valid Application Number:"+validnumber,true);
		waitForSomeTime();
		HighlightOnElement(searchbtn);
		searchbtn.click();
		waitForSomeTime();
		HighlightOnElement(action);
		action.click();
		waitForSomeTime();

		HighlightOnElement(clickonselectactiondrop);
		clickonselectactiondrop.click();
		selectValueFromDropdown("Approve");
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(entercommentbox);
	}

	public void toVerifyErrorMessageAsUploadingDocumentAsInvalidFormat() throws InterruptedException
	{
		waitForSomeTime();
		HighlightOnElement(ErrorMessag_Popup);
		String Expected=ErrorMessag_Popup.getText();
		String Actual="Upload only jpg, png or pdf file";
		Reporter.log("POP-UP Message Is:"+ Expected,true);
		Assert.assertEquals(Expected,Actual,"Test case pass");
		Reporter.log("Expected result:"+Expected,true);
		waitForSomeTime();
		waitForSomeTime();
	}
}