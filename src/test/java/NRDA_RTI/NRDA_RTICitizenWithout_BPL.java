
package NRDA_RTI;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import GenericLibrary.ExcelDataDriver;
import LoginLogoutWSNRDAScript.URLPageWSNRDAScript;
import NRDA_Estate_Project.ToVerifyPaymentDetailsofNewConnection;
import NRDA_WaterAndSewerage_Disconnection.ToverifyDisConnectionAsWaterandSewerage;
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;


/**
 * @author Sarvesh.Nellore
 * @Date: 16-10-2017
 * @Purpose Warer And Sewerage RTI Login As  Citizen WithoutBPL
 */
@Listeners(GenericLibrary.ListenerDriver.class)
public class NRDA_RTICitizenWithout_BPL extends URLPageWSNRDAScript
	{
		ExcelDataDriver exceldata=new ExcelDataDriver();
		String filepath=".\\src\\test\\resources\\NRDA_TESTDATA.xlsx";
	
		/*@AfterMethod 
		public void logoutWS() throws InterruptedException
		{
			WebElement web1=driver.findElement(By.xpath("//a[@class='dropdown-toggle' and@role='button']/span"));
			Actions action = new Actions(driver);
			action.moveToElement(web1).build().perform();
			waitForSomeTime();
			waitForSomeTime();
			driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
			waitForSomeTime();
			driver.close();
	
		}*/
		@DataProvider(name="citizen")
		public String[][] getExcelData() throws InvalidFormatException, IOException
		{
			return exceldata.getCellData(filepath,"Citizen Credentials");
		}

		/*******************************Verified By Joydip on 1/11/2018*************************************/
		@Test(description="VerifytheLoginAsCitizen_SC_01_TC_01",priority=1,dataProvider ="citizen")
		public void NRDA_RTI_SC_01_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			URLPageWSNRDAScript.logoutWS1();
		}
		/************************************* End *********************************************************/
		
		/*******************************Created By Joydip on 1/11/2018*************************************/
		@Test(description="VerifytheLoginAsCitizen_SC_01_TC_01",priority=2,dataProvider ="citizen")
		public void NRDA_RTI_SC_02_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsinvalidCitizen(username, password);
		}
		/************************************* End *********************************************************/
		
	/*	@Test(description="Verifythe Dash Board Menu",priority=2,dataProvider ="citizen")
		public void NRDA_RTI_SC_02_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.toverifyDashBoardMenu_SC_02_TC_01();
		}
			*/	
		/*******************************Verified By Joydip on 1/11/2018*************************************/
		@Test(description="VerifytheRTIDash Board Form_SC_03_TC_01",priority=3,dataProvider ="citizen")
		public void NRDA_RTI_SC_03_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.clickOnToVerifyRTIConnection02();
			RTI.toverifyLabelsInRTIApplicant_SC_03_TC_01();
			URLPageWSNRDAScript.logoutWS1();
		}
		/************************************* End *********************************************************/
		/*******************************Verified By Joydip on 1/11/2018*************************************/
		@Test(description="Verify the submit button by clicking on Mandatory fields",priority=4,dataProvider ="citizen")
		public void NRDA_RTI_SC_03_TC_02(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.clickOnToVerifyRTIConnection02();
			RTI.toverifyApplicantDetails_withMandatoryFields_SC_03_TC_02();
			RTI.toverifyBelowPovertyLine();
			RTI.toverifyDeliveryModebyPOST_SC_03_TC_02();
			RTI.toverifythefunctionalityof_RTIInformation();
			RTI.toverifythefunctionalityof_UploadingDocument();
			RTI.toverifyfunctionalityofSubmitButton_SC_03_TC_10();	
			URLPageWSNRDAScript.logoutWS1();
		}
		/************************************* End *********************************************************/
		/*@Test(description="VerifytheApplicantwithValidData_DeliveryModebyPOST_SC_03_TC_02",priority=5,dataProvider ="citizen")
		public void NRDA_RTI_SC_03_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.clickOnToVerifyRTIConnection02();
			RTI.toverifyApplicantDetails_withInValidData_SC_03_TC_03();
			
		}*/
		/*******************************Verified By Joydip on 1/11/2018*************************************/	
		@Test(description="VerifytheApplicantwithValidData_DeliveryModebyByPostCourier_SC_03_TC_03",priority=6,dataProvider ="citizen")
		public void NRDA_RTI_SC_03_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.clickOnToVerifyRTIConnection02();
			
			RTI.toverifyApplicantDetails_withValidData_SC_01_TC_02();
			RTI.toverifyBelowPovertyLine();
			RTI.toverifyDeliveryModebyPOST_SC_03_TC_02();
			RTI.toverifythefunctionalityof_RTIInformation();
			RTI.toverifythefunctionalityof_UploadingDocument();
			RTI.toverifyfunctionalityofSubmitButton_SC_03_TC_10();
			URLPageWSNRDAScript.logoutWS1();
		}
		/************************************* End *********************************************************/
		/*******************************Verified By Joydip on 1/11/2018*************************************/
		@Test(description="VerifytheApplicantwithValidData_DeliveryModebyCollectAtOffice_SC_03_TC_03",priority=7,dataProvider ="citizen")
		public void NRDA_RTI_SC_03_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.clickOnToVerifyRTIConnection02();
			//RTI.clickproceedButton();
			RTI.toverifyApplicantDetails_withValidData_SC_01_TC_02();
			RTI.toverifyBelowPovertyLine();
			RTI.toverifyDeliveryModebyCollectAtOffice_SC_03_TC_03();
			RTI.toverifythefunctionalityof_RTIInformation();
			RTI.toverifythefunctionalityof_UploadingDocument();
			RTI.toverifyfunctionalityofSubmitButton_SC_03_TC_10();	
			URLPageWSNRDAScript.logoutWS1();
		}
		/************************************* End *********************************************************/
		
		/*******************************Verified By Joydip on 1/11/2018*************************************/
		@Test(description="VerifytheApplicantwithValidData_DeliveryModebyEMAIL_SC_03_TC_04",priority=8,dataProvider ="citizen")
		public void NRDA_RTI_SC_03_TC_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.clickOnToVerifyRTIConnection02();
			RTI.toverifyApplicantDetails_withValidData_SC_01_TC_02();
			RTI.toverifyBelowPovertyLine();
			RTI.toverifyDeliveryModebyEMAIL_SC_03_TC_04();
			RTI.toverifythefunctionalityof_RTIInformation();
			RTI.toverifythefunctionalityof_UploadingDocument();
			RTI.toverifyfunctionalityofSubmitButton_SC_03_TC_10();
			URLPageWSNRDAScript.logoutWS1();
		}
		/************************************* End *********************************************************/
		
		/*******************************Verified By Joydip on 1/11/2018*************************************/
		@Test(description="VerifythefunctionalityofAddmoreButton_SC_03_TC_05",priority=9,dataProvider ="citizen")
		public void NRDA_RTI_SC_03_TC_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.clickOnToVerifyRTIConnection02();
			RTI.toverifyfunctionalityofAddMoreButton_SC_03_TC_05();	
			URLPageWSNRDAScript.logoutWS1();
		}
		/************************************* End *********************************************************/	
		/*******************************Verified By Joydip on 1/11/2018*************************************/
		@Test(description="VerifythefunctionalityofUpload_Button_SC_03_TC_06",priority=10,dataProvider ="citizen")
		public void NRDA_RTI_SC_03_TC_7A(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.clickOnToVerifyRTIConnection02();
			//RTI.clickproceedButton();
			RTI.toverifyfunctionalityofUploadButton_SC_03_TC_06();	
			URLPageWSNRDAScript.logoutWS1();
		}
		/************************************* End *********************************************************/
		
		/*@Test(description="VerifythefunctionalityofUpload_ButtonInvalidData_SC_03_TC_07",priority=11,dataProvider ="citizen")
		public void NRDA_RTI_SC_03_TC_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.clickOnToVerifyRTIConnection02();
			RTI.clickproceedButton();
			RTI.toverifyfunctionalityofUploadButtonwithInvalidFile_SC_03_TC_07();
			
		}
		*/
		/*******************************Verified By Joydip on 1/11/2018*************************************/
		@Test(description="VerifytheSaveAsDraftButton_SC_03_TC_08",priority=12,dataProvider ="citizen")
		public void NRDA_RTI_SC_03_TC_11(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.clickOnToVerifyRTIConnection02();
			//RTI.clickproceedButton();
			RTI.toverifyApplicantDetails_withValidData_SC_01_TC_02();
			RTI.toverifyBelowPovertyLine();
			RTI.toverifyDeliveryModebyPOST_SC_03_TC_02();
			RTI.toverifythefunctionalityof_RTIInformation();
			RTI.toverifythefunctionalityof_UploadingDocument();
			RTI.toverifyfunctionalityofSaveAsDraftButton_SC_03_TC_08();
			URLPageWSNRDAScript.logoutWS1();
		}
		/************************************* End *********************************************************/
		/*******************************Verified By Joydip on 1/11/2018*************************************/
		@Test(description="VerifytheBackButton_SC_03_TC_09",priority=13,dataProvider ="citizen")
		public void NRDA_RTI_SC_03_TC_12(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.clickOnToVerifyRTIConnection02();
			//RTI.clickproceedButton();
			//RTI.clickonPopup_YESButton();
			RTI.toverifyfunctionalityofBackButton_SC_03_TC_09();
			URLPageWSNRDAScript.logoutWS1();
		}
		/************************************* End *********************************************************/
		/*******************************Verified By Joydip on 1/11/2018*************************************/
		@Test(description="VerifytheCloseButton_SC_03_TC_13",priority=14,dataProvider ="citizen")
		public void NRDA_RTI_SC_03_TC_13(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.clickOnToVerifyRTIConnection02();
			//RTI.clickproceedButton();
			RTI.toverifyfunctionalityofCloseButton_SC_03_TC_09();
			RTI.clickonPopup_YESButton();
			URLPageWSNRDAScript.logoutWS1();
		}
		/************************************* End *********************************************************/
		/*******************************Verified By Joydip on 1/11/2018*************************************/
		@Test(description="VerifytheResetButton_SC_03_TC_13",priority=15,dataProvider ="citizen")
		public void NRDA_RTI_SC_03_TC_14(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.clickOnToVerifyRTIConnection02();
			//RTI.clickproceedButton();
			RTI.toverifyApplicantDetails_withValidData_SC_01_TC_02();
			RTI.toverifyBelowPovertyLine();
			RTI.toverifyDeliveryModebyPOST_SC_03_TC_02();
			RTI.toverifythefunctionalityof_RTIInformation();
			//RTI.clickonPopup_YESButton();
			RTI.toverifyfunctionalityofResetButton_SC_03_TC_09();
			RTI.clickonPopup_YESButton();
			URLPageWSNRDAScript.logoutWS1();
		}
		/************************************* End *********************************************************/
		/*******************************Verified By Joydip on 1/11/2018*************************************/
		@Test(description="VerifytheSubmitButton_SC_03_TC_10",priority=16,dataProvider ="citizen")
		public void NRDA_RTI_SC_03_TC_15(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.clickOnToVerifyRTIConnection02();
			//RTI.clickproceedButton();
			//RTI.clickonPopup_YESButton();
			RTI.toverifyApplicantDetails_withValidData_SC_01_TC_02();
			RTI.toverifyBelowPovertyLine();
			RTI.toverifyDeliveryModebyPOST_SC_03_TC_02();
			RTI.toverifythefunctionalityof_RTIInformation();
			RTI.toverifythefunctionalityof_UploadingDocument();
			RTI.toverifyfunctionalityofSubmitButton_SC_03_TC_10();
			//waitForSomeTime();
			//RTI.clickonPopup_YESButton();
			RTI.verifyapplicationinPendingPayments();
			//RTI.clickonPopup_YESButton();
			//URLPageWSNRDAScript.logoutWS1();
		}
		/************************************* End *********************************************************/
		
