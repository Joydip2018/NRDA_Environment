﻿package NRDA_RTI;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;




/**
 * @author Sarvesh.Nellore
 * @Date: 16-10-2017
 *  @Purpose: Wter And Sewerage RTI Login As Citizen
 */
public class ToverifyRTILoginAsCitizen extends CommonLibrary 
	{
		Logger log=Logger.getLogger("devpinoyLogger");
		ExcelDataDriver excel=new ExcelDataDriver();
		
	
		/****************************************************************************************************/
		/*
		 * This is the xpath of the WebElement "Home DashBoard Menu".
		 * @author deepak.saini
		 * @since 2017-08-11
		 */
		/*****************************************************************************************************/
		@FindBy(xpath="//table[@style='width:100%;']/tbody/tr/td/div/h3/a")
		private List <WebElement> Menu_DashBoard;
		
		@FindBy(xpath="//a[contains(.,'Fresh Application')]")
		private WebElement FreshApplication;
		
		
		public void toverifyDashBoardMenu_SC_02_TC_01() throws InterruptedException
		{
			waitForSomeTime();
			HighlightOnElement(FreshApplication);
			FreshApplication.click();
			for(WebElement MenuInDashBoard:Menu_DashBoard)
			{
				
				if(MenuInDashBoard.isDisplayed())
				{
					HighlightOnElement(MenuInDashBoard);
					String DashBoardMenu=MenuInDashBoard.getText();
					Reporter.log("MenuInDasHboard Are:"+DashBoardMenu,true);
				}
			}
			
			
		}
		
		/****************************************************************************************************/
		/*
		 * This is the xpath of the WebElement "RTI Menu".
		 * @author deepak.saini
		 * @since 2017-08-11
		 */
		/*****************************************************************************************************/
		@FindBy(xpath="//table[@style='width:100%;']/tbody/tr/td/div/h3/a[contains(.,'Administrative Section')]")
		private WebElement RTI_Menu;
		
		/****************************************************************************************************/
		/*
		 * This is the xpath of the WebElement "RTI Online".
		 * @author deepak.saini
		 * @since 2017-08-11
		 */
		/*****************************************************************************************************/
		@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/div[1]/div/table/tbody/tr/td/div/h3/following-sibling::div/table/tbody/tr/td/label[contains(text(),'ONLINE RTI')]/../following-sibling::td/span/a/img[@src='/NRDAuthorityPreUAT/javax.faces.resource/applyNow.png.xhtml?ln=img']")
		private WebElement OnlineRTI;
		
		/****************************************************************************************************/
		/*
		 * This is the xpath of the WebElement "RTI Online".
		 * @author deepak.saini
		 * @since 2017-08-11
		 */
		/*****************************************************************************************************/
		@FindBy(xpath="//button[contains(.,'Proceed') and@role='button']")
		private WebElement Proceed_Button;
		
		
		/****************************************************************************************************/
		/*
		 * This is the xpath of the WebElement "RTI APPLICANT LABElS".
		 * @author deepak.saini
		 * @since 2017-08-11
		 */
		/*****************************************************************************************************/
		@FindBy(xpath="//a[contains(.,'Personal Details of RTI Applicant')]/../../following-sibling::div/div[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label")
		private List <WebElement> RTIApplicantLabel;
		
		@FindBy(xpath="//button[contains(.,'New Application')]")
		private WebElement NewApplication;
		
		
		@FindBy(xpath="//span[contains(.,'Confirm Action')]/../following-sibling::div/div/div/div/div[1]/table/tbody/tr/td/button[contains(.,'Proceed')]")
		private WebElement Proceed1_Button;
		
		@FindBy(xpath="//span[@class='ui-paginator-last ui-state-default ui-corner-all']")
		private WebElement next_Button;
		
		@FindBy(xpath="//div[@id='form0:citizenFirstApeal']//span[@class='ui-icon ui-icon-closethick']")
		private WebElement Close;
		
		@FindBy(xpath="//div[@id='form0:datatb']//div[1]//table//tr")
		private List<WebElement> findapplication;
		
		
		
		public void clickOnToVerifyRTIConnection02() throws InterruptedException
		{
			waitForDomElement();
			FreshApplication.click();
			HighlightOnElement(RTI_Menu);
			Assert.assertEquals(true,RTI_Menu.isEnabled());
			Assert.assertNotNull(RTI_Menu,"Click on Application of NRDA  RTI Menu link sucessfully");
			HighlightOnElement(RTI_Menu);
			RTI_Menu.click();
			Reporter.log("Verify Application of NRDA  RTI Menu link is Present",true); //print for eclipse console 
			waitForSomeTime();
			
			waitForSomeTime();
			Assert.assertEquals(true,OnlineRTI.isEnabled());
			Assert.assertNotNull(OnlineRTI,"Click on Application of NRDAOnline RTI link sucessfully");
			HighlightOnElement(OnlineRTI);
			OnlineRTI.click();
			Reporter.log("Verify Application of NRDA Online RTI link is Present",true); //print for eclipse console 
			waitForSomeTime();
			waitForSomeTime();
			
			Assert.assertEquals(true,Proceed_Button.isEnabled());
			Assert.assertNotNull(Proceed_Button,"Click on Application of NRDA Proceed_Button sucessfully");
			HighlightOnElement(Proceed_Button);
			Proceed_Button.click();
			Reporter.log("Verify Application of NRDA Proceed_Button is Present",true); //print for eclipse console 
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
//			waitForelementPresent(NewApplication);
//			HighlightOnElement(NewApplication);
//			NewApplication.click();
//			waitForSomeTime();
//			waitForSomeTime();
			
			
			
		
		}
		
		@FindBy(xpath="(//button/span[contains(.,'Reset')])[1]")
		private WebElement ResetApplication;
		
		@FindBy(xpath="(//span[contains(.,'Confirm Action')]/../following-sibling::div/div/div/center/table/tbody/tr/td/button[contains(.,'Yes')])[2]")
		private WebElement YesButtonPopUP;
		public void clickproceedButton() throws InterruptedException
		{
			waitForSomeTime();
			HighlightOnElement(Proceed1_Button);
			Proceed1_Button.click();
			/*if(Proceed1_Button.isDisplayed())
			{
				Proceed1_Button.click();	
			}
			else
			{
				System.out.println("No Drafted Application"); 
			}*/
			waitForSomeTime();
			waitForSomeTime();
			Thread.sleep(10000);
			HighlightOnElement(ResetApplication);
			ResetApplication.click();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(YesButtonPopUP);
			YesButtonPopUP.click();
			Thread.sleep(10000);
			waitForSomeTime();
			waitForSomeTime();
		}
		
		@FindBy(xpath="//label[contains(.,'ONLINE RTI')]/../../../following-sibling::div/div/div/div[1]/span/center/table/tbody/tr/td/span/button")
		private List<WebElement> Buttons;
		
		public void toverifyLabelsInRTIApplicant_SC_03_TC_01() throws InterruptedException
		{
			waitForSomeTime();
			for(WebElement MenuInDashBoard:RTIApplicantLabel)
			{
				waitForSomeTime();
				HighlightOnElement(MenuInDashBoard);
				if(MenuInDashBoard.isDisplayed())
				{
					
					String DashBoardMenu=MenuInDashBoard.getText();
					Reporter.log("RTI Appliacnt Fields  Are:"+DashBoardMenu,true);
				}
				
			}
			
			waitForSomeTime();
			ScroolDown();
			for(WebElement MenuInDashBoard:Buttons)
			{
				HighlightOnElement(MenuInDashBoard);
				if(MenuInDashBoard.isDisplayed())
				{
					
					String DashBoardMenu=MenuInDashBoard.getText();
					Reporter.log("RTI Application in Buttons  Are:"+DashBoardMenu,true);
				}
				
			}
			ScroolUp();
			
		}

		@FindBy(xpath="//input[@title='Aadhaar Number'  and @type='text']")
		private WebElement AadhaarNumber;
		
		@FindBy(xpath="//input[@title='First Name'  and @type='text']")
		private WebElement FirstName;
		
		@FindBy(xpath="//input[@title='Last Name'  and @type='text']")
		private WebElement LastName;
		
		@FindBy(xpath="//input[@title='Middle Name'  and @type='text']")
		private WebElement MiddleName;
		
		@FindBy(xpath="//input[@title[contains(.,'Father / Husband / Wif')]  and @type='text']")
		private WebElement Father_Husband_Name;
		
		@FindBy(xpath="//select[@title='Relationship Type']")
		private WebElement RelationShip_Dropdown;
		
		@FindBy(xpath="//input[@title='Mother Name'  and @type='text']")
		private WebElement Mother_Name;
		
		@FindBy(xpath="//input[@title='Date of Birth']")
		private WebElement DateofBirth_Field;
		
		@FindBy(xpath="//a[contains(.,'1')]")
		private WebElement DateSelect;
		
		@FindBy(xpath="//select[@title='Gender']")
		private WebElement GenderDropdown;
		
		
		
		@FindBy(xpath="//select[@title='State']")
		private WebElement StateDropdown;
		
		@FindBy(xpath="//select[@title='District']")
		private WebElement DistrictDropdown;
		
		@FindBy(xpath="//select[@title='Tehsil']")
		private WebElement TesilDropdown;
		
		@FindBy(xpath="//textarea[@title='Address']")
		private WebElement Address;
		
		@FindBy(xpath="//input[@title='Pin Code'  and @type='text']")
		private WebElement Pincode;
		
		@FindBy(xpath="//input[@title='Phone Number'  and @type='text']")
		private WebElement PhoneNo;
		
		@FindBy(xpath="//select[@title='Area']")
		private WebElement AreaDropdown;
		
		@FindBy(xpath="//select[@title='Education Status']")
		private WebElement EducationDropdown;
		
		@FindBy(xpath="//input[@title='Mobile Number (For receiving SMS alert)'  and @type='text']")
		private WebElement MobileNo;
		
		@FindBy(xpath="//input[@title='Email-ID'  and @type='text']")
		private WebElement EmailID;
		
		@FindBy(xpath="//input[@title='Confirm Email-ID'  and @type='text']")
		private WebElement ConformEmailID;
		
		@FindBy(xpath="//select[@title='Citizenship']")
		private WebElement CitizenshipDropdown;
		
		@FindBy(xpath="//select[@title='Is the Applicant Below Poverty Line?']")
		private WebElement PovertylineDropdown;
		
		
		@FindBy(xpath="//input[@title='BPL No.'  and @type='text']")
		private WebElement BPL_NO;
		
		@FindBy(xpath="//select[@title='Delivery Mode']")
		private WebElement DelivaryModeDropdown;
		
		@FindBy(xpath="//select[@title='Media Type for Receiving Information']")
		private WebElement MediaReceivingDropdown;
		
		@FindBy(xpath="(//button[contains(.,'Save As Draft') and@role='button'])[3]")
		private WebElement SaveAsDraft_Button;
		
		@FindBy(xpath="(//button[contains(.,'Reset') and@role='button'])[3]")
		private WebElement Reset_Button;
		
		
		@FindBy(xpath="(//button[contains(.,'Close') and@role='button'])[3]")
		private WebElement Close_Button;
		
		@FindBy(xpath="(//button[contains(.,'Next') and@role='button'])[1]")
		private WebElement Next_Button;
		
		
		public void toverifyApplicantDetails_withValidData_SC_01_TC_02() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(AadhaarNumber);
			/*Assert.assertTrue(AadhaarNumber.isEnabled(),"TestCase Pass:  Aadhaar Number");
			AadhaarNumber.sendKeys("572241310456");*/
			Reporter.log("Verify Application of NRDA RTI Aadhaar Filed is Present",true); //print for eclipse console 
		
			HighlightOnElement(FirstName);
			Assert.assertTrue(FirstName.isEnabled(),"TestCase Pass:  FirstName");
			excel.getExcelData(FirstName, "RTIApplicantDetails", 1, 1);
			Reporter.log("Verify Application of NRDA RTI FirstName Filed is Present",true); //print for eclipse console 
		
			HighlightOnElement(LastName);
			Assert.assertTrue(LastName.isEnabled(),"TestCase Pass:  LastName");
			excel.getExcelData(LastName, "RTIApplicantDetails", 1, 2);
			Reporter.log("Verify Application of NRDA RTI LastName Filed is Present",true); //print for eclipse console 
		
			HighlightOnElement(MiddleName);
			Assert.assertTrue(MiddleName.isEnabled(),"TestCase Pass:  MiddleName");
			excel.getExcelData(MiddleName, "RTIApplicantDetails", 1, 3);
			Reporter.log("Verify Application of NRDA RTI MiddleName Filed is Present",true); //print for eclipse console 
		
			
			HighlightOnElement(Father_Husband_Name);
			Assert.assertTrue(Father_Husband_Name.isEnabled(),"TestCase Pass:  Father_Husband_Name");
			excel.getExcelData(Father_Husband_Name, "RTIApplicantDetails", 1, 5);
			Reporter.log("Verify Application of NRDA RTI Father_Husband_Name Filed is Present",true); //print for eclipse console 
		
			HighlightOnElement(RelationShip_Dropdown);
			Assert.assertTrue(RelationShip_Dropdown.isEnabled(),"TestCase Pass:  RelationShip_Dropdown");
			SelectVisibleText(RelationShip_Dropdown, "Father / पिता");
			Reporter.log("Verify Application of NRDA RTI RelationShip_Dropdown Filed is Present",true); //print for eclipse console 
		
			HighlightOnElement(Mother_Name);
			Assert.assertTrue(Mother_Name.isEnabled(),"TestCase Pass:  Mother_Name");
			excel.getExcelData(Mother_Name, "RTIApplicantDetails", 1, 6 );
			Reporter.log("Verify Application of NRDA RTI Mother_Name Filed is Present",true); //print for eclipse console 
		
			HighlightOnElement(DateofBirth_Field);
			Assert.assertTrue(DateofBirth_Field.isEnabled(),"TestCase Pass:  DateofBirth_Field");
			DateofBirth_Field.click();
			DateSelect.click();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA RTI Mother_Name Filed is Present",true); //print for eclipse console 
		
			HighlightOnElement(GenderDropdown);
			/*Assert.assertTrue(GenderDropdown.isEnabled(),"TestCase Pass:  GenderDropdown");
			SelectVisibleText(GenderDropdown, "Male/पुरुष");
			waitForSomeTime();*/
			Reporter.log("Verify Application of NRDA RTI GenderDropdown Filed is Present",true);
			
			HighlightOnElement(EmailID);
			/*Assert.assertTrue(EmailID.isEnabled(),"TestCase Pass:  EmailID");
			excel.getExcelData(EmailID, "RTIApplicantDetails", 1, 10);*/
			Reporter.log("Verify Application of NRDA RTI EmailID Filed is Present",true); //print for eclipse console 
		
			/*HighlightOnElement(ConformEmailID);
			Assert.assertTrue(ConformEmailID.isEnabled(),"TestCase Pass:  ConformEmailID");
			excel.getExcelData(ConformEmailID, "RTIApplicantDetails", 1, 11);
			Reporter.log("Verify Application of NRDA RTI ConformEmailID Filed is Present",true); //print for eclipse console 
		*/
			HighlightOnElement(PhoneNo);
			Assert.assertTrue(PhoneNo.isEnabled(),"TestCase Pass:  PhoneNo");
			excel.getExcelData(PhoneNo, "RTIApplicantDetails", 1, 10);
			Reporter.log("Verify Application of NRDA RTI PhoneNo Filed is Present",true); //print for eclipse console 
		
			HighlightOnElement(MobileNo);
			/*Assert.assertTrue(MobileNo.isEnabled(),"TestCase Pass:  MobileNo");
			excel.getExcelData(MobileNo, "RTIApplicantDetails", 1, 9);*/
			Reporter.log("Verify Application of NRDA RTI MobileNo Filed is Present",true); //print for eclipse console 
		
			HighlightOnElement(Address);
			Assert.assertTrue(Address.isEnabled(),"TestCase Pass:  Address");
			excel.getExcelData(Address, "RTIApplicantDetails", 1, 12);
			Reporter.log("Verify Application of NRDA RTI Address Filed is Present",true); //print for eclipse console 
		
			HighlightOnElement(StateDropdown);
			Assert.assertTrue(StateDropdown.isEnabled(),"TestCase Pass:  StateDropdown");
			SelectVisibleText(StateDropdown, "CHHATTISGARH");
			waitForSomeTime();
			waitForSomeTime();
			Thread.sleep(15000);
			Reporter.log("Verify Application of NRDA RTI StateDropdown Filed is Present",true);
			
			
			HighlightOnElement(DistrictDropdown);
			Assert.assertTrue(DistrictDropdown.isEnabled(),"TestCase Pass:  DistrictDropdown");
			SelectVisibleText(DistrictDropdown, "RAIPUR");
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA RTI DistrictDropdown Filed is Present",true);
					
			HighlightOnElement(TesilDropdown);
			Assert.assertTrue(TesilDropdown.isEnabled(),"TestCase Pass:  TesilDropdown");
			SelectVisibleText(TesilDropdown, "Arang");
			waitForSomeTime();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA RTI TesilDropdown Filed is Present",true);
			
			HighlightOnElement(AreaDropdown);
			Assert.assertTrue(AreaDropdown.isEnabled(),"TestCase Pass:  AreaDropdown");
			SelectVisibleText(AreaDropdown, "Rural / ग्रामीण");
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA RTI AreaDropdown Filed is Present",true);
						
			HighlightOnElement(Pincode);
			Assert.assertTrue(Pincode.isEnabled(),"TestCase Pass:  Pincode");
			excel.getExcelData(Pincode, "RTIApplicantDetails", 1, 17);
			Reporter.log("Verify Application of NRDA RTI Pincode Filed is Present",true); //print for eclipse console 
		
			HighlightOnElement(EducationDropdown);
			Assert.assertTrue(EducationDropdown.isEnabled(),"TestCase Pass:  EducationDropdown");
			SelectVisibleText(EducationDropdown, "Graduate / स्नातक");
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA RTI EducationDropdown Filed is Present",true);
			
			HighlightOnElement(CitizenshipDropdown);
			Assert.assertTrue(CitizenshipDropdown.isEnabled(),"TestCase Pass:  CitizenshipDropdown");
			SelectVisibleText(CitizenshipDropdown, "Indian / भारतीय");
			Thread.sleep(10000);
			Reporter.log("Verify Application of NRDA RTI CitizenshipDropdown Filed is Present",true); //print for eclipse console 
		
	
		}
		
		
		public void toverifyApplicantDetails_withMandatoryFields_SC_03_TC_02() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			Thread.sleep(10000);
			
			HighlightOnElement(FirstName);
			Assert.assertTrue(FirstName.isEnabled(),"TestCase Pass:  FirstName");
			excel.getExcelData(FirstName, "RTIApplicantDetails", 1, 1);
			Reporter.log("Verify Application of NRDA RTI FirstName Filed is Present",true); //print for eclipse console 
		
			HighlightOnElement(LastName);
			Assert.assertTrue(LastName.isEnabled(),"TestCase Pass:  LastName");
			excel.getExcelData(LastName, "RTIApplicantDetails", 1, 2);
			Reporter.log("Verify Application of NRDA RTI LastName Filed is Present",true); //print for eclipse console 
		
			HighlightOnElement(DateofBirth_Field);
			Assert.assertTrue(DateofBirth_Field.isEnabled(),"TestCase Pass:  DateofBirth_Field");
			DateofBirth_Field.click();
			DateSelect.click();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA RTI Mother_Name Filed is Present",true); //print for eclipse console 
		
			HighlightOnElement(GenderDropdown);
			Assert.assertTrue(GenderDropdown.isEnabled(),"TestCase Pass:  GenderDropdown");
			SelectVisibleText(GenderDropdown, "Male/पुरुष");
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA RTI GenderDropdown Filed is Present",true);
			HighlightOnElement(MobileNo);
			/*Assert.assertTrue(MobileNo.isEnabled(),"TestCase Pass:  MobileNo");
			excel.getExcelData(MobileNo, "RTIApplicantDetails", 1, 9);*/
			Reporter.log("Verify Application of NRDA RTI MobileNo Filed is Present",true); //print for eclipse console 
		
			
			HighlightOnElement(EmailID);
			/*Assert.assertTrue(EmailID.isEnabled(),"TestCase Pass:  EmailID");
			excel.getExcelData(EmailID, "RTIApplicantDetails", 1, 10);*/
			Reporter.log("Verify Application of NRDA RTI EmailID Filed is Present",true); //print for eclipse console 
		
			/*HighlightOnElement(ConformEmailID);
			Assert.assertTrue(ConformEmailID.isEnabled(),"TestCase Pass:  ConformEmailID");
			excel.getExcelData(ConformEmailID, "RTIApplicantDetails", 1, 11);
			Reporter.log("Verify Application of NRDA RTI ConformEmailID Filed is Present",true); //print for eclipse console 
		*/
			HighlightOnElement(StateDropdown);
			Assert.assertTrue(StateDropdown.isEnabled(),"TestCase Pass:  StateDropdown");
			SelectVisibleText(StateDropdown, "CHHATTISGARH");
			waitForSomeTime();
			Thread.sleep(15000);
			Reporter.log("Verify Application of NRDA RTI StateDropdown Filed is Present",true);
			
			
			HighlightOnElement(DistrictDropdown);
			Assert.assertTrue(DistrictDropdown.isEnabled(),"TestCase Pass:  DistrictDropdown");
			SelectVisibleText(DistrictDropdown, "RAIPUR");
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA RTI DistrictDropdown Filed is Present",true);
					
			HighlightOnElement(TesilDropdown);
			Assert.assertTrue(TesilDropdown.isEnabled(),"TestCase Pass:  TesilDropdown");
			SelectVisibleText(TesilDropdown, "Arang");
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA RTI TesilDropdown Filed is Present",true);
			
			HighlightOnElement(AreaDropdown);
			Assert.assertTrue(AreaDropdown.isEnabled(),"TestCase Pass:  AreaDropdown");
			SelectVisibleText(AreaDropdown, "Rural / ग्रामीण");
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA RTI AreaDropdown Filed is Present",true);
						
			HighlightOnElement(Pincode);
			Assert.assertTrue(Pincode.isEnabled(),"TestCase Pass:  Pincode");
			excel.getExcelData(Pincode, "RTIApplicantDetails", 1, 17);
			Reporter.log("Verify Application of NRDA RTI Pincode Filed is Present",true); //print for eclipse console 
		
			HighlightOnElement(CitizenshipDropdown);
			Assert.assertTrue(CitizenshipDropdown.isEnabled(),"TestCase Pass:  CitizenshipDropdown");
			SelectVisibleText(CitizenshipDropdown, "Indian / भारतीय");
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA RTI CitizenshipDropdown Filed is Present",true); //print for eclipse console 
		
	
			
		}
		
		@FindBy(xpath=".//*[@id='form0:growl_container']/div/div/div/span")
		private  List<WebElement> ERRORmsgs;
		
		@FindBy(xpath="//a[contains(.,'Personal Details of RTI Applicant')]")
		private  WebElement PersonalDetailsofRTIApplicant;
		
		
		
		public void toverifyApplicantDetails_withInValidData_SC_03_TC_03() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			/*waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(Upload_DocumentTab);
			Assert.assertTrue(Upload_DocumentTab.isEnabled(),"TestCase Pass:  Upload_DocumentTab");
			Upload_DocumentTab.click();
			waitForSomeTime();
			CaptchaAlertandAccept();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(Submit_BTN);
			Submit_BTN.click();
			Reporter.log("Submit Button Click Successfully",true);
			waitForSomeTime();
			for(WebElement ERRORMSGS:ERRORmsgs)
			{
				
				if(ERRORMSGS.isDisplayed())
				{
					HighlightOnElement(ERRORMSGS);
					String DashBoardMenu=ERRORMSGS.getText();
					Reporter.log("RTI APPLICATION MANDATORY FIELDS Are:"+DashBoardMenu,true);
				}
				
			}*/
			waitForSomeTime();
			HighlightOnElement(PersonalDetailsofRTIApplicant);
			PersonalDetailsofRTIApplicant.click();
			Reporter.log("PersonalDetailsofRTIApplicant is Present",true);
			waitForelementPresent(AadhaarNumber);
			HighlightOnElement(AadhaarNumber);
			
			
			Assert.assertTrue(AadhaarNumber.isEnabled(),"TestCase Pass:  Aadhaar Number");
			AadhaarNumber.sendKeys("57224131");
			waitForSomeTime();
			//acceptAlert();
			waitForSomeTime();
			//HighlightOnElement(FirstName);
			FirstName.click();
			acceptAlert();
			Reporter.log("Verify Application of NRDA RTI Aadhaar Filed is Present",true); //print for eclipse console 
		
			HighlightOnElement(FirstName);
			Assert.assertTrue(FirstName.isEnabled(),"TestCase Pass:  FirstName");
			waitForSomeTime();waitForSomeTime();waitForSomeTime();waitForSomeTime();
			excel.getExcelData(FirstName, "RTIApplicantDetails", 1, 1);			
			Reporter.log("Verify Application of NRDA RTI FirstName Filed is Present",true); //print for eclipse console 
		
			HighlightOnElement(LastName);
			Assert.assertTrue(LastName.isEnabled(),"TestCase Pass:  LastName");
			excel.getExcelData(LastName, "RTIApplicantDetails", 1, 2);
			Reporter.log("Verify Application of NRDA RTI LastName Filed is Present",true); //print for eclipse console 
		
			HighlightOnElement(MiddleName);
			Assert.assertTrue(MiddleName.isEnabled(),"TestCase Pass:  MiddleName");
			excel.getExcelData(MiddleName, "RTIApplicantDetails", 1, 3);
			Reporter.log("Verify Application of NRDA RTI MiddleName Filed is Present",true); //print for eclipse console 
		
			
			HighlightOnElement(Father_Husband_Name);
			Assert.assertTrue(Father_Husband_Name.isEnabled(),"TestCase Pass:  Father_Husband_Name");
			excel.getExcelData(Father_Husband_Name, "RTIApplicantDetails", 1, 5);
			Reporter.log("Verify Application of NRDA RTI Father_Husband_Name Filed is Present",true); //print for eclipse console 
		
			HighlightOnElement(RelationShip_Dropdown);
			Assert.assertTrue(RelationShip_Dropdown.isEnabled(),"TestCase Pass:  RelationShip_Dropdown");
			SelectVisibleText(RelationShip_Dropdown, "Father / पिता");
			Reporter.log("Verify Application of NRDA RTI RelationShip_Dropdown Filed is Present",true); //print for eclipse console 
		
			HighlightOnElement(Mother_Name);
			Assert.assertTrue(Mother_Name.isEnabled(),"TestCase Pass:  Mother_Name");
			excel.getExcelData(Mother_Name, "RTIApplicantDetails", 1, 4 );
			Reporter.log("Verify Application of NRDA RTI Mother_Name Filed is Present",true); //print for eclipse console 
		
			HighlightOnElement(DateofBirth_Field);
			Assert.assertTrue(DateofBirth_Field.isEnabled(),"TestCase Pass:  DateofBirth_Field");
			DateofBirth_Field.click();
			DateSelect.click();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA RTI Date_of_Birth Filed is Present",true); //print for eclipse console 
		
			HighlightOnElement(GenderDropdown);
			Assert.assertTrue(GenderDropdown.isEnabled(),"TestCase Pass:  GenderDropdown");
			SelectVisibleText(GenderDropdown, "Male/पुरुष");
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA RTI GenderDropdown Filed is Present",true);
			
			/*	HighlightOnElement(EmailID);
			Assert.assertTrue(EmailID.isEnabled(),"TestCase Pass:  EmailID");
			excel.getExcelData(EmailID, "RTIApplicantDetails", 2, 10);
			PhoneNo.click();
			acceptAlert();
			Reporter.log("Verify Application of NRDA RTI EmailID Filed is Present",true); //print for eclipse console 
		
			HighlightOnElement(ConformEmailID);
			Assert.assertTrue(ConformEmailID.isEnabled(),"TestCase Pass:  ConformEmailID");
			excel.getExcelData(ConformEmailID, "RTIApplicantDetails", 2, 11);
			PhoneNo.click();
			acceptAlert();
			Reporter.log("Verify Application of NRDA RTI ConformEmailID Filed is Present",true); //print for eclipse console 
		*/
			HighlightOnElement(PhoneNo);
			PhoneNo.click();
			Assert.assertTrue(PhoneNo.isEnabled(),"TestCase Pass:  PhoneNo");
			excel.getExcelData(PhoneNo, "RTIApplicantDetails", 2, 11);
			waitForSomeTime();
			//HighlightOnElement(MobileNo);
			MobileNo.click();
			acceptAlert();
			Reporter.log("Verify Application of NRDA RTI PhoneNo Filed is Present",true); //print for eclipse console 			
	
		}
		
		public void toverifyBelowPovertyLine() throws InterruptedException
		{
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(PovertylineDropdown);
			Assert.assertTrue(PovertylineDropdown.isEnabled(),"TestCase Pass:  PovertylineDropdown");
			SelectVisibleText(PovertylineDropdown, "No / नहीं");
			waitForSomeTime();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA RTI PovertylineDropdown Filed is Present",true); //print for eclipse console 
			
		}

		public void toverifyBelowPovertyLine1() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(PovertylineDropdown);
			Assert.assertTrue(PovertylineDropdown.isEnabled(),"TestCase Pass:  PovertylineDropdown");
			SelectVisibleText(PovertylineDropdown, "Yes / हाँ");
			waitForSomeTime();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA RTI PovertylineDropdown Filed is Present",true); //print for eclipse console 
			
			waitForSomeTime();
			HighlightOnElement(BPL_NO);
			//BPL_NO.sendKeys("98631584");
			Assert.assertTrue(BPL_NO.isEnabled(),"TestCase Pass:  BPL_NO");
			excel.getExcelData(BPL_NO, "RTIApplicantDetails", 1, 20);
			
		}
		
		public void toverifyDeliveryModebyPOST_SC_03_TC_02() throws InterruptedException
		
		{
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(DelivaryModeDropdown);
			Assert.assertTrue(DelivaryModeDropdown.isEnabled(),"TestCase Pass:  DelivaryModeDropdown");
			SelectVisibleText(DelivaryModeDropdown, "By Post / Courier / पोस्ट / कूरियर द्वारा");
			Reporter.log("Verify Application of NRDA RTI DelivaryModeDropdown Filed is Present",true); //print for eclipse console 
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(MediaReceivingDropdown);
			Assert.assertTrue(MediaReceivingDropdown.isEnabled(),"TestCase Pass:  MediaReceivingDropdown");
			SelectVisibleText(MediaReceivingDropdown, "CD / DVD / सीडी / डीवीडी");
			Reporter.log("Verify Application of NRDA RTI MediaReceivingDropdown Filed is Present",true); //print for eclipse console 
			waitForSomeTime();
			waitForSomeTime();waitForSomeTime();
		}
		
		
		public void toverifyDeliveryModebyCollectAtOffice_SC_03_TC_03() throws InterruptedException
		
		{
			waitForSomeTime();
			HighlightOnElement(DelivaryModeDropdown);
			Assert.assertTrue(DelivaryModeDropdown.isEnabled(),"TestCase Pass:  DelivaryModeDropdown");
			SelectVisibleText(DelivaryModeDropdown, "Collect at Office / ऑफिस से प्राप्त करें");
			Reporter.log("Verify Application of NRDA RTI DelivaryModeDropdown Filed is Present",true); //print for eclipse console 
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(MediaReceivingDropdown);
			Assert.assertTrue(MediaReceivingDropdown.isEnabled(),"TestCase Pass:  MediaReceivingDropdown");
			SelectVisibleText(MediaReceivingDropdown, "CD / DVD / सीडी / डीवीडी");
			Reporter.log("Verify Application of NRDA RTI MediaReceivingDropdown Filed is Present",true); //print for eclipse console 
			waitForSomeTime();
			
		}
		
		public void toverifyDeliveryModebyEMAIL_SC_03_TC_04() throws InterruptedException
		
		{
			waitForSomeTime();
			HighlightOnElement(DelivaryModeDropdown);
			Assert.assertTrue(DelivaryModeDropdown.isEnabled(),"TestCase Pass:  DelivaryModeDropdown");
			SelectVisibleText(DelivaryModeDropdown, "By e-Mail / ई-मेल द्वारा");
			Reporter.log("Verify Application of NRDA RTI DelivaryModeDropdown Filed is Present",true); //print for eclipse console 
			waitForSomeTime();
			
		}
		
		@FindBy(xpath="//a[contains(.,'RTI Information')]")
		private WebElement RTI_InformationTAB;
		
		@FindBy(xpath="//textarea[@title='Information Required']")
		private WebElement RTI_InformationTABField;
		
		@FindBy(xpath="(//textarea[@title='Information Required'])[2]")
		private WebElement RTI_InformationTABField2;
		
		@FindBy(xpath="//button[@title='Click to add detail' and@type='submit']")
		private WebElement Addmore_Btn;
		
		@FindBy(xpath="//a[contains(.,'Upload Document')]/../../following-sibling::div/div[3]/span/center/table/tbody/tr//span/button[contains(.,'Submit')]")
		private WebElement Submit_BTN;
		
		@FindBy(xpath="//button[@title='Click to delete detail' and@role='button']")
		private WebElement Delete_Row;
		
		@FindBy(xpath="(//button/span[contains(.,'Remove')])[2]")
		private WebElement RemoveField_Row;
		
		@FindBy(xpath="(//button[@title='Draft application' and@role='button'])[3]")
		private WebElement SaveAsDraft_Button1;
		
		@FindBy(xpath="(//button[@title='Reset application' and@role='button'])[3]")
		private WebElement Reset_Button1;
		
		
		@FindBy(xpath="(//button[@title='Close application' and@role='button'])[3]")
		private WebElement Close_Button1;
		
		
		
		public void toverifyfunctionalityofAddMoreButton_SC_03_TC_05() throws InterruptedException
		{
			
			waitForSomeTime();
			HighlightOnElement(RTI_InformationTAB);
			Assert.assertTrue(RTI_InformationTAB.isEnabled(),"TestCase Pass:  QuestionTAB");
			RTI_InformationTAB.click();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA RTI QuestionTAB  is Present",true); //print for eclipse console 
			waitForSomeTime();
			waitForSomeTime();
			
			HighlightOnElement(RTI_InformationTABField);
			Assert.assertTrue(RTI_InformationTABField.isEnabled(),"TestCase Pass:  RTI_InformationTABField");
			Reporter.log("Verify Application of NRDA RTI RTI_InformationTABField  is Present",true); //print for eclipse console 
			RTI_InformationTABField.sendKeys("RTI WORK FLOW");
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(Addmore_Btn);
			Assert.assertTrue(Addmore_Btn.isEnabled(),"TestCase Pass:  Addmore button");
			Addmore_Btn.click();
			Reporter.log("Verify Application of NRDA RTI Addmore button  is Present",true); //print for eclipse console 
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			
			HighlightOnElement(RTI_InformationTABField2);
			Assert.assertTrue(RTI_InformationTABField2.isEnabled(),"TestCase Pass:  RTI_InformationTABField2");
			Reporter.log("Verify Application of NRDA  RTI_InformationTABField2  is Present",true); //print for eclipse console 
			waitForSomeTime();
			waitForSomeTime();
			
			HighlightOnElement(RemoveField_Row);
			Assert.assertTrue(RemoveField_Row.isEnabled(),"TestCase Pass:   RemoveField_Row");
			RemoveField_Row.click();
			Reporter.log("Verify Application of NRDA RTI RemoveField_Row button  is Present",true); //print for eclipse console 
			waitForSomeTime();
			waitForSomeTime();
		
		}
		
		@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/span/div[1]/div[1]/label")
		private WebElement Upload_Button;
		
		public void toverifyfunctionalityofUploadButton_SC_03_TC_06() throws InterruptedException, AWTException, EncryptedDocumentException, InvalidFormatException, IOException
		{
		 
			waitForSomeTime();
			HighlightOnElement(Upload_DocumentTab);
			Assert.assertTrue(Upload_DocumentTab.isEnabled(),"TestCase Pass:  Upload_DocumentTab");
			Upload_DocumentTab.click();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA RTI Upload_DocumentTab  is Present",true); //print for eclipse console 
			waitForSomeTime();
			
			HighlightOnElement(Upload_Button1);
			Assert.assertTrue(Upload_Button1.isEnabled(),"TestCase Pass:  Upload_Button");
			Upload_Button1.click();
			waitForSomeTime();
			waitForSomeTime();
			UpLoadFile("E:\\NRDA_Environment\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Company_Id.pdf");
			waitForSomeTime();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA RTI Upload_Button  is Present",true); //print for eclipse console 
			waitForSomeTime();
		/*	
			HighlightOnElement(RTI_InformationTABField);
			Assert.assertTrue(RTI_InformationTABField.isEnabled(),"TestCase Pass:  Question_Field1");
			excel.getExcelData(RTI_InformationTABField, "RTIApplicantDetails", 1, 11);
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA RTI QuestionTAB  is Present",true); //print for eclipse console 
			waitForSomeTime();
			*/
			
			
			
		}
		
		@FindBy(xpath=".//*[@id='form0:growl_container']/div/div/div[2]/span")
		private WebElement Error_Message;
		
		@FindBy(xpath=".//*[@id='form0:growl_container']/div/div/div[2]/span")
		private WebElement popup_close;
		
		public void toverifyfunctionalityofUploadButtonwithInvalidFile_SC_03_TC_07() throws InterruptedException, AWTException
		{
		 
			waitForSomeTime();
			HighlightOnElement(Upload_DocumentTab);
			Assert.assertTrue(Upload_DocumentTab.isEnabled(),"TestCase Pass:  Upload_DocumentTab");
			Upload_DocumentTab.click();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA RTI Upload_DocumentTab is Present",true); //print for eclipse console 
			waitForSomeTime();
			HighlightOnElement(Upload_Button1);
			Assert.assertTrue(Upload_Button1.isEnabled(),"TestCase Pass:  Upload_Button");
			Upload_Button1.click();
			waitForSomeTime();
			waitForSomeTime();
			UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\en-US-7-1.bdic");
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA RTI Upload_Button  is Present",true); //print for eclipse console 
			HighlightOnElement(Error_Message);
			String Expected_Message="Please select actual file, changed extension and .exe not allowed.";
			String Actual_Message=Error_Message.getText();
			Assert.assertEquals(Expected_Message, Actual_Message);
			WebElement element1 = Error_Message;
			Actions action = new Actions(driver);
			HighlightOnElement(element1);
			action.moveToElement(element1).build().perform();
			HighlightOnElement(popup_close);
			popup_close.click();
			waitForSomeTime();
			waitForSomeTime();
			
			
		}
		
		@FindBy(xpath=".//*[@id='form0:growl_container']/div/div/div[2]/span")
		private WebElement Success_Message;
		
		@FindBy(xpath="//a[contains(.,'Drafted Application/प्रारूपित आवेदन')]")
		private WebElement DraftApplication_Link;
		
		@FindBy(xpath="//a[contains(text(),'ONLINE RTI ')]")
		private WebElement ONLINERTI_Link;
		
		@FindBy(xpath="//a[contains(text(),'ONLINE RTI - 1')]")
		private WebElement DraftedONLINERTI_Link;
		
		@FindBy(xpath="//div[@role='tabpanel']/div/div/div[1]/table")
		private WebElement PendingApplication_Grid;
		
		
		public void toverifyfunctionalityofSaveAsDraftButton_SC_03_TC_08() throws InterruptedException
		
		{
			waitForSomeTime();
			CaptchaAlertandAccept();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			
			HighlightOnElement(SaveAsDraft_Button);
			Assert.assertTrue(SaveAsDraft_Button.isEnabled(),"TestCase Pass:  SaveAsDraft_Button1");
			SaveAsDraft_Button.click();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA SaveAsDraft_Button1  is Present",true); //print for eclipse console 
			waitForSomeTime();
			waitForSomeTime();
			
			HighlightOnElement(Success_Message);
			/*String Expected_Message="Your application has been saved successfully.";
			String Actual_Message=Success_Message.getText();
			Assert.assertEquals(Expected_Message, Actual_Message);
			WebElement element1 = Success_Message;
			Actions action = new Actions(driver);
			HighlightOnElement(element1);
			action.moveToElement(element1).build().perform();
			HighlightOnElement(popup_close);
			popup_close.click();
			waitForSomeTime();
			waitForSomeTime();
			
			HighlightOnElement(DraftApplication_Link);
			Assert.assertTrue(DraftApplication_Link.isEnabled(),"TestCase Pass:  DraftApplication_Link");
			DraftApplication_Link.click();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA DraftApplication_Link  is Present",true); //print for eclipse console 
			waitForSomeTime();

			HighlightOnElement(ONLINERTI_Link);
			Assert.assertTrue(ONLINERTI_Link.isEnabled(),"TestCase Pass:  ONLINERTI_Link");
			ONLINERTI_Link.click();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA ONLINERTI_Link  is Present",true); //print for eclipse console 
			waitForSomeTime();
			
			HighlightOnElement(PendingApplication_Grid);
			Assert.assertTrue(PendingApplication_Grid.isEnabled(),"TestCase Pass:  PendingApplication_Grid");
			Reporter.log("Verify Application of NRDA PendingApplication_Grid  is Present",true); //print for eclipse console 
*/			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			
		
		}
		
		@FindBy(xpath="//button[contains(.,'Delete') and@role='button']")
		private WebElement Delete;
		
		@FindBy(xpath="//button[contains(.,'Proceed') and@role='button']")
		private WebElement Proceed;
		
		
		
		
		
		/****************************************************************************************************/
		  /**
		    * This is the xpath of the WebElement "click on alert Yes/NO button".
		    * @author deepak.saini
		    * @since 2017-08-16
		    */
		/****************************************************************************************************/
		@FindBy(xpath="//div[@id='form0:confirmDlg']/div[2]/div/div/center/table/tbody/tr/td/button")
		private List<WebElement> button;
		@FindBy(xpath="//button[@id='form0:j_id1542663399_1b337918']")
		private WebElement button1;
		
		public void clickonPopup_YESButton() throws InterruptedException
		
		   {
			 waitForSomeTime();
			for(int index=0;index<button.size();index++)
			   {
				waitForSomeTime();
				String buttone=button.get(index).getText();
				System.out.println(buttone);
				
				if( buttone.trim().equalsIgnoreCase("Yes"))
				   {
					button.get(index).click();
					Reporter.log("Verify Yes Button In POP-UP Of Application In RTI  is Present",true);
					break;
				   }
			   }
			  waitForSomeTime();
			  driver.navigate().refresh();
		
		   }
		public void clickonPopup_YESButton1() throws InterruptedException
		
		   {
			 waitForSomeTime();
			 button1.click();
			 Reporter.log("Verify Yes Button In POP-UP Of Application In RTI  is Present",true);
			 waitForSomeTime();
		
		   }
		public void toverifyfunctionalityofResetButton_SC_03_TC_09() throws InterruptedException 
		{
			/*HighlightOnElement(RTI_InformationTAB);
			RTI_InformationTAB.click();
			waitForSomeTime();
			waitForSomeTime();*/
			HighlightOnElement(Reset_ButtoN);
			Assert.assertTrue(Reset_ButtoN.isEnabled(),"TestCase Pass:  Reset_Button");
			Reset_ButtoN.click();
			waitForSomeTime();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA Reset_Button  is Present",true); //print for eclipse console 
			waitForSomeTime();
			
			VerifyTextField(FirstName);
			VerifyTextField(LastName);
			VerifyTextField(MiddleName);
			VerifyTextField(Address);
			VerifyTextField(Pincode);
			VerifyTextField(PhoneNo);
			VerifyTextField(MobileNo);
			VerifyTextField(EmailID);
			//VerifyTextField(ConformEmailID);
			//VerifyTextField(BPL_NO);
			waitForSomeTime();
			
			
		}
		
		@FindBy(xpath="//a[contains(.,'RTI Information')]/../../following-sibling::div/div[2]/span/center/table/tbody/tr/td//button[contains(.,'Back')]")
		private WebElement Back_Button;
		
		@FindBy(xpath="//a[contains(.,'RTI Information')]/../../following-sibling::div/div[2]/span/center/table/tbody/tr/td//button[contains(.,'Close')]")
		private WebElement Close_ButtoN;
		
		@FindBy(xpath="//a[contains(.,'RTI Information')]/../../following-sibling::div/div[2]/span/center/table/tbody/tr/td//button[contains(.,'Reset')]")
		private WebElement Reset_ButtoN;
		
		public void toverifyfunctionalityofBackButton_SC_03_TC_09() throws InterruptedException 
		{
			HighlightOnElement(RTI_InformationTAB);
			RTI_InformationTAB.click();
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(Back_Button);
			Assert.assertTrue(Back_Button.isEnabled(),"TestCase Pass:  Back_Button");
			Back_Button.click();
			waitForSomeTime();
			waitForSomeTime();
			Reporter.log("Verify Application of RTI Back_Button  is Present",true); //print for eclipse console 
			waitForSomeTime();
			waitForSomeTime();
			
		}
		
		public void toverifyfunctionalityofCloseButton_SC_03_TC_09() throws InterruptedException 
		{
		
			HighlightOnElement(RTI_InformationTAB);
			RTI_InformationTAB.click();
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(Close_ButtoN);
			Assert.assertTrue(Close_ButtoN.isEnabled(),"TestCase Pass:  Close_ButtoN");
			Close_ButtoN.click();
			waitForSomeTime();
			waitForSomeTime();
			Reporter.log("Verify Application of RTI Close_ButtoN  is Present",true); //print for eclipse console 
			waitForSomeTime();
			
		}
		
		
		
		@FindBy(xpath="//table/tbody/tr/td[1]/label")
		private List <WebElement> All_Fields ;
		
		@FindBy(xpath="(//table/tbody/tr/td[2]/label)[1]")
		private WebElement Application_Number;
		
		public void toverifyfunctionalityofSubmitButton_SC_03_TC_10() throws InterruptedException 
		{
			
			/*waitForSomeTime();
			HighlightOnElement(RTI_InformationTAB);
			Assert.assertTrue(RTI_InformationTAB.isEnabled(),"TestCase Pass:  QuestionTAB");
			RTI_InformationTAB.click();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA RTI QuestionTAB  is Present",true); //print for eclipse console 
			waitForSomeTime();
			waitForSomeTime();
			RTI_InformationTABField.sendKeys("RTI Application");*/
			
			//CaptchaAlertandAccept();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			
				HighlightOnElement(Submit_BTN);
				Assert.assertTrue(Submit_BTN.isEnabled(),"TestCase Pass:  Submit_BTN");
				Assert.assertNotNull(Submit_BTN,"Click on Submit_BTN in Application of RTIsucessfully");
				
				Submit_BTN.click();
				waitForSomeTime();
				waitForSomeTime();
				waitForSomeTime();
				waitForSomeTime();
				Reporter.log(" To Verify SubmitButton Link in Application of RTI is Present",true); //print for eclipse console
				//waitForSomeTime();waitForSomeTime();waitForSomeTime();
				waitForSomeTime();
				waitForSomeTime();
				waitForSomeTime();
		}
		
		
		public void toverifythefunctionalityof_RTIInformation() throws InterruptedException
		  {
			
			waitForSomeTime();
			HighlightOnElement(RTI_InformationTAB);
			Assert.assertTrue(RTI_InformationTAB.isEnabled(),"TestCase Pass:  QuestionTAB");
			RTI_InformationTAB.click();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA RTI QuestionTAB  is Present",true); //print for eclipse console 
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			RTI_InformationTABField.sendKeys("RTI Application");
			
			
			
			}
		
		
		@FindBy(xpath="//div[@id='form0:tabView']/div/div/span/table/tbody/tr/td/div/div/table/tbody/tr/td/div/following-sibling::a/img/../preceding-sibling::div/div/label")
		private WebElement Upload_Button1;
		
		@FindBy(xpath="//a[contains(.,'Upload Document')]")
		private WebElement Upload_DocumentTab;
		
		@FindBy(xpath="//select[@title='Document Name']")
		private WebElement ServicerelatedDocument_Dropdown;
		
		
		public void toverifythefunctionalityof_UploadingDocument() throws InterruptedException, AWTException
		  {
			
			waitForSomeTime();
			HighlightOnElement(Upload_DocumentTab);
			Assert.assertTrue(Upload_DocumentTab.isEnabled(),"TestCase Pass:  Upload_DocumentTab");
			Upload_DocumentTab.click();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA RTI Upload_DocumentTab  is Present",true); //print for eclipse console 
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(ServicerelatedDocument_Dropdown);
			SelectVisibleText(ServicerelatedDocument_Dropdown, "Other Document / अन्य दस्तावेज");
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			
			HighlightOnElement(Upload_Button1);
			//Assert.assertTrue(RTI_InformationTAB.isEnabled(),"TestCase Pass:  Upload_Button");
			Upload_Button1.click();
			waitForSomeTime();
			UpLoadFile("E:\\NRDA_Environment\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Company_Id.pdf");
			waitForSomeTime();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA RTI Upload_Button  is Present",true); //print for eclipse console 
			waitForSomeTime();
			
				
			
			
			}
				
				
				
				
				
				
				
				
		
		@FindBy(xpath="//button[contains(.,'Generate Challan')]")
		private WebElement GenerateChallan;
		
		public void verifyapplicationinPendingPaymentsOffline() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			waitForSomeTime();
			HighlightOnElement(Application_Number);
			String ApllicationNumber=Application_Number.getText().trim();
			
			excel.updateExcelDataa(ApllicationNumber);
			Reporter.log("Apploication Number is:  "+ ApllicationNumber,true);
			for(WebElement AllFieldsList :All_Fields)
			{
				if(AllFieldsList.isDisplayed())

				{
					HighlightOnElement(AllFieldsList);
					String MenuDetails=AllFieldsList.getText();
					Reporter.log("Fields list on HomePage Is:"+MenuDetails,true);

				}


			}
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			

			HighlightOnElement(PaymentMode_Dropdown);
			SelectVisibleText(PaymentMode_Dropdown, "Pay Offline");
			waitForSomeTime();
			HighlightOnElement(SelectChallan_Dropdown);
			SelectVisibleText(SelectChallan_Dropdown, "Via Challan@Bank");
	
			waitForSomeTime();
			HighlightOnElement(GenerateChallan);
			GenerateChallan.click();
			waitForSomeTime();
			waitForSomeTime();
			

		}
		
		
		
		public void verifyapplicationinPendingPayments() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			waitForSomeTime();
			HighlightOnElement(Application_Number);
			String ApllicationNumber=Application_Number.getText().trim();
			excel.updateExcelDataa(ApllicationNumber);
			Reporter.log("Apploication Number is:  "+ ApllicationNumber,true);
			for(WebElement AllFieldsList :All_Fields)
			{
				if(AllFieldsList.isDisplayed())

				{
					HighlightOnElement(AllFieldsList);
					String MenuDetails=AllFieldsList.getText();
					Reporter.log("Fields list on HomePage Is:"+MenuDetails,true);

				}


			}
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			

		}
		
		@FindBy(xpath="//a[contains(.,'Submitted Applications')]")
		private WebElement SubmittedApplication_Link;
		
		@FindBy(xpath="//a[contains(.,'Application Status')]")
		private WebElement ApplicationStatus;
		
		@FindBy(xpath="//input[@id='form0:j_id1282409372_72d01089']")
		private WebElement entervalueinsearchbox;
		
		@FindBy(xpath="//input[@id='form0:j_id119598161_571f540']")
		private WebElement entervalueinsearchbox1;
		
		@FindBy(xpath="//button/span[contains(text(),'Search')]")
		private WebElement searchbtn;
		
		@FindBy(xpath="(//table[@role='grid']/thead/tr)")
		private WebElement Application_Grid;
		
		@FindBy(xpath="//table[@role='grid']/tbody/tr/td[5]/span[contains(.,'PENDING')]")
		private WebElement Application_Status;
		
		/*@FindBy(xpath="(//table[@role='grid']/thead/tr)[1]")
		private WebElement Submitted;*/
		
		@FindBy(xpath="//a[contains(.,'ONLINE RTI')]/../following-sibling::div/div/div[1]/table/thead/tr/th/span")
		private List<WebElement> Application_Menu;
		
		
		public void toverifythesubmittedApplication_SC_05_TC_01() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			HighlightOnElement(ApplicationStatus);
			Assert.assertTrue(ApplicationStatus.isEnabled(),"TestCase Pass:  ApplicationStatus");
			ApplicationStatus.click();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA ApplicationStatus  is Present",true); //print for eclipse console 
			waitForSomeTime();
			waitForSomeTime();
			waitForelementPresent(entervalueinsearchbox1);
		
			HighlightOnElement(entervalueinsearchbox1);
			//String Validnumber=ApplicationNumber.getText();
			String validnumber=excel.getExcelData(entervalueinsearchbox1, "RTIApplication Number",0, 1);
			Reporter.log("Valid Application Number:"+validnumber,true);
			
			
			
			waitForSomeTime();
			HighlightOnElement(searchbtn);
			searchbtn.click();
			Thread.sleep(60000);
			
			HighlightOnElement(SubmittedApplication_Link);
			SubmittedApplication_Link.click();
			waitForSomeTime();
			HighlightOnElement(ONLINERTI_Link);
			Assert.assertTrue(ONLINERTI_Link.isEnabled(),"TestCase Pass:  ONLINERTI_Link");
			ONLINERTI_Link.click();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA ONLINERTI_Link  is Present",true); //print for eclipse console 
			waitForSomeTime();
			
			waitForSomeTime();
			HighlightOnElement(Application_Grid);
			waitForSomeTime();
			
			waitForSomeTime();
			for(WebElement MenuInDashBoard:Application_Menu)
			{
				
				if(MenuInDashBoard.isDisplayed())
				{
					HighlightOnElement(MenuInDashBoard);
					String DashBoardMenu=MenuInDashBoard.getText();
					Reporter.log("RTI Appliacnt Menu  Are:"+DashBoardMenu,true);
				}
				
			}
			
			
			//HighlightOnElement(Application_Status);
			/*String ActualStatus=Application_Status.getText();
			String ExpectedStatus="PENDING";
			if(ActualStatus.equalsIgnoreCase(ExpectedStatus))
			{
				Reporter.log("Application Status Is Pending",true);
			}
			else
			{
				Reporter.log("Application Status Is Not Pending",true);	
			}
	*/
		
		}
		
		
		public void toverifythesubmittedApplicationStatus_SC_05_TC_01() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			HighlightOnElement(ApplicationStatus);
			ApplicationStatus.click();
			waitForSomeTime();
			waitForelementPresent(entervalueinsearchbox1);
		
			HighlightOnElement(entervalueinsearchbox1);
			//String Validnumber=ApplicationNumber.getText();
			String validnumber=excel.getExcelData(entervalueinsearchbox1, "RTIApplication Number",0, 1);
			Reporter.log("Valid Application Number:"+validnumber,true);
						
			waitForSomeTime();
			HighlightOnElement(searchbtn);
			searchbtn.click();
			Thread.sleep(60000);
			
			HighlightOnElement(SubmittedApplication_Link);
			SubmittedApplication_Link.click();
			waitForSomeTime();
			HighlightOnElement(ONLINERTI_Link);
			Assert.assertTrue(ONLINERTI_Link.isEnabled(),"TestCase Pass:  ONLINERTI_Link");
			ONLINERTI_Link.click();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA ONLINERTI_Link  is Present",true); //print for eclipse console 
			waitForSomeTime();
			
			waitForSomeTime();
			HighlightOnElement(Application_Grid);
			waitForSomeTime();
			//HighlightOnElement(Application_Status);
		}
		
		
		@FindBy(xpath="//a[contains(.,'Drafted Applications')]")
		private WebElement DraftedApplication;
		
		@FindBy(xpath="//a[contains(.,'Drafted Applications')]/../following-sibling::div/div/h3/a[contains(.,'ONLINE RTI')]/../following-sibling::div/div/div/div[1]/table/tbody/tr[1]/td[6]/button/span")
		private List <WebElement> PROCEED_DELETE_BUTTONS;
		
		@FindBy(xpath="//a[contains(.,'Drafted Applications')]/../following-sibling::div/div/h3/a[contains(.,'ONLINE RTI')]/../following-sibling::div/div/div/div[1]/table/tbody/tr[1]/td[6]/button[contains(.,'Proceed')]")
		private WebElement ProceedButton;
		
		@FindBy(xpath="//a[contains(.,'Drafted Applications')]/../following-sibling::div/div/h3/a[contains(.,'ONLINE RTI')]/../following-sibling::div/div/div/div[1]/table/tbody/tr[1]/td[6]/button[contains(.,'Delete')]")
		private WebElement DeleteButton;
		
		
		public void toverifytheDraftedApplication_SC_07_TC_01() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			HighlightOnElement(ApplicationStatus);
			ApplicationStatus.click();
			waitForSomeTime();
			waitForelementPresent(entervalueinsearchbox1);
		
			HighlightOnElement(entervalueinsearchbox1);
			//String Validnumber=ApplicationNumber.getText();
			String validnumber=excel.getExcelData(entervalueinsearchbox1, "RTIApplication Number",0, 1);
			Reporter.log("Valid Application Number:"+validnumber,true);
			
			/*waitForSomeTime();
			HighlightOnElement(searchbtn);
			searchbtn.click();
			waitForSomeTime();*/
		
			HighlightOnElement(DraftedApplication);
			DraftedApplication.click();
			Reporter.log("Verify Application of NRDA ONLINERTI  DraftedApplication  is Present",true);
			waitForSomeTime();
			HighlightOnElement(DraftedONLINERTI_Link);
			//Assert.assertTrue(DraftedONLINERTI_Link.isEnabled(),"TestCase Pass:  ONLINERTI_Link");
			DraftedONLINERTI_Link.click();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA ONLINERTI_Link  is Present",true); //print for eclipse console 
			waitForSomeTime();
			waitForSomeTime();
			for(WebElement MenuInDashBoard:PROCEED_DELETE_BUTTONS)
			{
				
				if(MenuInDashBoard.isDisplayed())
				{
					HighlightOnElement(MenuInDashBoard);
					String DashBoardMenu=MenuInDashBoard.getText();
					Reporter.log("Button in Drafted Application Are:"+DashBoardMenu,true);
				}
			}
		}
		
		
		public void toverifyProceedButtoninDraftedApplication_SC_07_TC_02() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			HighlightOnElement(ApplicationStatus);
			ApplicationStatus.click();
			waitForSomeTime();
			waitForelementPresent(entervalueinsearchbox1);
		
			HighlightOnElement(entervalueinsearchbox1);
			//String Validnumber=ApplicationNumber.getText();
			String validnumber=excel.getExcelData(entervalueinsearchbox1, "RTIApplication Number",0, 1);
			Reporter.log("Valid Application Number:"+validnumber,true);
			
			/*waitForSomeTime();
			HighlightOnElement(searchbtn);
			searchbtn.click();
			waitForSomeTime();*/
		
			HighlightOnElement(DraftedApplication);
			DraftedApplication.click();
			Reporter.log("Verify Application of NRDA ONLINERTI  DraftedApplication  is Present",true);
			waitForSomeTime();
			HighlightOnElement(DraftedONLINERTI_Link);
			Assert.assertTrue(DraftedONLINERTI_Link.isEnabled(),"TestCase Pass:  ONLINERTI_Link");
			DraftedONLINERTI_Link.click();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA ONLINERTI_Link  is Present",true); //print for eclipse console 
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(ProceedButton);
			ProceedButton.click();
			waitForSomeTime();
			waitForSomeTime();
		
		}
		
		public void toverifyDeleteButtoninDraftedApplication_SC_07_TC_03() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			HighlightOnElement(ApplicationStatus);
			ApplicationStatus.click();
			waitForSomeTime();
			waitForelementPresent(entervalueinsearchbox1);
		
			HighlightOnElement(entervalueinsearchbox1);
			//String Validnumber=ApplicationNumber.getText();
			String validnumber=excel.getExcelData(entervalueinsearchbox1, "RTIApplication Number",0, 1);
			Reporter.log("Valid Application Number:"+validnumber,true);
			
			/*waitForSomeTime();
			HighlightOnElement(searchbtn);
			searchbtn.click();
			waitForSomeTime();*/
		
			HighlightOnElement(DraftedApplication);
			DraftedApplication.click();
			Reporter.log("Verify Application of NRDA ONLINERTI  DraftedApplication  is Present",true);
			waitForSomeTime();
			HighlightOnElement(DraftedONLINERTI_Link);
			Assert.assertTrue(DraftedONLINERTI_Link.isEnabled(),"TestCase Pass:  ONLINERTI_Link");
			DraftedONLINERTI_Link.click();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA ONLINERTI_Link  is Present",true); //print for eclipse console 
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(DeleteButton);
			DeleteButton.click();
			waitForSomeTime();
			waitForSomeTime();
		
		}
		
		
		
		public void toverifytheAllRTIApplicantDetails_SC_05_TC_02() throws InterruptedException
				
		{
			HighlightOnElement(ApplicationStatus);
			ApplicationStatus.click();
			waitForSomeTime();
			waitForelementPresent(entervalueinsearchbox);
			
			HighlightOnElement(SubmittedApplication_Link);
			Assert.assertTrue(SubmittedApplication_Link.isEnabled(),"TestCase Pass:  SubmittedApplication_Link");
			SubmittedApplication_Link.click();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA SubmittedApplication_Link  is Present",true); //print for eclipse console 
			waitForSomeTime();
			waitForSomeTime();
			
			HighlightOnElement(ONLINERTI_Link);
			Assert.assertTrue(ONLINERTI_Link.isEnabled(),"TestCase Pass:  ONLINERTI_Link");
			ONLINERTI_Link.click();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA ONLINERTI_Link  is Present",true); //print for eclipse console 
			waitForSomeTime();
			
			waitForSomeTime();
			HighlightOnElement(Application_Grid);
			waitForSomeTime();
			
		}
		
		@FindBy(xpath="//a[@id='form0:j_id119598161_571f5cc:j_id119598161_571f588:j_id119598161_571f44a_1:0:j_id119598161_571f7de_1']//img")		
		private WebElement Action_Button;
		
		@FindBy(xpath="//img[@src='/NRDAuthorityPreUAT/resources/images/view-icon.png']")		
		private WebElement Action_Button1;
		
		@FindBy(xpath="//button[contains(.,'Close')]")
		private WebElement Close_button;
		
		public void toverifytheActionButtonRTIAppplicant_SC_05_TC03() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			HighlightOnElement(ApplicationStatus);
			ApplicationStatus.click();
			waitForSomeTime();
			waitForelementPresent(entervalueinsearchbox1);
		
			HighlightOnElement(entervalueinsearchbox1);
			//String Validnumber=ApplicationNumber.getText();
			String validnumber=excel.getExcelData(entervalueinsearchbox1, "RTIApplication Number",0, 1);
			Reporter.log("Valid Application Number:"+validnumber,true);
			
			waitForSomeTime();
			HighlightOnElement(searchbtn);
			searchbtn.click();
			Thread.sleep(60000);
			
			HighlightOnElement(SubmittedApplication_Link);
			Assert.assertTrue(SubmittedApplication_Link.isEnabled(),"TestCase Pass:  SubmittedApplication_Link");
			SubmittedApplication_Link.click();
			waitForSomeTime();
			
			HighlightOnElement(ONLINERTI_Link);
			Assert.assertTrue(ONLINERTI_Link.isEnabled(),"TestCase Pass:  ONLINERTI_Link");
			ONLINERTI_Link.click();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA ONLINERTI_Link  is Present",true); //print for eclipse console 
			waitForSomeTime();
			
			System.out.println("joydip bhattacharjee");
			
			waitForSomeTime();
			HighlightOnElement(Action_Button1);
			Assert.assertTrue(Action_Button1.isEnabled(),"TestCase Pass:  Action_Button1");
			Action_Button1.click();
			waitForSomeTime();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA Action_Button  is Present",true); //print for eclipse console 
			waitForSomeTime();
			
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,250)", "");
			
			HighlightOnElement(Close_button);
			Assert.assertTrue(Close_button.isEnabled(),"TestCase Pass:  Close_button");
			Close_button.click();
			Thread.sleep(20000);
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA Close_button  is Present",true); //print for eclipse console 
		
		}
		
		@FindBy(xpath="//html/body/form/div[1]/table/tbody/tr/td[2]/span/div[1]/div[2]/div[2]/div[4]/div/div/div[1]/table/tbody/tr/td[4]")
		private WebElement ApplicationNumber;
		
		public void toverifythefunctionalityofDraftedApplication_SC_07_TC_01() throws InterruptedException
		{
			
			HighlightOnElement(ApplicationNumber);
			String Applicationnumber=ApplicationNumber.getText();
			Reporter.log("Application Number:"+Applicationnumber);
			HighlightOnElement(entervalueinsearchbox);
			entervalueinsearchbox.sendKeys(Applicationnumber);
			waitForSomeTime();
			waitForSomeTime();
			
			HighlightOnElement(searchbtn);
			searchbtn.click();
			waitForSomeTime();
			HighlightOnElement(ONLINERTI_Link);
			Assert.assertTrue(ONLINERTI_Link.isEnabled(),"TestCase Pass:  ONLINERTI_Link");
			ONLINERTI_Link.click();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA ONLINERTI_Link  is Present",true); //print for eclipse console 
			waitForSomeTime();
			
			
			
			HighlightOnElement(Delete);
			Assert.assertTrue(Delete.isEnabled(),"TestCase Pass:  Delete");
			waitForSomeTime();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA Delete  is Present",true); //print for eclipse console 
			
			HighlightOnElement(Proceed);
			Assert.assertTrue(Proceed.isEnabled(),"TestCase Pass:  Proceed");
			waitForSomeTime();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA Proceed  is Present",true); //print for eclipse console 
			
		}
		
		public void toverifythefunctionalityofProceedButton_inDraftedApplication_SC_07_TC_02() throws InterruptedException
		{
			HighlightOnElement(DraftApplication_Link);
			Assert.assertTrue(DraftApplication_Link.isEnabled(),"TestCase Pass:  DraftApplication_Link");
			DraftApplication_Link.click();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA DraftApplication_Link  is Present",true); //print for eclipse console 
			waitForSomeTime();

			HighlightOnElement(ONLINERTI_Link);
			Assert.assertTrue(ONLINERTI_Link.isEnabled(),"TestCase Pass:  ONLINERTI_Link");
			ONLINERTI_Link.click();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA ONLINERTI_Link  is Present",true); //print for eclipse console 
			waitForSomeTime();
			
			HighlightOnElement(PendingApplication_Grid);
			Assert.assertTrue(PendingApplication_Grid.isEnabled(),"TestCase Pass:  PendingApplication_Grid");
			Reporter.log("Verify Application of NRDA PendingApplication_Grid  is Present",true); //print for eclipse console 
			waitForSomeTime();
			
			
			
			HighlightOnElement(ApplicationNumber);
			String Applicationnumber=ApplicationNumber.getText();
			Reporter.log("Application Number:"+Applicationnumber);
			HighlightOnElement(entervalueinsearchbox);
			entervalueinsearchbox.sendKeys(Applicationnumber);
			waitForSomeTime();
			waitForSomeTime();
			
			HighlightOnElement(searchbtn);
			searchbtn.click();
			waitForSomeTime();
			HighlightOnElement(ONLINERTI_Link);
			Assert.assertTrue(ONLINERTI_Link.isEnabled(),"TestCase Pass:  ONLINERTI_Link");
			ONLINERTI_Link.click();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA ONLINERTI_Link  is Present",true); //print for eclipse console 
			waitForSomeTime();
			HighlightOnElement(Proceed);
			Assert.assertTrue(Proceed.isEnabled(),"TestCase Pass:  Proceed");
			Proceed.click();
			waitForSomeTime();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA Proceed  is Present",true); //print for eclipse console 
			
			
			
		}
		
		
		public void toverifythefunctionalityofDeleteButton_inDraftedApplication_SC_07_TC_03() throws InterruptedException
		{
			HighlightOnElement(DraftApplication_Link);
			Assert.assertTrue(DraftApplication_Link.isEnabled(),"TestCase Pass:  DraftApplication_Link");
			DraftApplication_Link.click();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA DraftApplication_Link  is Present",true); //print for eclipse console 
			waitForSomeTime();

			HighlightOnElement(ONLINERTI_Link);
			Assert.assertTrue(ONLINERTI_Link.isEnabled(),"TestCase Pass:  ONLINERTI_Link");
			ONLINERTI_Link.click();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA ONLINERTI_Link  is Present",true); //print for eclipse console 
			waitForSomeTime();
			
			HighlightOnElement(PendingApplication_Grid);
			Assert.assertTrue(PendingApplication_Grid.isEnabled(),"TestCase Pass:  PendingApplication_Grid");
			Reporter.log("Verify Application of NRDA PendingApplication_Grid  is Present",true); //print for eclipse console 
			waitForSomeTime();
			
			
			
			HighlightOnElement(ApplicationNumber);
			String Applicationnumber=ApplicationNumber.getText();
			Reporter.log("Application Number:"+Applicationnumber);
			HighlightOnElement(entervalueinsearchbox);
			entervalueinsearchbox.sendKeys(Applicationnumber);
			waitForSomeTime();
			waitForSomeTime();
			
			HighlightOnElement(searchbtn);
			searchbtn.click();
			waitForSomeTime();
			HighlightOnElement(ONLINERTI_Link);
			Assert.assertTrue(ONLINERTI_Link.isEnabled(),"TestCase Pass:  ONLINERTI_Link");
			ONLINERTI_Link.click();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA ONLINERTI_Link  is Present",true); //print for eclipse console 
			waitForSomeTime();
			HighlightOnElement(Delete);
			Assert.assertTrue(Delete.isEnabled(),"TestCase Pass:  Delete");
			Delete.click();
			waitForSomeTime();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA Delete  is Present",true); //print for eclipse console 
		
		}
		
		@FindBy(xpath="//html/body/form/div[1]/table/tbody/tr/td[2]/span/div[1]/div[2]/div[1]/div/div/div[1]/table/thead/tr")
		private WebElement OnlineRTI_Heading;
		
		@FindBy(xpath="//a[contains(.,'Online RTI/सूचना का अधिकार')]")
		private WebElement OnlineRTILink_Account;
		
		public void toverifytheDashBoardOfONLINE_RTI_SC_07_TC_04() throws InterruptedException
		{
			HighlightOnElement(OnlineRTILink_Account);
			Assert.assertTrue(OnlineRTILink_Account.isEnabled(),"TestCase Pass:  OnlineRTILink_Account");
			OnlineRTILink_Account.click();
			waitForSomeTime();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA OnlineRTILink_Account is Present",true); //print for eclipse console 
		
			HighlightOnElement(OnlineRTI_Heading);
			Assert.assertTrue(OnlineRTI_Heading.isEnabled(),"TestCase Pass:  OnlineRTI_Heading");
			waitForSomeTime();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA OnlineRTI_Heading is Present",true); //print for eclipse console 
		
		}
		
		@FindBy(xpath="//span[@class='ui-icon ui-icon-seek-next']")
		private WebElement SeekNExt;
		
		@FindBy(xpath=".//*[@id='form0:datatb_data']/tr[1]")
		private WebElement First_Row;
		
		
		public void toverifytheDashBoardOfONLINE_RTI_SC_07_TC_05() throws InterruptedException
		
		{
			waitForSomeTime();
			waitForSomeTime();
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,1250)", "");
			
			HighlightOnElement(SeekNExt);
			Assert.assertTrue(SeekNExt.isEnabled(),"TestCase Pass:  SeekNExt");
			SeekNExt.click();
			waitForSomeTime();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA SeekNExt is Present",true); //print for eclipse console 
		
			HighlightOnElement(First_Row);
			Assert.assertTrue(First_Row.isEnabled(),"TestCase Pass:  First_Row");
			waitForSomeTime();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA First_Row is Present",true); //print for eclipse console 
			jse.executeScript("window.scrollBy(0,-550)", "");
			waitForSomeTime();
			
		}
		
		@FindBy(xpath="//a[contains(.,'Pending For Payment')]")
		private WebElement PendingForPayments;
		
		
		//@FindBy(xpath="//button[contains(.,'Proceed to Payment')])")
		@FindBy(xpath="(//a[contains(.,'ONLINE RTI')]/../following-sibling::div/div/div[1]/table/tbody/tr/td[6]/button[contains(.,'Proceed to Payment')])[1]")
		private WebElement ProccedtoPayment;
		
		//@FindBy(xpath="//button[contains(.,'View')]")
		@FindBy(xpath="(//a[contains(.,'ONLINE RTI')]/../following-sibling::div/div/div[1]/table/tbody/tr/td[6]/button[contains(.,'View')])[1]")
		private WebElement View_Button;
		
		
		
