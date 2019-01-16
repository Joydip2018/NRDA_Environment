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
import NRDA_ENVIRONMENT.ToverifyFunctionalityof_EnvironmentSection_Loginas_M;
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;
@Listeners(GenericLibrary.ListenerDriver.class)
public class NRDA_EnvironmentSectionLoginAs_M extends URLPageWSNRDAScript
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

	@DataProvider(name="NRDA-M")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"M_ENV_Credentials");
	}

	@Test(dataProvider ="NRDA-M",description="Verify the Home Page of Citizen",priority=1)
	public void NRDA_ENVIRONMENT_SC_10_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_Manager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_Manager.loginAsM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_M LoginAa_M=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_M.class);
			LoginAa_M.toverifythedashboardoftheApplication();
			
		}
	
	@Test(dataProvider ="NRDA-M",description="Verify the Pending Applications",priority=2)
	public void NRDA_ENVIRONMENT_SC_10_TC_02(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_Manager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_Manager.loginAsM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_M LoginAa_M=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_M.class);
			LoginAa_M.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_M.toVerifyPendingApplicationMenulist();
		}
	
	@Test(dataProvider ="NRDA-M",description="toVerifyPendingApplicationWithValidNumber",priority=3)
	public void NRDA_ENVIRONMENT_SC_10_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{ 
			WaterAndSewerageLoginPage logina_Manager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_Manager.loginAsM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_M LoginAa_M=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_M.class);
			LoginAa_M.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_M.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
		}
	
	@Test(dataProvider ="NRDA-M",description="toVerifyPaginationinApplication",priority=3)
	public void NRDA_ENVIRONMENT_SC_10_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_Manager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_Manager.loginAsM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_M LoginAa_M=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_M.class);
			LoginAa_M.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_M.toveriftthePaginationinPendingApplications();
		}
	
	@Test(dataProvider ="NRDA-M",description="toVerifyApplicationFieldAs Invalid Number",priority=3)
	public void NRDA_ENVIRONMENT_SC_10_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_Manager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_Manager.loginAsM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_M LoginAa_M=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_M.class);
			LoginAa_M.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_M.toverifythefunctionalityofsearchfiledasInvalidApplicationNumber();
		}
	
	@Test(dataProvider ="NRDA-M",description="toVerifyApplicationFieldAs Invalid Number",priority=3)
	public void NRDA_ENVIRONMENT_SC_10_TC_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_Manager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_Manager.loginAsM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_M LoginAa_M=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_M.class);
			LoginAa_M.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_M.toverifythefunctionalityofsearchfiledasApplicationNumberAsEnterNumericonly();
		}
	@Test(dataProvider ="NRDA-M",description="toVerifyApplicationFieldAs Invalid Number",priority=3)
	public void NRDA_ENVIRONMENT_SC_10_TC_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_Manager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_Manager.loginAsM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_M LoginAa_M=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_M.class);
			LoginAa_M.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_M.toverifythefunctionalityofsearchfiledasApplicationNumberAsEnterAlphabetonly();;
		}
	
	@Test(dataProvider ="NRDA-M",description="toVerifyfunctionalityPendingApplicationbyselectingspecificapplication",priority=4)
	public void NRDA_ENVIRONMENT_SC_10_TC_08(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_Manager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_Manager.loginAsM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_M LoginAa_M=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_M.class);
			LoginAa_M.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_M.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			LoginAa_M.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			
		}
	
//	@Test(dataProvider ="NRDA-M",description="toVerifyfunctionalityPendingApplicationbyselectingspecificapplication",priority=4)
//	public void NRDA_ENVIRONMENT_SC_04_TC_09(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
//		{
//			WaterAndSewerageLoginPage logina_Manager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
//			logina_Manager.loginAsM_ENV(username, password);
//			
//			ToverifyFunctionalityof_EnvironmentSection_Loginas_M LoginAa_M=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_M.class);
//			LoginAa_M.toVerifyEnvironmentSectionLink_SC_04_TC_02();
//			LoginAa_M.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
//			LoginAa_M.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
//			LoginAa_M.toVerifyfunctionalitySubjectField();
//		}
	
