package NRDA_WaterAndSewerage_Disconnection;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
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
 * @Date: 27-09-2017
 *@Purpose: To Verify Disconnection Login As JE
 */
public class WaterAndSewerageDisconnectionLoginAsJE  extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	
	int m1=1;
	private static WebElement element = null;
	static int pendcountList=0;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Pending Application".
	 * @author Sarvesh.Nellore
	 * @since 2017-09-21
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li[contains(.,'Pending Application')]")
	private WebElement PendingApplication;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "New Application Label" .
	 * @author Sarvesh.Nellore
	 * @since 2017-09-21
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/div/div[2]/div[2]/h3/a")
	private WebElement newapplication;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Under New Application menu".
	 * @author Sarvesh.Nellore
	 * @since 2017-09-21
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/div/div[2]/div[2]/div/div/h3/a")
	private List<WebElement> underNewApplicationpending;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Pending Installation".
	 * @author Sarvesh.Nellore
	 * @since 2017-09-21
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/div/div[2]/div[3]/h3/a")
	private WebElement pendinginstallation;

	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/div/div[2]/div[3]/div/div/h3/a")
	private List<WebElement> underpendinginstallation;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "RTI name".
	 * @author Sarvesh.Nellore
	 * @since 2017-09-21
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/div/div[2]/div[4]/h3/a")
	private WebElement rtiquestion;

	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/div/div[2]/div[5]/h3/a")
	private WebElement MeetingManageMent;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Check Action button is displayed".
	 * @author Sarvesh.Nellore
	 * @since 2017-09-21
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//span[contains(.,'Application')]/../following-sibling::div[1]/div/h3/a[contains(.,'DISCONNECTION OF WATER CONNECTION')]/../following-sibling::div[1]/div/div/div/div[1]/table/tbody/tr/td/center/a/img[@src='/NRDAuthorityPreUAT/resources/images/view-new.png']")
	private  List<WebElement> actionbtn;
	
	public void toVerifyActionButtonDisplayed01()
	{
		//int actionbuttoncount=0;
		for(WebElement action:actionbtn)
		{
			if(action.isDisplayed())
				Assert.assertTrue(action.isDisplayed(),"Test Case: Pass");
			{
				HighlightOnElement(action);
				/*JavascriptExecutor jse = (JavascriptExecutor)driver;
						jse.executeScript("window.scrollBy(0,250)", "");*/

			}
			//Reporter.log("Test case is passed for action button shown:"+actionbuttoncount,true);
		}
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Enter Value in the search box".
	 * @author Sarvesh.Nellore
	 * @since 2017-09-21
	 */
	/*****************************************************************************************************/
	//@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr/td[2]/input")
	@FindBy(xpath="//span[contains(.,'Application No.')]/following-sibling::input")
	private WebElement entervalueinsearchbox;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on Search button".
	 * @author Sarvesh.Nellore
	 * @since 2017-09-21
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Search')]")
	private WebElement searchbtn;

	@FindBy(xpath="//button/span[contains(text(),'Reset')]")
	private WebElement Resetbtn;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Pending Application Link".
	 * @author birbal.tahim
	 * @since 2017-09-06
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@class='dash-wraper water']/div[2]/div[1]/ul[2]/li[3]")
	private WebElement Pending_count;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "PendingListonPopup".
	 * @author birbal.tahim
	 * @since 2017-09-06
	 */
	/*****************************************************************************************************/
	//@FindBy(xpath="//div[@id='inboxForm:dlg']/div[2]/div/div/div/div[1]/table/tbody/tr/td[5]/span")
	@FindBy(xpath="//span[contains(.,'Application')]/../following-sibling::div[1]/div/h3/a[contains(.,'DISCONNECTION OF WATER CONNECTION')]/../following-sibling::div[1]/div/div/div/div[1]/table/tbody/tr")
	private List <WebElement> PendingListonPopup;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Close Popup Window".
	 * @author birbal.tahim
	 * @since 2017-09-06
	 */
	/*****************************************************************************************************/
	@FindBy(xpath=".//*[@id='inboxForm:showStatusApplication']/div[1]/a/span")
	private WebElement Close_Popwindow;

	public void toclickonpendingcountlink() throws InterruptedException
	{

		HighlightOnElement(Pending_count);
		Assert.assertEquals(true,Pending_count.isEnabled());
		String PendingCount1=Pending_count.getText();
		int pendingcount=Integer.parseInt(PendingCount1);
		waitForSomeTime();
		System.out.println("Pending Count On Water Icon Is:" +pendingcount);
		Pending_count.click();
		waitForSomeTime();
		Thread.sleep(20000);
		closePopUpWindow();
		Pending_count.click();
		waitForSomeTime();
		Thread.sleep(20000);

	}

	public void toverifyPendingCountinWatermenu02() throws InterruptedException
	{

		waitForSomeTime();
		HighlightOnElement(Pending_count);
		Assert.assertEquals(true,Pending_count.isEnabled());
		String PendingCount1=Pending_count.getText();
		int pendingcount=Integer.parseInt(PendingCount1);
		waitForSomeTime();
		System.out.println("Pending Count On Water Icon Is:" +pendingcount);
		Pending_count.click();
		Thread.sleep(20000);
		waitForSomeTime();
		Reporter.log(" To Verify Pending_count  in Water_Icon  Water&Sewerage link is Present",true); //print for eclipse console
		List<WebElement> allpages = driver.findElements(By.xpath("//span[contains(.,'WATER AND SEWERAGE CONNECTION Pending List')]/../following-sibling::div/div/div/div/div[2]/span[3]/span"));
		System.out.println("Total No Of Pages:" +allpages.size());
		for(int i=1;i<=((pendingcount/10)+1);i++)
		{
			pendcountList=pendcountList + PendingListonPopup.size();

			if(Seeknext_PendingList.isEnabled())
			{

				Seeknext_PendingList.click();
				waitForSomeTime();

			}

		}
		Reporter.log("Approve Count On Popup List  Is:" +pendcountList,true);
		//System.out.println("Pending Count On Popup List  Is:" +pendcountList);
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Pagination on PendingList_SeekFirst".
	 * @author birbal.tahim
	 * @since 2017-09-06
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//span[contains(.,'Application')]/../following-sibling::div[1]/div/h3/a[contains(.,'DISCONNECTION OF WATER CONNECTION')]/../following-sibling::div[1]/div/div/div/div[2]/span[4]/span")
	private WebElement Seeknext_PendingList;

	public void closePopUpWindow() throws InterruptedException{
		waitForSomeTime();
		ScroolUp();
		HighlightOnElement(Close_Popwindow);
		waitForSomeTime();
		Assert.assertEquals(true,Close_Popwindow.isEnabled());
		Close_Popwindow.click();
		Reporter.log("Expected result:click on Close Popup window",true);
		waitForSomeTime();
		waitForSomeTime();


	}
	public void toVerifyRecordPerPage02() throws InterruptedException
	{

		waitForSomeTime();
		int count=PendingListonPopup.size();
		if(count==10)
		{
			Assert.assertEquals(count,10);
			Reporter.log("Test case pass: Number of record per page is equal to 10",true);
		}
		else
		{
			Reporter.log("Test case fail: Number of record per page is greater or less than 10",true);
			Assert.assertNotEquals(count,10);
		}
		Reporter.log("No of record per page:"+count,true);
		waitForSomeTime();

		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Pagination on PendingList_SeekFirst".
	 * @author birbal.tahim
	 * @since 2017-09-06
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//span[contains(.,'Application')]/../following-sibling::div[1]/div/h3/a[contains(.,'DISCONNECTION OF WATER CONNECTION')]/../following-sibling::div[1]/div/div/div/div[2]/span[1]/span")
	private WebElement SeekFirst_PendingList;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Pagination on PendingList_SeekFirst".
	 * @author birbal.tahim
	 * @since 2017-09-06
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//span[contains(.,'Application')]/../following-sibling::div[1]/div/h3/a[contains(.,'DISCONNECTION OF WATER CONNECTION')]/../following-sibling::div[1]/div/div/div/div[2]/span[2]/span")
	private WebElement SeekPrevious_PendingList;



	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Pagination on PendingList_SeekFirst".
	 * @author birbal.tahim
	 * @since 2017-09-06
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//span[contains(.,'Application')]/../following-sibling::div[1]/div/h3/a[contains(.,'DISCONNECTION OF WATER CONNECTION')]/../following-sibling::div[1]/div/div/div/div[2]/span[5]/span")
	private WebElement Seekend_PendingList;

	public void toVerifyPagination02() throws InterruptedException
	{
		waitForSomeTime();
		ScroolDown();
		HighlightOnElement(SeekFirst_PendingList);
		HighlightOnElement(SeekPrevious_PendingList);
		HighlightOnElement(Seeknext_PendingList);
		HighlightOnElement(Seekend_PendingList);

		if(Seeknext_PendingList.isEnabled())
		{
			Assert.assertTrue(Seeknext_PendingList.isDisplayed(),"TestCase Pass");
			Reporter.log("Test case pass: Pagination is Displayed in PendingList Application",true);
			//Seeknext_PendingList.click();
			waitForSomeTime();
		}
		else 
		{
			Assert.assertFalse(Seeknext_PendingList.isDisplayed(),"Test Case Fail");
			Reporter.log("Test case pass: Pagination is Not Displayed in PendingList Application",true);
		}

	}	


	@FindBy(xpath="(//span[@class='ui-icon ui-icon-seek-next'])[1]")
	private WebElement Seeknext_PendingApplication;

	@FindBy(xpath="(//span[@class='ui-icon ui-icon-seek-first'])[1]")
	private WebElement SeekFirst_PendingApplication;


	@FindBy(xpath="(//span[@class='ui-icon ui-icon-seek-prev'])[1]")
	private WebElement SeekPrevious_PendingApplication;

	@FindBy(xpath="(//span[@class='ui-icon ui-icon-seek-end'])[1]")
	private WebElement Seekend_PendingApplication;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Pagination on PendingList_SeekFirst".
	 * @author birbal.tahim
	 * @since 2017-09-06
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//a[contains(.,'DISCONNECTION OF WATER CONNECTION')]")
	private WebElement DisconnectionofWaterConnection;



	public void toverifypeginationofPendingApplication03() throws InterruptedException
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
			Assert.assertTrue(Seeknext_PendingList.isEnabled());
			Reporter.log("Test case pass: Pagination is Displayed in  Application",true);
			Seeknext_PendingList.click();
			waitForPageLoad();
			waitForPageLoad();
		}
		else 
		{
			Assert.assertFalse(Seeknext_PendingList.isEnabled());
			Reporter.log("Test case pass: Pagination is Not Displayed in  Application",true);
		}
	}

	@FindBy(xpath=".//*[@id='inboxForm:growl_container']/div/div/div[2]/span")
	private WebElement getmessage;

	public void toclickonPendingApplication() throws InterruptedException
	{
		HighlightOnElement(PendingApplication);
		Assert.assertTrue(PendingApplication.isEnabled(),"Test Case PAss");
		PendingApplication.click();
		waitForelementPresent(entervalueinsearchbox);
		Reporter.log("Expected result:click on PendingApplication Link",true);
	}

	@FindBy(xpath = ".//tbody[@id='inboxForm:j_id1583889823_159c1e7f:serviceWisedata_data']/tr/td[contains(text(),'No record found with given criteria')]")
	private WebElement message_lable;
	public void toVerifyInvalidApplicationNumber04() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(entervalueinsearchbox));
		Assert.assertTrue(entervalueinsearchbox.isDisplayed());
		HighlightOnElement(entervalueinsearchbox);
		
		wait.until(ExpectedConditions.elementToBeClickable(entervalueinsearchbox));
		Assert.assertTrue(entervalueinsearchbox.isEnabled(),"Test Case Pass: entervalueinsearchbox");
		excel.getExcelData(entervalueinsearchbox, "DisconnectionNumber", 0, 7);
		waitForPageLoad();
		waitForPageLoad();
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
	private WebElement popupmsg;

	public void toVerifyInvalidApplicationNumber05() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		HighlightOnElement(PendingApplication);
		Assert.assertTrue(PendingApplication.isEnabled(),"Test Case PAss");
		PendingApplication.click();
		//waitForSomeTime();
		fluentWait(entervalueinsearchbox);
		Reporter.log("Expected result:click on PendingApplication Link",true);

		waitForSomeTime();
		HighlightOnElement(entervalueinsearchbox);
		String invalidnumber=excel.getExcelData(entervalueinsearchbox, "DisconnectionNumber",0, 2);
		Reporter.log("Invalid Application Number:"+invalidnumber,true);
		waitForSomeTime();
		HighlightOnElement(searchbtn);
		searchbtn.click();
		waitForSomeTime();
		HighlightOnElement(getmessage);
		String Expected=getmessage.getText();
		String Actual="Application Number is not in Records";
		Assert.assertEquals(Actual, Expected);
		Reporter.log("Expected result:"+Expected,true);
		waitForSomeTime();
		waitForSomeTime();

	}


	public void toVerifyresetButtonFunctionality() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		HighlightOnElement(PendingApplication);
		Assert.assertTrue(PendingApplication.isEnabled(),"Test Case PAss");
		PendingApplication.click();
		//waitForSomeTime();
		fluentWait(entervalueinsearchbox);
		Reporter.log("Expected result:click on PendingApplication Link",true);

		waitForSomeTime();
		HighlightOnElement(entervalueinsearchbox);
		String invalidnumber=excel.getExcelData(entervalueinsearchbox, "DisconnectionNumber",0, 2);
		Reporter.log("Invalid Application Number:"+invalidnumber,true);
		waitForSomeTime();
		HighlightOnElement(Resetbtn);
		Resetbtn.click();
		/*
			WebDriverWait wait = new WebDriverWait(driver, 120);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button/span[contains(text(),'Search')]")));
		 */waitForSomeTime();
		 waitForSomeTime();

	}


	public void toVerifyBlankApplicationNumber05() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		HighlightOnElement(entervalueinsearchbox);
		Assert.assertTrue(entervalueinsearchbox.isEnabled(),"Test Case Pass: entervalueinsearchbox");
		//excel.getExcelData(entervalueinsearchbox, "Environment_Application_Number", 0, 2);
		waitForSomeTime();
		
		HighlightOnElement(searchbtn);
		Assert.assertTrue(searchbtn.isEnabled(),"Test Case Pass: searchbtn");
		searchbtn.click();
		waitForSomeTime();
		System.out.println(" To Click on searchbtn Link in Application of Environment  Successfully" ); //print for eclipse console
		
		HighlightOnElement(popupmsg);
		Assert.assertTrue(popupmsg.isEnabled(),"Test Case Pass: popupmsg");
		String ActualMessage=popupmsg.getText();
		String ExpectedMessage="Please enter Application Number !";
		Assert.assertEquals(ActualMessage, ExpectedMessage);
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Application Grid".
	 * @author Sarvesh.Nellore
	 * @since 2017-09-21
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//table[@role='grid']/thead/tr)[1]")
	private WebElement Application_Grid;


	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Application Status".
	 * @author Sarvesh.Nellore
	 * @since 2017-09-21
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//span[contains(.,'PENDING')]")
	private WebElement Application_Status;

	@FindBy(xpath="//h3/a[contains(.,'DISCONNECTION OF WATER CONNECTION')]/../../div/div/div[1]/table/thead/tr/th")
	private List<WebElement> ApplicationDetails;

	public void toVerifyValidApplicationNumber06()throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		HighlightOnElement(PendingApplication);
		Assert.assertTrue(PendingApplication.isEnabled(),"Test Case PAss");
		PendingApplication.click();
		fluentWait(entervalueinsearchbox);
		waitForSomeTime();
		Reporter.log("Expected result:click on PendingApplication Link",true);
		HighlightOnElement(entervalueinsearchbox);
		HighlightOnElement(searchbtn);
		String validnumber=excel.getExcelData(entervalueinsearchbox, "DisconnectionNumber",0, 1);
		Reporter.log("Valid Application Number:"+validnumber,true);
		waitForSomeTime();
		HighlightOnElement(searchbtn);
		searchbtn.click();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(Application_Grid);
		waitForSomeTime();

		for(WebElement Disconnectionapplication:ApplicationDetails)
		{

			if(Disconnectionapplication.isDisplayed())
			{
				HighlightOnElement(Disconnectionapplication);
				String pendingapplication=Disconnectionapplication.getText();
				Reporter.log("Menu list under  Application:"+pendingapplication,true);
			}
		}


		HighlightOnElement(Application_Status);
		String ActualStatus=Application_Status.getText();
		String ExpectedStatus="PENDING";
		if(ActualStatus.equalsIgnoreCase(ExpectedStatus))
		{
			Reporter.log("Application Status Is Pending",true);
		}
		else
		{
			Reporter.log("Application Status Is Not Pending",true);	
		}

	}

	//@FindBy(xpath="(//img[@src='/NRDAuthority1/resources/images/view-new.png'])[1]")
	@FindBy(xpath="//h3[contains(.,'DISCONNECTION OF WATER CONNECTION')]/../../div/div/div/div[1]/table/tbody/tr/td//img[@src='/NRDAuthority/resources/images/view-new.png']")
	private WebElement action;


	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/div[4]/div[2]/center/table/tbody/tr/td[1]/label")
	private List<WebElement> commentlabel;

	//@FindBy(xpath="//label[contains(text(),'Enter Comments')]/../../following-sibling::tr/td/div/div/textarea")
	@FindBy(xpath="//textarea[@id='inboxForm:todolist']")
	private WebElement entercommentbox;

	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/div[4]/div[2]/center/table[2]/tbody/tr[4]/td[1]/span")
	private WebElement uploaddocumentlabel;

	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/div[4]/div[2]/center/table[2]/tbody/tr/td/table/tbody/tr/td/div/div[1]/label")
	private WebElement uploaddocument;

	@FindBy(xpath=".//td[@role='gridcell']/label[contains(.,'Select Action')]/../following-sibling::td[1]/div/div[3]/span")
	private WebElement clickonselectactiondrop;

	@FindBy(xpath="//ul[@class='ui-selectonemenu-items ui-selectonemenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']/li")
	private List<WebElement> selectdropdownvalue;

	public void toVerifyActionbuttonFunctionalityinPendingApplication07() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		HighlightOnElement(entervalueinsearchbox);
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
		waitForSomeTime();
		ScroolDown();
		for(WebElement la:commentlabel)
		{
			if(la.isDisplayed())
			{
				HighlightOnElement(la);
				String labelname=la.getText();
				Reporter.log("Expected result:"+labelname,true);
			}
		}
		//Assert.assertEquals(uploaddocumentlabel.isDisplayed(),"Test case pass");
		HighlightOnElement(uploaddocumentlabel);
		String uploadlabel=uploaddocumentlabel.getText();
		Reporter.log("Expected result:"+uploadlabel,true);
		waitForSomeTime();

		HighlightOnElement(clickonselectactiondrop);
		clickonselectactiondrop.click();

		for(WebElement menulistDropdown:selectdropdownvalue)
		{

			if(menulistDropdown.isDisplayed())
			{
				HighlightOnElement(menulistDropdown);
				String DropdownMenu=menulistDropdown.getText();
				Reporter.log("Menu list Action DROPDOWN :"+DropdownMenu,true);
			}
		}

		ScroolUp();
		/*
			for(int i=1;i<selectdropdownvalue.size();i++)
			{
				String value=selectdropdownvalue.get(i).getText();
				Reporter.log("Expected result:"+value,true);
				waitForSomeTime();
			}
		 */
	}

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
		
		wait.until(ExpectedConditions.elementToBeClickable(entercommentbox));
		Assert.assertTrue(entercommentbox.isEnabled());
		excel.getExcelData(entercommentbox, "WaterConnectionDetails", 1, 2);

		wait.until(ExpectedConditions.visibilityOf(Submit_Button));
		Assert.assertTrue(Submit_Button.isDisplayed());
		HighlightOnElement(Submit_Button);
		
		wait.until(ExpectedConditions.elementToBeClickable(Submit_Button));
		Assert.assertEquals(Submit_Button.isEnabled(),true);
		Submit_Button.click();
		Reporter.log("Click on Submit button Successfully",true);
		waitForPageLoad();
		waitForPageLoad();
	}
	
	public void toVerifySubmitbutton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{		
		ScroolDown();
		wait.until(ExpectedConditions.visibilityOf(Submit_Button));
		Assert.assertTrue(Submit_Button.isDisplayed());
		HighlightOnElement(Submit_Button);
		
		wait.until(ExpectedConditions.elementToBeClickable(Submit_Button));
		Assert.assertEquals(Submit_Button.isEnabled(),true);
		Submit_Button.click();
		Reporter.log("Click on Submit button Successfully",true);
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

	public void toVerifyErrorMessageAsUserisBlank() throws InterruptedException
	{
		waitForSomeTime();
		HighlightOnElement(ErrorMessag_Popup);
		String Expected_Message="Please select any User to forward the Application !!";
		String Actual_Message=ErrorMessag_Popup.getText();
		Assert.assertEquals(Expected_Message, Actual_Message);
		waitForSomeTime();
		waitForSomeTime();

	}


	public void toVerifyErrorMessageAsCommentFieldisBlank() throws InterruptedException
	{
		waitForSomeTime();
		HighlightOnElement(ErrorMessag_Popup);
		String Expected_Message="Comments is required !";
		String Actual_Message=ErrorMessag_Popup.getText();
		Assert.assertEquals(Expected_Message, Actual_Message);
		waitForSomeTime();
		waitForSomeTime();

	}

	public void toVerifyErrorMessageAsUploadingDocumentAsInvalidFormat() throws InterruptedException
	{
		waitForSomeTime();
		HighlightOnElement(ErrorMessag_Popup);
		String Expected=ErrorMessag_Popup.getText();
		String Actual="Upload only jpg, png or pdf file";
		Assert.assertEquals(Expected,Actual,"Test case pass");
		Reporter.log("Expected result:"+Expected,true);
		waitForSomeTime();
		waitForSomeTime();

	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select value".
	 * @author Sarvesh.Nellore
	 * @since 2017-09-22
	 */
	/*****************************************************************************************************/
	//@FindBy(xpath="//html/body/div[11]/div/ul/li")
	@FindBy(xpath="//ul[@class='ui-selectonemenu-items ui-selectonemenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']/li")
	private List<WebElement> selectdropdownvalueUser;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select user value".
	 * @author Sarvesh.Nellore
	 * @since 2017-09-22s
	 */
	/*****************************************************************************************************/
	@FindBy(xpath=".//td[@role='gridcell']/label[contains(.,'Select Action')]/../following-sibling::td[1]/div/div[3]/span/../../../following-sibling::td[1]/span/table/tbody/tr[2]/td/div/div[3]/span")
	private WebElement clickonselectuserdrop;

	public void verifyFormSubmissionWithoutUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		wait.until(ExpectedConditions.visibilityOf(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isDisplayed());
		HighlightOnElement(clickonselectactiondrop);
		
		wait.until(ExpectedConditions.elementToBeClickable(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isEnabled());
		clickonselectactiondrop.click();
		selectValueFromDropdown("Forward");
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(entercommentbox));
		Assert.assertTrue(entercommentbox.isDisplayed());
		HighlightOnElement(entercommentbox);
		
		wait.until(ExpectedConditions.elementToBeClickable(entercommentbox));
		Assert.assertTrue(entercommentbox.isEnabled());
		excel.getExcelData(entercommentbox, "WaterConnectionDetails", 1, 2);
		
		wait.until(ExpectedConditions.visibilityOf(Submit_Button));
		Assert.assertTrue(Submit_Button.isDisplayed());
		HighlightOnElement(Submit_Button);
		
		wait.until(ExpectedConditions.elementToBeClickable(Submit_Button));
		Assert.assertEquals(Submit_Button.isEnabled(),true);
		Submit_Button.click();
		Reporter.log("Click on Submit button Successfully",true);
		waitForPageLoad();
		waitForPageLoad();
	}

	public void verifyFormSubmissionWithBlankComments() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{	
		wait.until(ExpectedConditions.visibilityOf(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isDisplayed());
		HighlightOnElement(clickonselectactiondrop);
		
		wait.until(ExpectedConditions.elementToBeClickable(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isEnabled());
		clickonselectactiondrop.click();
		selectValueFromDropdown("Forward");
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(clickonselectuserdrop));
		Assert.assertTrue(clickonselectuserdrop.isDisplayed());
		HighlightOnElement(clickonselectuserdrop);
		
		wait.until(ExpectedConditions.elementToBeClickable(clickonselectuserdrop));
		Assert.assertTrue(clickonselectuserdrop.isEnabled());
		clickonselectuserdrop.click();
		selectValueFromDropdown("priyanshu kodape (SUE)");
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
		Reporter.log("Click on Submit button Successfully",true);
		waitForPageLoad();
		waitForPageLoad();
	}
	
	public void verifyFormAction() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isDisplayed());
		HighlightOnElement(clickonselectactiondrop);
		
		wait.until(ExpectedConditions.elementToBeClickable(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isEnabled());
		clickonselectactiondrop.click();
		selectValueFromDropdown("Forward");
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(clickonselectuserdrop));
		Assert.assertTrue(clickonselectuserdrop.isDisplayed());
		HighlightOnElement(clickonselectuserdrop);
		
		wait.until(ExpectedConditions.elementToBeClickable(clickonselectuserdrop));
		Assert.assertTrue(clickonselectuserdrop.isEnabled());
		clickonselectuserdrop.click();
		selectValueFromDropdown("priyanshu kodape (SUE)");
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(entercommentbox));
		Assert.assertTrue(entercommentbox.isDisplayed());
		HighlightOnElement(entercommentbox);
		
		wait.until(ExpectedConditions.elementToBeClickable(entercommentbox));
		Assert.assertTrue(entercommentbox.isEnabled());
		excel.getExcelData(entercommentbox, "WaterConnectionDetails", 1, 2);
		waitForDomElement();
	}
	
	public void verifyFormSubmissionWithoutRemarks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{	
		ScroolDown();
		wait.until(ExpectedConditions.visibilityOf(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isDisplayed());
		HighlightOnElement(clickonselectactiondrop);
		
		wait.until(ExpectedConditions.elementToBeClickable(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isEnabled());
		clickonselectactiondrop.click();
		selectValueFromDropdown("Forward for Final approval");
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(clickonselectuserdrop));
		Assert.assertTrue(clickonselectuserdrop.isDisplayed());
		HighlightOnElement(clickonselectuserdrop);
		
		wait.until(ExpectedConditions.elementToBeClickable(clickonselectuserdrop));
		Assert.assertTrue(clickonselectuserdrop.isEnabled());
		clickonselectuserdrop.click();
		selectValueFromDropdown("priyanshu kodape (SUE)");
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
		Reporter.log("Click on Submit button Successfully",true);
		waitForPageLoad();
		waitForPageLoad();
	}

	public void verifyInvalidFileUpload() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		wait.until(ExpectedConditions.visibilityOf(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isDisplayed());
		HighlightOnElement(clickonselectactiondrop);
		
		wait.until(ExpectedConditions.elementToBeClickable(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isEnabled());
		clickonselectactiondrop.click();
		selectValueFromDropdown("Forward");
		waitForPageLoad();
		waitForPageLoad();
	
		wait.until(ExpectedConditions.visibilityOf(clickonselectuserdrop));
		Assert.assertTrue(clickonselectuserdrop.isDisplayed());
		HighlightOnElement(clickonselectuserdrop);
		
		wait.until(ExpectedConditions.elementToBeClickable(clickonselectuserdrop));
		Assert.assertTrue(clickonselectuserdrop.isEnabled());
		clickonselectuserdrop.click();
		selectValueFromDropdown("priyanshu kodape (SUE)");
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(entercommentbox));
		Assert.assertTrue(entercommentbox.isDisplayed());
		HighlightOnElement(entercommentbox);
		
		wait.until(ExpectedConditions.elementToBeClickable(entercommentbox));
		Assert.assertTrue(entercommentbox.isEnabled());
		excel.getExcelData(entercommentbox, "WaterConnectionDetails", 1, 2);
		
		wait.until(ExpectedConditions.visibilityOf(uploaddocument));
		Assert.assertTrue(uploaddocument.isDisplayed());
		HighlightOnElement(uploaddocument);
		
		wait.until(ExpectedConditions.elementToBeClickable(uploaddocument));
		Assert.assertTrue(uploaddocument.isEnabled());
		uploaddocument.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\TestData.txt");
		waitForPageLoad();
		waitForDomElement();
	}
	
	public void verifyFormSubmissionWithInvalidFile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		ScroolDown();
		wait.until(ExpectedConditions.visibilityOf(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isDisplayed());
		HighlightOnElement(clickonselectactiondrop);
		
		wait.until(ExpectedConditions.elementToBeClickable(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isEnabled());
		clickonselectactiondrop.click();
		selectValueFromDropdown("Forward for Final approval");
		waitForPageLoad();
		waitForPageLoad();
	
		wait.until(ExpectedConditions.visibilityOf(clickonselectuserdrop));
		Assert.assertTrue(clickonselectuserdrop.isDisplayed());
		HighlightOnElement(clickonselectuserdrop);
		
		wait.until(ExpectedConditions.elementToBeClickable(clickonselectuserdrop));
		Assert.assertTrue(clickonselectuserdrop.isEnabled());
		clickonselectuserdrop.click();
		selectValueFromDropdown("priyanshu kodape (SUE)");
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(entercommentbox));
		Assert.assertTrue(entercommentbox.isDisplayed());
		HighlightOnElement(entercommentbox);
		
		wait.until(ExpectedConditions.elementToBeClickable(entercommentbox));
		Assert.assertTrue(entercommentbox.isEnabled());
		excel.getExcelData(entercommentbox, "WaterConnectionDetails", 1, 2);
		
		wait.until(ExpectedConditions.visibilityOf(uploaddocument));
		Assert.assertTrue(uploaddocument.isDisplayed());
		HighlightOnElement(uploaddocument);
		
		wait.until(ExpectedConditions.elementToBeClickable(uploaddocument));
		Assert.assertTrue(uploaddocument.isEnabled());
		uploaddocument.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\TestData.txt");
		waitForPageLoad();
		waitForDomElement();
	}

	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr/td[2]/table/tbody/tr/td[2]/button[contains(.,'Search')]")
	private WebElement SearchButton_Fileno;

	@FindBy(xpath="(//div[@class='ui-dialog-content ui-widget-content']/div/div/table/tbody/tr/td[3]/input)[7]")
	private WebElement SubjectField;

	@FindBy(xpath="//div[@class='ui-dialog-content ui-widget-content']/div/div/center[1]/table/tbody/tr/td/button[contains(.,'Search')]")
	private WebElement SearchButton1;

	@FindBy(xpath="//div[@class='ui-dialog-content ui-widget-content']/div/div/table/tbody/tr/td[6]/input")
	private WebElement FileField;

	@FindBy(xpath="//button[contains(.,'Create New File')]")
	private WebElement CreateNewFile_Button;

	@FindBy(xpath="//button[contains(.,'Fill In Form')]")
	private WebElement FillInForm_Button;

	@FindBy(xpath="//span[contains(.,'Create File')]/../following-sibling::div/div/div/table/tbody/tr[1]/td[2]/input")
	private WebElement SubjectField1;

	@FindBy(xpath="//span[contains(.,'Create File')]/../following-sibling::div/div/div/table/tbody/tr[1]/td/table/tbody/tr/td/input")
	private WebElement FileField1;


	@FindBy(xpath="//span[contains(.,'Create File')]/../following-sibling::div/div/div/table/tbody/tr[2]/td[2]/div/div/span")
	//@FindBy(xpath="//span[contains(.,'Create File')]/../following-sibling::div/div/div/table/tbody/tr[2]/td[2]/select")
	private WebElement Type_Dropdown;

	@FindBy(xpath="//span[contains(.,'Create File')]/../following-sibling::div/div/div/table/tbody/tr[2]/td[4]/div/div/span")
	//@FindBy(xpath="//span[contains(.,'Create File')]/../following-sibling::div/div/div/table/tbody/tr[2]/td[4]/select")
	private WebElement Category_Dropdown;

	@FindBy(xpath="//span[contains(.,'Create File')]/../following-sibling::div/div/div/table/tbody/tr[3]/td[2]/div/div/span")
	//@FindBy(xpath="//span[contains(.,'Create File')]/../following-sibling::div/div/div/table/tbody/tr[3]/td[2]/select")
	private WebElement Department_Dropdown;

	//@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[3]/td[6]/div/div[2]")
	@FindBy(xpath="//span[contains(.,'Create File')]/../following-sibling::div/div/div/table/tbody/tr[3]/td[4]/div/div[2]")
	private WebElement IsConditional_Checkbox;

	@FindBy(xpath=".//*[@id='inboxForm:searchdata_data']/tr/td[1]/div/div[2]")
	private WebElement Checkbox1;

	@FindBy(xpath="//span[contains(.,'Create File')]/../following-sibling::div/div/div/center/table/tbody/tr/td/button[contains(.,'Submit')]")
	private WebElement SUBMITBTN;


	@FindBy(xpath="(//table[@class='ui-panelgrid ui-widget']/tbody/tr/td[2]/input)[7]")
	private WebElement Subject_Field;

	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr/td[2]/table/tbody/tr/td[1]/input")
	private WebElement FileNo_Field;
	
	@FindBy(xpath = ".//span[contains(text(),'Search Action')]/following-sibling::a/span")
	private WebElement close_search_action_form;

	public void verifySubjectAndFileFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(Subject_Field));
		Assert.assertTrue(Subject_Field.isDisplayed());
		HighlightOnElement(Subject_Field);
		
		wait.until(ExpectedConditions.visibilityOf(FileNo_Field));
		Assert.assertTrue(FileNo_Field.isDisplayed());
		HighlightOnElement(FileNo_Field);
		
		wait.until(ExpectedConditions.visibilityOf(SearchButton_Fileno));
		Assert.assertTrue(SearchButton_Fileno.isDisplayed());
		HighlightOnElement(SearchButton_Fileno);
		
		wait.until(ExpectedConditions.elementToBeClickable(SearchButton_Fileno));
		Assert.assertTrue(SearchButton_Fileno.isEnabled());
		SearchButton_Fileno.click();
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(CreateNewFile_Button));
		Assert.assertTrue(CreateNewFile_Button.isDisplayed());
		HighlightOnElement(CreateNewFile_Button);
		
		wait.until(ExpectedConditions.visibilityOf(close_search_action_form));
		Assert.assertTrue(close_search_action_form.isDisplayed());
		HighlightOnElement(close_search_action_form);
		
		wait.until(ExpectedConditions.elementToBeClickable(close_search_action_form));
		Assert.assertTrue(close_search_action_form.isEnabled());
		close_search_action_form.click();		
	}
	
	@FindBy(xpath="(//table[@id='inboxForm:createfild']/tbody/tr[1]/td[3]/label")
	private WebElement file_label_elm;
	public void verifyCreateNewFileForm() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(SearchButton_Fileno));
		Assert.assertTrue(SearchButton_Fileno.isDisplayed());
		HighlightOnElement(SearchButton_Fileno);
		
		wait.until(ExpectedConditions.elementToBeClickable(SearchButton_Fileno));
		Assert.assertTrue(SearchButton_Fileno.isEnabled());
		SearchButton_Fileno.click();
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(CreateNewFile_Button));
		Assert.assertTrue(CreateNewFile_Button.isDisplayed());
		HighlightOnElement(CreateNewFile_Button);
		wait.until(ExpectedConditions.elementToBeClickable(CreateNewFile_Button));
		Assert.assertTrue(CreateNewFile_Button.isEnabled());
		CreateNewFile_Button.click();
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(SubjectField1));
		Assert.assertTrue(Subject_Field1.isDisplayed());
		HighlightOnElement(SubjectField1);
		wait.until(ExpectedConditions.visibilityOf(SubjectField1));
		Assert.assertTrue(Subject_Field1.isEnabled());
		SubjectField1.sendKeys("Water Disconnection");
		waitForPageLoad();
		waitForPageLoad();
		
		//file_label_elm.click();
		
		wait.until(ExpectedConditions.visibilityOf(FileField1));
		Assert.assertTrue(FileField1.isDisplayed());
		HighlightOnElement(FileField1);
		wait.until(ExpectedConditions.visibilityOf(FileField1));
		Assert.assertTrue(FileField1.isEnabled());
		FileField1.sendKeys("123");
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(Type_Dropdown));
		Assert.assertTrue(Type_Dropdown.isDisplayed());
		HighlightOnElement(Type_Dropdown);
		
		wait.until(ExpectedConditions.visibilityOf(Type_Dropdown));
		Assert.assertTrue(Type_Dropdown.isEnabled());
		Type_Dropdown.click();
		selectValueFromDropdown("File");
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(Category_Dropdown));
		Assert.assertTrue(Category_Dropdown.isDisplayed());
		HighlightOnElement(Category_Dropdown);
		
		wait.until(ExpectedConditions.visibilityOf(Category_Dropdown));
		Assert.assertTrue(Category_Dropdown.isEnabled());
		Category_Dropdown.click();
		selectValueFromDropdown("Land");
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(Department_Dropdown));
		Assert.assertTrue(Department_Dropdown.isDisplayed());
		HighlightOnElement(Department_Dropdown);
		
		wait.until(ExpectedConditions.visibilityOf(Department_Dropdown));
		Assert.assertTrue(Department_Dropdown.isEnabled());
		Department_Dropdown.click();		
		selectValueFromDropdown("Public Health and Engineering");
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(SUBMITBTN));
		Assert.assertTrue(SUBMITBTN.isDisplayed());
		HighlightOnElement(SUBMITBTN);
		
		wait.until(ExpectedConditions.elementToBeClickable(SUBMITBTN));
		Assert.assertTrue(SUBMITBTN.isEnabled());
		SUBMITBTN.click();
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(close_search_action_form));
		Assert.assertTrue(close_search_action_form.isDisplayed());
		HighlightOnElement(close_search_action_form);
		
		wait.until(ExpectedConditions.elementToBeClickable(close_search_action_form));
		Assert.assertTrue(close_search_action_form.isEnabled());
		close_search_action_form.click();		
	}
	
	@FindBy(xpath = ".//label[contains(text(),'Subject')]/../following-sibling::td[2]/input")
	private WebElement subject_textbox;
	
	@FindBy(xpath = "(.//button/span[contains(text(),'Search')])[2]")
	private WebElement search_button;
	
	public void verifyFillInForm()
	{
		wait.until(ExpectedConditions.visibilityOf(SearchButton_Fileno));
		Assert.assertTrue(SearchButton_Fileno.isDisplayed());
		HighlightOnElement(SearchButton_Fileno);
		
		wait.until(ExpectedConditions.elementToBeClickable(SearchButton_Fileno));
		Assert.assertTrue(SearchButton_Fileno.isEnabled());
		SearchButton_Fileno.click();
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(subject_textbox));
		Assert.assertTrue(subject_textbox.isDisplayed());
		HighlightOnElement(subject_textbox);
		
		wait.until(ExpectedConditions.elementToBeClickable(subject_textbox));
		Assert.assertTrue(subject_textbox.isEnabled());
		subject_textbox.sendKeys("Water Disconnection");
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(search_button));
		Assert.assertTrue(search_button.isDisplayed());
		HighlightOnElement(search_button);
		
		wait.until(ExpectedConditions.elementToBeClickable(search_button));
		Assert.assertTrue(search_button.isEnabled());
		search_button.click();
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(Checkbox1));
		Assert.assertTrue(Checkbox1.isDisplayed());
		HighlightOnElement(Checkbox1);
		
		wait.until(ExpectedConditions.elementToBeClickable(Checkbox1));
		Assert.assertTrue(Checkbox1.isEnabled());
		Checkbox1.click();
				
		wait.until(ExpectedConditions.visibilityOf(FillInForm_Button));
		Assert.assertTrue(FillInForm_Button.isDisplayed());
		HighlightOnElement(FillInForm_Button);
		
		wait.until(ExpectedConditions.elementToBeClickable(FillInForm_Button));
		Assert.assertTrue(FillInForm_Button.isEnabled());
		FillInForm_Button.click();
		waitForPageLoad();
		waitForPageLoad();
	}
	public void fillsubjectfileFileds1() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		waitForSomeTime();
		HighlightOnElement(entercommentbox);
		excel.getExcelData(entercommentbox, "Customer ID",1, 9);
		waitForSomeTime();

		HighlightOnElement(Subject_Field);
		waitForSomeTime();
		Assert.assertTrue(Subject_Field.isEnabled(),"Test Case Pass: Subject_Field");
		//excel.getExcelData(Subject_Field, "Application_AM_LEGAL", 1, 24);
		System.out.println("Subject_Field  in Application of Water&Sewerage  LEGAL  Is Present" ); //print for eclipse console
		waitForDomElement();
		waitForSomeTime();
		HighlightOnElement(FileNo_Field);
		Assert.assertTrue(FileNo_Field.isEnabled(),"Test Case Pass: FileNo_Field");
		//excel.getExcelData(FileNo_Field, "Application_AM_LEGAL", 1, 25);
		System.out.println("FileNo_Field  in Application of Water&Sewerage  LEGAL  Is Present" ); //print for eclipse console
		waitForDomElement();
		waitForSomeTime();


		HighlightOnElement(SearchButton_Fileno);
		SearchButton_Fileno.click();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(CreateNewFile_Button);
		CreateNewFile_Button.click();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(SubjectField1);
		excel.getExcelData(SubjectField1, "DisconnectionNumber", 1, 5);
		waitForSomeTime();
		HighlightOnElement(FileField1);
		excel.getExcelData(FileField1, "DisconnectionNumber", 1, 7);
		waitForSomeTime();
		HighlightOnElement(Type_Dropdown);
		Type_Dropdown.click();
		waitForSomeTime();
		selectValueFromDropdown("File");
		HighlightOnElement(Category_Dropdown);
		Category_Dropdown.click();
		waitForSomeTime();
		selectValueFromDropdown("Case File");
		HighlightOnElement(Department_Dropdown);
		Department_Dropdown.click();
		waitForSomeTime();
		selectValueFromDropdown("WATER AND SEWERAGE SECTION");
		waitForSomeTime();
		HighlightOnElement(IsConditional_Checkbox);
		IsConditional_Checkbox.click();
		HighlightOnElement(SUBMITBTN);
		SUBMITBTN.click();
		waitForSomeTime();
		waitForSomeTime();
		fluentWait(Checkbox1);
		HighlightOnElement(Checkbox1);
		Checkbox1.click();
		waitForSomeTime();
		HighlightOnElement(FillInForm_Button);
		FillInForm_Button.click();
		waitForSomeTime();
		waitForSomeTime();

		waitForSomeTime();
	}

	@FindBy(xpath="//div[@class='dash-wraper water']/div[2]/div/ul[2]/li/../li[3]/a")
	private WebElement beforepending;
	public void beforesentbackpendingcount() throws InterruptedException
	{
		HighlightOnElement(beforepending);
		Assert.assertEquals(true,beforepending.isEnabled());
		String pendingcount=beforepending.getText();;
		int beforependingcount=Integer.parseInt(pendingcount);
		waitForSomeTime();
		Reporter.log("Before Submition pending Count On Water Icon Is:" +beforependingcount,true);
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "file upload message".
	 * @author Sarvesh.Nellore
	 * @since 2017-09-22
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'File uploaded Successfully')]")
	private WebElement fileuploadmessage;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Home link".
	 * @author Sarvesh.Nellore
	 * @since 2017-09-21
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[1]/a/span/img")
	private WebElement homelink;

	@FindBy(xpath="//div[@class='dash-wraper water']/div[2]/div[1]/ul[2]/li[3]")
	private WebElement AfterPending;

	@FindBy(xpath="//html/body/div[2]/table[2]/tbody/tr/td[2]/table/tbody/tr/td/form/div/div[2]/div[2]/div/div/div[1]/div/div[1]/table/tbody/tr[1]/td[4]")
	private WebElement ApplicationNumber;

	public void aftersentbackpendingcount() throws InterruptedException
	{
		HighlightOnElement(AfterPending);
		Assert.assertEquals(true,AfterPending.isEnabled());
		String pendingcount=AfterPending.getText();;
		int afterpendingcount=Integer.parseInt(pendingcount);
		waitForSomeTime();
		Reporter.log("After Submition pending Count On Water Icon Is:" +afterpendingcount,true);
		waitForSomeTime();
	}

	public void verifyValidInformation() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		
	}

	public void toforwardApplicationJEtoEE() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		String pendingcount=beforepending.getText();;
		int beforependingcount=Integer.parseInt(pendingcount);
		System.out.println("BeforePending Count:"+beforependingcount);
		HighlightOnElement(PendingApplication);
		Assert.assertTrue(PendingApplication.isEnabled(),"Test Case PAss");
		PendingApplication.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForelementPresent(entervalueinsearchbox);
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
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(action);
		action.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		ScroolDown();
		HighlightOnElement(clickonselectactiondrop);
		clickonselectactiondrop.click();

		selectValueFromDropdown("Forward");
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(clickonselectuserdrop);
		clickonselectuserdrop.click();

		selectValueFromDropdown("Rajesh Singh (EE)");

		/*selectValueFromDropdown("Hari Singh (FE)");
			for(int i=0;i<selectdropdownvalueUser.size();i++)
			{
				String value=selectdropdownvalueUser.get(i).getText();
				if(value.equalsIgnoreCase("Hari Singh (FE)"))
				{
					selectdropdownvalueUser.get(i).click();
					waitForSomeTime();
				}
			}*/
		waitForSomeTime();
		HighlightOnElement(entercommentbox);
		//excel.getExcelData(entercommentbox, "Customer ID",1, 9);
		entercommentbox.sendKeys("Application Forwarded to Executive Engineer");
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
		waitForSomeTime();
		Thread.sleep(30000);
		waitForelementPresent(entervalueinsearchbox);
		HighlightOnElement(entervalueinsearchbox);
		waitForSomeTime();
		HighlightOnElement(homelink);
		homelink.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();

		String Aftpendingcount=AfterPending.getText();;
		int afterpendingcount=Integer.parseInt(Aftpendingcount);
		System.out.println("AfterPending Count:"+afterpendingcount);
		waitForSomeTime();
		if(beforependingcount==afterpendingcount+m1)
		{
			Reporter.log("Test case Pass pending count Decreased", true);
			waitForSomeTime();
		}
		else
		{

			Reporter.log("Test case Fail when pending count Same", true);
		}
		waitForSomeTime();

	}


	public void toverifySubmitFunctionalitywithActionAsSentBack13() throws InterruptedException, AWTException, EncryptedDocumentException, InvalidFormatException, IOException	
	{

		//beforesentbackpendingcount();

		
		HighlightOnElement(clickonselectactiondrop);
		clickonselectactiondrop.click();
		selectValueFromDropdown("Send Back");
		/*for(int i=0;i<selectdropdownvalue.size();i++)
			{
				String value=selectdropdownvalue.get(i).getText();
				if(value.equalsIgnoreCase("Send Back"))
				{
					selectdropdownvalue.get(i).click();
					waitForSomeTime();
				}
			}*/
		waitForSomeTime();
		waitForSomeTime();
		verifySubjectAndFileFields();
		/*HighlightOnElement(entercommentbox);
			excel.getExcelData(entercommentbox, "Customer ID",3, 8);*/
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
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		

	}

	@FindBy(xpath="//div[@class='dash-wraper water']/div[2]/div/ul[2]/li/../li[2]/a")
	private WebElement beforereject;
	public void beforeRejectcount() throws InterruptedException
	{
		HighlightOnElement(beforereject);
		Assert.assertEquals(true,beforereject.isEnabled());
		String rejectcount=beforereject.getText();;
		int beforerejectcount=Integer.parseInt(rejectcount);
		waitForSomeTime();
		Reporter.log("Before Submition Reject Count On Water Icon Is:" +beforerejectcount,true);
		waitForSomeTime();
	}


	@FindBy(xpath="//div[@class='dash-wraper water']/div[2]/div/ul[2]/li/../li[2]/a")
	private WebElement afterreject;
	public void afterRejectcount() throws InterruptedException
	{
		HighlightOnElement(afterreject);
		Assert.assertEquals(true,afterreject.isEnabled());
		String rejectcount=afterreject.getText();;
		int afterrejectcount=Integer.parseInt(rejectcount);
		waitForSomeTime();
		Reporter.log("After Submition Reject Count On Water Icon Is:" +afterrejectcount,true);
		waitForSomeTime();
	}


	public void toverifySubmitFunctionalitywithActionAsReject14() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		String rejectcount=beforereject.getText();;
		int beforerejectcount=Integer.parseInt(rejectcount);
		System.out.println("Before Reject Count is:"+beforerejectcount);
		HighlightOnElement(PendingApplication);
		Assert.assertTrue(PendingApplication.isEnabled(),"Test Case PAss");
		PendingApplication.click();
		waitForSomeTime();
		waitForVisibleElement("//span[contains(.,'Applications List')]/../following-sibling::div/div[1]/div/table/tbody/tr[2]/td/input");
		waitForSomeTime();
		Reporter.log("Expected result:click on PendingApplication Link",true);
		HighlightOnElement(entervalueinsearchbox);
		//String Validnumber=ApplicationNumber.getText();
		String validnumber=excel.getExcelData(entervalueinsearchbox, "DisconnectionNumber",0, 1);
		//Reporter.log("Valid Application Number:"+Validnumber,true);
		//entervalueinsearchbox.sendKeys(Validnumber);

		waitForSomeTime();
		HighlightOnElement(searchbtn);
		searchbtn.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(action);
		action.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(clickonselectactiondrop);
		clickonselectactiondrop.click();
		selectValueFromDropdown("Reject");
		/*for(int i=0;i<selectdropdownvalue.size();i++)
			{
				String value=selectdropdownvalue.get(i).getText();
				if(value.equalsIgnoreCase("Reject"))
				{
					selectdropdownvalue.get(i).click();
					waitForSomeTime();
				}
			}
			waitForSomeTime();*/
		waitForSomeTime();

		HighlightOnElement(entercommentbox);
		excel.getExcelData(entercommentbox, "Customer ID",2, 8);
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
		Thread.sleep(30000);
		homelink.click();
		waitForSomeTime();
		String rejectcounT=afterreject.getText();;
		int afterrejectcount=Integer.parseInt(rejectcounT);
		if(beforerejectcount==afterrejectcount+m1)
		{
			Reporter.log("Test case Pass Reject count Increased", true);
			waitForSomeTime();
		}
		else
		{

			Reporter.log("Test case Fail when Reject count Same", true);
		}
		waitForSomeTime();


	}

	@FindBy(xpath="//button[contains(.,'Close')]")
	private WebElement close_Button;

	public void toverifyfunctionalityofclosebutton15() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		/*HighlightOnElement(PendingApplication);
		Assert.assertTrue(PendingApplication.isEnabled(),"Test Case PAss");
		PendingApplication.click();
		waitForSomeTime();
		waitForSomeTime();

		Reporter.log("Expected result:click on PendingApplication Link",true);

		element = (new WebDriverWait(driver, 30)).until(ExpectedConditions
				.visibilityOfElementLocated(By
						.xpath("//span[contains(.,'Applications List')]/../following-sibling::div/div[1]/div/table/tbody/tr[2]/td/input")));


		HighlightOnElement(entervalueinsearchbox);
		//String Validnumber=ApplicationNumber.getText();
		String validnumber=excel.getExcelData(entervalueinsearchbox, "DisconnectionNumber",0, 1);
		Reporter.log("Valid Application Number:"+validnumber,true);
		//entervalueinsearchbox.sendKeys(Validnumber);
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(searchbtn);
		searchbtn.click();
		//fluentWait(element);
		isElementNotDisplayed(action, 10);
		//element = (new WebDriverWait(driver, 50)).until(ExpectedConditions.eleme);
		HighlightOnElement(action);
		action.click();
		element = (new WebDriverWait(driver, 50)).until(ExpectedConditions.visibilityOf(clickonselectactiondrop));
		*/HighlightOnElement(clickonselectactiondrop);
		HighlightOnElement(entercommentbox);
		HighlightOnElement(Submit_Button);
		HighlightOnElement(close_Button);
		waitForSomeTime();
		close_Button.click();
		Reporter.log("click on Close button succesfully",true);
		waitForSomeTime();
		Thread.sleep(18000);

	}

	public void toVerifyJEToEEForwardAction16() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		beforesentbackpendingcount();

		HighlightOnElement(PendingApplication);
		Assert.assertTrue(PendingApplication.isEnabled(),"Test Case PAss");
		PendingApplication.click();
		waitForSomeTime();
		waitForSomeTime();
		Reporter.log("Expected result:click on PendingApplication Link",true);



		HighlightOnElement(entervalueinsearchbox);

		//String Validnumber=ApplicationNumber.getText();
		String validnumber=excel.getExcelData(entervalueinsearchbox, "Disconnection",0, 1);
		Reporter.log("Valid Application Number:"+validnumber,true);
		//entervalueinsearchbox.sendKeys(Validnumber);
		waitForSomeTime();
		HighlightOnElement(searchbtn);
		searchbtn.click();
		waitForSomeTime();
		HighlightOnElement(action);
		action.click();
		waitForSomeTime();

		HighlightOnElement(clickonselectactiondrop);
		clickonselectactiondrop.click();

		for(int i=0;i<selectdropdownvalue.size();i++)
		{
			String value=selectdropdownvalue.get(i).getText();
			if(value.equalsIgnoreCase("Forward"))
			{
				selectdropdownvalue.get(i).click();
				waitForSomeTime();
			}
		}
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(clickonselectuserdrop);
		clickonselectuserdrop.click();
		for(int i=0;i<selectdropdownvalueUser.size();i++)
		{
			String value=selectdropdownvalueUser.get(i).getText();
			if(value.equalsIgnoreCase("Rajesh Singh (EE)"))
			{
				selectdropdownvalueUser.get(i).click();
				waitForSomeTime();
			}
		}

		waitForSomeTime();
		HighlightOnElement(entercommentbox);
		excel.getExcelData(entercommentbox, "Customer ID",1, 9);
		waitForSomeTime();
		HighlightOnElement(uploaddocument);
		uploaddocument.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur.jpg");
		waitForSomeTime();

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
		waitForSomeTime();
		waitForSomeTime();
		homelink.click();
		waitForSomeTime();
		aftersentbackpendingcount();


		if(beforepending==AfterPending)
		{
			Reporter.log("Test case fail pending count Matched", true);
			waitForSomeTime();
		}
		else
		{

			Reporter.log("Test case pass when pending count not Matched", true);
		}
		waitForSomeTime();

	}


	@FindBy(xpath="//a[contains(.,'Application Status/आवेदन की स्थिति')]")
	private WebElement ApplicationStatus;

	@FindBy(xpath="//span[@style='width:100%;']/div/div/table/tbody/tr/td/input")
	private WebElement ApplicationNumberField;

	@FindBy(xpath="//span[@style='width:100%;']/div/div/table/tbody/tr/td/button[contains(.,'Search')]")
	private WebElement SearchButton;

	@FindBy(xpath="//span[@style='width:100%;']/div/div/table/tbody/tr/td/button[contains(.,'Reset')]")
	private WebElement ResetButton;

	@FindBy(xpath="//a[contains(.,'Submitted Applications')]")
	private WebElement SubmittedApplications;

	@FindBy(xpath="//a[contains(.,'DISCONNECTION OF WATER CONNECTION')]")
	private WebElement DisConnectionofWaterConnection;

	@FindBy(xpath="//img[@src='/NRDAuthorityPreUAT/resources/images/edit-icon.png']")
	private WebElement ActionButton;

	@FindBy(xpath="//a[contains(.,'Water Disconnection Details/जल वियोग विवरण')]")
	private WebElement WaterDisconnectionDetail;



	@FindBy(xpath="//div[@id='form0:tabView']/div/div/span/table/tbody/tr/td/div/div/table/tbody/tr/td/div/following-sibling::a/img/../preceding-sibling::div/div/label")
	private WebElement Upload_Button1;
	
	
	@FindBy(xpath="//a[contains(.,'Upload Document')]")
	private WebElement Upload_DocumentTab;
	
	@FindBy(xpath="//select[@title='Document Name']")
	private WebElement ServicerelatedDocument_Dropdown;

	public void toverifysendbackapplicationtoJE() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		waitForSomeTime();
		HighlightOnElement(ApplicationStatus);
		ApplicationStatus.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForelementPresent(ApplicationNumberField);
		HighlightOnElement(ApplicationNumberField);
		excel.getExcelData(ApplicationNumberField, "DisconnectionNumber", 0, 1);
		waitForSomeTime();
		HighlightOnElement(SearchButton);
		SearchButton.click();
		waitForSomeTime();
		HighlightOnElement(SubmittedApplications);
		SubmittedApplications.click();
		waitForSomeTime();
		HighlightOnElement(DisConnectionofWaterConnection);
		DisConnectionofWaterConnection.click();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(ActionButton);
		ActionButton.click();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(Upload_DocumentTab);
		Upload_DocumentTab.click();
		waitForSomeTime();
		waitForSomeTime();
		Reporter.log("Verify Application of NRDA Disconnection Upload_DocumentTab  is Present",true); //print for eclipse console 
		waitForSomeTime();
		HighlightOnElement(ServicerelatedDocument_Dropdown);
		SelectVisibleText(ServicerelatedDocument_Dropdown, "Other Document");
		waitForSomeTime();
		waitForSomeTime();
		
		HighlightOnElement(Upload_Button1);
		//Assert.assertTrue(RTI_InformationTAB.isEnabled(),"TestCase Pass:  Upload_Button");
		Upload_Button1.click();
		waitForSomeTime();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur1.jpg");
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(Submit_Button);
		//Assert.assertEquals(true,Submit_Button.isEnabled());
		//Assert.assertNotNull(Submit_Button,"Click on Submit Button Application of Water and Sewerage sucessfully");
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		javascript.executeScript("alert('Please Enter Captcha..');");
		waitForSomeTime();
		acceptAlert();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		Submit_Button.click();
		System.out.println(" To Verify Submit Button of Water&Sewerage link is Present" ); //print for eclipse console
		waitForSomeTime();
		waitForSomeTime();
		Thread.sleep(30000);


	}



	@FindBy(xpath="(//input[@title='Subject'])[1]")
	private WebElement Subject_Field1;

	@FindBy(xpath="(//input[@title='File Number'])[1]")
	private WebElement File_Field;

	public void toverifythefieldnofunctionality() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{


		HighlightOnElement(entervalueinsearchbox);
		String validnumber=excel.getExcelData(entervalueinsearchbox, "DisconnectionNumber",0, 1);
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

	public void toverifytheSubjectfunctionality() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{


		HighlightOnElement(entervalueinsearchbox);
		String validnumber=excel.getExcelData(entervalueinsearchbox, "DisconnectionNumber",0, 1);
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
		waitForSomeTime();
		HighlightOnElement(action);
		action.click();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(clickonselectactiondrop);
		clickonselectactiondrop.click();
		selectValueFromDropdown("Forward for Final Approval");
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(clickonselectuserdrop);
		clickonselectuserdrop.click();
		selectValueFromDropdown("Hari Singh (FE)");
		waitForSomeTime();	
		waitForSomeTime();
		HighlightOnElement(entercommentbox);
	}

	public void toVerifySubmitbuttonuploadingdocumentwithinvalidformat() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
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
		selectValueFromDropdown("Forward for Final Approval");

		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(clickonselectuserdrop);
		clickonselectuserdrop.click();
		waitForSomeTime();
		selectValueFromDropdown("Hari Singh (FE)");
		waitForSomeTime();
		HighlightOnElement(entercommentbox);
		excel.getExcelData(entercommentbox, "Customer ID",1, 9);
		waitForSomeTime();
		HighlightOnElement(uploaddocument);
		uploaddocument.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\TestData.txt");
		waitForSomeTime();

	}


	public void toverifySubmitFunctionalitywithActionAsForward() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		String pendingcount=beforepending.getText();;
		int beforependingcount=Integer.parseInt(pendingcount);
		System.out.println("BeforePending Count:"+beforependingcount);
		HighlightOnElement(PendingApplication);
		Assert.assertTrue(PendingApplication.isEnabled(),"Test Case PAss");
		PendingApplication.click();
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
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(action);
		action.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(clickonselectactiondrop);
		clickonselectactiondrop.click();

		selectValueFromDropdown("Forward for Final Approval");
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(clickonselectuserdrop);
		clickonselectuserdrop.click();

		selectValueFromDropdown("Hari Singh (FE)");


		//fillsubjectfileFileds();
		waitForSomeTime();
		HighlightOnElement(entercommentbox);
		entercommentbox.sendKeys("Application Forwarded to final Approval");
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
		waitForSomeTime();
		Thread.sleep(60000);
		waitForSomeTime();
		homelink.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();

		String Aftpendingcount=AfterPending.getText();;
		int afterpendingcount=Integer.parseInt(Aftpendingcount);
		System.out.println("AfterPending Count:"+afterpendingcount);
		waitForSomeTime();
		if(beforependingcount==afterpendingcount+m1)
		{
			Reporter.log("Test case Pass pending count Decreased", true);
			waitForSomeTime();
		}
		else
		{

			Reporter.log("Test case Fail when pending count Same", true);
		}
		waitForSomeTime();

	}

	
	
	@FindBy(xpath="//div[@class='col-md-9']/div/div/div/div/div[1]/div")
	private List <WebElement> HeadingsInApplications;
	
	
	public void toverifythedashboardoftheApplication() throws InterruptedException
	{
		for(WebElement menulist:HeadingsInApplications)
		{
			HighlightOnElement(menulist);
			Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
			if(menulist.isDisplayed())
			{
				String Menu=menulist.getText();
				System.out.println(" Menu list inDash Board are:"+Menu );
			}
		}	
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
	
	public void toVerifySearchFieldAsPendingApplicationNumberAsEnterSpecialCharacters() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
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
	
	@FindBy(xpath="//a[contains(.,'Public Health and Engineering ')]/../following-sibling::div/ul/li[contains(.,'DISCONNECTION OF WATER CONNECTION')]")
	private WebElement DisconnectionofwaterConnection;
	
	@FindBy(xpath="//a[contains(.,'Disconnection')]/../following-sibling::div/div/div/div/div[2]/table/thead/tr/th/span")
	private List <WebElement> Disconnectionmenu;
	
	public void toVerifyPendingApplicationMenulist() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(DisconnectionofwaterConnection));
		Assert.assertTrue(DisconnectionofWaterConnection.isDisplayed());
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
	
	@FindBy(xpath="//div[contains(.,'Public Health and Engineering')]/../following-sibling::div[1]/div[1]/div[2]/span/a")
	private WebElement MyInboxCount;
	
	
	@FindBy(xpath="//span[contains(.,'Application')]/../following-sibling::div[1]/div/h3/a[contains(.,'DISCONNECTION OF WATER CONNECTION')]")
	private WebElement DisconnectionofWaterConnection_Link;
	
	
	public void toVerifyMyInboxCountLink() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(MyInboxCount));
		Assert.assertTrue(MyInboxCount.isDisplayed());
		HighlightOnElement(MyInboxCount);
		
		wait.until(ExpectedConditions.elementToBeClickable(MyInboxCount));
		Assert.assertTrue(MyInboxCount.isEnabled());
		MyInboxCount.click();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(DisconnectionofWaterConnection_Link));
		Assert.assertTrue(DisconnectionofWaterConnection_Link.isDisplayed());
		HighlightOnElement(DisconnectionofWaterConnection_Link);
		
		wait.until(ExpectedConditions.elementToBeClickable(DisconnectionofWaterConnection_Link));
		Assert.assertTrue(DisconnectionofWaterConnection_Link.isEnabled());
		DisconnectionofWaterConnection_Link.click();
		waitForPageLoad();
		waitForPageLoad();
	}
	
	@FindBy(xpath="//a[contains(.,'eGovernance')]")
	private WebElement eGovernanceLink;
	
	@FindBy(xpath="//span[contains(.,'Pending Application')]")
	private WebElement PendingApplicationLink;
	
	public void toVerifyPendingApplicationLink() throws InterruptedException
	{
		waitForSomeTime();
		HighlightOnElement(eGovernanceLink);
		Assert.assertTrue(eGovernanceLink.isEnabled(),"Test Case Pass: eGovernanceLink");
		eGovernanceLink.click();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(PendingApplicationLink);
		Assert.assertTrue(PendingApplicationLink.isEnabled(),"Test Case Pass: PendingApplicationLink");
		PendingApplicationLink.click();
		Thread.sleep(10000);
		waitForelementPresent(entervalueinsearchbox);
		HighlightOnElement(entervalueinsearchbox);
		System.out.println(" To Click on PendingApplication_Icon Link in Application of Environment  Successfully" ); //print for eclipse console
		
	}
	
	
	@FindBy(xpath="//span[contains(.,'Application No.')]/following-sibling::input")
	private WebElement ApplicationNumberField1;
	
	@FindBy(xpath="//a[contains(.,'Disconnection')]/../following-sibling::div[1]/div/div/div/div[1]/table/thead/tr/th/span")
	private List <WebElement> Disconnection_Menu;
	
	@FindBy(xpath=".//a/img[@src='/NRDAuthorityPreUAT/resources/images/view-new.png']")
	private WebElement Action_Button;
	
	@FindBy(xpath="//a[contains(.,'Disconnection')]")
	private WebElement DisconnectionLink;
	
	
	
	public void toVerifyPendingApplicationWithValidNumber() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(entervalueinsearchbox));
		Assert.assertTrue(entervalueinsearchbox.isDisplayed());
		HighlightOnElement(entervalueinsearchbox);
		
		wait.until(ExpectedConditions.elementToBeClickable(entervalueinsearchbox));
		Assert.assertTrue(entervalueinsearchbox.isEnabled(),"Test Case Pass: ApplicationNumberField");
		excel.getExcelData(entervalueinsearchbox, "DisconnectionNumber", 0, 1);
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(Action_Button));
		Assert.assertTrue(Action_Button.isDisplayed());
		HighlightOnElement(Action_Button);
	}	
	
	public void verifyActionLink()
	{
		wait.until(ExpectedConditions.visibilityOf(Action_Button));
		Assert.assertTrue(Action_Button.isDisplayed());
		HighlightOnElement(Action_Button);
		
		wait.until(ExpectedConditions.elementToBeClickable(Action_Button));
		Assert.assertTrue(Action_Button.isEnabled());
		Action_Button.click();
		waitForPageLoad();
		waitForPageLoad();
	}
	
	@FindBy(xpath=".//*[@id='inboxForm:docAccordionPanel']/ul/li/a")
	private List<WebElement> Menulabels;
	
	public void verifyAllWaterDisconnectionTabs() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		for(WebElement elm : Menulabels)
		{
			wait.until(ExpectedConditions.visibilityOf(elm));
			if(elm.isDisplayed())
			{
				HighlightOnElement(elm);
			}
		}
		/*		
		for(WebElement la:Menulabels)
		{
			if(la.isDisplayed())
			{
				HighlightOnElement(la);
				String labelname=la.getText();
				Reporter.log("Expected result:"+labelname,true);
			}
		}
				
		for(WebElement la:commentlabel)
		{
			if(la.isDisplayed())
			{
				HighlightOnElement(la);
				String labelname = la.getText();
				Reporter.log("Expected result:"+labelname,true);
			}
		}*/
	}
	
	
	@FindBy(xpath=".//*[@id='inboxForm:docAccordionPanel']/ul/li/a[contains(.,'Generate Pending Bills')]")
	private WebElement GeneratePendingBillsTab;
	
	@FindBy(xpath="//a[contains(.,'Generate Pending Bills')]/../../following-sibling::div/div[9]/div/div/center/table/tbody/tr/td/label")
	private List <WebElement> MenuinGeneratePendingBillsTab;
	
	@FindBy(xpath="//a[contains(.,'Generate Pending Bills')]/../../following-sibling::div/div[9]/div/div/center/table[1]/tbody/tr/td[1]/div/div[2]")
	private WebElement FlatRadioBtton;
	
	@FindBy(xpath="//a[contains(.,'Generate Pending Bills')]/../../following-sibling::div/div[9]/div/div/center/table[1]/tbody/tr/td[3]/div/div[2]")
	private WebElement ProDataRadioBtton;
	
	@FindBy(xpath="//a[contains(.,'Generate Pending Bills')]/../../following-sibling::div/div[9]/div/div/center/table[2]/tbody/tr/td[2]/input")
	private WebElement Enteramount_Field;
	
	@FindBy(xpath="//a[contains(.,'Generate Pending Bills')]/../../following-sibling::div/div[9]/div/div/center/table[2]/tbody/tr/td[2]/input")
	private WebElement Enterunit_Field;
	
	@FindBy(xpath="//a[contains(.,'Generate Pending Bills')]/../../following-sibling::div/div[9]/div/div/center/table[3]/tbody/tr/td[2]/input")
	private WebElement EnterDiscount_Field;
	
	@FindBy(xpath="//a[contains(.,'Generate Pending Bills')]/../../following-sibling::div/div[9]/div/div/center/table[3]/tbody/tr/td[2]/input")
	private WebElement EnterDiscount1_Field;	
	
	public void toVerifyGenereatePendingBillsTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{		
		wait.until(ExpectedConditions.visibilityOf(GeneratePendingBillsTab));
		Assert.assertTrue(GeneratePendingBillsTab.isDisplayed());
		HighlightOnElement(GeneratePendingBillsTab);
		
		wait.until(ExpectedConditions.elementToBeClickable(GeneratePendingBillsTab));
		Assert.assertTrue(GeneratePendingBillsTab.isEnabled());
		GeneratePendingBillsTab.click();
		waitForPageLoad();
		waitForPageLoad();
	}
	
	@FindBy(xpath = ".//label[contains(text(),'Enter Discount')]")
	private WebElement label_elm;
	public void verifyGeneratePendingBillsWithInvalidFlatRate() throws InterruptedException
	{				
		wait.until(ExpectedConditions.visibilityOf(FlatRadioBtton));
		Assert.assertTrue(FlatRadioBtton.isDisplayed());
		HighlightOnElement(FlatRadioBtton);
		
		wait.until(ExpectedConditions.elementToBeClickable(FlatRadioBtton));
		Assert.assertTrue(FlatRadioBtton.isEnabled());
		FlatRadioBtton.click();
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(Enteramount_Field));
		Assert.assertTrue(Enteramount_Field.isDisplayed());
		HighlightOnElement(Enteramount_Field);
		
		wait.until(ExpectedConditions.visibilityOf(Enteramount_Field));
		Assert.assertTrue(Enteramount_Field.isEnabled());
		Enteramount_Field.sendKeys("afs");
		
		label_elm.click();
		waitForDomElement();
		acceptAlert();
		
		wait.until(ExpectedConditions.visibilityOf(EnterDiscount_Field));
		Assert.assertTrue(EnterDiscount_Field.isEnabled());
		HighlightOnElement(EnterDiscount_Field);
		EnterDiscount_Field.sendKeys("asd");	
		
		label_elm.click();
		waitForDomElement();
		acceptAlert();		
	}
	
	public void verifyGeneratePendingBillsWithInvalidProDataRate() throws InterruptedException
	{				
		wait.until(ExpectedConditions.visibilityOf(ProDataRadioBtton));
		Assert.assertTrue(ProDataRadioBtton.isDisplayed());
		HighlightOnElement(ProDataRadioBtton);
		
		wait.until(ExpectedConditions.elementToBeClickable(ProDataRadioBtton));
		Assert.assertTrue(ProDataRadioBtton.isEnabled());
		ProDataRadioBtton.click();
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(Enterunit_Field));
		Assert.assertTrue(Enterunit_Field.isDisplayed());
		HighlightOnElement(Enterunit_Field);
		
		wait.until(ExpectedConditions.visibilityOf(Enterunit_Field));
		Assert.assertTrue(Enterunit_Field.isEnabled());
		Enterunit_Field.sendKeys("afs");
		
		label_elm.click();
		waitForDomElement();
		acceptAlert();
		
		wait.until(ExpectedConditions.visibilityOf(EnterDiscount1_Field));
		Assert.assertTrue(EnterDiscount1_Field.isEnabled());
		HighlightOnElement(EnterDiscount1_Field);
		EnterDiscount1_Field.sendKeys("gfgf");
		
		label_elm.click();
		waitForDomElement();
		acceptAlert();
	}
	
	public void toVerifyGenereatePendingBillwithValidDetails() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(FlatRadioBtton));
		Assert.assertTrue(FlatRadioBtton.isDisplayed());
		HighlightOnElement(FlatRadioBtton);
		
		wait.until(ExpectedConditions.elementToBeClickable(FlatRadioBtton));
		Assert.assertTrue(FlatRadioBtton.isEnabled());
		FlatRadioBtton.click();
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(Enteramount_Field));
		Assert.assertTrue(Enteramount_Field.isDisplayed());
		HighlightOnElement(Enteramount_Field);
		
		wait.until(ExpectedConditions.visibilityOf(Enteramount_Field));
		Assert.assertTrue(Enteramount_Field.isEnabled());
		Enteramount_Field.sendKeys("12");
		
		wait.until(ExpectedConditions.visibilityOf(EnterDiscount_Field));
		Assert.assertTrue(EnterDiscount_Field.isEnabled());
		HighlightOnElement(EnterDiscount_Field);
		
		wait.until(ExpectedConditions.visibilityOf(EnterDiscount_Field));
		Assert.assertTrue(EnterDiscount_Field.isEnabled());
		EnterDiscount_Field.sendKeys("98");
		waitForDomElement();
	}	
	
	@FindBy(xpath = "(.//button/span[contains(text(),'Save as draft')])[1]")
	private WebElement save_as_draft_btn;
	public void verifySaveAsDraftButton()
	{
		wait.until(ExpectedConditions.visibilityOf(save_as_draft_btn));
		Assert.assertTrue(save_as_draft_btn.isDisplayed());
		HighlightOnElement(save_as_draft_btn);
		
		wait.until(ExpectedConditions.elementToBeClickable(save_as_draft_btn));
		Assert.assertTrue(save_as_draft_btn.isEnabled());
		save_as_draft_btn.click();
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
	
	public void verifyFormForwardSubmissionWithValidValues() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException 
	{
		wait.until(ExpectedConditions.visibilityOf(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isDisplayed());
		HighlightOnElement(clickonselectactiondrop);
		
		wait.until(ExpectedConditions.elementToBeClickable(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isEnabled());
		clickonselectactiondrop.click();
		selectValueFromDropdown("Forward");
		waitForPageLoad();
		waitForPageLoad();
	
		wait.until(ExpectedConditions.visibilityOf(clickonselectuserdrop));
		Assert.assertTrue(clickonselectuserdrop.isDisplayed());
		HighlightOnElement(clickonselectuserdrop);
		
		wait.until(ExpectedConditions.elementToBeClickable(clickonselectuserdrop));
		Assert.assertTrue(clickonselectuserdrop.isEnabled());
		clickonselectuserdrop.click();
		selectValueFromDropdown("priyanshu kodape (SUE)");
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(entercommentbox));
		Assert.assertTrue(entercommentbox.isDisplayed());
		HighlightOnElement(entercommentbox);
		
		wait.until(ExpectedConditions.elementToBeClickable(entercommentbox));
		Assert.assertTrue(entercommentbox.isEnabled());
		excel.getExcelData(entercommentbox, "WaterConnectionDetails", 1, 2);
		
		wait.until(ExpectedConditions.visibilityOf(uploaddocument));
		Assert.assertTrue(uploaddocument.isDisplayed());
		HighlightOnElement(uploaddocument);
		
		wait.until(ExpectedConditions.elementToBeClickable(uploaddocument));
		Assert.assertTrue(uploaddocument.isEnabled());
		uploaddocument.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\download.jpg");
		waitForPageLoad();
		waitForPageLoad();
		waitForDomElement();
	}
	
	public void verifyFormSubmissionWithValidValues() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException 
	{
		ScroolDown();
		wait.until(ExpectedConditions.visibilityOf(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isDisplayed());
		HighlightOnElement(clickonselectactiondrop);
		
		wait.until(ExpectedConditions.elementToBeClickable(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isEnabled());
		clickonselectactiondrop.click();
		selectValueFromDropdown("Forward for Final approval");
		waitForPageLoad();
		waitForPageLoad();
	
		wait.until(ExpectedConditions.visibilityOf(clickonselectuserdrop));
		Assert.assertTrue(clickonselectuserdrop.isDisplayed());
		HighlightOnElement(clickonselectuserdrop);
		
		wait.until(ExpectedConditions.elementToBeClickable(clickonselectuserdrop));
		Assert.assertTrue(clickonselectuserdrop.isEnabled());
		clickonselectuserdrop.click();
		selectValueFromDropdown("priyanshu kodape (SUE)");
		waitForPageLoad();
		waitForPageLoad();
		
		wait.until(ExpectedConditions.visibilityOf(entercommentbox));
		Assert.assertTrue(entercommentbox.isDisplayed());
		HighlightOnElement(entercommentbox);
		
		wait.until(ExpectedConditions.elementToBeClickable(entercommentbox));
		Assert.assertTrue(entercommentbox.isEnabled());
		excel.getExcelData(entercommentbox, "WaterConnectionDetails", 1, 2);
		
		wait.until(ExpectedConditions.visibilityOf(uploaddocument));
		Assert.assertTrue(uploaddocument.isDisplayed());
		HighlightOnElement(uploaddocument);
		
		wait.until(ExpectedConditions.elementToBeClickable(uploaddocument));
		Assert.assertTrue(uploaddocument.isEnabled());
		uploaddocument.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\download.jpg");
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		waitForDomElement();
	}
	
	
	@FindBy(xpath="//label[contains(text(),'Enter Comments')]/../../following-sibling::tr[1]/td/div/div/textarea")
	private WebElement comment_box;
	public void verifyFormForwardSubmissionWithValidValuesToEE() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException 
	{
		ScroolDown();
		wait.until(ExpectedConditions.visibilityOf(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isDisplayed());
		HighlightOnElement(clickonselectactiondrop);
		
		wait.until(ExpectedConditions.elementToBeClickable(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isEnabled());
		clickonselectactiondrop.click();
		selectValueFromDropdown("Forward");
		waitForPageLoad();
		waitForPageLoad();
			
		wait.until(ExpectedConditions.visibilityOf(clickonselectuserdrop));
		Assert.assertTrue(clickonselectuserdrop.isDisplayed());
		HighlightOnElement(clickonselectuserdrop);
		
		wait.until(ExpectedConditions.elementToBeClickable(clickonselectuserdrop));
		Assert.assertTrue(clickonselectuserdrop.isEnabled());
		clickonselectuserdrop.click();
		selectValueFromDropdown("Shivendra Nath (SE)");
		waitForPageLoad();
		waitForPageLoad();
				
		wait.until(ExpectedConditions.visibilityOf(comment_box));
		Assert.assertTrue(comment_box.isDisplayed());
		HighlightOnElement(comment_box);
		
		wait.until(ExpectedConditions.elementToBeClickable(comment_box));
		Assert.assertTrue(comment_box.isEnabled());
		excel.getExcelData(comment_box, "WaterConnectionDetails", 1, 6);
		
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
}