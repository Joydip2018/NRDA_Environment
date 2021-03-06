package NRDA_RTI;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
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
 * @Date: 31-10-2017
 * @Purpose: RTI Application Login As Head  
 */
public class ToverifyRTILoginHEAD extends CommonLibrary
{
	
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	static int ApprovecountList=0;
	static int RejectcountList=0;
	static int PendingcountList=0;
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Home_Icon".
	 * @author Sarvesh.Nellore
	 * @since 2017-09-21
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[1]")
	private WebElement Home_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[2]")
	private WebElement PendingApplication_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[3]")
	private WebElement ApproveorRejectApplication_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[11]")
	private WebElement PaymentCollection_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[14]")
	private WebElement ApplicationForm_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[15]")
	private WebElement MisReport_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[19]")
	private WebElement MeetingManagement_Icon;
	
	
	@FindBy(xpath="//html/body/div[2]/table[2]/tbody/tr/td[2]/table/tbody/tr/td/form/div[4]/div[2]/div[1]/ul[1]/li")
	private List <WebElement> RTI_Icon;
	
	public void toVerifyMenuFieldsonDashBoard_SC_11_TC02() throws InterruptedException
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
				HighlightOnElement(ApproveorRejectApplication_Icon);
				Assert.assertEquals(true,ApproveorRejectApplication_Icon.isEnabled());
				Reporter.log(" To Verify ApprovceRejectApplication_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
	
				
				waitForSomeTime();
				HighlightOnElement(PaymentCollection_Icon);
				Assert.assertEquals(true,PaymentCollection_Icon.isEnabled());
				Reporter.log(" To Verify PaymentCollection_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
	
				waitForSomeTime();
				HighlightOnElement(ApplicationForm_Icon);
				Assert.assertEquals(true,ApplicationForm_Icon.isEnabled());
				Reporter.log(" To Verify ApplicationForm_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
	
	
	
				waitForSomeTime();
				HighlightOnElement(MisReport_Icon);
				Assert.assertEquals(true,MisReport_Icon.isEnabled());
				Reporter.log(" To Verify MisReports_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
	
				waitForSomeTime();
				HighlightOnElement(MeetingManagement_Icon);
				Assert.assertEquals(true,MeetingManagement_Icon.isEnabled());
				Reporter.log(" To Verify MeetingManagement_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
	
			}
	
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	
	

	@FindBy(xpath="//span[@class='ui-icon ui-icon-seek-first']")
	private WebElement SeekFirst_PendingList;
	
	@FindBy(xpath="//span[@class='ui-icon ui-icon-seek-prev']")
	private WebElement SeekPrevious_PendingList;

	@FindBy(xpath="//span[@class='ui-icon ui-icon-seek-end']")
	private WebElement Seekend_PendingList;
	
	@FindBy(xpath="//span[@class='ui-icon ui-icon-seek-next']")
	private WebElement Seeknext_PendingList;
	
	@FindBy(xpath="//a[contains(.,'New Application')]")
	private WebElement NewApplication_Menu;
	
	@FindBy(xpath="//a[contains(.,'RTI Questions')]")
	private WebElement ONLINERTI_Menu;
	
	
	

	
	public void toverifythefunctionalityofpaginationinPendingApplication_SC_11_TC_07() throws InterruptedException
	 {
		HighlightOnElement(PendingApplication_Icon);
		Assert.assertTrue(PendingApplication_Icon.isEnabled(),"TestCase Pass:PendingApplication_Icon ");
		Reporter.log(" To Verify PendingApplication_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
		PendingApplication_Icon.click();
		waitForSomeTime();
		waitForelementPresent(NewApplication_Menu);
		
		HighlightOnElement(NewApplication_Menu);
		Assert.assertTrue(NewApplication_Menu.isEnabled(),"TestCase NewApplication_Menu ");
		Reporter.log(" To Verify NewApplication_Menu Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
		waitForSomeTime();
		
		HighlightOnElement(ONLINERTI_Menu);
		Assert.assertTrue(ONLINERTI_Menu.isEnabled(),"TestCase ONLINERTI_Menu ");
		Reporter.log(" To Verify ONLINERTI_Menu Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
		waitForSomeTime();
		
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
	

	@FindBy(xpath=".//*[@id='inboxForm:growl_container']/div/div/div[2]/span")
	private WebElement getmessage;
	
	@FindBy(xpath=".//*[@id='inboxForm:growl_container']/div/div/div[2]/span")
	private WebElement getmessage1;
	
	@FindBy(xpath="//span[contains(.,'Applications List')]/../following-sibling::div/div[1]/div/table/tbody/tr/td/input")
	private WebElement entervalueinsearchbox;

	@FindBy(xpath="//button/span[contains(text(),'Search')]")
	private WebElement searchbtn;
	
	public void toverifythependingApplicationWithInvalidNumber_SC_11_TC_08() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		HighlightOnElement(PendingApplication_Icon);
		Assert.assertTrue(PendingApplication_Icon.isEnabled(),"TestCase Pass:PendingApplication_Icon ");
		Reporter.log(" To Verify PendingApplication_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
		PendingApplication_Icon.click();
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
		HighlightOnElement(getmessage);
		String Expected=getmessage.getText();
		String Actual="Application Number is not in Records";
		Assert.assertEquals(Actual, Expected);
		Reporter.log("Expected result:"+Expected,true);
		waitForSomeTime();
		waitForSomeTime();
	
	}
	
	public void toverifythependingApplicationWithBlankField_SC_11_TC_09() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	
		{
			
			HighlightOnElement(PendingApplication_Icon);
			Assert.assertTrue(PendingApplication_Icon.isEnabled(),"TestCase Pass:PendingApplication_Icon ");
			Reporter.log(" To Verify PendingApplication_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
			PendingApplication_Icon.click();
			waitForSomeTime();
			waitForelementPresent(entervalueinsearchbox);
			HighlightOnElement(entervalueinsearchbox);
			//String Validnumber=ApplicationNumber.getText();
			//String validnumber=excel.getExcelData(entervalueinsearchbox, "RTIApplication Number",0, 3);
			//Reporter.log("Valid Application Number:"+validnumber,true);
			waitForSomeTime();
			HighlightOnElement(searchbtn);
			searchbtn.click();
			waitForSomeTime();
			
		
			HighlightOnElement(getmessage1);
			String Expected1=getmessage1.getText();
			String Actual1="Please enter Application Number !";
			Assert.assertEquals(Actual1, Expected1);
			Reporter.log("Expected result:"+Expected1,true);
			waitForSomeTime();
			waitForSomeTime();	
			
		
		}
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div[3]/div/div/div[1]/table/tbody/tr")
	private List<WebElement> rowtable;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div[3]/div/div/div[1]/table/tbody/tr")
	private List<WebElement> Basic_Details;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/table/tbody/tr/td/span")
	private List<WebElement> dashboardelement;

	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div/div[2]/ul/li/a")
	private List<WebElement> dashboardelement1;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div/div[2]/ul/li[4]/a")
	private WebElement rti_information;

	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div/div[2]/div[1]/div[4]/span/div/div/table/tbody/tr/td/table/tbody/tr/td[1]/span")
	private List<WebElement> rti_information_details;
	
	@FindBy(xpath="//html/body/div[1]/table[2]/tbody/tr/td[2]/table/tbody/tr/td/form/span[2]/span/div/div/div[4]/div[2]/center/table/tbody/tr/td[1]/div/div/label")
	private List<WebElement> ActionComment_details;
	
	@FindBy(xpath="//div[@class='ui-panel-titlebar ui-widget-header ui-helper-clearfix ui-corner-all']/span[contains(.,'Action and Comment')]")
	private WebElement ActionCommentMenu;
	

	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/div[4]/div[2]/center/table[2]/tbody/tr[2]/td[1]/span")
	private WebElement uploaddocumentlabel;
	
	
	public void toVerifyActionFunctionWithValidData_SC_11_TC_11() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
		HighlightOnElement(PendingApplication_Icon);
		PendingApplication_Icon.click();
		waitForSomeTime();
		waitForelementPresent(entervalueinsearchbox);
		waitForSomeTime();
		waitForelementPresent(entervalueinsearchbox);
		HighlightOnElement(entervalueinsearchbox);
		//String Validnumber=ApplicationNumber.getText();
		String validnumber=excel.getExcelData(entervalueinsearchbox, "RTIApplication Number",0, 1);
		Reporter.log("Valid Application Number:"+validnumber,true);
		waitForSomeTime();
		HighlightOnElement(searchbtn);
		searchbtn.click();
		waitForSomeTime();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)", "");
		waitForSomeTime();
		try
		{
		int rows_count = rowtable.size();
		for(int row=0; row<rows_count; row++) 
		{
		List <WebElement> Columns_row = rowtable.get(row).findElements(By.tagName("td"));
		int columns_count = Columns_row.size();
		for (int column = 0; column <columns_count; column++)
		{
		String celltext = Columns_row.get(column).getText();
		if(celltext.equalsIgnoreCase("ORTIC2110170265"))
		{
		List<WebElement> actionbtn =driver.findElements(By.xpath("//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div[3]/div/div/div[1]/table/tbody/tr/td[3]/following-sibling::td[1]/span/../following-sibling::td/a/img"));
		actionbtn.get(row).click();
		Reporter.log("click on action buton successfully",true);
		waitForSomeTime();
		}
		}
	
		}
		}
		catch (Exception StaleElementReferenceException) 
		{
		StaleElementReferenceException.printStackTrace();
		}
	
		for(WebElement dashboard:dashboardelement)
		{
		HighlightOnElement(dashboard);
		String element=dashboard.getText();
		Reporter.log("Expected result:"+element,true);
		}
	
		for(WebElement dashboard:dashboardelement1)
		{
		HighlightOnElement(dashboard);
		String element=dashboard.getText();
		Reporter.log("Expected result:"+element,true);
		}
		HighlightOnElement(rti_information);
		rti_information.click();
	
		for(WebElement information:rti_information_details)
		{
		HighlightOnElement(information);
		String element=information.getText();
		Reporter.log("RTI QUESTION INFORMATION:"+element,true);
		
		}
		HighlightOnElement(ActionCommentMenu);
		waitForSomeTime();
		for(WebElement information1:ActionComment_details)
		{
		HighlightOnElement(information1);
		String element1=information1.getText();
		Reporter.log("Action Comment INFORMATION:"+element1,true);
		
		}
		HighlightOnElement(uploaddocumentlabel);
		String uploadlabel=uploaddocumentlabel.getText();
		Reporter.log("Expected result:"+uploadlabel,true);
		waitForSomeTime();
*/
		}	
	
	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/div[4]/div[2]/center/table/tbody/tr/td/div/div/label")
	private List<WebElement> commentlabel;
	
	@FindBy(xpath="//img[@src='/NRDAuthority/resources/images/view-new.png']")
	private  WebElement actionbtn1;
	
	@FindBy(xpath="//div[@role='tabpanel']/div/div[1]/table")
	private WebElement PendingApplication_Grid;
	
	
	
	
	@FindBy(xpath="//table[@role='grid']/tbody/tr/td[5]/span[contains(.,'PENDING')]")
	private WebElement Application_Status;

	public void toVerifySubmitbuttonFunctionalityWithActionFieldISBlank_SC_09_TC_12() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{

		waitForSomeTime();
		HighlightOnElement(actionbtn1);
		actionbtn1.click();
		waitForSomeTime();
		HighlightOnElement(clickonselectactiondrop);
		
	}
public	void toverifythependingApplicationActionFunctionality_SC_09_TC_11() throws InterruptedException
	{
		HighlightOnElement(actionbtn1);
		Assert.assertTrue(actionbtn1.isEnabled(),"TestCase actionbtn1 ");
		Reporter.log(" To Verify actionbtn1 Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
		actionbtn1.click();
		waitForSomeTime();
		waitForSomeTime();
		
		
		waitForSomeTime();
		for(WebElement la:commentlabel)
		{
			if(la.isDisplayed())
			{
				String labelname=la.getText();
				Reporter.log("Expected result:"+labelname,true);
				waitForSomeTime();
			}
		}
		//Assert.assertEquals(uploaddocumentlabel.isDisplayed(),"Test case pass");
		/*HighlightOnElement(uploaddocumentlabel);
		String uploadlabel=uploaddocumentlabel.getText();
		Reporter.log("Expected result:"+uploadlabel,true);
		waitForSomeTime();*/


		HighlightOnElement(clickonselectactiondrop);
		//clickonselectactiondrop.click();
		SelectVisibleText(clickonselectactiondrop, "Select Action");
		/*for(int i=1;i<selectdropdownvalue.size();i++)
		{
			String value=selectdropdownvalue.get(i).getText();
			Reporter.log("Expected result:"+value,true);
			waitForSomeTime();
		}*/

	}
	
	
	
	
	
	
	
	
	@FindBy(xpath=".//*[@id='inboxForm:msg_container']/div/div/div[2]/span")
	private WebElement ErrorMessag_Popup1;
	
	public void toVerifyErrorMessage() throws InterruptedException
	{
		waitForSomeTime();
		HighlightOnElement(ErrorMessag_Popup1);
		String Expected_Message="Please select some action before submit !";
		String Actual_Message=ErrorMessag_Popup1.getText();
		Assert.assertEquals(Expected_Message, Actual_Message);
		waitForSomeTime();
		waitForSomeTime();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-350)", "");
		waitForSomeTime();
	}
	
	
	
	@FindBy(xpath="(//button[contains(.,'Submit') and@role='button'])[1]")
	private WebElement Submit_Button;

	public void toVerifySubmitbuttonFunctionalityWithActionFieldISBlank() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(Submit_Button);
		Assert.assertEquals(Submit_Button.isEnabled(),true);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		waitForSomeTime();
		Submit_Button.click();
		Reporter.log("Click on Submit button Successfully",true);
		waitForSomeTime();
		Thread.sleep(150000);
		waitForSomeTime();
		waitForSomeTime();
		
	}
	
	@FindBy(xpath=".//*[@id='inboxForm:msg_container']/div/div/div[2]/span")
	private WebElement ErrorMessag_Popup;
	
	public void toVerifyErrorMessageAsUserisBlank() throws InterruptedException
	{
		waitForSomeTime();
		HighlightOnElement(ErrorMessag_Popup);
		String Expected_Message="Please enter comments !";
		String Actual_Message=ErrorMessag_Popup.getText();
		Assert.assertEquals(Expected_Message, Actual_Message);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-450)", "");
		waitForSomeTime();

	}
	
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr/td[2]/select")
	private WebElement clickonselectactiondrop;
	
	@FindBy(xpath="//ul[@class='ui-selectonemenu-items ui-selectonemenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']/li")
	private List<WebElement> selectdropdownvalue;
	
	public void toVerifySubmitbuttonFunctionalityWithCommentFieldISBlank_SC_11_TC_13() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{

		waitForSomeTime();
		HighlightOnElement(clickonselectactiondrop);
		SelectVisibleText(clickonselectactiondrop, "Forward");
		/*clickonselectactiondrop.click();

		for(int i=0;i<selectdropdownvalue.size();i++)
		{
			String value=selectdropdownvalue.get(i).getText();
			if(value.equalsIgnoreCase("Forward"))
			{
				selectdropdownvalue.get(i).click();
				waitForSomeTime();
			}
		}*/

	}
	
	@FindBy(xpath="//div[@class='ui-panel-content ui-widget-content']/table/tbody/tr/td[2]/table/tbody/tr/td[3]/select")
	private WebElement Officer_Dropdown;
	
	@FindBy(xpath="//div[@class='ui-panel-content ui-widget-content']/table/tbody/tr/td/table/tbody/tr[2]/td[3]/textarea")
	private WebElement Department_Remarks;
	
	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/div[4]/div[2]/center/table/tbody/tr/td[2]/textarea")
	private WebElement entercommentbox;
	
	@FindBy(xpath="//a[contains(.,'RTI Information')]")
	private WebElement RTIInformation;
	
	
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[4]/td[2]/table/tbody/tr/td/div/div[1]/label")
	private WebElement uploaddocument;
	
	public void toverifythefunctionalityofForward_SC_11_TC_14() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		waitForSomeTime();
		HighlightOnElement(RTIInformation);
		RTIInformation.click();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(Officer_Dropdown);
		waitForSomeTime();
		waitForSomeTime();
		SelectVisibleText(Officer_Dropdown, "eephe  (Executive Engineer)");
		waitForSomeTime();
		HighlightOnElement(Department_Remarks);
		excel.getExcelData(Department_Remarks, "RTIApplication Number", 0, 14);
		waitForSomeTime();
		
		waitForSomeTime();
		HighlightOnElement(clickonselectactiondrop);
		/*clickonselectactiondrop.click();

		for(int i=0;i<selectdropdownvalue.size();i++)
		{
			String value=selectdropdownvalue.get(i).getText();
			if(value.equalsIgnoreCase("Forward"))
			{
				selectdropdownvalue.get(i).click();
				waitForSomeTime();
			}
		}*/
		
		SelectVisibleText(clickonselectactiondrop, "Forward");
		waitForSomeTime();
		
		HighlightOnElement(entercommentbox);
		//excel.getExcelData(entercommentbox, "RTIApplication Number", 0, 11);
		entercommentbox.sendKeys("Forward To Executive Engineer");
		waitForSomeTime();
		HighlightOnElement(uploaddocument);
		uploaddocument.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur.jpg");
		waitForSomeTime();
		
	}
	
	@FindBy(xpath="//button[contains(.,'Close')]")
	private WebElement close_Button;
	
	public void toverifytheCloseButtonFunctionality_SC_11_TC_15() throws InterruptedException
	{
		waitForSomeTime();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		HighlightOnElement(close_Button);
		waitForSomeTime();
		close_Button.click();
		Reporter.log("click on Close button succesfully",true);
		waitForSomeTime();
		waitForSomeTime();
		
		
		
	}
	
	
	}