/*		@Test(description="VerifytheApplicanrabletoSuccessfulpayment_SC_04_TC_01",priority=17,dataProvider ="citizen")
		public void NRDA_RTI_SC_05_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.clickOnToVerifyRTIConnection02();
			//RTI.clickonPopup_YESButton();
			RTI.toverifyApplicantDetails_withValidData_SC_01_TC_02();
			RTI.toverifyBelowPovertyLine();
			RTI.toverifyDeliveryModebyPOST_SC_03_TC_02();
			RTI.toverifythefunctionalityof_RTIInformation();
			RTI.toverifythefunctionalityof_UploadingDocument();
			RTI.toverifyfunctionalityofSubmitButton_SC_03_TC_10();
			//RTI.verifyapplicationinPendingPayments();
			
			ToVerifyPaymentDetailsofNewConnection payment=PageFactory.initElements(driver, ToVerifyPaymentDetailsofNewConnection.class);
			payment.selectPaymentGateway();
			payment.selectPaymentMode();			
		}
		
		@Test(description="VerifytheApplicanrabletoSuccessfulpayment_SC_04_TC_01",priority=18,dataProvider ="citizen")
		public void NRDA_RTI_SC_05_TC_02(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.clickOnToVerifyRTIConnection02();
			//RTI.clickonPopup_YESButton();
			RTI.toverifyApplicantDetails_withValidData_SC_01_TC_02();
			RTI.toverifyBelowPovertyLine();
			RTI.toverifyDeliveryModebyPOST_SC_03_TC_02();
			RTI.toverifythefunctionalityof_RTIInformation();
			RTI.toverifythefunctionalityof_UploadingDocument();
			RTI.toverifyfunctionalityofSubmitButton_SC_03_TC_10();
			RTI.verifyapplicationinPendingPayments();
			
			ToVerifyPaymentDetailsofNewConnection payment=PageFactory.initElements(driver, ToVerifyPaymentDetailsofNewConnection.class);
			payment.selectPaymentGateway();
			payment.selectPaymentMode();
			payment.VerifyPaymentOptions();
		}*/
		
