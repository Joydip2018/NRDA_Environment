package NRDA_Estate_Project;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToverifyFunctionalityof_GM_Project_Scrutiny extends CommonLibrary {
	
	
	Logger log=Logger.getLogger("devpinoyLogger");
	ExcelDataDriver excel=new ExcelDataDriver();
	
	
	@FindBy(xpath="//div[@class='col-md-9']/table/tbody/tr/td/div/div/div/div/div[1]/div")
	private List <WebElement> HeadingsInApplications;
	
	
	public void toverifythedashboardoftheApplication() throws InterruptedException
	{
		waitForSomeTime();
		for(WebElement menulist:HeadingsInApplications)
		{
			HighlightOnElement(menulist);
			Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
			if(menulist.isDisplayed())
			{
				String Menu=menulist.getText();
				System.out.println(" Menu list in Dash Board are:"+Menu );
			}

		}
	
	}
	
	@FindBy(xpath="//span[contains(.,'Estate & Project Section')]/../../following-sibling::div/div[1]/div[2]/span")
	private WebElement MyInboxLink;
	
	@FindBy(xpath="//span[contains(.,'Application')]/../following-sibling::div[1]/div/div[4]/div/div/div/div[1]/table/thead/tr/th/span")
	private List <WebElement> PendingApplicationLabels;
	
	@FindBy(xpath="//span[contains(.,'Application')]/../following-sibling::div[1]/div/div/span/div/div/div/div/div/div[1]/table/thead/tr/th[2]/input")
	private WebElement ApplicationNo_Field;
	
	@FindBy(xpath="//img[@src='/NRDAuthorityPreUAT/resources/images/view-new.png']")
	private WebElement Action_Button;
	
	@FindBy(xpath=".//*[@id='inboxForm:showStatusApplication']/div[1]/a/span")
	private WebElement ClosePopup;
	

	
	@FindBy(xpath="//span[contains(.,'Application')]/../following-sibling::div[1]/div/h3/a[contains(.,'PROJECT SCRUTINY')]")
	private WebElement ProjectScrutiny_Link1;
	
	public void toverifyMyInboxlink() throws InterruptedException
	{
		HighlightOnElement(MyInboxLink);
		Assert.assertNotNull(MyInboxLink.isDisplayed(),"Test case pass");
		MyInboxLink.click();
		Reporter.log("To Click on MyInboxLink is Successfully",true);
		waitForSomeTime();
		ScroolDown();
		
		HighlightOnElement(ProjectScrutiny_Link1);
		ProjectScrutiny_Link1.click();
		waitForSomeTime();
		ScroolDown();
		ScroolDown();
		waitForSomeTime();
		for(WebElement menulist:PendingApplicationLabels)
		{
			HighlightOnElement(menulist);
			Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
			if(menulist.isDisplayed())
			{
				String Menu=menulist.getText();
				System.out.println(" PendingApplicationLabels are:"+Menu );
			}

		}
		
		waitForSomeTime();
		HighlightOnElement(ClosePopup);
		ClosePopup.click();
		waitForSomeTime();
	
	}
	
	@FindBy(xpath="//span[contains(.,'Application')]/../following-sibling::div[1]/div/h3/a[contains(.,'PROJECT SCRUTINY')]/../following-sibling::div[1]/div/div/div/div[1]/table/thead/tr/th[2]/input")
	private WebElement ApplicationNo_Field1;
	
	@FindBy(xpath="//span[contains(.,'Application')]/../following-sibling::div[1]/div/h3/a[contains(.,'PROJECT SCRUTINY')]/../following-sibling::div[1]/div/div/div/div[1]/table/tbody/tr/td[7]/center/a/img[@src='/NRDAuthorityPreUAT/resources/images/view-new.png']")
	private WebElement Action_Button1;
	
	public void toverifyActionButtonagainsttheApplication() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		HighlightOnElement(MyInboxLink);
		Assert.assertNotNull(MyInboxLink.isDisplayed(),"Test case pass");
		MyInboxLink.click();
		Reporter.log("To Click on MyInboxLink is Successfully",true);
		waitForSomeTime();
		waitForSomeTime();
		ScroolDown();
		
		HighlightOnElement(ProjectScrutiny_Link1);
		ProjectScrutiny_Link1.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		ScroolDown();
		
		
		HighlightOnElement(ApplicationNo_Field1);
		excel.getExcelData(ApplicationNo_Field1, "RefferenceNumber", 0, 1);
		waitForSomeTime();
		waitForSomeTime();
		
		Actions actions = new Actions(driver);
		actions.moveToElement(Action_Button1);
		HighlightOnElement(Action_Button1);
		actions.click().build().perform();
		/*HighlightOnElement(Action_Button1);
		Assert.assertNotNull(Action_Button1.isDisplayed(),"Test case pass");
		Action_Button1.click();
		Reporter.log("To Click on Action_Button is Successfully",true);
		waitForSomeTime();*/
		waitForSomeTime();
		Thread.sleep(12000);
		waitForSomeTime();
		waitForSomeTime();
		
	}
	
	@FindBy(xpath="//button[contains(.,'Print')]")
	private WebElement PrintButton;
	
	
	public void toverifyPrintButtonFunctionality() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(5000);
		HighlightOnElement(PrintButton);
		Assert.assertNotNull(PrintButton.isDisplayed(),"Test case pass");
		PrintButton.click();
		Reporter.log("To Click on PrintButton is Successfully",true);
		waitForSomeTime();
		waitForSomeTime();
	}
	
	@FindBy(xpath="//a[contains(.,'Sale/Purchase Detail')]/../../following-sibling::div/div[3]/table[1]/tbody/tr/td/label")
	private List<WebElement> SalePurchaseTabLabels;
	
	@FindBy(xpath="//a[contains(.,'Sale/Purchase Detail')]")
	private WebElement SalePurchaseTab;
	
	public void verifylabelsinSalePurchaseTab() throws InterruptedException
	{
		 
    	 HighlightOnElement(SalePurchaseTab);
    	 Assert.assertTrue(SalePurchaseTab.isDisplayed(),"Test case Failed");
    	 SalePurchaseTab.click();
    	 Reporter.log("To Click on SalePurchaseTab is Successfully",true);
    	 waitForSomeTime();
    	 
		for(WebElement ProjectDetails:SalePurchaseTabLabels)
		{
			HighlightOnElement(ProjectDetails);
			Assert.assertNotNull(ProjectDetails.isDisplayed(),"Test case pass");
			if(ProjectDetails.isDisplayed())
			{
				String Menu=ProjectDetails.getText();
				System.out.println(" SalePurchase Detail Labels are:"+Menu );
			}
		}
		
		
	
	}
	
	@FindBy(xpath="//span[contains(.,'Sale/Purchase Detail')]/../following-sibling::div[1]/span/div/div[1]/table/tbody/tr/td[contains(.,'No records found')]")
	private WebElement NorecordFound_Message;
	
	@FindBy(xpath="//a[contains(.,'Sale/Purchase Detail')]/../../following-sibling::div/div[3]/table/tbody/tr/td[4]/input")
	private WebElement EnterSelectValue_Field;
	
	@FindBy(xpath="//a[contains(.,'Sale/Purchase Detail')]/../../following-sibling::div/div[3]/table/tbody/tr/td/button[contains(.,'Search')]")
	private WebElement SearchButton;
	
	@FindBy(xpath="//span[contains(.,'Sale/Purchase Detail')]/../following-sibling::div[1]/span/div/div[1]/table/tbody/tr/td[1]/div/div[2]")
	private WebElement CheckBox1;
	
	@FindBy(xpath="//span[contains(.,'Sale/Purchase Detail')]/../following-sibling::div[1]/span/center/button[1]/span[contains(.,'Eligible')]")
	private WebElement Eligible_Button;
	
	@FindBy(xpath="//span[contains(.,'Sale/Purchase Detail')]/../following-sibling::div[1]/span/center/button[2]/span[contains(.,'Not Eligible')]")
	private WebElement NonEligible_Button;
	
	@FindBy(xpath="//span[contains(.,'Sale/Purchase Detail')]/../following-sibling::div[1]/span/div/div[1]/table/tbody/tr/td/label[contains(.,'Eligible')]")
	private WebElement EligibleLabel;
	
	@FindBy(xpath="//span[contains(.,'Sale/Purchase Detail')]/../following-sibling::div[1]/span/div/div[1]/table/tbody/tr/td/label[contains(.,'Not Eligible')]")
	private WebElement NoNEligibleLabel;
	
	public void toverifyEnterSelectedValueisInvalid() throws InterruptedException
	{
		
		 HighlightOnElement(EnterSelectValue_Field);
    	 Assert.assertTrue(EnterSelectValue_Field.isDisplayed(),"Test case Failed");
    	 EnterSelectValue_Field.sendKeys("fhggjkhkjggkjhkj");
    	 Reporter.log("To Send data in EnterSelectValue_Field Successfully",true);
    	 waitForSomeTime();
		
    	 HighlightOnElement(SearchButton);
    	 Assert.assertTrue(SearchButton.isDisplayed(),"Test case Failed");
    	 SearchButton.click();
    	 Reporter.log("To Click on SearchButton is Successfully",true);
    	 waitForSomeTime();
    	 waitForSomeTime();
    	 HighlightOnElement(NorecordFound_Message);
    	
	}
	
	@FindBy(xpath=".//*[@id='inboxForm:docAccordionPanel:dataTableId1']")
	private WebElement AppliocationGrid;
	
	public void toverifyEnterSelectedValueisvalidNumber() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		 HighlightOnElement(EnterSelectValue_Field);
    	 Assert.assertTrue(EnterSelectValue_Field.isDisplayed(),"Test case Failed");
    	 
    	 Reporter.log("To Send data in EnterSelectValue_Field Successfully",true);
    	 waitForSomeTime();
    	 excel.getExcelData(EnterSelectValue_Field, "IndividualApplicationNumber", 0, 1);
    	
    	 HighlightOnElement(SearchButton);
    	 Assert.assertTrue(SearchButton.isDisplayed(),"Test case Failed");
    	 SearchButton.click();
    	 Reporter.log("To Click on SearchButton is Successfully",true);
    	 waitForSomeTime();
    	 waitForSomeTime();
    	 HighlightOnElement(AppliocationGrid);
    	
	}
	
	
	@FindBy(xpath="//span[contains(.,'Sale/Purchase Detail')]/../following-sibling::div[1]/span/div/div[1]/table/tbody/tr/td/button[contains(.,'Fill Check List')]")
	private WebElement FillCheckList_Button;
	
	@FindBy(xpath="//span[contains(.,'Sale/Purchase Detail')]/../following-sibling::div[1]/span/div/div[1]/table/tbody/tr/td/button[contains(.,'Send Alert')]")
	private WebElement SendAlert_Button;
	
	@FindBy(xpath="//span[contains(.,'Fill Check List')]/../following-sibling::div[1]/div/div/table/tbody/tr[1]/td[6]/div/div[3]/span")
	private WebElement ApplicationIdProofDropdown;
	
	@FindBy(xpath="//span[contains(.,'Fill Check List')]/../following-sibling::div[1]/div/div/table/tbody/tr[2]/td[6]/div/div[3]/span")
	private WebElement AddressIdProofDropdown;
	
	@FindBy(xpath="//span[contains(.,'Fill Check List')]/../following-sibling::div[1]/div/div/table/tbody/tr[3]/td[6]/div/div[3]/span")
	private WebElement EMDFeesPaid_Dropdown;
	
	@FindBy(xpath="//span[contains(.,'Fill Check List')]/../following-sibling::div[1]/div/div/table/tbody/tr[4]/td[6]/div/div[3]/span")
	private WebElement ApplicationFeesPaid_Dropdown;
	
	@FindBy(xpath="//span[contains(.,'Fill Check List')]/../following-sibling::div[1]/center[2]/button[contains(.,'Submit')]")
	private WebElement Submit_BUTTON;
	
	public void toverifyNoteligibleFunctionality() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		 HighlightOnElement(EnterSelectValue_Field);
    	 Assert.assertTrue(EnterSelectValue_Field.isDisplayed(),"Test case Failed");
    	 
    	 Reporter.log("To Send data in EnterSelectValue_Field Successfully",true);
    	 waitForSomeTime();
    	 excel.getExcelData(EnterSelectValue_Field, "IndividualApplicationNumber", 0, 1);
    	
    	 HighlightOnElement(SearchButton);
    	 Assert.assertTrue(SearchButton.isDisplayed(),"Test case Failed");
    	 SearchButton.click();
    	 Reporter.log("To Click on SearchButton is Successfully",true);
    	 waitForSomeTime();
    	 waitForSomeTime();
    	 waitForSomeTime();
    	 HighlightOnElement(CheckBox1);
    	 CheckBox1.click();
    	 HighlightOnElement(FillCheckList_Button);
    	 Assert.assertTrue(FillCheckList_Button.isDisplayed(),"Test case Failed");
    	 FillCheckList_Button.click();
    	 Reporter.log("To Click in FillCheckList_Button Successfully",true);
    	 waitForSomeTime();
    	 
    	 HighlightOnElement(ApplicationIdProofDropdown);
    	 ApplicationIdProofDropdown.click();
    	 selectValueFromDropdown("Yes");
    	 waitForSomeTime();
    	 
    	 HighlightOnElement(AddressIdProofDropdown);
    	 AddressIdProofDropdown.click();
    	 selectValueFromDropdown("Yes");
    	 waitForSomeTime();
	 	    	
    	 HighlightOnElement(EMDFeesPaid_Dropdown);
    	 EMDFeesPaid_Dropdown.click();
    	 selectValueFromDropdown("Yes");
    	 waitForSomeTime();
    	 
    	 HighlightOnElement(ApplicationFeesPaid_Dropdown);
    	 ApplicationFeesPaid_Dropdown.click();
    	 selectValueFromDropdown("Yes");
    	 waitForSomeTime();
    	 HighlightOnElement(Submit_BUTTON);
    	 Submit_BUTTON.click();
    	 waitForSomeTime();
    	 Thread.sleep(10000);
    	 HighlightOnElement(EligibleLabel);
    	 String Label =EligibleLabel.getText();
    	 Reporter.log("data Is:"+Label,true);
    	 
    	 
	}
	
	@FindBy(xpath="//span[contains(.,'Sale/Purchase Detail')]/../following-sibling::div[1]/span/div/div[1]/table/tbody/tr/td/input")
	private WebElement RemarksField;
	
	
	public void toverifyEligibleFunctionality() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		 HighlightOnElement(EnterSelectValue_Field);
    	 Assert.assertTrue(EnterSelectValue_Field.isDisplayed(),"Test case Failed");
    	 
    	 Reporter.log("To Send data in EnterSelectValue_Field Successfully",true);
    	 waitForSomeTime();
    	 excel.getExcelData(EnterSelectValue_Field, "IndividualApplicationNumber", 0, 1);
    	
    	 HighlightOnElement(SearchButton);
    	 Assert.assertTrue(SearchButton.isDisplayed(),"Test case Failed");
    	 SearchButton.click();
    	 Reporter.log("To Click on SearchButton is Successfully",true);
    	 waitForSomeTime();
    	 waitForSomeTime();
    	 waitForSomeTime();
    	 HighlightOnElement(CheckBox1);
    	 CheckBox1.click();
    	 HighlightOnElement(FillCheckList_Button);
    	 Assert.assertTrue(FillCheckList_Button.isDisplayed(),"Test case Failed");
    	 FillCheckList_Button.click();
    	 Reporter.log("To Click in FillCheckList_Button Successfully",true);
    	 waitForSomeTime();
    	 
    	 HighlightOnElement(ApplicationIdProofDropdown);
    	 ApplicationIdProofDropdown.click();
    	 selectValueFromDropdown("Yes");
    	 waitForSomeTime();
    	 
    	 HighlightOnElement(AddressIdProofDropdown);
    	 AddressIdProofDropdown.click();
    	 selectValueFromDropdown("Yes");
    	 waitForSomeTime();
	 	    	
    	 HighlightOnElement(EMDFeesPaid_Dropdown);
    	 EMDFeesPaid_Dropdown.click();
    	 selectValueFromDropdown("Yes");
    	 waitForSomeTime();
    	 
    	 HighlightOnElement(ApplicationFeesPaid_Dropdown);
    	 ApplicationFeesPaid_Dropdown.click();
    	 selectValueFromDropdown("Yes");
    	 waitForSomeTime();
    	 HighlightOnElement(Submit_BUTTON);
    	 Submit_BUTTON.click();
    	 waitForSomeTime();
    	 Thread.sleep(10000);
    	 HighlightOnElement(Eligible_Button);
    	 Eligible_Button.click();
    	 waitForSomeTime();
    	 waitForSomeTime();
    	 HighlightOnElement(EligibleLabel);
    	 String Label =EligibleLabel.getText();
    	 Reporter.log("data Is:"+Label,true);
    	/* HighlightOnElement(RemarksField);
    	 Assert.assertTrue(RemarksField.isDisplayed(),"Test case Failed");
    	 RemarksField.sendKeys("Remarks Provided By SE");
    	 Reporter.log("To Send Data  RemarksField Successfully",true);
    	 waitForSomeTime();*/
    	 
	}
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div[1]/center/table[1]/tbody/tr[1]/td[2]/div/div[3]/span")
	private WebElement SelectActionDropdown;
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div[1]/center/table[1]/tbody/tr[1]/td[3]/span/table/tbody/tr[2]/td/div/div[3]/span")
	private WebElement SelectUserDropdown;
	
	
	public void verifyFunctionalityofActionDropdown() throws InterruptedException
	{
		HighlightOnElement(SelectActionDropdown);
		 Assert.assertTrue(SelectActionDropdown.isDisplayed(),"Test case Failed");
		 SelectActionDropdown.click();
		 selectValueFromDropdown("Forward");
    	 Reporter.log("To Select Data  SelectActionDropdown Successfully",true);
    	 waitForSomeTime();
    	 waitForSomeTime();
    	 HighlightOnElement(SelectUserDropdown);
		 Assert.assertTrue(SelectUserDropdown.isDisplayed(),"Test case Failed");
		 SelectUserDropdown.click();
    	selectValueFromDropdown("Rajat Kumar (CEO)");
    	 Reporter.log("To Select Data  SelectUserDropdown Successfully",true);
    	 waitForSomeTime();
    	 waitForSomeTime();
					
	}
	
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div[1]/center/table[2]/tbody/tr[6]/td/textarea")
	private WebElement CommentsField;
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div[1]/center/table[2]/tbody/tr[8]/td/table/tbody/tr/td/div/div[1]/label")
	private WebElement UploadDocument;
	
	@FindBy(xpath=".//*[@id='inboxForm:submitButton']")
	private WebElement SubmitButton;
	
	@FindBy(xpath=".//*[@id='inboxForm:msg_container']/div/div/div[2]/span")
	private WebElement PopUpMsg;
	
	
	public void toverifyEnterCommentsFieldisBlank() throws InterruptedException
	{
		HighlightOnElement(CommentsField);
		Assert.assertTrue(CommentsField.isEnabled(),"Test Case Pass: EnterCommentsField");
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(SubmitButton);
		SubmitButton.click();
		waitForSomeTime();
		waitForSomeTime();
		String ActualMessage=PopUpMsg.getText();
		String ExpectedMessage="Comments is required !";
		Assert.assertEquals(ActualMessage, ExpectedMessage);
		waitForSomeTime();
		waitForSomeTime();

	}
	
	public void toverifyEnterCommentsField() throws InterruptedException
	{
		HighlightOnElement(CommentsField);
		Assert.assertTrue(CommentsField.isEnabled(),"Test Case Pass: EnterCommentsField");
		waitForSomeTime();
		waitForSomeTime();
		CommentsField.sendKeys("Project Scrutiny Request Forwarded to CEO ");
		waitForSomeTime();
		waitForSomeTime();

	}
	
	
	public void toverifyinvalidUploaddocumentfield() throws AWTException, InterruptedException
	{
		
		HighlightOnElement(UploadDocument);
		UploadDocument.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\TestData.txt"); 
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(PopUpMsg);
		String ActualMessage=PopUpMsg.getText();
		String ExpectedMessage="Please select actual file, changed extension and .exe not allowed.";
		Assert.assertEquals(ActualMessage, ExpectedMessage);
		waitForSomeTime();
		waitForSomeTime();
	
	}
	
	public void toverifyUploaddocumentfield() throws AWTException, InterruptedException
	{
		
		HighlightOnElement(UploadDocument);
		UploadDocument.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur.jpg");
		System.out.println("Upload Document Successfully" ); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	
	}
	
	public void toverifysubmitbuttonFunctionality() throws InterruptedException
	{
		
		HighlightOnElement(SubmitButton);
		Assert.assertNotNull(SubmitButton.isDisplayed(),"Test case pass");
		SubmitButton.click();
		Reporter.log(" To click SubmitButton Successfully",true);
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		Thread.sleep(150000);
		//waitForelementPresent(EnterApplicationNumber_Field);
		
		
	}
	
	
	
}