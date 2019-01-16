package NRDA__ENVIRONMENT;

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
import NRDA_ENVIRONMENT.ToverifyFunctionalityof_EnvironmentSection_Loginas_CheifExecutiveOfficer;
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;

@Listeners(GenericLibrary.ListenerDriver.class)
public class NRDA_EnvironmentSectionLoginAs_CheifExecutiveOfficer extends URLPageWSNRDAScript
{


	ExcelDataDriver exceldata=new ExcelDataDriver();
	String filepath="C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\NRDA_TESTDATA.xlsx";

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

	@DataProvider(name="ENV-CEO")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"CEO_ENV_Credentials");
	}

	@Test(dataProvider ="ENV-CEO",description="Verify the Home Page of Citizen",priority=1)
	public void NRDA_ENVIRONMENT_SC_12_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginas_ceo=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginas_ceo.loginAsCEO_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_CheifExecutiveOfficer LoginAs_CEO=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_CheifExecutiveOfficer.class);
			LoginAs_CEO.toverifythedashboardoftheApplication();
			
		}
	
	@Test(dataProvider ="ENV-CEO",description="Verify the Pending Applications",priority=2)
	public void NRDA_ENVIRONMENT_SC_12_TC_02(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginas_ceo=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginas_ceo.loginAsCEO_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_CheifExecutiveOfficer LoginAs_CEO=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_CheifExecutiveOfficer.class);
			LoginAs_CEO.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAs_CEO.toVerifyPendingApplicationMenulist();
		}
	
	@Test(dataProvider ="ENV-CEO",description="toVerifyPendingApplicationWithValidNumber",priority=3)
	public void NRDA_ENVIRONMENT_SC_12_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{ 
			WaterAndSewerageLoginPage loginas_ceo=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginas_ceo.loginAsCEO_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_CheifExecutiveOfficer LoginAs_CEO=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_CheifExecutiveOfficer.class);
			LoginAs_CEO.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAs_CEO.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
		}
	
	@Test(dataProvider ="ENV-CEO",description="toVerifyPaginationinApplication",priority=3)
	public void NRDA_ENVIRONMENT_SC_12_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginas_ceo=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginas_ceo.loginAsCEO_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_CheifExecutiveOfficer LoginAs_CEO=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_CheifExecutiveOfficer.class);
			LoginAs_CEO.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAs_CEO.toveriftthePaginationinPendingApplications();
		}
	
	@Test(dataProvider ="ENV-CEO",description="toVerifyApplicationFieldAs Invalid Number",priority=3)
	public void NRDA_ENVIRONMENT_SC_12_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginas_ceo=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginas_ceo.loginAsCEO_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_CheifExecutiveOfficer LoginAs_CEO=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_CheifExecutiveOfficer.class);
			LoginAs_CEO.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAs_CEO.toverifythefunctionalityofsearchfiledasInvalidApplicationNumber();
		}
	
	@Test(dataProvider ="ENV-CEO",description="toVerifyApplicationFieldAs Invalid Number",priority=3)
	public void NRDA_ENVIRONMENT_SC_12_TC_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginas_ceo=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginas_ceo.loginAsCEO_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_CheifExecutiveOfficer LoginAs_CEO=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_CheifExecutiveOfficer.class);
			LoginAs_CEO.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAs_CEO.toverifythefunctionalityofsearchfiledasApplicationNumberAsEnterNumericonly();
		}
	@Test(dataProvider ="ENV-CEO",description="toVerifyApplicationFieldAs Invalid Number",priority=3)
	public void NRDA_ENVIRONMENT_SC_12_TC_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginas_ceo=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginas_ceo.loginAsCEO_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_CheifExecutiveOfficer LoginAs_CEO=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_CheifExecutiveOfficer.class);
			LoginAs_CEO.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAs_CEO.toverifythefunctionalityofsearchfiledasApplicationNumberAsEnterAlphabetonly();;
		}
	
	@Test(dataProvider ="ENV-CEO",description="toVerifyfunctionalityPendingApplicationbyselectingspecificapplication",priority=4)
	public void NRDA_ENVIRONMENT_SC_12_TC_08(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginas_ceo=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginas_ceo.loginAsCEO_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_CheifExecutiveOfficer LoginAs_CEO=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_CheifExecutiveOfficer.class);
			LoginAs_CEO.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAs_CEO.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			LoginAs_CEO.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			
		}
	

	
	@Test(dataProvider ="ENV-CEO",description="toVerifyfunctionalityPendingApplicationbyselectingspecificapplication",priority=4)
	public void NRDA_ENVIRONMENT_SC_12_TC_09(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginas_ceo=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginas_ceo.loginAsCEO_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_CheifExecutiveOfficer LoginAs_CEO=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_CheifExecutiveOfficer.class);
			LoginAs_CEO.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAs_CEO.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			LoginAs_CEO.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			LoginAs_CEO.toVerifyfunctionalitySelectingActionDropdownasForward();
		}
	
	@Test(dataProvider ="ENV-CEO",description="toVerifyfunctionalityPendingApplicationbyselectingspecificapplication",priority=4)
	public void NRDA_ENVIRONMENT_SC_12_TC_10(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginas_ceo=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginas_ceo.loginAsCEO_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_CheifExecutiveOfficer LoginAs_CEO=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_CheifExecutiveOfficer.class);
			LoginAs_CEO.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAs_CEO.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			LoginAs_CEO.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			LoginAs_CEO.toVerifyfunctionalitySelectingActionDropdownasForward();
			LoginAs_CEO.toVerifyfunctionalityPrintButton_SC_05_TC_11();
		}
	
	
	@Test(dataProvider ="ENV-CEO",description="toVerifyfunctionalityofUploadingDocument",priority=6)
	public void NRDA_ENVIRONMENT_SC_12_TC_11(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginas_ceo=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginas_ceo.loginAsCEO_ENV(username, password);
			
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_CheifExecutiveOfficer LoginAs_CEO=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_CheifExecutiveOfficer.class);
			LoginAs_CEO.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAs_CEO.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			LoginAs_CEO.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			LoginAs_CEO.toVerifyfunctionalitySelectingActionDropdownasForward();
			LoginAs_CEO.toVerifyfunctionalityofUploadingDocument();
		
		}
	

	@Test(dataProvider ="ENV-CEO",description="toVerifyfunctionalityofUploadingDocument",priority=6)
	public void NRDA_ENVIRONMENT_SC_12_TC_12(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginas_ceo=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginas_ceo.loginAsCEO_ENV(username, password);
					
			ToverifyFunctionalityof_EnvironmentSection_Loginas_CheifExecutiveOfficer LoginAs_CEO=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_CheifExecutiveOfficer.class);
			LoginAs_CEO.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAs_CEO.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			LoginAs_CEO.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			LoginAs_CEO.toVerifyfunctionalitySelectingActionDropdownasForward();
			LoginAs_CEO.toVerifyfunctionalityofUploadingInvalidDocument();
		
		}
	
	@Test(dataProvider ="ENV-CEO",description="toVerifyfunctionalityofUploadingDocument",priority=6)
	public void NRDA_ENVIRONMENT_SC_12_TC_13(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginas_ceo=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginas_ceo.loginAsCEO_ENV(username, password);
					
			ToverifyFunctionalityof_EnvironmentSection_Loginas_CheifExecutiveOfficer LoginAs_CEO=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_CheifExecutiveOfficer.class);
			LoginAs_CEO.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAs_CEO.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			LoginAs_CEO.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			LoginAs_CEO.toVerifyfunctionalitySelectingActionDropdownasForward();
			LoginAs_CEO.toVerifyfunctionalityofUploadingDocument();
			LoginAs_CEO.toVerifyfunctionalityofEnterCommentsField();
		
		}
	
	
	@Test(dataProvider ="ENV-CEO",description="toVerifyfunctionalityofUploadingDocument",priority=6)
	public void NRDA_ENVIRONMENT_SC_12_TC_14(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginas_ceo=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginas_ceo.loginAsCEO_ENV(username, password);
					
			ToverifyFunctionalityof_EnvironmentSection_Loginas_CheifExecutiveOfficer LoginAs_CEO=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_CheifExecutiveOfficer.class);
			LoginAs_CEO.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAs_CEO.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			LoginAs_CEO.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			LoginAs_CEO.toVerifyfunctionalitySelectingActionDropdownasForward();
			//LoginAs_CEO.ToverifyFunctionalityofSearchbuttoncreatenewfile();
			LoginAs_CEO.toVerifyfunctionalityofUploadingDocument();
			LoginAs_CEO.toVerifyfunctionalityofEnterCommentsField();
			LoginAs_CEO.toVerifyfunctionalityofCloseButton();
		
		}
	
	
	@Test(dataProvider ="ENV-CEO",description="toVerifyfunctionalityofUploadingDocument",priority=6)
	public void NRDA_ENVIRONMENT_SC_12_TC_15(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginas_ceo=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginas_ceo.loginAsCEO_ENV(username, password);
					
			ToverifyFunctionalityof_EnvironmentSection_Loginas_CheifExecutiveOfficer LoginAs_CEO=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_CheifExecutiveOfficer.class);
			LoginAs_CEO.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAs_CEO.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			LoginAs_CEO.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			LoginAs_CEO.toVerifyfunctionalitySelectingActionDropdownasForward();
			//LoginAs_CEO.ToverifyFunctionalityofSearchbuttoncreatenewfile();
			LoginAs_CEO.toVerifyfunctionalityofUploadingDocument();
			LoginAs_CEO.toVerifyfunctionalityofEnterCommentsField();
			LoginAs_CEO.toVerifyfunctionalityofSubmitButton();
		
		}
}