//		@Test(description="VerifytheSubmitButton_SC_03_TC_10",priority=16,dataProvider ="citizen")
//		public void NRDA_RTI_SC_05_TC_02(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
//		{
//			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
//			logina_citizen.loginAsCitizen(username, password);
//			
//			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
//			RTI.clickOnToVerifyRTIConnection02();
//			RTI.clickonPopup_YESButton();
//			RTI.toverifyApplicantDetails_withValidData_SC_01_TC_02();
//			RTI.toverifyBelowPovertyLine();
//			RTI.toverifyDeliveryModebyPOST_SC_03_TC_02();
//			//RTI.toverifyfunctionalityofUploadButton_SC_03_TC_06();
//			RTI.toverifyfunctionalityofSubmitButton_SC_03_TC_10();
//			RTI.verifyapplicationinPendingPaymentsOffline();
//		}
		
		
		/*******************************Verified By Joydip on 5/11/2018*************************************/
		@Test(description="VerifytheApplicanrabletoSuccessfulpayment_SC_04_TC_01",priority=19,dataProvider ="citizen")
		public void NRDA_RTI_SC_05_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.clickOnToVerifyRTIConnection02();
			//RTI.clickonPopup_YESButton();
			RTI.toverifyApplicantDetails_withValidData_SC_01_TC_02();
			RTI.toverifyBelowPovertyLine();
			RTI.toverifyDeliveryModebyPOST_SC_03_TC_02();
			RTI.toverifythefunctionalityof_RTIInformation();
			RTI.toverifythefunctionalityof_UploadingDocument();
			RTI.toverifyfunctionalityofSubmitButton_SC_03_TC_10();
			RTI.verifyapplicationinPendingPayments();
			
			ToVerifyPaymentDetailsofNewConnection payment=PageFactory.initElements(driver, ToVerifyPaymentDetailsofNewConnection.class);
			payment.selectPaymentGateway();
			payment.selectPaymentMode();
			payment.entervaliddetailsoncreditcard();
			payment.clickOnPayNow();
			//payment.clickOnSimulateTransaction();
			URLPageWSNRDAScript.logoutWS1();
		}
		/************************************* End *********************************************************/
	
		/*******************************Verified By Joydip on 5/11/2018*************************************/
		@Test(description="verifyDownloadReciept_SC_04_TC_01",priority=21,dataProvider ="citizen")
	public void NRDA_RTI_SC_05_TC_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
		RTI.clickOnToVerifyRTIConnection02();
		//RTI.clickonPopup_YESButton();
		RTI.toverifyApplicantDetails_withValidData_SC_01_TC_02();
		RTI.toverifyBelowPovertyLine();
		RTI.toverifyDeliveryModebyPOST_SC_03_TC_02();
		RTI.toverifythefunctionalityof_RTIInformation();
		RTI.toverifythefunctionalityof_UploadingDocument();
		RTI.toverifyfunctionalityofSubmitButton_SC_03_TC_10();
		RTI.verifyapplicationinPendingPayments();
		
		ToVerifyPaymentDetailsofNewConnection payment=PageFactory.initElements(driver, ToVerifyPaymentDetailsofNewConnection.class);
		payment.selectPaymentGateway();
		payment.selectPaymentMode();
		payment.entervaliddetailsoncreditcard();
		payment.clickOnPayNow();
		//payment.clickOnSimulateTransaction();
		
		ToverifyDisConnectionAsWaterandSewerage Receipt=PageFactory.initElements(driver, ToverifyDisConnectionAsWaterandSewerage.class);
		Receipt.verifyDownloadReciept13();
		URLPageWSNRDAScript.logoutWS1();
	}
		/************************************* End *********************************************************/	
	/*	@Test(description="VerifytheApplicanrabletoSuccessfulpayment_SC_04_TC_01",priority=20,dataProvider ="citizen")
		public void NRDA_RTI_SC_05_TC_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.clickOnToVerifyRTIConnection02();
			RTI.clickonPopup_YESButton();
			RTI.toverifyApplicantDetails_withValidData_SC_01_TC_02();
			RTI.toverifyBelowPovertyLine();
			RTI.toverifyDeliveryModebyPOST_SC_03_TC_02();
			RTI.toverifythefunctionalityof_RTIInformation();
			RTI.toverifythefunctionalityof_UploadingDocument();
			RTI.toverifyfunctionalityofSubmitButton_SC_03_TC_10();
			RTI.verifyapplicationinPendingPayments();
			
			ToVerifyPaymentDetailsofNewConnection payment=PageFactory.initElements(driver, ToVerifyPaymentDetailsofNewConnection.class);
			payment.ToVerifypaymentasOnline();
			payment.ApplicationSubmitMakePaymentWith_ValidData03();
			
			ToVerifyPaymentDetailsofNewConnection payment=PageFactory.initElements(driver, ToVerifyPaymentDetailsofNewConnection.class);
			payment.selectPaymentGateway();
			payment.selectPaymentMode();
			payment.enterInvaliddetailsoncreditcard();
			payment.clickOnPayNow();
			payment.verifyBlankMsg();
		}*/
		
		