//	@Test(dataProvider ="NRDA-M",description="toVerifyfunctionalityPendingApplicationbyselectingspecificapplication",priority=4)
//	public void NRDA_ENVIRONMENT_SC_04_TC_10(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
//		{
//			WaterAndSewerageLoginPage logina_Manager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
//			logina_Manager.loginAsM_ENV(username, password);
//			
//			ToverifyFunctionalityof_EnvironmentSection_Loginas_M LoginAa_M=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_M.class);
//			LoginAa_M.toVerifyEnvironmentSectionLink_SC_04_TC_02();
//			LoginAa_M.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
//			LoginAa_M.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
//			LoginAa_M.toVerifyfunctionalityFileField();
//		}
//	
	
//	@Test(dataProvider ="NRDA-M",description="toVerifyfunctionalityPendingApplicationbyselectingspecificapplication",priority=4)
//	public void NRDA_ENVIRONMENT_SC_04_TC_11(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
//		{
//			WaterAndSewerageLoginPage logina_Manager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
//			logina_Manager.loginAsM_ENV(username, password);
//			
//			ToverifyFunctionalityof_EnvironmentSection_Loginas_M LoginAa_M=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_M.class);
//			LoginAa_M.toVerifyEnvironmentSectionLink_SC_04_TC_02();
//			LoginAa_M.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
//			LoginAa_M.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
//			LoginAa_M.toverifytheSearchbuttonFunctionality();
//		}
//	
//	@Test(dataProvider ="NRDA-M",description="toVerifyfunctionalityPendingApplicationbyselectingspecificapplication",priority=4)
//	public void NRDA_ENVIRONMENT_SC_04_TC_13(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
//		{
//			WaterAndSewerageLoginPage logina_Manager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
//			logina_Manager.loginAsM_ENV(username, password);
//			
//			ToverifyFunctionalityof_EnvironmentSection_Loginas_M LoginAa_M=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_M.class);
//			LoginAa_M.toVerifyEnvironmentSectionLink_SC_04_TC_02();
//			LoginAa_M.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
//			LoginAa_M.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
//			LoginAa_M.toverifyfunctionalityofClearButton();
//		}
//	
//	@Test(dataProvider ="NRDA-M",description="toVerifyfunctionalityPendingApplicationbyselectingspecificapplication",priority=4)
//	public void NRDA_ENVIRONMENT_SC_04_TC_12(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
//		{
//			WaterAndSewerageLoginPage logina_Manager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
//			logina_Manager.loginAsM_ENV(username, password);
//			
//			ToverifyFunctionalityof_EnvironmentSection_Loginas_M LoginAa_M=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_M.class);
//			LoginAa_M.toVerifyEnvironmentSectionLink_SC_04_TC_02();
//			LoginAa_M.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
//			LoginAa_M.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
//			LoginAa_M.ToverifyFunctionalityofSearchbuttoncreatenewfile();
//		}
	
	@Test(dataProvider ="NRDA-M",description="toVerifyfunctionalityPendingApplicationbyselectingspecificapplication",priority=4)
	public void NRDA_ENVIRONMENT_SC_10_TC_09(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_Manager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_Manager.loginAsM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_M LoginAa_M=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_M.class);
			LoginAa_M.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_M.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			LoginAa_M.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			LoginAa_M.toVerifyfunctionalitySelectingActionDropdownasForward();
		}
	
	@Test(dataProvider ="NRDA-M",description="toVerifyfunctionalityPendingApplicationbyselectingspecificapplication",priority=4)
	public void NRDA_ENVIRONMENT_SC_10_TC_10(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_Manager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_Manager.loginAsM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_M LoginAa_M=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_M.class);
			LoginAa_M.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_M.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			LoginAa_M.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			LoginAa_M.toVerifyfunctionalitySelectingActionDropdownasForward();
			LoginAa_M.toVerifyfunctionalityPrintButton_SC_05_TC_11();
		}
	
	
	@Test(dataProvider ="NRDA-M",description="toVerifyfunctionalityofUploadingDocument",priority=6)
	public void NRDA_ENVIRONMENT_SC_10_TC_11(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_Manager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_Manager.loginAsM_ENV(username, password);
			
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_M LoginAa_M=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_M.class);
			LoginAa_M.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_M.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			LoginAa_M.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			LoginAa_M.toVerifyfunctionalitySelectingActionDropdownasForward();
			LoginAa_M.toVerifyfunctionalityofUploadingDocument();
		
		}
	

	@Test(dataProvider ="NRDA-M",description="toVerifyfunctionalityofUploadingDocument",priority=6)
	public void NRDA_ENVIRONMENT_SC_10_TC_12(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_Manager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_Manager.loginAsM_ENV(username, password);
					
			ToverifyFunctionalityof_EnvironmentSection_Loginas_M LoginAa_M=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_M.class);
			LoginAa_M.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_M.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			LoginAa_M.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			LoginAa_M.toVerifyfunctionalitySelectingActionDropdownasForward();
			LoginAa_M.toVerifyfunctionalityofUploadingInvalidDocument();
		
		}
	
	@Test(dataProvider ="NRDA-M",description="toVerifyfunctionalityofUploadingDocument",priority=6)
	public void NRDA_ENVIRONMENT_SC_10_TC_13(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_Manager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_Manager.loginAsM_ENV(username, password);
					
			ToverifyFunctionalityof_EnvironmentSection_Loginas_M LoginAa_M=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_M.class);
			LoginAa_M.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_M.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			LoginAa_M.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			LoginAa_M.toVerifyfunctionalitySelectingActionDropdownasForward();
			LoginAa_M.toVerifyfunctionalityofUploadingDocument();
			LoginAa_M.toVerifyfunctionalityofEnterCommentsField();
		
		}
	
	
	@Test(dataProvider ="NRDA-M",description="toVerifyfunctionalityofUploadingDocument",priority=6)
	public void NRDA_ENVIRONMENT_SC_10_TC_14(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_Manager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_Manager.loginAsM_ENV(username, password);
					
			ToverifyFunctionalityof_EnvironmentSection_Loginas_M LoginAa_M=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_M.class);
			LoginAa_M.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_M.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			LoginAa_M.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			LoginAa_M.toVerifyfunctionalitySelectingActionDropdownasForward();
			//LoginAa_M.ToverifyFunctionalityofSearchbuttoncreatenewfile();
			LoginAa_M.toVerifyfunctionalityofUploadingDocument();
			LoginAa_M.toVerifyfunctionalityofEnterCommentsField();
			LoginAa_M.toVerifyfunctionalityofCloseButton();
		
		}
	
	
	@Test(dataProvider ="NRDA-M",description="toVerifyfunctionalityofUploadingDocument",priority=6)
	public void NRDA_ENVIRONMENT_SC_10_TC_15(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_Manager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_Manager.loginAsM_ENV(username, password);
					
			ToverifyFunctionalityof_EnvironmentSection_Loginas_M LoginAa_M=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_M.class);
			LoginAa_M.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_M.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			LoginAa_M.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			LoginAa_M.toVerifyfunctionalitySelectingActionDropdownasForward();
			//LoginAa_M.ToverifyFunctionalityofSearchbuttoncreatenewfile();
			LoginAa_M.toVerifyfunctionalityofUploadingDocument();
			LoginAa_M.toVerifyfunctionalityofEnterCommentsField();
			LoginAa_M.toVerifyfunctionalityofSubmitButton();
		
		}
}