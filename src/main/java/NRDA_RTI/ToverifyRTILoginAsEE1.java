package NRDA_RTI;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;



import GenericLibrary.ExcelDataDriver;
import GenericLibrary.CommonLibrary;
/**
 * @author Sarvesh.Nellore
 *
 */
public class ToverifyRTILoginAsEE1 extends CommonLibrary 
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
	@FindBy(xpath="//td[@class='leftCol']/table/tbody/tr[1]/td/form/div/ul/li[2]")
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
	
	
	
	public void toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07() throws InterruptedException
	 {
		HighlightOnElement(PendingApplication_Icon);
		Assert.assertTrue(PendingApplication_Icon.isEnabled(),"TestCase Pass:PendingApplication_Icon ");
		Reporter.log(" To Verify PendingApplication_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
		PendingApplication_Icon.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForelementPresent(entervalueinsearchbox);
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		
		
		waitForSomeTime();
		HighlightOnElement(SeekFirst_PendingList);
		HighlightOnElement(SeekPrevious_PendingList);
		HighlightOnElement(Seeknext_PendingList);
		HighlightOnElement(Seekend_PendingList);

		if(Seeknext_PendingList.isEnabled())
		{
			Assert.assertTrue(Seeknext_PendingList.isDisplayed(),"TestCase Pass");
			Reporter.log("Test case pass: Pagination is Displayed in List Application",true);
			Seeknext_PendingList.click();
			waitForSomeTime();
		}
		else 
		{
			Assert.assertFalse(Seeknext_PendingList.isDisplayed(),"Test Case Fail");
			Reporter.log("Test case pass: Pagination is Not Displayed in List Application",true);
		}
		waitForSomeTime();
		jse.executeScript("window.scrollBy(0,-250)", "");
		
	
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
