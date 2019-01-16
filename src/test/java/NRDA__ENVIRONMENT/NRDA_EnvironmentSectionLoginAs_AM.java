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
import NRDA_ENVIRONMENT.ToverifyFunctionalityof_EnvironmentSection_Loginas_AM;
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;
@Listeners(GenericLibrary.ListenerDriver.class)
public class NRDA_EnvironmentSectionLoginAs_AM extends URLPageWSNRDAScript
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

	@DataProvider(name="NRDA-AM")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"AM_ENV_Credentials");
	}

	@Test(dataProvider ="NRDA-AM",description="Verify the Home Page of Citizen",priority=1)
	public void NRDA_ENVIRONMENT_SC_09_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsAM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_AM LoginAa_AM=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_AM.class);
			LoginAa_AM.toverifythedashboardoftheApplication();
			
		}
	
	@Test(dataProvider ="NRDA-AM",description="Verify the Pending Applications",priority=2)
	public void NRDA_ENVIRONMENT_SC_09_TC_02(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsAM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_AM LoginAa_AM=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_AM.class);
			LoginAa_AM.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_AM.toVerifyPendingApplicationMenulist();
		}
	
	@Test(dataProvider ="NRDA-AM",description="toVerifyPendingApplicationWithValidNumber",priority=3)
	public void NRDA_ENVIRONMENT_SC_09_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{ 
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsAM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_AM LoginAa_AM=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_AM.class);
			LoginAa_AM.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_AM.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
		}
	
	@Test(dataProvider ="NRDA-AM",description="toVerifyPaginationinApplication",priority=3)
	public void NRDA_ENVIRONMENT_SC_09_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsAM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_AM LoginAa_AM=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_AM.class);
			LoginAa_AM.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_AM.toveriftthePaginationinPendingApplications();
		}
	
	@Test(dataProvider ="NRDA-AM",description="toVerifyApplicationFieldAs Invalid Number",priority=3)
	public void NRDA_ENVIRONMENT_SC_09_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsAM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_AM LoginAa_AM=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_AM.class);
			LoginAa_AM.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_AM.toverifythefunctionalityofsearchfiledasInvalidApplicationNumber();
		}
	
	@Test(dataProvider ="NRDA-AM",description="toVerifyApplicationFieldAs Invalid Number",priority=3)
	public void NRDA_ENVIRONMENT_SC_09_TC_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsAM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_AM LoginAa_AM=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_AM.class);
			LoginAa_AM.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_AM.toverifythefunctionalityofsearchfiledasApplicationNumberAsEnterNumericonly();
		}
	@Test(dataProvider ="NRDA-AM",description="toVerifyApplicationFieldAs Invalid Number",priority=3)
	public void NRDA_ENVIRONMENT_SC_09_TC_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsAM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_AM LoginAa_AM=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_AM.class);
			LoginAa_AM.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_AM.toverifythefunctionalityofsearchfiledasApplicationNumberAsEnterAlphabetonly();;
		}
	
	@Test(dataProvider ="NRDA-AM",description="toVerifyfunctionalityPendingApplicationbyselectingspecificapplication",priority=4)
	public void NRDA_ENVIRONMENT_SC_09_TC_08(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsAM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_AM LoginAa_AM=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_AM.class);
			LoginAa_AM.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_AM.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			LoginAa_AM.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			
		}
	
//	@Test(dataProvider ="NRDA-AM",description="toVerifyfunctionalityPendingApplicationbyselectingspecificapplication",priority=4)
//	public void NRDA_ENVIRONMENT_SC_04_TC_09(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
//		{
//			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
//			logina_citizen.loginAsAM_ENV(username, password);
//			
//			ToverifyFunctionalityof_EnvironmentSection_Loginas_AM LoginAa_AM=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_AM.class);
//			LoginAa_AM.toVerifyEnvironmentSectionLink_SC_04_TC_02();
//			LoginAa_AM.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
//			LoginAa_AM.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
//			LoginAa_AM.toVerifyfunctionalitySubjectField();
//		}
	
//	@Test(dataProvider ="NRDA-AM",description="toVerifyfunctionalityPendingApplicationbyselectingspecificapplication",priority=4)
//	public void NRDA_ENVIRONMENT_SC_04_TC_10(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
//		{
//			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
//			logina_citizen.loginAsAM_ENV(username, password);
//			
//			ToverifyFunctionalityof_EnvironmentSection_Loginas_AM LoginAa_AM=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_AM.class);
//			LoginAa_AM.toVerifyEnvironmentSectionLink_SC_04_TC_02();
//			LoginAa_AM.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
//			LoginAa_AM.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
//			LoginAa_AM.toVerifyfunctionalityFileField();
//		}
//	
	