//		@Test(description="VerifytheApplicanrabletoSuccessfulpaymentWithInvalidData_SC_04_TC_02",priority=13,dataProvider ="citizen")
//		public void NRDA_RTI_SC_04_TC_02(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
//		{
//			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
//			logina_citizen.loginAsCitizen(username, password);
//			
//			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
//			RTI.clickOnToVerifyRTIConnection02();
//			RTI.clickonPopup_YESButton();
//			RTI.toverifyApplicantDetails_withValidData_SC_01_TC_02();
//			RTI.toverifyBelowPovertyLine();
//			RTI.toverifyDeliveryModebyPOST_SC_03_TC_02();
//			RTI.toverifythefunctionalityof_RTIInformation();
//			RTI.toverifythefunctionalityof_UploadingDocument();
//			RTI.toverifyfunctionalityofSubmitButton_SC_03_TC_10();
//			RTI.verifyapplicationinPendingPayments();
//			
//			
//			ToVerifyPaymentDetailsofNewConnection payment=PageFactory.initElements(driver, ToVerifyPaymentDetailsofNewConnection.class);
//			payment.applicationSubmitMakePaymentWith_InValidCardNumber04();
//			
//		}
//		
//	/*	@Test(description="VerifytheApplicanrabletoSuccessfulpaymentWithValidData_SC_04_TC_03",priority=14,dataProvider ="citizen")
//		public void NRDA_RTI_SC_04_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
//		{
//			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
//			logina_citizen.loginAsCitizen(username, password);
//			
//			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
//			RTI.clickOnToVerifyRTIConnection02();
//			RTI.clickonPopup_YESButton();
//			RTI.toverifyApplicantDetails_withValidData_SC_01_TC_02();
//			RTI.toverifyBelowPovertyLine();
//			RTI.toverifyDeliveryModebyPOST_SC_03_TC_02();
//			//RTI.toverifyfunctionalityofUploadButton_SC_03_TC_06();
//			RTI.toverifyfunctionalityofSubmitButton_SC_03_TC_10();
//			RTI.verifyapplicationinPendingPayments();
//			
//			ToVerifyPaymentDetailsofNewConnection payment=PageFactory.initElements(driver, ToVerifyPaymentDetailsofNewConnection.class);
//			payment.ApplicationSubmitMakePaymentWith_ValidData03();
//			
//		}
//		
//			@Test(description="VerifytheApplicanrabletoSuccessfulpaymentAndDownloadReceipt_SC_04_TC_04",priority=15,dataProvider ="citizen")
//		public void NRDA_RTI_SC_04_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
//		{
//			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
//			logina_citizen.loginAsCitizen(username, password);
//			
//			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
//			RTI.clickOnToVerifyRTIConnection02();
//			RTI.clickonPopup_YESButton();
//			RTI.toverifyApplicantDetails_withValidData_SC_01_TC_02();
//			RTI.toverifyBelowPovertyLine();
//			RTI.toverifyDeliveryModebyPOST_SC_03_TC_02();
//			//RTI.toverifyfunctionalityofUploadButton_SC_03_TC_06();
//			RTI.toverifyfunctionalityofSubmitButton_SC_03_TC_10();
//			RTI.verifyapplicationinPendingPayments();
//			
//			ToVerifyPaymentDetailsofNewConnection payment=PageFactory.initElements(driver, ToVerifyPaymentDetailsofNewConnection.class);
//			payment.ApplicationSubmitMakePaymentWith_ValidData03();
//			
//			ToverifyDisConnectionAsWaterandSewerage Receipt=PageFactory.initElements(driver, ToverifyDisConnectionAsWaterandSewerage.class);
//			Receipt.verifyDownloadReciept13();
//		}
		/*******************************Verified By Joydip on 5/11/2018*************************************/
		@Test(description="VerifytheSubmittedApplicationisPending_SC_05_TC_01",priority=22,dataProvider ="citizen")
		public void NRDA_RTI_SC_06_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.toverifythesubmittedApplication_SC_05_TC_01();
			URLPageWSNRDAScript.logoutWS1();
			
		}
		/************************************* End *********************************************************/
		/*******************************Verified By Joydip on 5/11/2018*************************************/
		@Test(description="VerifytheActionButtononRTIApplicant_SC_05_TC_03",priority=23,dataProvider ="citizen")
	public void NRDA_RTI_SC_06_TC_02(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
		RTI.toverifytheActionButtonRTIAppplicant_SC_05_TC03();
		//URLPageWSNRDAScript.logoutWS1();
		
	}
		/************************************* End *********************************************************/
		/*******************************Verified By Joydip on 5/11/2018*************************************/
		@Test(description="VerifytheStatusofRTIApplicant_SC_05_TC_03",priority=24,dataProvider ="citizen")
	public void NRDA_RTI_SC_06_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
		RTI.toverifythesubmittedApplicationStatus_SC_05_TC_01();
		URLPageWSNRDAScript.logoutWS1();
		
	}
		/************************************* End *********************************************************/
		/*******************************Verified By Joydip on 5/11/2018*************************************/		
		@Test(description="VerifytheDrafted Application_SC_07_TC_01",priority=25,dataProvider ="citizen")
		public void NRDA_RTI_SC_07_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.clickOnToVerifyRTIConnection02();
			//RTI.clickproceedButton();
			RTI.toverifyApplicantDetails_withValidData_SC_01_TC_02();
			RTI.toverifyBelowPovertyLine();
			RTI.toverifyDeliveryModebyPOST_SC_03_TC_02();
			RTI.toverifythefunctionalityof_RTIInformation();
			RTI.toverifythefunctionalityof_UploadingDocument();
			RTI.toverifyfunctionalityofSaveAsDraftButton_SC_03_TC_08();
			RTI.toverifytheDraftedApplication_SC_07_TC_01();
			URLPageWSNRDAScript.logoutWS1();
			
		}
		/************************************* End *********************************************************/
		/*******************************Verified By Joydip on 5/11/2018*************************************/
		@Test(description="toverifyProceedButtoninDraftedApplication_SC_07_TC_02",priority=26,dataProvider ="citizen")
		public void NRDA_RTI_SC_07_TC_02(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.toverifyProceedButtoninDraftedApplication_SC_07_TC_02();
			URLPageWSNRDAScript.logoutWS1();
		}
		/************************************* End *********************************************************/
		/*******************************Verified By Joydip on 5/11/2018*************************************/
		@Test(description="toverifyDeleteButtoninDraftedApplication_SC_07_TC_03",priority=27,dataProvider ="citizen")
		public void NRDA_RTI_SC_07_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.toverifyDeleteButtoninDraftedApplication_SC_07_TC_03();
			URLPageWSNRDAScript.logoutWS1();			
		}
		/************************************* End *********************************************************/
	
	
	
		
