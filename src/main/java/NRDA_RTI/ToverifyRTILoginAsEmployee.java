package NRDA_RTI;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;



import GenericLibrary.ExcelDataDriver;
import GenericLibrary.CommonLibrary;
/**
 * @author Sarvesh.Nellore
 *
 */
public class ToverifyRTILoginAsEmployee extends CommonLibrary 
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");	
	
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Home_Icon"
	 * @author sarvesh.nellore
	 * @Date: 16-08-2017
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="//td[@class='leftCol']/table/tbody/tr[1]/td/form/div/ul/li[1]")
	private WebElement Home_Icon;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "PendingApplication_Icon"
	 * @author sarvesh.nellore
	 * @Date: 21-09-2017
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="//span[contains(text(),'Pending Application')]")
	private WebElement PendingApplication_Icon;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "ApprovceRejectApplication_Icon"
	 * @author sarvesh.nellore
	 * @Date: 21-09-2017
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="//td[@class='leftCol']/table/tbody/tr[1]/td/form/div/ul/li[3]")
	private WebElement ApprovceRejectApplication_Icon;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "ManageWaterReading_Icon"
	 * @author sarvesh.nellore
	 * @Date: 21-09-2017
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="//td[@class='leftCol']/table/tbody/tr[1]/td/form/div/ul/li[4]")
	private WebElement ManageWaterReading_Icon;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "PaymentCollection_Icon"
	 * @author sarvesh.nellore
	 * @Date: 21-09-2017
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="//td[@class='leftCol']/table/tbody/tr[1]/td/form/div/ul/li[11]")
	private WebElement PaymentCollection_Icon;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "MisReports_Icon"
	 * @author sarvesh.nellore
	 * @Date: 21-09-2017
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="//td[@class='leftCol']/table/tbody/tr[1]/td/form/div/ul/li[15]")
	private WebElement MisReports_Icon;

	/****************************************************************************************************/


	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "MisReports_Icon"
	 * @author sarvesh.nellore
	 * @Date: 21-09-2017
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="//td[@class='leftCol']/table/tbody/tr[1]/td/form/div/ul/li[20]")
	private WebElement MeetingManagement_Icon;

	/****************************************************************************************************/

	@FindBy(xpath="//div[@class='col-md-9']/div/div/div/div/div[1]/div")
	 List <WebElement> HeadingsInApplications;

	@FindBy(xpath="//div[@class='ui-panelmenu-panel']/h3/a")
	 List <WebElement> MenuLabels;
	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	 WebElement home;
	
	@FindBy(xpath="//a[contains(text(),'eGovernance')]")
	 WebElement eGovernance;
	
	@FindBy(xpath="//h3[@class='ui-accordion-header ui-helper-reset ui-state-default ui-corner-all']//a[@href='#'][contains(text(),'RTI')]")
	 WebElement RTI_Link;
	
	@FindBy(xpath="//div[@id='inboxForm:j_id2115130985_7443e758:j_id2115130985_7443e7f0_9_paginator_bottom']//span[@class='ui-paginator-next ui-state-default ui-corner-all']")
	 WebElement next;
	
	@FindBy(xpath="//span[@class='ui-paginator-prev ui-state-default ui-corner-all']")
	 WebElement previous;
	
	@FindBy(xpath="//input[@id='inboxForm:j_id2115130985_7443e758:j_id2115130985_7443e7f0_9:j_id2115130985_7443e41a_9:filter']")
	 WebElement Application_no;
	
	@FindBy(xpath="//a[@id='inboxForm:j_id2115130985_7443e758:j_id2115130985_7443e7f0_9:0:j_id2115130985_7443e4a0_9']//img")
	 WebElement Action;
	
	@FindBy(xpath="//button[@id='inboxForm:docAccordionPanel:j_id530723777_9ce692b']")
	 WebElement Print;
	
	@FindBy(xpath="//a[@id='inboxForm:j_id530723777_9ce6d18']")
	 WebElement Application_no1;
	
	@FindBy(xpath="//div[@id='inboxForm:consumerAllDetails']//span[@class='ui-icon ui-icon-closethick']")
	 WebElement close;
	
	@FindBy(xpath="//span[contains(text(),'Close')]")
	 WebElement close1;
	
	@FindBy(xpath="//button[@id='inboxForm:docAccordionPanel:j_id530723777_9ce774c']")
	 WebElement Submit;
	
	@FindBy(xpath=".//*[@id='inboxForm:msg_container']/div/div/div[2]/span")
	 WebElement ErrorMessag_Popup;
	
	@FindBy(xpath="//select[@id='inboxForm:j_id530723777_9ce7184']")
	 WebElement SeltectAction;
	
	@FindBy(xpath="//a[contains(text(),'RTI Information')]")
	 WebElement RTIInfoTab;
	
	@FindBy(xpath="//select[@id='inboxForm:docAccordionPanel:val0']")
	 WebElement officer;
	
	@FindBy(xpath="//textarea[@id='inboxForm:docAccordionPanel:j_id530723777_9ce7696']")
	 WebElement enteranswertbox;
	
	@FindBy(xpath="//label[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left fileinput-button']")
	private WebElement Upload_Button1;
	
	public void toverifythefunctionalityofhomelink() throws InterruptedException
	 {
		//waitForPageLoad(driver,eGovernance);
		HighlightOnElement(home);
		Assert.assertTrue(home.isEnabled(),"TestCase Pass:home");
		Reporter.log(" To Verify home Link is Present",true); //print for eclipse console
		home.click();
		waitForSomeTime();
	 }
	
	public void toVerifyMenuFieldsonDashBoard_SC_09_TC02() throws InterruptedException
	{
		try
		{
			waitForSomeTime();
			for(WebElement menulist:HeadingsInApplications)
			{
				HighlightOnElement(menulist);
				Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
				if(menulist.isDisplayed())
				{
					String Menu=menulist.getText();
					Reporter.log(" Menu list inDash Board are:"+Menu,true);
				}

			}
			
			waitForSomeTime();
			for(WebElement menulist:MenuLabels)
			{
				HighlightOnElement(menulist);
				Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
				if(menulist.isDisplayed())
				{
					String Menu=menulist.getText();
					Reporter.log(" Menu list inDash Board are:"+Menu,true );
				}

			}

		}

		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	public void toverifythefunctionalityofeGovernance() throws InterruptedException
	 {
		//waitForPageLoad(driver,eGovernance);
		HighlightOnElement(eGovernance);
		Assert.assertTrue(eGovernance.isEnabled(),"TestCase Pass:eGovernance");
		Reporter.log(" To Verify eGovernance Link Present",true); //print for eclipse console
		eGovernance.click();
		waitForSomeTime();
	 }
	
	public void toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07() throws InterruptedException
	 {
		waitForPageLoad(driver,PendingApplication_Icon);
		HighlightOnElement(PendingApplication_Icon);
		Assert.assertTrue(PendingApplication_Icon.isEnabled(),"TestCase Pass:PendingApplication_Icon ");
		Reporter.log(" To Verify PendingApplication_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
		PendingApplication_Icon.click();
		waitForSomeTime();
	}
	public void toverifytheRTIlink() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		waitForSomeTime();
		waitForPageLoad(driver,RTI_Link);
		HighlightOnElement(RTI_Link);
		Assert.assertTrue(RTI_Link.isEnabled(),"TestCase Pass:RTI_Link ");
		Reporter.log(" To Verify RTI link is Present",true); //print for eclipse console
		RTI_Link.click();
	}
	public void toverifyPagination() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		waitForSomeTime();
		waitForPageLoad(driver,next);
		HighlightOnElement(next);
		Assert.assertTrue(next.isEnabled(),"TestCase Pass:next ");
		next.click();
		waitForSomeTime();waitForSomeTime();
		HighlightOnElement(previous);
		Assert.assertTrue(previous.isEnabled(),"TestCase Pass:previous");
		previous.click();
		Reporter.log(" To Verify Pagination is Present",true); //print for eclipse console
	}
	public void toverifysearchapplication() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		waitForSomeTime();
		waitForPageLoad(driver,Application_no);
		HighlightOnElement(Application_no);
		Assert.assertTrue(Application_no.isEnabled(),"TestCase Pass:Application_no ");
		Reporter.log(" To Verify Application no text box is Present",true); //print for eclipse console
		//String validnumber=
		excel.getExcelData(Application_no, "RTIApplication Number",0, 1);
		//Application_no.sendKeys(validnumber);
		waitForSomeTime();waitForSomeTime();
	}
	public void toverifythefunctionalityofactionbutton() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		waitForSomeTime();
		waitForPageLoad(driver,Action);
		HighlightOnElement(Action);
		Assert.assertTrue(Action.isEnabled(),"TestCase Pass:Action ");
		Reporter.log(" To Verify action button is Present",true); //print for eclipse console
		Action.click();
		waitForSomeTime();waitForSomeTime();
	}
	public void toverifythefunctionalityofprintbutton() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		waitForSomeTime();
		waitForPageLoad(driver,Print);
		HighlightOnElement(Print);
		Assert.assertTrue(Print.isEnabled(),"TestCase Pass:Print ");
		Reporter.log(" To Verify print button is Present",true); //print for eclipse console
		Print.click();
		waitForSomeTime();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
	}
	public void toverifytheapplicationno() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		waitForSomeTime();
		waitForPageLoad(driver,Application_no1);
		HighlightOnElement(Application_no1);
		Assert.assertTrue(Application_no1.isEnabled(),"TestCase Pass:Application_no1 ");
		Reporter.log(" To Verify the application number is Present",true); //print for eclipse console
		Application_no1.click();
		waitForSomeTime();
		close.click();
	}
	
	public void toverifythefunctionalityofsubmitbutton() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		waitForPageLoad(driver,Submit);
		HighlightOnElement(Submit);
		Assert.assertTrue(Submit.isEnabled(),"TestCase Pass:Submit");
		Reporter.log(" To Verify Update Answer button is Present",true); //print for eclipse console
		Submit.click();
		waitForSomeTime();waitForSomeTime();waitForSomeTime();waitForSomeTime();
		waitForSomeTime();waitForSomeTime();
	}
	
	public void toverifythefunctionalityofclosebutton() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		waitForPageLoad(driver,close1);
		HighlightOnElement(close1);
		Assert.assertTrue(close1.isEnabled(),"TestCase Pass:Submit");
		Reporter.log(" To Verify close button is Present",true); //print for eclipse console
		close1.click();		
	}
	
	public void toVerifyErrorMessageAsCommentFieldisBlank() throws InterruptedException
	{
		waitForSomeTime();
		HighlightOnElement(ErrorMessag_Popup);
		String Expected_Message="Please enter answer !";
		String Actual_Message=ErrorMessag_Popup.getText();
		Assert.assertEquals(Expected_Message, Actual_Message);
		waitForSomeTime();
		waitForSomeTime();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-150)", "");
		waitForSomeTime();

	}
	public void toverifythefunctionalityofactiondropdown() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		waitForSomeTime();
		waitForPageLoad(driver,SeltectAction);
		HighlightOnElement(SeltectAction);
		Assert.assertTrue(SeltectAction.isEnabled(),"TestCase Pass:SeltectAction ");
		Select sel=new Select(SeltectAction);
		sel.selectByVisibleText("Forward");		
		Reporter.log(" To Verify action dropdown is Present",true); //print for eclipse console
	}
	public void toverifytheRTIInformationtab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		waitForPageLoad(driver,RTIInfoTab);
		HighlightOnElement(RTIInfoTab);
		RTIInfoTab.click();
		
		/*waitForSomeTime();
		waitForPageLoad(driver,officer);
		HighlightOnElement(officer);
		Assert.assertTrue(officer.isEnabled(),"TestCase Pass:officer");
		Select sel=new Select(officer);
		sel.selectByVisibleText("Shivendra Nath");	
		Reporter.log("Oficer is selectted successfully",true); //print for eclipse console
*/	}
	public void toverifythefunctionalityof_UploadingDocument() throws InterruptedException, AWTException
	  {
		waitForPageLoad(driver,Upload_Button1);
		HighlightOnElement(Upload_Button1);
		Upload_Button1.click();
		waitForSomeTime();
		UpLoadFile("E:\\NRDA_Environment\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Company_Id.pdf");
		waitForSomeTime();
		waitForSomeTime();
		Reporter.log("Verify Application of Upload Button  is Present",true); //print for eclipse console 
		waitForSomeTime();		
		}
	public void toverifytheAnswerbox() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		waitForSomeTime();waitForSomeTime();waitForSomeTime();
		ScroolDown();
		waitForPageLoad(driver,enteranswertbox);
		HighlightOnElement(enteranswertbox);
		Assert.assertTrue(enteranswertbox.isEnabled(),"TestCase Pass:enteranswertbox ");
		Reporter.log("Answer box is prasent",true); //print for eclipse console
		enteranswertbox.click();
		enteranswertbox.sendKeys("Test content");	
	}
	public void toVerifyDashBoardAsEE02() throws InterruptedException
	{
		try
		{
			waitForSomeTime();
			HighlightOnElement(Home_Icon);
			Assert.assertEquals(true,Home_Icon.isEnabled());
			Assert.assertNotNull(Home_Icon,"Click on Home_Icon Link in Application of Water and Sewerage sucessfully");
			Home_Icon.click();
			Reporter.log(" To Verify Home_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
		}

		catch(Exception ex)
		{
			ex.printStackTrace();
		}	
	}
	public void toVerifyMenuFieldsOnDashBoard() throws InterruptedException
	{
		try
		{
			waitForSomeTime();
			HighlightOnElement(Home_Icon);
			Assert.assertEquals(true,Home_Icon.isEnabled());
			Reporter.log(" To Verify Home_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console

			waitForSomeTime();
			HighlightOnElement(PendingApplication_Icon);
			Assert.assertEquals(true,PendingApplication_Icon.isEnabled());
			Reporter.log(" To Verify PendingApplication_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console

			waitForSomeTime();
			HighlightOnElement(ApprovceRejectApplication_Icon);
			Assert.assertEquals(true,ApprovceRejectApplication_Icon.isEnabled());
			Reporter.log(" To Verify ApprovceRejectApplication_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console

			waitForSomeTime();
			HighlightOnElement(PaymentCollection_Icon);
			Assert.assertEquals(true,PaymentCollection_Icon.isEnabled());
			Reporter.log(" To Verify PaymentCollection_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console


			waitForSomeTime();
			HighlightOnElement(MisReports_Icon);
			Assert.assertEquals(true,MisReports_Icon.isEnabled());
			Reporter.log(" To Verify MisReports_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console

			waitForSomeTime();
			HighlightOnElement(MeetingManagement_Icon);
			Assert.assertEquals(true,MeetingManagement_Icon.isEnabled());
			Reporter.log(" To Verify MeetingManagement_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
			waitForSomeTime();
		}

		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	
	
	@FindBy(xpath="//a[contains(.,'New Application')]")
	private WebElement NewApplication_Menu;
	
	@FindBy(xpath="//a[contains(.,'ONLINE RTI')]")
	private WebElement ONLINERTI_Menu;
	
	@FindBy(xpath="//img[@src='/NRDAuthority/resources/images/view-new.png']")
	private  WebElement actionbtn1;
	
	@FindBy(xpath="//div[@role='tabpanel']/div/div[1]/table")
	private WebElement PendingApplication_Grid;
	
	@FindBy(xpath="//span[contains(.,'Applications List')]/../following-sibling::div/div[1]/div/table/tbody/tr/td/input")
	private WebElement entervalueinsearchbox;
	
	@FindBy(xpath="//button/span[contains(text(),'Search')]")
	private WebElement searchbtn;
	
	@FindBy(xpath="//table[@role='grid']/tbody/tr/td[5]/span[contains(.,'PENDING')]")
	private WebElement Application_Status;
	
	
	@FindBy(xpath="//a[contains(.,'RTI Information')]")
	private WebElement RTIInformationTab;
	

	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[2]/td[3]/textarea")
	private WebElement AnswerBox;
	
	@FindBy(xpath="//button[contains(.,'Update Answer')]")
	private WebElement UpdateAnswer;
	
	
	public void toverifyUpdateanswer() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HighlightOnElement(PendingApplication_Icon);
		PendingApplication_Icon.click();
		Reporter.log(" To Verify PendingApplication_Icon Link in Application  link is Present",true);
		waitForSomeTime();
		waitForSomeTime();
		waitForelementPresent(entervalueinsearchbox);
		HighlightOnElement(entervalueinsearchbox);
		//String Validnumber=ApplicationNumber.getText();
		String validnumber=excel.getExcelData(entervalueinsearchbox, "RTIApplication Number",0, 3);
		Reporter.log("Valid Application Number:"+validnumber,true);
		waitForSomeTime();
		HighlightOnElement(searchbtn);
		searchbtn.click();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(actionbtn1);
		actionbtn1.click();
		waitForSomeTime();
		
		HighlightOnElement(RTIInformationTab);
		RTIInformationTab.click();
		waitForSomeTime();
		waitForSomeTime();
		
		HighlightOnElement(AnswerBox);
		AnswerBox.sendKeys("Noremarks");
		waitForSomeTime();
		HighlightOnElement(UpdateAnswer);
		UpdateAnswer.click();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(CloseButton);
		CloseButton.click();
		waitForSomeTime();
		waitForSomeTime();
	
	}
	
	
	public void toVerifyPendingApplicationLink_SC_06_TC_02() throws InterruptedException
	{
		waitForSomeTime();
		HighlightOnElement(PendingApplication_Icon);
		Assert.assertTrue(PendingApplication_Icon.isEnabled(),"Test Case Pass: PendingApplication_Icon");
		PendingApplication_Icon.click();
		waitForSomeTime();
		waitForelementPresent(entervalueinsearchbox);
		HighlightOnElement(entervalueinsearchbox);
		System.out.println(" To Click on PendingApplication_Icon Link in Application of Water&Sewerage  Successfully" ); //print for eclipse console
		
	}
	
	@FindBy(xpath=".//*[@id='inboxForm:growl_container']/div/div/div[2]/span")
	private WebElement popupmsg;
	
	public void toVerifySearchFieldAsPendingApplicationNumberAsInValidNumber_SC_06_TC_03() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		HighlightOnElement(entervalueinsearchbox);
		Assert.assertTrue(entervalueinsearchbox.isEnabled(),"Test Case Pass: entervalueinsearchbox");
		excel.getExcelData(entervalueinsearchbox, "Environment_Application_Number", 0, 2);
		waitForSomeTime();
		
		HighlightOnElement(searchbtn);
		Assert.assertTrue(searchbtn.isEnabled(),"Test Case Pass: searchbtn");
		searchbtn.click();
		waitForSomeTime();
		System.out.println(" To Click on searchbtn Link in Application of Water&Sewerage  Successfully" ); //print for eclipse console
		
		HighlightOnElement(popupmsg);
		Assert.assertTrue(popupmsg.isEnabled(),"Test Case Pass: popupmsg");
		String ActualMessage=popupmsg.getText();
		String ExpectedMessage="Application Number is not in Records";
		Assert.assertEquals(ActualMessage, ExpectedMessage);
		waitForSomeTime();
	
	}
	
	public void toVerifySearchFieldAsPendingApplicationNumberAsEnterSpecialCharacters_SC_06_TC_05() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		HighlightOnElement(entervalueinsearchbox);
		Assert.assertTrue(entervalueinsearchbox.isEnabled(),"Test Case Pass: entervalueinsearchbox");
		excel.getExcelData(entervalueinsearchbox, "Environment_Application_Number", 0, 3);
		HighlightOnElement(searchbtn);
		Assert.assertTrue(searchbtn.isEnabled(),"Test Case Pass: searchbtn");
		searchbtn.click();
		waitForSomeTime();
		acceptAlert();
		waitForSomeTime();
		
	}
	
	public void toVerifySearchFieldAsPendingApplicationNumberAsEnterAlphabetsonly_SC_06_TC_06() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		HighlightOnElement(entervalueinsearchbox);
		Assert.assertTrue(entervalueinsearchbox.isEnabled(),"Test Case Pass: entervalueinsearchbox");
		excel.getExcelData(entervalueinsearchbox, "Environment_Application_Number", 0, 4);
		waitForSomeTime();
		
		HighlightOnElement(searchbtn);
		Assert.assertTrue(searchbtn.isEnabled(),"Test Case Pass: searchbtn");
		searchbtn.click();
		waitForSomeTime();
		System.out.println(" To Click on searchbtn Link in Application of Water&Sewerage  Successfully" ); //print for eclipse console
		
		HighlightOnElement(popupmsg);
		Assert.assertTrue(popupmsg.isEnabled(),"Test Case Pass: popupmsg");
		String ActualMessage=popupmsg.getText();
		String ExpectedMessage="Application Number is not in Records";
		Assert.assertEquals(ActualMessage, ExpectedMessage);
		waitForSomeTime();
	}
	
	
	
	public void toVerifySearchFieldAsPendingApplicationNumberAsBlankField_SC_06_TC_04() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		HighlightOnElement(entervalueinsearchbox);
		Assert.assertTrue(entervalueinsearchbox.isEnabled(),"Test Case Pass: entervalueinsearchbox");
		//excel.getExcelData(entervalueinsearchbox, "Environment_Application_Number", 0, 2);
		waitForSomeTime();
		
		HighlightOnElement(searchbtn);
		Assert.assertTrue(searchbtn.isEnabled(),"Test Case Pass: searchbtn");
		searchbtn.click();
		waitForSomeTime();
		System.out.println(" To Click on searchbtn Link in Application of Water&Sewerage  Successfully" ); //print for eclipse console
		
		HighlightOnElement(popupmsg);
		Assert.assertTrue(popupmsg.isEnabled(),"Test Case Pass: popupmsg");
		String ActualMessage=popupmsg.getText();
		String ExpectedMessage="Please enter Application Number !";
		Assert.assertEquals(ActualMessage, ExpectedMessage);
		waitForSomeTime();
		
	}
	
	
	public void toVerifySearchFieldAsPendingApplicationNumberAsValid_SC_06_TC_04() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HighlightOnElement(PendingApplication_Icon);
		PendingApplication_Icon.click();
		Reporter.log(" To Verify PendingApplication_Icon Link in Application  link is Present",true);
		waitForSomeTime();
		waitForSomeTime();
		waitForelementPresent(entervalueinsearchbox);
		HighlightOnElement(entervalueinsearchbox);
		//String Validnumber=ApplicationNumber.getText();
		String validnumber=excel.getExcelData(entervalueinsearchbox, "RTIApplication Number",0, 3);
		Reporter.log("Valid Application Number:"+validnumber,true);
		waitForSomeTime();
		HighlightOnElement(searchbtn);
		searchbtn.click();
		waitForSomeTime();
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
	
	@FindBy(xpath="//ul//a[contains(.,'RTI Information')]/../../following-sibling::div/div[3]/span/table/tbody/tr[4]/td[3]/table/tbody/tr/td/div/div/div/div[1]/label")
	private WebElement SupportingDocument;
	
	@FindBy(xpath="//button[contains(.,'Close')]")
	private WebElement CloseButton;
	
	
	public void toverifythefunctionalityofCloseButton_SC_09_TC_07() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		HighlightOnElement(entervalueinsearchbox);
		//String Validnumber=ApplicationNumber.getText();
		String validnumber=excel.getExcelData(entervalueinsearchbox, "RTIApplication Number",0, 3);
		Reporter.log("Valid Application Number:"+validnumber,true);
		waitForSomeTime();
		HighlightOnElement(searchbtn);
		searchbtn.click();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(actionbtn1);
		actionbtn1.click();
		waitForSomeTime();
		
		HighlightOnElement(RTIInformationTab);
		RTIInformationTab.click();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(CloseButton);
		CloseButton.click();
		waitForSomeTime();
		waitForSomeTime();
				
	}
	
	@FindBy(xpath=".//*[@id='inboxForm:msg_container']/div/div/div[2]/span")
	private WebElement ErrorMsg;
	
	public void toverifythefunctionalityofUpdateButtonWithoutAnswer_SC_09_TC_07() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		HighlightOnElement(entervalueinsearchbox);
		//String Validnumber=ApplicationNumber.getText();
		String validnumber=excel.getExcelData(entervalueinsearchbox, "RTIApplication Number",0, 3);
		Reporter.log("Valid Application Number:"+validnumber,true);
		waitForSomeTime();
		HighlightOnElement(searchbtn);
		searchbtn.click();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(actionbtn1);
		actionbtn1.click();
		waitForSomeTime();
		
		HighlightOnElement(RTIInformationTab);
		RTIInformationTab.click();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(UpdateAnswer);
		UpdateAnswer.click();
		HighlightOnElement(ErrorMsg);
		Assert.assertTrue(ErrorMsg.isEnabled(),"Test Case Pass: popupmsg");
		String ActualMessage=ErrorMsg.getText();
		String ExpectedMessage="Please enter answer !";
		
		Assert.assertEquals(ActualMessage, ExpectedMessage);
		waitForSomeTime();
	}
	
	
	

	
}
