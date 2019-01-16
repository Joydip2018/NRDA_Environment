
package NRDA_RTI;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
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
 * @Date:23-10-2017
 * @Purpose:  Warer And Sewerage RTI Login As  Citizen WithBPL
 */
@Listeners(GenericLibrary.ListenerDriver.class)
public class NRDA_RTICitizenWithBPL  extends URLPageWSNRDAScript 
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

		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		driver.close();

	}*/
	@DataProvider(name="citizen")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"Citizen Credentials");
	}

	
/*	@Test(description="NRDA_Water & Sewerage_RTI_SC_01_TC_01",priority=1,dataProvider ="citizen")
	public void VerifytheLoginAsCitizen_SC_01_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		LoginPageWS_JavaFile logina_citizen=PageFactory.initElements(driver,LoginPageWS_JavaFile.class);
		logina_citizen.loginAsCitizen(username, password);
	}
	
	
	
	@Test(description="NRDA_Water & Sewerage_RTI_SC_02_TC_01",priority=2,dataProvider ="citizen")
	public void VerifytheLoginAsCitizen_SC_02_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		LoginPageWS_JavaFile logina_citizen=PageFactory.initElements(driver,LoginPageWS_JavaFile.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyWaterAndSewerageRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyWaterAndSewerageRTILoginAsCitizen.class);
		RTI.toverifyDashBoardMenu_SC_02_TC_01();
	}
	

	
	@Test(description="NRDA_Water & Sewerage_RTI_SC_03_TC_01",priority=3,dataProvider ="citizen")
	public void VerifytheRTIDetailApplicationForm_SC_03_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
		RTI.clickOnToVerifyRTIConnection02();
		RTI.toverifyLabelsInRTIApplicant_SC_03_TC_01();
	}*/
	
	/*******************************Created By Joydip on 9/11/2018*************************************/
	@Test(description="VerifytheRTIDash Board Form_SC_04_TC_01",priority=1,dataProvider ="citizen")
	public void NRDA_RTI_SC_04_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
		RTI.clickOnToVerifyRTIConnection02();
		RTI.toverifyLabelsInRTIApplicant_SC_03_TC_01();
		URLPageWSNRDAScript.logoutWS1();
	}
	/************************************* End *********************************************************/
	/*******************************Created By Joydip on 9/11/2018*************************************/
	@Test(description="Verify the submit button by clicking on Mandatory fields",priority=2,dataProvider ="citizen")
	public void NRDA_RTI_SC_04_TC_02(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
		RTI.clickOnToVerifyRTIConnection02();
		RTI.toverifyApplicantDetails_withMandatoryFields_SC_03_TC_02();
		RTI.toverifyBelowPovertyLine1();
		RTI.toverifyDeliveryModebyPOST_SC_03_TC_02();
		RTI.toverifythefunctionalityof_RTIInformation();
		RTI.toverifythefunctionalityof_UploadingDocument();
		RTI.toverifyfunctionalityofSubmitButton_SC_03_TC_10();	
	}
	/************************************* End *********************************************************/
	/*******************************Created By Joydip on 9/11/2018*************************************/	
	@Test(description="VerifytheApplicantwithValidData_DeliveryModebyByPostCourier",priority=3,dataProvider ="citizen")
	public void NRDA_RTI_SC_04_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
		RTI.clickOnToVerifyRTIConnection02();		
		RTI.toverifyApplicantDetails_withValidData_SC_01_TC_02();
		RTI.toverifyBelowPovertyLine1();
		RTI.toverifyDeliveryModebyPOST_SC_03_TC_02();
		RTI.toverifythefunctionalityof_RTIInformation();
		RTI.toverifythefunctionalityof_UploadingDocument();
		RTI.toverifyfunctionalityofSubmitButton_SC_03_TC_10();
		
	}
	/************************************* End *********************************************************/
	/*******************************created By Joydip on 9/11/2018*************************************/
	@Test(description="VerifytheApplicantwithValidData_DeliveryModebyCollectAtOffice_SC_03_TC_04",priority=6,dataProvider ="citizen")
	public void NRDA_RTI_SC_04_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
		RTI.clickOnToVerifyRTIConnection02();
		//RTI.clickproceedButton();
		RTI.toverifyApplicantDetails_withValidData_SC_01_TC_02();
		RTI.toverifyBelowPovertyLine1();
		RTI.toverifyDeliveryModebyCollectAtOffice_SC_03_TC_03();
		RTI.toverifythefunctionalityof_RTIInformation();
		RTI.toverifythefunctionalityof_UploadingDocument();
		RTI.toverifyfunctionalityofSubmitButton_SC_03_TC_10();
	}
	/************************************* End *********************************************************/

	/*******************************Created By Joydip on 1/11/2018*************************************/
	@Test(description="VerifytheApplicantwithValidData_DeliveryModebyEMAIL",priority=5,dataProvider ="citizen")
	public void NRDA_RTI_SC_04_TC_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
		RTI.clickOnToVerifyRTIConnection02();
		RTI.toverifyApplicantDetails_withValidData_SC_01_TC_02();
		RTI.toverifyBelowPovertyLine1();
		RTI.toverifyDeliveryModebyEMAIL_SC_03_TC_04();
		RTI.toverifythefunctionalityof_RTIInformation();
		RTI.toverifythefunctionalityof_UploadingDocument();
		RTI.toverifyfunctionalityofSubmitButton_SC_03_TC_10();
	}
	/************************************* End *********************************************************/
	/*******************************Verified By Joydip on 1/11/2018*************************************/
	@Test(description="VerifythefunctionalityofAddmoreButton",priority=6,dataProvider ="citizen")
	public void NRDA_RTI_SC_04_TC_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
		RTI.clickOnToVerifyRTIConnection02();
		RTI.toverifyfunctionalityofAddMoreButton_SC_03_TC_05();			
	}
	/************************************* End *********************************************************/
	/*******************************Created By Joydip on 9/11/2018*************************************/
	@Test(description="VerifytheBackButton",priority=7,dataProvider ="citizen")
	public void NRDA_RTI_SC_04_TC_11(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
		RTI.clickOnToVerifyRTIConnection02();
		RTI.toverifyfunctionalityofBackButton_SC_03_TC_09();
	}
	/************************************* End *********************************************************/
	/*******************************Created By Joydip on 9/11/2018*************************************/
	@Test(description="VerifytheCloseButton",priority=8,dataProvider ="citizen")
	public void NRDA_RTI_SC_04_TC_12(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
		RTI.clickOnToVerifyRTIConnection02();
		RTI.toverifyfunctionalityofCloseButton_SC_03_TC_09();
		RTI.clickonPopup_YESButton();
	}
	/************************************* End *********************************************************/
	/*******************************Created By Joydip on 9/11/2018*************************************/
	@Test(description="VerifytheSaveAsDraftButton",priority=9,dataProvider ="citizen")
	public void NRDA_RTI_SC_04_TC_13(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
		RTI.clickOnToVerifyRTIConnection02();
		//RTI.clickproceedButton();
		RTI.toverifyApplicantDetails_withValidData_SC_01_TC_02();
		RTI.toverifyBelowPovertyLine1();
		RTI.toverifyDeliveryModebyPOST_SC_03_TC_02();
		RTI.toverifythefunctionalityof_RTIInformation();
		RTI.toverifythefunctionalityof_UploadingDocument();
		RTI.toverifyfunctionalityofSaveAsDraftButton_SC_03_TC_08();		
	}
	/************************************* End *********************************************************/
	/*******************************Created By Joydip on 9/11/2018*************************************/
	@Test(description="VerifytheResetButton",priority=10,dataProvider ="citizen")
	public void NRDA_RTI_SC_04_TC_14(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
		RTI.clickOnToVerifyRTIConnection02();
		RTI.toverifyApplicantDetails_withValidData_SC_01_TC_02();
		RTI.toverifyBelowPovertyLine1();
		RTI.toverifyDeliveryModebyPOST_SC_03_TC_02();
		RTI.toverifythefunctionalityof_RTIInformation();
		RTI.toverifyfunctionalityofResetButton_SC_03_TC_09();
		RTI.clickonPopup_YESButton1();
	}
	/************************************* End *********************************************************/
	/*******************************Created By Joydip on 9/11/2018*************************************/
	@Test(description="VerifytheSubmitButton",priority=11,dataProvider ="citizen")
	public void NRDA_RTI_SC_04_TC_15(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
		RTI.clickOnToVerifyRTIConnection02();
		RTI.toverifyApplicantDetails_withValidData_SC_01_TC_02();
		RTI.toverifyBelowPovertyLine1();
		RTI.toverifyDeliveryModebyPOST_SC_03_TC_02();
		RTI.toverifythefunctionalityof_RTIInformation();
		RTI.toverifythefunctionalityof_UploadingDocument();
		RTI.toverifyfunctionalityofSubmitButton_SC_03_TC_10();
	}
	/************************************* End *********************************************************/
	/*******************************Created By Joydip on 9/11/2018*************************************/
	@Test(description="verifyDownloadReciept",priority=12,dataProvider ="citizen")
	public void NRDA_RTI_SC_04_TC_16(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
		RTI.clickOnToVerifyRTIConnection02();
		RTI.toverifyApplicantDetails_withValidData_SC_01_TC_02();
		RTI.toverifyBelowPovertyLine1();
		RTI.toverifyDeliveryModebyPOST_SC_03_TC_02();
		RTI.toverifythefunctionalityof_RTIInformation();
		RTI.toverifythefunctionalityof_UploadingDocument();
		RTI.toverifyfunctionalityofSubmitButton_SC_03_TC_10();
		RTI.verifyapplicationinPendingPayments();
		ToverifyDisConnectionAsWaterandSewerage Receipt=PageFactory.initElements(driver, ToverifyDisConnectionAsWaterandSewerage.class);
		Receipt.verifyDownloadReciept14();	
	}
	/************************************* End *********************************************************/
	
}