//	@Test(dataProvider ="NRDA-AM",description="toVerifyfunctionalityPendingApplicationbyselectingspecificapplication",priority=4)
//	public void NRDA_ENVIRONMENT_SC_04_TC_11(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
//		{
//			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
//			logina_citizen.loginAsAM_ENV(username, password);
//			
//			ToverifyFunctionalityof_EnvironmentSection_Loginas_AM LoginAa_AM=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_AM.class);
//			LoginAa_AM.toVerifyEnvironmentSectionLink_SC_04_TC_02();
//			LoginAa_AM.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
//			LoginAa_AM.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
//			LoginAa_AM.toverifytheSearchbuttonFunctionality();
//		}
//	
//	@Test(dataProvider ="NRDA-AM",description="toVerifyfunctionalityPendingApplicationbyselectingspecificapplication",priority=4)
//	public void NRDA_ENVIRONMENT_SC_04_TC_13(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
//		{
//			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
//			logina_citizen.loginAsAM_ENV(username, password);
//			
//			ToverifyFunctionalityof_EnvironmentSection_Loginas_AM LoginAa_AM=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_AM.class);
//			LoginAa_AM.toVerifyEnvironmentSectionLink_SC_04_TC_02();
//			LoginAa_AM.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
//			LoginAa_AM.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
//			LoginAa_AM.toverifyfunctionalityofClearButton();
//		}
//	
//	@Test(dataProvider ="NRDA-AM",description="toVerifyfunctionalityPendingApplicationbyselectingspecificapplication",priority=4)
//	public void NRDA_ENVIRONMENT_SC_04_TC_12(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
//		{
//			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
//			logina_citizen.loginAsAM_ENV(username, password);
//			
//			ToverifyFunctionalityof_EnvironmentSection_Loginas_AM LoginAa_AM=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_AM.class);
//			LoginAa_AM.toVerifyEnvironmentSectionLink_SC_04_TC_02();
//			LoginAa_AM.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
//			LoginAa_AM.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
//			LoginAa_AM.ToverifyFunctionalityofSearchbuttoncreatenewfile();
//		}
	
	@Test(dataProvider ="NRDA-AM",description="toVerifyfunctionalityPendingApplicationbyselectingspecificapplication",priority=4)
	public void NRDA_ENVIRONMENT_SC_09_TC_09(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsAM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_AM LoginAa_AM=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_AM.class);
			LoginAa_AM.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_AM.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			LoginAa_AM.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			LoginAa_AM.toVerifyfunctionalitySelectingActionDropdownasForward();
		}
	
	@Test(dataProvider ="NRDA-AM",description="toVerifyfunctionalityPendingApplicationbyselectingspecificapplication",priority=4)
	public void NRDA_ENVIRONMENT_SC_09_TC_10(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsAM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_AM LoginAa_AM=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_AM.class);
			LoginAa_AM.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_AM.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			LoginAa_AM.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			LoginAa_AM.toVerifyfunctionalitySelectingActionDropdownasForward();
			LoginAa_AM.toVerifyfunctionalityPrintButton_SC_05_TC_11();
		}
	
	
	@Test(dataProvider ="NRDA-AM",description="toVerifyfunctionalityofUploadingDocument",priority=6)
	public void NRDA_ENVIRONMENT_SC_09_TC_11(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsAM_ENV(username, password);
			
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_AM LoginAa_AM=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_AM.class);
			LoginAa_AM.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_AM.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			LoginAa_AM.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			LoginAa_AM.toVerifyfunctionalitySelectingActionDropdownasForward();
			LoginAa_AM.toVerifyfunctionalityofUploadingDocument();
		
		}
	

	@Test(dataProvider ="NRDA-AM",description="toVerifyfunctionalityofUploadingDocument",priority=6)
	public void NRDA_ENVIRONMENT_SC_09_TC_12(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsAM_ENV(username, password);
					
			ToverifyFunctionalityof_EnvironmentSection_Loginas_AM LoginAa_AM=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_AM.class);
			LoginAa_AM.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_AM.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			LoginAa_AM.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			LoginAa_AM.toVerifyfunctionalitySelectingActionDropdownasForward();
			LoginAa_AM.toVerifyfunctionalityofUploadingInvalidDocument();
		
		}
	
	@Test(dataProvider ="NRDA-AM",description="toVerifyfunctionalityofUploadingDocument",priority=6)
	public void NRDA_ENVIRONMENT_SC_09_TC_13(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsAM_ENV(username, password);
					
			ToverifyFunctionalityof_EnvironmentSection_Loginas_AM LoginAa_AM=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_AM.class);
			LoginAa_AM.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_AM.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			LoginAa_AM.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			LoginAa_AM.toVerifyfunctionalitySelectingActionDropdownasForward();
			LoginAa_AM.toVerifyfunctionalityofUploadingDocument();
			LoginAa_AM.toVerifyfunctionalityofEnterCommentsField();
		
		}
	
	
	@Test(dataProvider ="NRDA-AM",description="toVerifyfunctionalityofUploadingDocument",priority=6)
	public void NRDA_ENVIRONMENT_SC_09_TC_14(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsAM_ENV(username, password);
					
			ToverifyFunctionalityof_EnvironmentSection_Loginas_AM LoginAa_AM=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_AM.class);
			LoginAa_AM.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_AM.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			LoginAa_AM.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			LoginAa_AM.toVerifyfunctionalitySelectingActionDropdownasForward();
			//LoginAa_AM.ToverifyFunctionalityofSearchbuttoncreatenewfile();
			LoginAa_AM.toVerifyfunctionalityofUploadingDocument();
			LoginAa_AM.toVerifyfunctionalityofEnterCommentsField();
			LoginAa_AM.toVerifyfunctionalityofCloseButton();
		
		}
	
	
	@Test(dataProvider ="NRDA-AM",description="toVerifyfunctionalityofUploadingDocument",priority=6)
	public void NRDA_ENVIRONMENT_SC_09_TC_15(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsAM_ENV(username, password);
					
			ToverifyFunctionalityof_EnvironmentSection_Loginas_AM LoginAa_AM=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_AM.class);
			LoginAa_AM.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_AM.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			LoginAa_AM.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			LoginAa_AM.toVerifyfunctionalitySelectingActionDropdownasForward();
			//LoginAa_AM.ToverifyFunctionalityofSearchbuttoncreatenewfile();
			LoginAa_AM.toVerifyfunctionalityofUploadingDocument();
			LoginAa_AM.toVerifyfunctionalityofEnterCommentsField();
			LoginAa_AM.toVerifyfunctionalityofSubmitButton();
		
		}
}