public void toverifythePendingPaymentFunctionalityAsCitizen_RTI_SC_08_TC_01() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		
		{
			
		  HighlightOnElement(PendingForPayments);	
		  Assert.assertTrue(PendingForPayments.isEnabled(),"TestCase Pass:  PendingForPayments");
		  PendingForPayments.click();
		  waitForSomeTime();
		  waitForSomeTime();
		  Reporter.log("Verify Application of NRDA SeekNExt is Present",true); //print for eclipse console 
		
		 /* HighlightOnElement(entervalueinsearchbox);
			//String Validnumber=ApplicationNumber.getText();
			String validnumber=excel.getExcelData(entervalueinsearchbox, "RTIApplication Number",0, 2);
			Reporter.log("Valid Application Number:"+validnumber,true);
		
			waitForSomeTime();
			HighlightOnElement(searchbtn);
			searchbtn.click();
			waitForSomeTime();
			HighlightOnElement(ONLINERTI_Link);
			Assert.assertTrue(ONLINERTI_Link.isEnabled(),"TestCase Pass:  ONLINERTI_Link");
			ONLINERTI_Link.click();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA ONLINERTI_Link  is Present",true); //print for eclipse console 
			waitForSomeTime();
			
			waitForSomeTime();
			HighlightOnElement(Application_Grid);
			waitForSomeTime();
			
			HighlightOnElement(ProccedtoPayment);
			Assert.assertTrue(ProccedtoPayment.isEnabled(),"TestCase Pass:  ProccedtoPayment");
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA ProccedtoPayment  is Present",true); //print for eclipse console 
			waitForSomeTime();
			
			HighlightOnElement(View_Button);
			Assert.assertTrue(View_Button.isEnabled(),"TestCase Pass:  View_Button");
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA View_Button  is Present",true); //print for eclipse console 
			waitForSomeTime();*/

		}
		public void toverifythePendingPaymentFunctionalityAsCitizen_RTI_SC_08_TC_001() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		
		{
			
		 		
		    HighlightOnElement(entervalueinsearchbox);
			//String Validnumber=ApplicationNumber.getText();
			String validnumber=excel.getExcelData(entervalueinsearchbox, "RTIApplication Number",0,1);
			Reporter.log("Valid Application Number:"+validnumber,true);
		
			waitForSomeTime();
			HighlightOnElement(searchbtn);
			searchbtn.click();
			Thread.sleep(60000);
			
			
			HighlightOnElement(ONLINERTI_Link);
			Assert.assertTrue(ONLINERTI_Link.isEnabled(),"TestCase Pass:  ONLINERTI_Link");
			ONLINERTI_Link.click();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA ONLINERTI_Link  is Present",true); //print for eclipse console 
			waitForSomeTime();
			
			waitForSomeTime();
			HighlightOnElement(Application_Grid);
			waitForSomeTime();
			
			HighlightOnElement(ProccedtoPayment);
			Assert.assertTrue(ProccedtoPayment.isEnabled(),"TestCase Pass:  ProccedtoPayment");
			waitForSomeTime();
			ProccedtoPayment.click();
			Reporter.log("Verify Application of NRDA ProccedtoPayment  is Present",true); //print for eclipse console 
			waitForSomeTime();
			
			/*HighlightOnElement(View_Button);
			Assert.assertTrue(View_Button.isEnabled(),"TestCase Pass:  View_Button");
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA View_Button  is Present",true); //print for eclipse console 
			waitForSomeTime();*/

		}
		
		public void toverifythePendingPaymentFunctionalityAsCitizen_RTI_SC_08_TC_02() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		
		{
			
		 
			HighlightOnElement(ONLINERTI_Link);
			Assert.assertTrue(ONLINERTI_Link.isEnabled(),"TestCase Pass:  ONLINERTI_Link");
			ONLINERTI_Link.click();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA ONLINERTI_Link  is Present",true); //print for eclipse console 
			waitForSomeTime();
			
		}
		public void toverifythenextbtn() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		
		{					 
			HighlightOnElement(next_Button);
			Assert.assertTrue(next_Button.isEnabled(),"TestCase Pass:  next_Button");
			next_Button.click();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA next_Button  is Present",true); //print for eclipse console 
			waitForSomeTime();			
		}
		public void toverifythedemandnote() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException		
		{	
			String str=excel.getExcelDataj("RTIApplication Number",0, 1);
			//System.out.println(str);
			int count=findapplication.size();
			count=count+1;
			//System.out.println(count);
			for(int i=1; i<count; i++)
			{
				String wb=driver.findElement(By.xpath("//div[@id='form0:datatb']//div[1]//table//tr["+i+"]//td[2]")).getText();
				if(wb.equalsIgnoreCase(str))
				{
					driver.findElement(By.xpath("//div[@id='form0:datatb']//div[1]//table//tr["+i+"]//td[5]//button[contains(.,'Demand Note')]")).click();
					waitForSomeTime();
					Robot robot = new Robot();
					robot.keyPress(KeyEvent.VK_ENTER);
					break;
				}				
			}
			Reporter.log("Demand note is prasent",true); //print for eclipse console
		}
		
		public void toverifythePay() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException		
		{	
			String str=excel.getExcelDataj("RTIApplication Number",0, 1);
			//System.out.println(str);
			int count=findapplication.size();
			count=count+1;
			//System.out.println(count);
			for(int i=1; i<count; i++)
			{
				String wb=driver.findElement(By.xpath("//div[@id='form0:datatb']//div[1]//table//tr["+i+"]//td[2]")).getText();
				if(wb.equalsIgnoreCase(str))
				{
					driver.findElement(By.xpath("//div[@id='form0:datatb']//div[1]//table//tr["+i+"]//td[5]//button[contains(.,'Pay')]")).click();
					waitForSomeTime();
					Robot robot = new Robot();
					robot.keyPress(KeyEvent.VK_ENTER);
					break;
				}				
			}
			Reporter.log("pay button is prasent",true); //print for eclipse console
		}
		
		public void toverifythefirstapproval() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException		
		{	
			String str=excel.getExcelDataj("RTIApplication Number",0, 1);
			//System.out.println(str);
			int count=findapplication.size();
			count=count+1;
			//System.out.println(count);
			for(int i=1; i<count; i++)
			{
				String wb=driver.findElement(By.xpath("//div[@id='form0:datatb']//div[1]//table//tr["+i+"]//td[2]")).getText();
				if(wb.equalsIgnoreCase(str))
				{
					driver.findElement(By.xpath("//div[@id='form0:datatb']//div[1]//table//tr["+i+"]//td[6]")).click();
					waitForSomeTime();
					break;
				}				
			}
			Close.click();
			waitForSomeTime();
			Reporter.log("Verify First Approval is Present",true);
		}
		
		@FindBy(xpath="//button[contains(.,'Make Payment') and@type='submit']")
		private WebElement MakePayment_Button;
		
		@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/table[1]/tbody/tr/td/select")
		private WebElement PaymentMode_Dropdown;
		
		@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/table[1]/tbody/tr[7]/td[2]/select")
		private WebElement SelectChallan_Dropdown;

		
		public void toverifytheproceedpaymentbuttonFunctionality_SC_08_TC_02() throws InterruptedException
		{
			
			
			HighlightOnElement(ProccedtoPayment);
			Assert.assertTrue(ProccedtoPayment.isEnabled(),"TestCase Pass:  ProccedtoPayment");
			ProccedtoPayment.click();
			waitForSomeTime();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA ProccedtoPayment  is Present",true); //print for eclipse console 
			waitForSomeTime();
			
			HighlightOnElement(gateway);
			Assert.assertTrue(gateway.isEnabled());
			gateway.click();
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(onlinemode);
			Assert.assertTrue(onlinemode.isEnabled());
			onlinemode.click();
			waitForSomeTime();
			HighlightOnElement(MakePayment_Button);
			
			
		}
		public void toverifytheproceedpaymentbuttonFunctionality_SC_08_TC_03() throws InterruptedException
		{
			
			
			HighlightOnElement(ProccedtoPayment);
			Assert.assertTrue(ProccedtoPayment.isEnabled(),"TestCase Pass:  ProccedtoPayment");
			ProccedtoPayment.click();
			waitForSomeTime();
			waitForSomeTime();
			Reporter.log("Verify Application of NRDA ProccedtoPayment  is Present",true); //print for eclipse console 
			waitForSomeTime();
			
			HighlightOnElement(gateway);
			Assert.assertTrue(gateway.isEnabled());
			gateway.click();
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(onlinemode);
			Assert.assertTrue(onlinemode.isEnabled());
			onlinemode.click();
			waitForSomeTime();
			HighlightOnElement(MakePayment_Button);
			MakePayment_Button.click();
			
		}
		
		@FindBy(xpath="//span[@id='form0:dynaFormGroup']/div/div/table/tbody/tr/td[1]/label[contains(text(),'Select Payment Gateway')]/../following-sibling::td/span/table/tbody/tr[2]/td/img/../preceding-sibling::td/div")
		private WebElement gateway;
		
		@FindBy(xpath="//span[@id='form0:dynaFormGroup']/div/div/table/tbody/tr/td[1]/label[contains(text(),'Select Payment Mode')]/../following-sibling::td/table/tbody/tr/td[1]/div")
		private WebElement onlinemode;
		
		
		@FindBy(xpath="//html/body/form/div[1]/table/tbody/tr/td[2]/span/div[1]/div[2]/div[2]/div[3]/div/div[1]/table/tbody/tr[1]/td[4]")
		private WebElement ApplicatioNUmber;
		
		@FindBy(xpath="//a[contains(.,'Approved/Rejected Application')]")
		private WebElement Approve_RejectApplications;
		
		@FindBy(xpath="//span[contains(.,'Approved / Rejected Applications')]/../following-sibling::div/table/tbody/tr[2]/td/div/div/div/table/thead/tr/th")
		private List <WebElement> Approve_RejectApplicationsMenu;
		
		
		@FindBy(xpath="//table[@role='grid']/tbody/tr[1]/td[7]")
		private WebElement Approve_RejectApplicationsStatus;
		
		@FindBy(xpath="//table[@role='grid']/tbody/tr[1]/td[4]")
		private WebElement Approve_RejectApplicationsNumber;
		
		@FindBy(xpath="//span[contains(.,'Approved / Rejected Applications')]/../following-sibling::div/div/div/table/tbody/tr/td/input")
		private WebElement Approve_RejectApplicationSearchBox;
		
		@FindBy(xpath="//span[contains(.,'Approved / Rejected Applications')]/../following-sibling::div/div/div/table/tbody/tr/td/button")
		private WebElement Approve_RejectApplicationSearchButton;
		
		
		public void toverifyapprove_rejectApplications() throws InterruptedException
		{
			
			HighlightOnElement(Approve_RejectApplications);
			Approve_RejectApplications.click();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();waitForSomeTime();waitForSomeTime();waitForSomeTime();
			for(WebElement MenuInDashBoard:Approve_RejectApplicationsMenu)
			{
				
				if(MenuInDashBoard.isDisplayed())
				{
					HighlightOnElement(MenuInDashBoard);
					String DashBoardMenu=MenuInDashBoard.getText();
					Reporter.log("Approve Rejection Application menu Fields  Are:"+DashBoardMenu,true);
				}
				
			}
			
			waitForSomeTime();waitForSomeTime();waitForSomeTime();

		}
		
		
		public void toverifyapprove_rejectApplicationsStatus() throws InterruptedException
		{
			
			waitForSomeTime();waitForSomeTime();waitForSomeTime();waitForSomeTime();
			waitForSomeTime();waitForSomeTime();waitForSomeTime();waitForSomeTime();
			HighlightOnElement(Approve_RejectApplicationsStatus);
			String Status=Approve_RejectApplications.getText();
			Reporter.log("Application Status Is:"+Status,true);
			waitForSomeTime();
			waitForSomeTime();
		}
		
		public void toverifyapprove_rejectApplicationNumberSearch() throws InterruptedException
		{
			System.out.println("testing");
			waitForSomeTime();waitForSomeTime();waitForSomeTime();waitForSomeTime();
			waitForSomeTime();waitForSomeTime();waitForSomeTime();waitForSomeTime();
			HighlightOnElement(Approve_RejectApplicationsNumber);
			String Status=Approve_RejectApplicationsNumber.getText();
			Reporter.log("Approve_RejectApplicationsNumber S Is:"+Status,true);
			waitForSomeTime();
			HighlightOnElement(Approve_RejectApplicationSearchBox);
			Approve_RejectApplicationSearchBox.sendKeys(Status);
			waitForSomeTime();
			HighlightOnElement(Approve_RejectApplicationSearchButton);
			Approve_RejectApplicationSearchButton.click();
			Thread.sleep(60000);
			waitForSomeTime();
			waitForSomeTime();			
			
		}
		
		@FindBy(xpath="//a[contains(.,'My Payment History')]")
		private WebElement PaymentHistory;
		
		@FindBy(xpath="//span[contains(.,'My Transactions')]/../following-sibling::div/table/tbody/tr[2]/td/div/div[1]/table/thead/tr/th")
		private List<WebElement> PaymentHistoryMenu;
		
		@FindBy(xpath="//span[contains(.,'My Transactions')]/../following-sibling::div/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr[1]/td[7]/center/a")
		private WebElement ActionButton;
		
		
		public void toverifyfunctionalityofPaymentHistory() throws InterruptedException
		{
			
			HighlightOnElement(PaymentHistory);
			PaymentHistory.click();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			
			for(WebElement MenuInDashBoard:PaymentHistoryMenu)
			{
				
				if(MenuInDashBoard.isDisplayed())
				{
					HighlightOnElement(MenuInDashBoard);
					String DashBoardMenu=MenuInDashBoard.getText();
					Reporter.log("Payment  menu Fields  Are:"+DashBoardMenu,true);
				}
				
			}
			
			/*waitForSomeTime();
			
			HighlightOnElement(ActionButton);
			
			ActionButton.click();
			waitForSomeTime();
			waitForSomeTime();*/
			
			
		}
	
	}
