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
import NRDA_ENVIRONMENT.ToverifyFunctionalityof_EnvironmentSection_Loginas_DGM;
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;

@Listeners(GenericLibrary.ListenerDriver.class)
public class NRDA_EnvironmentSectionLoginAs_DGM extends URLPageWSNRDAScript
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

	@DataProvider(name="ENV-DGM")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"DGM_ENV_Credentials");
	}

	@Test(dataProvider ="ENV-DGM",description="Verify the Home Page of Citizen",priority=1)
	public void NRDA_ENVIRONMENT_SC_11_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_DGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_DGM.loginAsDGM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_DGM LoginAa_DGM=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_DGM.class);
			LoginAa_DGM.toverifythedashboardoftheApplication();
			
		}
	
	@Test(dataProvider ="ENV-DGM",description="Verify the Pending Applications",priority=2)
	public void NRDA_ENVIRONMENT_SC_11_TC_02(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_DGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_DGM.loginAsDGM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_DGM LoginAa_DGM=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_DGM.class);
			LoginAa_DGM.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_DGM.toVerifyPendingApplicationMenulist();
		}
	
	@Test(dataProvider ="ENV-DGM",description="toVerifyPendingApplicationWithValidNumber",priority=3)
	public void NRDA_ENVIRONMENT_SC_11_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{ 
			WaterAndSewerageLoginPage logina_DGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_DGM.loginAsDGM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_DGM LoginAa_DGM=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_DGM.class);
			LoginAa_DGM.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_DGM.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
		}
	
	@Test(dataProvider ="ENV-DGM",description="toVerifyPaginationinApplication",priority=3)
	public void NRDA_ENVIRONMENT_SC_11_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_DGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_DGM.loginAsDGM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_DGM LoginAa_DGM=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_DGM.class);
			LoginAa_DGM.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_DGM.toveriftthePaginationinPendingApplications();
		}
	
	@Test(dataProvider ="ENV-DGM",description="toVerifyApplicationFieldAs Invalid Number",priority=3)
	public void NRDA_ENVIRONMENT_SC_11_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_DGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_DGM.loginAsDGM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_DGM LoginAa_DGM=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_DGM.class);
			LoginAa_DGM.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_DGM.toverifythefunctionalityofsearchfiledasInvalidApplicationNumber();
		}
	
	@Test(dataProvider ="ENV-DGM",description="toVerifyApplicationFieldAs Invalid Number",priority=3)
	public void NRDA_ENVIRONMENT_SC_11_TC_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_DGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_DGM.loginAsDGM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_DGM LoginAa_DGM=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_DGM.class);
			LoginAa_DGM.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_DGM.toverifythefunctionalityofsearchfiledasApplicationNumberAsEnterNumericonly();
		}
	@Test(dataProvider ="ENV-DGM",description="toVerifyApplicationFieldAs Invalid Number",priority=3)
	public void NRDA_ENVIRONMENT_SC_11_TC_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_DGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_DGM.loginAsDGM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_DGM LoginAa_DGM=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_DGM.class);
			LoginAa_DGM.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_DGM.toverifythefunctionalityofsearchfiledasApplicationNumberAsEnterAlphabetonly();;
		}
	
	@Test(dataProvider ="ENV-DGM",description="toVerifyfunctionalityPendingApplicationbyselectingspecificapplication",priority=4)
	public void NRDA_ENVIRONMENT_SC_11_TC_08(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_DGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_DGM.loginAsDGM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_DGM LoginAa_DGM=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_DGM.class);
			LoginAa_DGM.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_DGM.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			LoginAa_DGM.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			
		}
	

	
	@Test(dataProvider ="ENV-DGM",description="toVerifyfunctionalityPendingApplicationbyselectingspecificapplication",priority=4)
	public void NRDA_ENVIRONMENT_SC_11_TC_09(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_DGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_DGM.loginAsDGM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_DGM LoginAa_DGM=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_DGM.class);
			LoginAa_DGM.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_DGM.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			LoginAa_DGM.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			LoginAa_DGM.toVerifyfunctionalitySelectingActionDropdownasForward();
		}
	
	@Test(dataProvider ="ENV-DGM",description="toVerifyfunctionalityPendingApplicationbyselectingspecificapplication",priority=4)
	public void NRDA_ENVIRONMENT_SC_11_TC_10(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_DGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_DGM.loginAsDGM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_DGM LoginAa_DGM=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_DGM.class);
			LoginAa_DGM.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_DGM.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			LoginAa_DGM.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			LoginAa_DGM.toVerifyfunctionalitySelectingActionDropdownasForward();
			LoginAa_DGM.toVerifyfunctionalityPrintButton_SC_05_TC_11();
		}
	
	
	@Test(dataProvider ="ENV-DGM",description="toVerifyfunctionalityofUploadingDocument",priority=6)
	public void NRDA_ENVIRONMENT_SC_11_TC_11(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_DGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_DGM.loginAsDGM_ENV(username, password);
			
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_DGM LoginAa_DGM=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_DGM.class);
			LoginAa_DGM.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_DGM.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			LoginAa_DGM.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			LoginAa_DGM.toVerifyfunctionalitySelectingActionDropdownasForward();
			LoginAa_DGM.toVerifyfunctionalityofUploadingDocument();
		
		}
	

	@Test(dataProvider ="ENV-DGM",description="toVerifyfunctionalityofUploadingDocument",priority=6)
	public void NRDA_ENVIRONMENT_SC_11_TC_12(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_DGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_DGM.loginAsDGM_ENV(username, password);
					
			ToverifyFunctionalityof_EnvironmentSection_Loginas_DGM LoginAa_DGM=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_DGM.class);
			LoginAa_DGM.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_DGM.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			LoginAa_DGM.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			LoginAa_DGM.toVerifyfunctionalitySelectingActionDropdownasForward();
			LoginAa_DGM.toVerifyfunctionalityofUploadingInvalidDocument();
		
		}
	
	@Test(dataProvider ="ENV-DGM",description="toVerifyfunctionalityofUploadingDocument",priority=6)
	public void NRDA_ENVIRONMENT_SC_11_TC_13(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_DGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_DGM.loginAsDGM_ENV(username, password);
					
			ToverifyFunctionalityof_EnvironmentSection_Loginas_DGM LoginAa_DGM=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_DGM.class);
			LoginAa_DGM.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_DGM.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			LoginAa_DGM.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			LoginAa_DGM.toVerifyfunctionalitySelectingActionDropdownasForward();
			LoginAa_DGM.toVerifyfunctionalityofUploadingDocument();
			LoginAa_DGM.toVerifyfunctionalityofEnterCommentsField();
		
		}
	
	
	@Test(dataProvider ="ENV-DGM",description="toVerifyfunctionalityofUploadingDocument",priority=6)
	public void NRDA_ENVIRONMENT_SC_11_TC_14(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_DGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_DGM.loginAsDGM_ENV(username, password);
					
			ToverifyFunctionalityof_EnvironmentSection_Loginas_DGM LoginAa_DGM=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_DGM.class);
			LoginAa_DGM.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_DGM.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			LoginAa_DGM.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			LoginAa_DGM.toVerifyfunctionalitySelectingActionDropdownasForward();
			//LoginAa_DGM.ToverifyFunctionalityofSearchbuttoncreatenewfile();
			LoginAa_DGM.toVerifyfunctionalityofUploadingDocument();
			LoginAa_DGM.toVerifyfunctionalityofEnterCommentsField();
			LoginAa_DGM.toVerifyfunctionalityofCloseButton();
		
		}
	
	
	@Test(dataProvider ="ENV-DGM",description="toVerifyfunctionalityofUploadingDocument",priority=6)
	public void NRDA_ENVIRONMENT_SC_11_TC_15(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_DGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_DGM.loginAsDGM_ENV(username, password);
					
			ToverifyFunctionalityof_EnvironmentSection_Loginas_DGM LoginAa_DGM=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_DGM.class);
			LoginAa_DGM.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			LoginAa_DGM.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			LoginAa_DGM.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			LoginAa_DGM.toVerifyfunctionalitySelectingActionDropdownasForward();
			//LoginAa_DGM.ToverifyFunctionalityofSearchbuttoncreatenewfile();
			LoginAa_DGM.toVerifyfunctionalityofUploadingDocument();
			LoginAa_DGM.toVerifyfunctionalityofEnterCommentsField();
			LoginAa_DGM.toVerifyfunctionalityofSubmitButton();
		
		}
}