package NRDA_Estate_Project;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.google.common.base.Verify;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToverifyFunctionalityof_SEProject_Scrutiny extends CommonLibrary
{

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

	
     @FindBy(xpath="//a[contains(.,'eGovernance')]")
     private WebElement eGovernanceLink;

     @FindBy(xpath="//span[contains(.,'Application Form')]")
     private WebElement ApplicationForm_Link;


     @FindBy(xpath="//div[@class='ui-accordion ui-widget ui-helper-reset ui-hidden-container Accordian-Header-Black']/h3/a")
     private List <WebElement> MenuLists;

     public void toverifyApplicationFormLink() throws InterruptedException
     {
    	 HighlightOnElement(eGovernanceLink);
    	 Assert.assertTrue(eGovernanceLink.isDisplayed(),"Test case Failed");
    	 eGovernanceLink.click();
    	 Reporter.log("To Click on eGovernanceLink is Successfully",true);
    	 waitForSomeTime();
	
    	 HighlightOnElement(ApplicationForm_Link);
    	 Assert.assertNotNull(ApplicationForm_Link.isDisplayed(),"Test case pass");
    	 ApplicationForm_Link.click();
    	 Reporter.log("To Click on ApplicationForm_Link is Successfully",true);
    	 waitForSomeTime();
			
    	 waitForSomeTime();
    	 for(WebElement menulist:MenuLists)
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

     @FindBy(xpath="//div[@class='ui-accordion ui-widget ui-helper-reset ui-hidden-container Accordian-Header-Black']/h3/a[contains(.,'Estate & Project Section')]")
		private WebElement EstateAndProjectSectionLink;
		
		@FindBy(xpath="//a[contains(.,'Estate & Project Section')]/../following-sibling::div[1]/table/tbody/tr/td[1]/span")
		private List<WebElement> SubMenuLists;
		
	
		public void toverifyEstate_Project_SectionLink() throws InterruptedException
		{
			HighlightOnElement(EstateAndProjectSectionLink);
			Assert.assertNotNull(EstateAndProjectSectionLink.isDisplayed(),"Test case pass");
			EstateAndProjectSectionLink.click();
			Reporter.log("To Click on EstateAndProjectSectionLink is Successfully",true);
			waitForSomeTime();
					
			waitForSomeTime();
			for(WebElement menulist:SubMenuLists)
			{
				HighlightOnElement(menulist);
				Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
				if(menulist.isDisplayed())
				{
					String Menu=menulist.getText();
					System.out.println(" SubMenu list in EstateAndProjectSectionLink are:"+Menu );
				}
			}
			
			
		}

		@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/table/tbody/tr/td/div/div[3]/table/tbody/tr/td/span[contains(text(),'PROJECT SCRUTINY')]/../following-sibling::td/span/a/img[@src='/NRDAuthorityPreUAT/javax.faces.resource/applyNow.png.xhtml?ln=img']")
		private WebElement ProjectScrutinyLink;
		
		@FindBy(xpath="//button[contains(.,'Proceed')]")
		private WebElement ProceedButton;
		
		@FindBy(xpath=".//*[@id='form0']/div[1]/div[2]")
		private WebElement ProjectScrutinyHeading;
		
		public void toverifyProjectScrutinyLink() throws InterruptedException
		{
			
			HighlightOnElement(EstateAndProjectSectionLink);
			Assert.assertNotNull(EstateAndProjectSectionLink.isDisplayed(),"Test case pass");
			EstateAndProjectSectionLink.click();
			Reporter.log("To Click on EstateAndProjectSectionLink is Successfully",true);
			waitForSomeTime();
			HighlightOnElement(ProjectScrutinyLink);
			Assert.assertNotNull(ProjectScrutinyLink.isDisplayed(),"Test case pass");
			ProjectScrutinyLink.click();
			Reporter.log("To Click on ProjectScrutinyLink is Successfully",true);
			waitForSomeTime();
			HighlightOnElement(ProjectScrutinyHeading);
			Assert.assertNotNull(ProjectScrutinyHeading.isDisplayed(),"Test case pass");
			Reporter.log("ProjectScrutinyHeading is Present in Application",true);
			waitForSomeTime();
			HighlightOnElement(ProceedButton);
			Assert.assertNotNull(ProceedButton.isDisplayed(),"Test case pass");
			//ProceedButton.click();
			Reporter.log("ProceedButton is Present in Application",true);
			waitForSomeTime();
		
		}
		
		@FindBy(xpath="(//a[contains(.,'PROJECT SCRUTINY')])[2]")
		private WebElement MenuLabel;
		
		
		public void toverifyProceedButtonFunctionality() throws InterruptedException
		{
	
			HighlightOnElement(ProceedButton);
			Assert.assertNotNull(ProceedButton.isDisplayed(),"Test case pass");
			ProceedButton.click();
			Reporter.log(" To Click onProceedButton is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForelementPresent(MenuLabel);
			HighlightOnElement(MenuLabel);
			
		}
		
		@FindBy(xpath="//a[contains(.,'PROJECT SCRUTINY')]/../../following-sibling::div/div/table[1]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label")
		private List<WebElement> ApplicationLabels;
		
		public void toverifyProjectScrutinyform() throws InterruptedException
		{
	
			HighlightOnElement(ProceedButton);
			Assert.assertNotNull(ProceedButton.isDisplayed(),"Test case pass");
			ProceedButton.click();
			Reporter.log(" To Click onProceedButton is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			Thread.sleep(15000);
			for(WebElement menulist:ApplicationLabels)
			{
				HighlightOnElement(menulist);
				Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
				if(menulist.isDisplayed())
				{
					String Menu=menulist.getText();
					System.out.println(" Labels list in Application Form are:"+Menu );
				}
			}
			
		}
	
		@FindBy(xpath="(//img[@src='/NRDAuthorityPreUAT/javax.faces.resource/images/search-aadhar.png.xhtml'])[1]")
		private WebElement SearchIcon;
		
		@FindBy(xpath="(//span[contains(.,'Search Project Detail')]/../following-sibling::div)[1]//table/tbody/tr/td/label")
		private  List<WebElement> SearchPropertyDetail_Labels;

		@FindBy(xpath=".//*[@id='form0:dlg_projectSearchScrutiny']/div[1]/a/span")
		private WebElement closePopup;
		
		public void toclickonProceedButton() throws InterruptedException
		{
			
			HighlightOnElement(ProceedButton);
			Assert.assertNotNull(ProceedButton.isDisplayed(),"Test case pass");
			ProceedButton.click();
			Reporter.log(" To Click onProceedButton is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			Thread.sleep(15000);
			
		}

		
		public void toverifySearchIcon() throws InterruptedException
		{
	
			
			HighlightOnElement(SearchIcon);
			Assert.assertNotNull(SearchIcon.isDisplayed(),"Test case pass");
			SearchIcon.click();
			Reporter.log(" To Click SearchIcon is successfully",true);
			waitForSomeTime();
			Thread.sleep(7000);
			for(WebElement menulist:SearchPropertyDetail_Labels)
			{
				HighlightOnElement(menulist);
				Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
				if(menulist.isDisplayed())
				{
					String Menu=menulist.getText();
					System.out.println(" Labels list SearchPropertyDetail are:"+Menu );
				}
			}
			
			HighlightOnElement(closePopup);
			closePopup.click();
			waitForSomeTime();
			
			
		}
		
		
		@FindBy(xpath="(//span[contains(.,'Search Project Detail')]/../following-sibling::div)[1]/table/tbody/tr/td[2]/div/div[3]/span")
		private WebElement SearchByDropdown;
		
		@FindBy(xpath="(//span[contains(.,'Search Project Detail')]/../following-sibling::div)[1]/table/tbody/tr/td[4]/input")
		private WebElement EnterSelectedValue;
		
		@FindBy(xpath="(//span[contains(.,'Search Project Detail')]/../following-sibling::div)[1]/span/center/button/span[contains(.,'Search')]")
		private WebElement Search_Button;
		
		@FindBy(xpath="//span[contains(.,'Project Detail')]/../following-sibling::div/span/div/div/table/tbody/tr/td/div/div[2]")
		private WebElement CheckBox;
		
		@FindBy(xpath="(//button[contains(.,'Fill in Form')])[1]")
		private WebElement Fillinform_Button;
		
		public void toverifySearchByFunctionality() throws InterruptedException
		{

			HighlightOnElement(SearchIcon);
			Assert.assertNotNull(SearchIcon.isDisplayed(),"Test case pass");
			SearchIcon.click();
			Thread.sleep(8000);
			Reporter.log(" To Click SearchIcon is successfully",true);
			waitForSomeTime();
			
			HighlightOnElement(SearchByDropdown);
			Assert.assertNotNull(SearchByDropdown.isDisplayed(),"Test case pass");
			SearchByDropdown.click();
			Reporter.log(" To Click SearchByDropdown is successfully",true);
			selectValueFromDropdown("Project Code");
			waitForSomeTime();
			
			HighlightOnElement(EnterSelectedValue);
			Assert.assertNotNull(EnterSelectedValue.isDisplayed(),"Test case pass");
			EnterSelectedValue.sendKeys("NP/01/02");
			Reporter.log(" To Click SearchByDropdown is successfully",true);
			
			HighlightOnElement(Search_Button);
			Assert.assertNotNull(Search_Button.isDisplayed(),"Test case pass");
			Search_Button.click();
			Reporter.log(" To Click Search_Button is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			
			HighlightOnElement(CheckBox);
			Assert.assertNotNull(CheckBox.isDisplayed(),"Test case pass");
			CheckBox.click();
			Reporter.log(" To Click CheckBox is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			
			HighlightOnElement(Fillinform_Button);
			Assert.assertNotNull(Fillinform_Button.isDisplayed(),"Test case pass");
			Fillinform_Button.click();
			Reporter.log(" To Click Fillinform_Button is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
		
		}
		
		
		
		public void toVerifyApplicationDetailsinProject() throws InterruptedException
		{
			waitForSomeTime();
			for(WebElement ProjectDetails:ApplicationInputs)
			{
				HighlightOnElement(ProjectDetails);
				Assert.assertNotNull(ProjectDetails.isDisplayed(),"Test case pass");
				if(ProjectDetails.isDisplayed())
				{
					String Menu=ProjectDetails.getAttribute("value");
					System.out.println(" ApplicationDetailsinProject are:"+Menu );
				}
			}
			
			
		
		}
		

		@FindBy(xpath="//a[contains(.,'PROJECT SCRUTINY')]/../../following-sibling::div/div/table[1]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/input")
		private List<WebElement> ApplicationInputs;
		
		@FindBy(xpath="//a[contains(.,'PROJECT SCRUTINY')]/../../following-sibling::div/div/table[1]/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/input")
		private WebElement ProjectCode_Field;
		
		@FindBy(xpath="//a[contains(.,'PROJECT SCRUTINY')]/../../following-sibling::div/div/table[1]/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/input")
		private WebElement ProjectName_Field;
		
		@FindBy(xpath="//a[contains(.,'PROJECT SCRUTINY')]/../../following-sibling::div/div/table[1]/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/input")
		private WebElement ProjectAddress_Field;
		
		
		public void toSelectonApplicationNumber() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			waitForSomeTime();
			String Application_Number=excel.getExcelData1("IndividualApplicationNumber", 0, 1);
			Reporter.log("Application NumberIs:"+Application_Number,true);
							    
			    boolean check = true;
			   
			    	List<WebElement> allrows = driver.findElements(By.xpath("//a[contains(.,'PROJECT SCRUTINY')]/../../following-sibling::div/div/table[2]/tbody/tr/td/div/div/table/tbody/tr"));
			            for(int row=1; row<=allrows.size(); row++)
			                {
			                    Reporter.log("Total rows :" +allrows.size(),true); 
			                    String name = driver.findElement(By.xpath("//a[contains(.,'PROJECT SCRUTINY')]/../../following-sibling::div/div/table[2]/tbody/tr/td/div/div/table/tbody/tr["+row+"]/td[2]")).getText();
			                    //Reporter.log(name);
			                    Reporter.log("Row loop",true);
			                    if(name.equals(Application_Number))
			                        {
			                            WebElement ApplicationNumber = driver.findElement(By.xpath("//a[contains(.,'PROJECT SCRUTINY')]/../../following-sibling::div/div/table[2]/tbody/tr/td/div/div/table/tbody/tr["+row+"]/td[1]/div/div[2]"));
			                            ApplicationNumber.click();
			                            waitForSomeTime();
			                            Reporter.log("Element  exist",true);
			                            check = false;
			                            break;
			                        }
			                    else
			                    {
			                        Reporter.log("Element doesn't exist",true);
			                    }
			               
			                }
		       
			           
			    waitForSomeTime();
		
		}
		
		
		@FindBy(xpath="//a[contains(.,'PROJECT SCRUTINY')]/../../following-sibling::div/div/span/center/table/tbody/tr/td/span/button[contains(.,'Submit')]")
		private WebElement Submit_Button;
		
		@FindBy(xpath="//a[contains(.,'PROJECT SCRUTINY')]/../../following-sibling::div/div/span/center/table/tbody/tr/td/span/button[contains(.,'Save As Draft')]")
		private WebElement SaveSadraft_Button;
		
		@FindBy(xpath="//a[contains(.,'PROJECT SCRUTINY')]/../../following-sibling::div/div/span/center/table/tbody/tr/td/span/button[contains(.,'Reset')]")
		private WebElement Reset_Button;
		
		@FindBy(xpath="//a[contains(.,'PROJECT SCRUTINY')]/../../following-sibling::div/div/span/center/table/tbody/tr/td/span/button[contains(.,'Close')]")
		private WebElement Close_Button;
		
		
		public void toVerifyFunctionalityofResetButton() throws InterruptedException
		{
			
			HighlightOnElement(Reset_Button);
	    	 Assert.assertTrue(Reset_Button.isDisplayed(),"Test case Failed");
	    	 Reset_Button.click();
	    	 Reporter.log("To Click on Reset_Button is Successfully",true);
	    	 waitForSomeTime();
	    	 Thread.sleep(5000);
	    	 VerifyTextField(ProjectName_Field);
	    	 VerifyTextField(ProjectCode_Field);
	    	 VerifyTextField(ProjectAddress_Field);
	    	 
		}
		
		
		@FindBy(xpath="//div[@id='form0:confirmDlg']/div[2]/div/div/center/table/tbody/tr/td/button")
		private List<WebElement> button;

		
		public void toVerifyFunctionalityofCloseButton() throws InterruptedException
		{
			
			HighlightOnElement(Close_Button);
	    	 Assert.assertTrue(Close_Button.isDisplayed(),"Test case Failed");
	    	 Close_Button.click();
	    	 Reporter.log("To Click on Reset_Button is Successfully",true);
	    	 waitForSomeTime();
	    	 Thread.sleep(5000);
	    	 for(int index=0;index<button.size();index++)
			   {
				String buttone=button.get(index).getText();
				System.out.println(buttone);
				
				if( buttone.trim().equalsIgnoreCase("yes"))
				   {
					button.get(index).click();
					Reporter.log("Verify Yes Button In POP-UP Of Application   is Present",true);
				   }
			   }
			  waitForSomeTime();
		      waitForSomeTime();
			  waitForSomeTime();

		}
		
		
		@FindBy(xpath="//span[contains(.,'Basic Details')]/../following-sibling::div[1]/table/tbody/tr[1]/td[2]/a")
		private WebElement RefferenceNumber;
		
		public void toVerifyFunctionalityofSubmitButton() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			HighlightOnElement(Submit_Button);
	    	 Assert.assertTrue(Submit_Button.isDisplayed(),"Test case Failed");
	    	 Submit_Button.click();
	    	 Reporter.log("To Click on Submit_Button is Successfully",true);
	    	 waitForSomeTime();
	    	 Thread.sleep(5000);
	    	 HighlightOnElement(RefferenceNumber);
	 		String ApllicationNumber=RefferenceNumber.getText().trim();
	 		excel.updateExcelDATA3(ApllicationNumber);
	 		Reporter.log("Apploication Number is:  "+ ApllicationNumber,true);
	    	 
	    	 
		}
		
		
		@FindBy(xpath="//a[contains(.,'Sale/Purchase Detail')]")
		private WebElement SalePurchaseTab;
		
		@FindBy(xpath="//span[contains(.,'Pending Application')]")
		private WebElement PendingApplication;
		
		@FindBy(xpath="//span[contains(.,'Applications List')]/../following-sibling::div/div[1]/div/table/tbody/tr/td/input")
		private WebElement ApplicationSearchField;
		
		@FindBy(xpath="//a[contains(.,'Project Scrutiny')]")
		private WebElement ProjectScrutiny_Link;
		
		@FindBy(xpath="//a[contains(.,'Project Scrutiny')]/../following-sibling::div[1]/div/div/div/div[1]/table/thead/tr/th[2]/input")
		private WebElement ApplicationNumberFiled;
		
		@FindBy(xpath="//a[contains(.,'Project Scrutiny')]/../following-sibling::div[1]/div/div/div/div[1]/table/tbody/tr/td/center/a/img[@src='/NRDAuthorityPreUAT/resources/images/view-new.png']")
		private WebElement Action_Button;
		
		
		public void toverifyfunctionalityofSalePurchaseTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			 HighlightOnElement(eGovernanceLink);
	    	 Assert.assertTrue(eGovernanceLink.isDisplayed(),"Test case Failed");
	    	 eGovernanceLink.click();
	    	 Reporter.log("To Click on eGovernanceLink is Successfully",true);
	    	 waitForSomeTime();
	    	 
	    	 HighlightOnElement(PendingApplication);
	    	 Assert.assertTrue(PendingApplication.isDisplayed(),"Test case Failed");
	    	 PendingApplication.click();
	    	 Reporter.log("To Click on PendingApplication is Successfully",true);
	    	 waitForSomeTime();
	    	 Thread.sleep(300000);
	    	// waitForelementPresent(ApplicationSearchField);
	    	 
	    	 ScroolDown();
	    	 ScroolDown();
	    	 HighlightOnElement(ProjectScrutiny_Link);
	    	 Assert.assertTrue(ProjectScrutiny_Link.isDisplayed(),"Test case Failed");
	    	 ProjectScrutiny_Link.click();
	    	 Reporter.log("To Click on ProjectScrutiny_Link is Successfully",true);
	    	 waitForSomeTime();
	    	 
	    	 HighlightOnElement(ApplicationNumberFiled);
	    	 Assert.assertTrue(ApplicationNumberFiled.isDisplayed(),"Test case Failed");
	    	 excel.getExcelData(ApplicationNumberFiled, "RefferenceNumber", 0, 1);
			waitForSomeTime();
			waitForSomeTime();
	    	 HighlightOnElement(Action_Button);
	    	 Assert.assertTrue(Action_Button.isDisplayed(),"Test case Failed");
	    	 Action_Button.click();
	    	 Reporter.log("To Click on Action_Button is Successfully",true);
	    	 waitForSomeTime();
	    	 
	    	 HighlightOnElement(SalePurchaseTab);
	    	 Assert.assertTrue(SalePurchaseTab.isDisplayed(),"Test case Failed");
	    	 SalePurchaseTab.click();
	    	 Reporter.log("To Click on SalePurchaseTab is Successfully",true);
	    	 waitForSomeTime();
			
		}
		
		@FindBy(xpath="//span[contains(.,'Estate & Project Section')]/../../following-sibling::div/div[1]/div[2]/span")
		private WebElement MyInboxLink;
		
		@FindBy(xpath="//span[contains(.,'Application')]/../following-sibling::div[1]/div/h3/a[contains(.,'PROJECT SCRUTINY')]")
		private WebElement ProjectScrutiny_Link1;
		
		
		public void toverifyMyInboxlink() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			HighlightOnElement(MyInboxLink);
			Assert.assertNotNull(MyInboxLink.isDisplayed(),"Test case pass");
			MyInboxLink.click();
			Reporter.log("To Click on MyInboxLink is Successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			ScroolDown();
			
			HighlightOnElement(ProjectScrutiny_Link1);
			ProjectScrutiny_Link1.click();
			waitForSomeTime();
			
			HighlightOnElement(ApplicationNo_Field1);
			 excel.getExcelData(ApplicationNo_Field1, "RefferenceNumber", 0, 1);
			waitForSomeTime();
			waitForSomeTime();
			

			HighlightOnElement(Action_Button1);
			Assert.assertNotNull(Action_Button1.isDisplayed(),"Test case pass");
			Action_Button1.click();
			Reporter.log("To Click on Action_Button is Successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			Thread.sleep(12000);
			
		
		}
		
		
		@FindBy(xpath="//span[contains(.,'Application')]/../following-sibling::div[1]/div/h3/a[contains(.,'PROJECT SCRUTINY')]/../following-sibling::div[1]/div/div/div/div[1]/table/thead/tr/th[2]/input")
		private WebElement ApplicationNo_Field1;
		
		@FindBy(xpath="//span[contains(.,'Application')]/../following-sibling::div[1]/div/h3/a[contains(.,'PROJECT SCRUTINY')]/../following-sibling::div[1]/div/div/div/div[1]/table/tbody/tr/td/center/a/img[@src='/NRDAuthorityPreUAT/resources/images/view-new.png']")
		private WebElement Action_Button1;
		
		@FindBy(xpath="//a[contains(.,'Sale/Purchase Detail')]/../../following-sibling::div/div[3]/table[1]/tbody/tr/td/label")
		private List<WebElement> SalePurchaseTabLabels;
		
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
		
		@FindBy(xpath="//span[contains(.,'Fill Check List')]/../following-sibling::div[1]/div/div/table/tbody/tr[1]/td[3]/div/div[3]/span")
		private WebElement ApplicationIdProofDropdown;
		
		@FindBy(xpath="//span[contains(.,'Fill Check List')]/../following-sibling::div[1]/div/div/table/tbody/tr[2]/td[3]/div/div[3]/span")
		private WebElement AddressIdProofDropdown;
		
		@FindBy(xpath="//span[contains(.,'Fill Check List')]/../following-sibling::div[1]/div/div/table/tbody/tr[3]/td[3]/div/div[3]/span")
		private WebElement EMDFeesPaid_Dropdown;
		
		@FindBy(xpath="//span[contains(.,'Fill Check List')]/../following-sibling::div[1]/div/div/table/tbody/tr[4]/td[3]/div/div[3]/span")
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
	    	 HighlightOnElement(NoNEligibleLabel);
	    	 String Label =NoNEligibleLabel.getText();
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
	    	 HighlightOnElement(RemarksField);
	    	 Assert.assertTrue(RemarksField.isDisplayed(),"Test case Failed");
	    	 RemarksField.sendKeys("Remarks Provided By SE");
	    	 Reporter.log("To Send Data  RemarksField Successfully",true);
	    	 waitForSomeTime();
	    	 
		}
		
		
		@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div[1]/center/table[1]/tbody/tr[1]/td[2]/div/div[3]/span")
		private WebElement SelectActionDropdown;
		
		@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div[1]/center/table[1]/tbody/tr[1]/td[3]/span/table/tbody/tr[2]/td/div/div[3]/span")
		private WebElement SelectUserDropdown;
		
		@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div[1]/center/table[2]/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/button[contains(.,'Search')]")
		private WebElement SearchButton1;
		
		@FindBy(xpath="//span[contains(.,'Search Action')]/../following-sibling::div/div/div/table[1]/tbody/tr/td[3]/input")
		private WebElement SubjectInputField;
		
		@FindBy(xpath="//span[contains(.,'Search Action')]/../following-sibling::div/div/div/center[1]/table/tbody/tr/td/button[contains(.,'Search')]")
		private WebElement SearchButton2;
		
		@FindBy(xpath=".//*[@id='inboxForm:searchdata_data']/tr/td[1]/div/div[2]")
		private WebElement RadioButton;
		
		@FindBy(xpath="//button[contains(.,'Fill In Form')]")
		private WebElement FillinFormButton;
		
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
	    	selectValueFromDropdown("Manish Mishra (MGR)");
	    	 Reporter.log("To Select Data  SelectUserDropdown Successfully",true);
	    	 waitForSomeTime();
	    	 waitForSomeTime();
						
		}
		
		
		@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div[1]/center/table[2]/tbody/tr[1]/td[2]/input")
		private WebElement SubjectField;
		
		@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div[1]/center/table[2]/tbody/tr[2]/td[2]/table/tbody/tr/td[1]/input")
		private WebElement FileField;
		
		public void ToFillFileandSubjectFieldwithValidData() throws InterruptedException
		{
		
			 HighlightOnElement(SearchButton1);
			 Assert.assertTrue(SearchButton1.isDisplayed(),"Test case Failed");
			 SearchButton1.click();
	    	 Reporter.log("To click on SearchButton1 Successfully",true);
	    	 waitForSomeTime();
	    	 
	    	 HighlightOnElement(SubjectInputField);
			 Assert.assertTrue(SubjectInputField.isDisplayed(),"Test case Failed");
			 SubjectInputField.sendKeys("Scrutiny");
	    	 Reporter.log("To send data on SubjectInputField Successfully",true);
	    	 waitForSomeTime();
	    	 
	    	 HighlightOnElement(SearchButton2);
			 Assert.assertTrue(SearchButton2.isDisplayed(),"Test case Failed");
			 SearchButton2.click();
	    	 Reporter.log("To click on SearchButton2 Successfully",true);
	    	 waitForSomeTime();
	    	 waitForSomeTime();
	    	 
	    	 HighlightOnElement(RadioButton);
			 Assert.assertTrue(RadioButton.isDisplayed(),"Test case Failed");
			 RadioButton.click();
	    	 Reporter.log("To click on RadioButton Successfully",true);
	    	 waitForSomeTime();
	    	 
	    	 HighlightOnElement(FillinFormButton);
			 Assert.assertTrue(FillinFormButton.isDisplayed(),"Test case Failed");
			 FillinFormButton.click();
	    	 Reporter.log("To click on FillinFormButton Successfully",true);
	    	 waitForSomeTime();
	    	 waitForSomeTime();
	    	 waitForSomeTime();
	    	    	 
	    	 VerifyTextField(SubjectField);
	    	 VerifyTextField(FileField);
	    	 
		}
		
		@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div[1]/center/table[2]/tbody/tr[3]/td[2]/textarea")
		private WebElement CommentsField;
		
		@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div[1]/center/table[2]/tbody/tr[4]/td[2]/table/tbody/tr/td/div/div[1]/label")
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
			CommentsField.sendKeys("Project Scrutiny Request Forwarded to M-Project ");
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