//		@Test(description="VerifytheAllRTIApplicantDetails_SC_05_TC_02",priority=17,dataProvider ="citizen")
//		public void NRDA_RTI_SC_05_TC_02(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
//		{
//			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
//			logina_citizen.loginAsCitizen(username, password);
//			
//			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
//			RTI.toverifytheAllRTIApplicantDetails_SC_05_TC_02();
//			
//		}
//		
		
		
		/*@Test(description="VerifytheDashBoardofONLINERTI_SC_07_TC_04",priority=28,dataProvider ="citizen")
		public void NRDA_RTI_SC_07_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.toverifytheDashBoardOfONLINE_RTI_SC_07_TC_04();
		}*/
		
		
//			@Test(description="VerifytheDashBoardofONLINERTI_SC_07_TC_05",priority=23,dataProvider ="citizen")
//		public void NRDA_RTI_SC_07_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
//		{
//			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
//			logina_citizen.loginAsCitizen(username, password);
//			
//			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
//			RTI.toverifytheDashBoardOfONLINE_RTI_SC_07_TC_04();
//			RTI.toverifytheDashBoardOfONLINE_RTI_SC_07_TC_05();
//		}
			
		
		/*******************************Verified By Joydip on 5/11/2018*************************************/
		@Test(description="verifythefunctionalityofPendingPayments_SC_08_TC_01",priority=29,dataProvider ="citizen")
		public void NRDA_RTI_SC_08_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.toverifythePendingPaymentFunctionalityAsCitizen_RTI_SC_08_TC_01();
			URLPageWSNRDAScript.logoutWS1();
		}
		/************************************* End *********************************************************/	
			
		/*******************************Verified By Joydip on 5/11/2018*************************************/
		@Test(description="verifythefunctionalityofPendingPayments_SC_08_TC_02",priority=30,dataProvider ="citizen")
		public void NRDA_RTI_SC_08_TC_02(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			NRDA_RTICitizenWithout_BPL sp = new NRDA_RTICitizenWithout_BPL();
			sp.NRDA_RTI_SC_03_TC_15(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.toverifythePendingPaymentFunctionalityAsCitizen_RTI_SC_08_TC_01();
			RTI.toverifythePendingPaymentFunctionalityAsCitizen_RTI_SC_08_TC_001();			
			URLPageWSNRDAScript.logoutWS1();
			//ToVerifyPaymentDetailsofNewConnection payment=PageFactory.initElements(driver, ToVerifyPaymentDetailsofNewConnection.class);
			//payment.ToVerifypaymenttypes1();
		}
		/************************************* End *********************************************************/
		/*******************************Verified By Joydip on 6/11/2018*************************************/
		@Test(description="verifythefunctionalityofPendingPaymentsTypes_SC_08_TC_04",priority=31,dataProvider ="citizen")
		public void NRDA_RTI_SC_08_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			NRDA_RTICitizenWithout_BPL sp = new NRDA_RTICitizenWithout_BPL();
			sp.NRDA_RTI_SC_03_TC_15(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.toverifythePendingPaymentFunctionalityAsCitizen_RTI_SC_08_TC_01();
			RTI.toverifythePendingPaymentFunctionalityAsCitizen_RTI_SC_08_TC_001();
			
			ToVerifyPaymentDetailsofNewConnection payment=PageFactory.initElements(driver, ToVerifyPaymentDetailsofNewConnection.class);
			payment.selectPaymentGateway();
			payment.selectPaymentMode();
			URLPageWSNRDAScript.logoutWS1();
		}
	/************************************* End *********************************************************/
	
		
//	@Test(description="verifythefunctionalityofPendingPaymentsOffline_SC_08_TC_05",priority=29,dataProvider ="citizen")
//		public void NRDA_RTI_SC_08_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
//		{
//			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
//			logina_citizen.loginAsCitizen(username, password);
//			
//			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
//			RTI.toverifythePendingPaymentFunctionalityAsCitizen_RTI_SC_08_TC_01();
//			RTI.toverifytheproceedpaymentbuttonFunctionality_SC_08_TC_02();
//			RTI.verifyapplicationinPendingPaymentsOffline();
//			
//		}
		
	/*	@Test(description="verifythefunctionalityofPendingPaymentsInvalid Card Number_SC_08_TC_05",priority=32,dataProvider ="citizen")
		public void NRDA_RTI_SC_08_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.toverifythePendingPaymentFunctionalityAsCitizen_RTI_SC_08_TC_01();
			RTI.toverifytheproceedpaymentbuttonFunctionality_SC_08_TC_02();
			RTI.verifyapplicationinPendingPayments();
			
			ToVerifyPaymentDetailsofNewConnection payment=PageFactory.initElements(driver, ToVerifyPaymentDetailsofNewConnection.class);
			//ToVerifyPaymentDetailsofNewConnection payment=PageFactory.initElements(driver, ToVerifyPaymentDetailsofNewConnection.class);
			payment.selectPaymentGateway();
			payment.selectPaymentMode();
			payment.enterInvaliddetailsoncreditcard();
			payment.clickOnPayNow();
			payment.verifyBlankMsg();
			
		}
		
		*/
	/*******************************Verified By Joydip on 6/11/2018*************************************/
		/*@Test(description="verifythefunctionalityofPendingPaymentsBlankFields_SC_08_TC_06",priority=32,dataProvider ="citizen")
		public void NRDA_RTI_SC_08_TC_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.toverifythePendingPaymentFunctionalityAsCitizen_RTI_SC_08_TC_01();
			RTI.toverifytheproceedpaymentbuttonFunctionality_SC_08_TC_02();
			//RTI.verifyapplicationinPendingPayments();
			
			ToVerifyPaymentDetailsofNewConnection payment=PageFactory.initElements(driver, ToVerifyPaymentDetailsofNewConnection.class);
			payment.applicationSubmitMakePaymentWith_BlankFields05();
			URLPageWSNRDAScript.logoutWS1();
		}*/
		/************************************* End *********************************************************/
	/*	@Test(description="verifythefunctionalityofPendingPaymentInvalidData_SC_08_TC_07",priority=32,dataProvider ="citizen")
		public void NRDA_RTI_SC_08_TC_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.toverifythePendingPaymentFunctionalityAsCitizen_RTI_SC_08_TC_01();
			RTI.toverifytheproceedpaymentbuttonFunctionality_SC_08_TC_02();
			RTI.verifyapplicationinPendingPayments();
			
			ToVerifyPaymentDetailsofNewConnection payment=PageFactory.initElements(driver, ToVerifyPaymentDetailsofNewConnection.class);
			payment.applicationSubmitMakePaymentWith_InValidDetails06();
			
		}
		*/
		/*******************************Verified By Joydip on 6/11/2018*************************************/
		@Test(description="verifythefunctionalityofPaymentsValid Data_SC_08_TC_08",priority=33,dataProvider ="citizen")
		public void NRDA_RTI_SC_08_TC_08(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			NRDA_RTICitizenWithout_BPL sp = new NRDA_RTICitizenWithout_BPL();
			sp.NRDA_RTI_SC_03_TC_15(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.toverifythePendingPaymentFunctionalityAsCitizen_RTI_SC_08_TC_01();
			RTI.toverifythePendingPaymentFunctionalityAsCitizen_RTI_SC_08_TC_001();
			//RTI.verifyapplicationinPendingPayments();
			
			ToVerifyPaymentDetailsofNewConnection payment=PageFactory.initElements(driver, ToVerifyPaymentDetailsofNewConnection.class);
			payment.selectPaymentGateway();
			payment.selectPaymentMode();
			payment.entervaliddetailsoncreditcard();
			payment.clickOnPayNow();
			URLPageWSNRDAScript.logoutWS1();			
		}
		/************************************* End *********************************************************/
		/*******************************Verified By Joydip on 6/11/2018*************************************/
		@Test(description="verifythefunctionalityofdowmloadrecipt_SC_08_TC_09",priority=34,dataProvider ="citizen")
		public void NRDA_RTI_SC_08_TC_09(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			//WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			//logina_citizen.loginAsCitizen(username, password);
			
			NRDA_RTICitizenWithout_BPL sp = new NRDA_RTICitizenWithout_BPL();
			sp.NRDA_RTI_SC_03_TC_15(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.toverifythePendingPaymentFunctionalityAsCitizen_RTI_SC_08_TC_01();
			RTI.toverifythePendingPaymentFunctionalityAsCitizen_RTI_SC_08_TC_001();
			
			ToVerifyPaymentDetailsofNewConnection payment=PageFactory.initElements(driver, ToVerifyPaymentDetailsofNewConnection.class);
			//ToVerifyPaymentDetailsofNewConnection payment=PageFactory.initElements(driver, ToVerifyPaymentDetailsofNewConnection.class);
			payment.selectPaymentGateway();
			payment.selectPaymentMode();
			payment.entervaliddetailsoncreditcard();
			payment.clickOnPayNow();
			
			ToverifyDisConnectionAsWaterandSewerage Receipt=PageFactory.initElements(driver, ToverifyDisConnectionAsWaterandSewerage.class);
			Receipt.verifyDownloadReciept13();
			URLPageWSNRDAScript.logoutWS1();
			
		}
		/************************************* End *********************************************************/
		/*******************************Verified By Joydip on 6/11/2018*************************************/
		@Test(description="toverifyapprove_rejectApplications_SC_08_TC_09",priority=35,dataProvider ="citizen")
		public void NRDA_RTI_SC_08_TC_10(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.toverifyapprove_rejectApplications();
			URLPageWSNRDAScript.logoutWS1();
			
		}
		/************************************* End *********************************************************/
		/*******************************Verified By Joydip on 6/11/2018*************************************/
		@Test(description="toverifyapprove_rejectApplicationsStatus_SC_08_TC_11",priority=36,dataProvider ="citizen")
		public void NRDA_RTI_SC_08_TC_11(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.toverifyapprove_rejectApplications();
			RTI.toverifyapprove_rejectApplicationsStatus();
			URLPageWSNRDAScript.logoutWS1();
			
		}
		/************************************* End *********************************************************/
		/*******************************Verified By Joydip on 6/11/2018*************************************/
		@Test(description="toverifyapprove_rejectApplicationNumberSearch_SC_08_TC_12",priority=37,dataProvider ="citizen")
		public void NRDA_RTI_SC_08_TC_12(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.toverifyapprove_rejectApplications();
			RTI.toverifyapprove_rejectApplicationNumberSearch();
			URLPageWSNRDAScript.logoutWS1();
			
		}
		/************************************* End *********************************************************/
		
		@Test(description="verifythefunctionalityofPaymentHistory_SC_08_TC_13",priority=38,dataProvider ="citizen")
		public void NRDA_RTI_SC_08_TC_13(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.toverifyfunctionalityofPaymentHistory();
			URLPageWSNRDAScript.logoutWS1();
			
		}
				
		
	}
