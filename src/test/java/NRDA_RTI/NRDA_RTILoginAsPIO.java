package NRDA_RTI;

import java.io.IOException;

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
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;


/**
 * @author Sarvesh.Nellore
 * @Date: 23-10-2017
 */
@Listeners(GenericLibrary.ListenerDriver.class)
public class NRDA_RTILoginAsPIO extends URLPageWSNRDAScript
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
	@DataProvider(name="PIO")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"PIO Credentials");
	}
	
	 @Test(priority=1,dataProvider ="PIO",description="verifyLoginAsPIO_SC_09_TC_01")
		public void NRDA_RTI_SC_09_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
			{
				WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
				login_as_PIO.loginAsPIO(username, password);
			}
	
	@Test(priority=2,dataProvider ="PIO",description="verifytheDashBoardOfRTI_PIO_SC_09_TC_02")
	public void NRDA_RTI_SC_09_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
			RTI_PIO.toVerifyMenuFieldsonDashBoard_SC_09_TC02();
			//RTI_PIO.toVerifyFieldsonRTIIcon_SC_09_TC02();
		}
	
/*	
	@Test(priority=3,dataProvider ="PIO",description="verifytheApprovedCountLinkonRTI_PIO_SC_09_TC_03")
	public void NRDA_RTI_SC_09_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
			RTI_PIO.toVerifyPendingApplicationLink();
			RTI_PIO.toVerifyPendingApplicationMenulist();
		}
	@Test(priority=3,dataProvider ="PIO",description="verifytheApprovedCountLinkonRTI_PIO_SC_09_TC_03")
	public void NRDA_RTI_SC_09_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
			RTI_PIO.toclickonApprovecountlink();
			RTI_PIO.toVerifyActionButtonDisplayed01();
			RTI_PIO.toVerifyRecordPerPage02();
			RTI_PIO.toVerifyPagination02();
			RTI_PIO.closePopUpWindow();
			RTI_PIO.toverifyApproveCountinRTImenu02();
			RTI_PIO.closePopUpWindow();
		}
	
	@Test(priority=4,dataProvider ="PIO",description="ToVerifyPagination In Peding Application")
	public void NRDA_RTI_SC_09_TC_04(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
			RTI_PIO.toVerifyPendingApplicationLink();
			RTI_PIO.toVerifyPendingApplicationMenulist();
			RTI_PIO.toVerifyPagination02();
		}
	
	@Test(priority=4,dataProvider ="PIO",description="verifytheRejectCountLinkonRTI_PIO_SC_09_TC_04")
	public void NRDA_RTI_SC_09_TC_04(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
			RTI_PIO.toVerifyRejectCountlinkinRTImenu();
			RTI_PIO.toVerifyActionButtonDisplayed01();
			RTI_PIO.toVerifyRecordPerPage02();
			RTI_PIO.toVerifyPagination02();
			RTI_PIO.closePopUpWindow();
			RTI_PIO.toverifyRejectCountinRTImenu02();
			RTI_PIO.closePopUpWindow();
		}
	
	@Test(priority=5,dataProvider ="PIO",description="verifythePendingCountLinkonRTI_PIO_SC_09_TC_05")
	public void NRDA_RTI_SC_09_TC_05(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
			RTI_PIO.toVerifyPendingCountlinkinRTImenu();
			RTI_PIO.toVerifyActionButtonDisplayed01();
			RTI_PIO.toVerifyRecordPerPage02();
			RTI_PIO.toVerifyPagination02();
			RTI_PIO.closePopUpWindow();
			RTI_PIO.toverifyPendingCountinRTImenu02();
			RTI_PIO.closePopUpWindow();
		}
	
	
	
	@Test(priority=6,dataProvider ="PIO",description="verifythePendingApplicationPublicInformationOfficer_PIO_SC_09_TC_06")
	public void NRDA_RTI_SC_09_TC_06(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
			RTI_PIO.toverifythependingApplicationAsPublicInformationOfficer_SC_09_TC_06();
		} 
	*/
	@Test(priority=7,dataProvider ="PIO",description="toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07")
	public void NRDA_RTI_SC_09_TC_07(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
			RTI_PIO.toverifythefunctionalityofeGovernance();
			RTI_PIO.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
		} 
	
	
	/*@Test(priority=8,dataProvider ="PIO",description="toverifythePendingApplicationInvalidNumber_SC_09_TC_08")
	public void NRDA_RTI_SC_09_TC_08(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
			RTI_PIO.toverifythependingApplicationWithInvalidNumber_SC_09_TC_08();
		} */
	
	@Test(priority=9,dataProvider ="PIO",description="toverifythePendingApplicationBlankField_SC_09_TC_09")
	public void NRDA_RTI_SC_09_TC_09(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
			RTI_PIO.toverifythefunctionalityofeGovernance();
			RTI_PIO.toverifythependingApplicationWithBlankField_SC_09_TC_09();
		} 
	
	@Test(priority=10,dataProvider ="PIO",description="toverifythePendingApplicationValidNumber_SC_09_TC_10")
	public void NRDA_RTI_SC_09_TC_10(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
			RTI_PIO.toverifythependingApplicationWithValidNumber_SC_09_TC_10();
		} 
	
	@Test(priority=11,dataProvider ="PIO",description="toverifythePendingApplicationActionFunctionality_SC_09_TC_11")
	public void NRDA_RTI_SC_09_TC_11(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
			RTI_PIO.toverifythependingApplicationWithValidNumber_SC_09_TC_10();
			RTI_PIO.toverifythependingApplicationActionFunctionality_SC_09_TC_11();
		}
	
	@Test(priority=12,dataProvider ="PIO",description="toverifytheSubmitButtonActionFunctionalityisBlank_SC_09_TC_12")
	public void NRDA_RTI_SC_09_TC_12(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
			RTI_PIO.toverifythependingApplicationWithValidNumber_SC_09_TC_10();
			RTI_PIO.toVerifySubmitbuttonFunctionalityWithActionFieldISBlank_SC_09_TC_12();
			RTI_PIO.toVerifySubmitbuttonFunctionalityWithActionFieldISBlank();
			//RTI_PIO.toVerifyErrorMessage();
			
		} 
//	
//	/*@Test(priority=13,dataProvider ="PIO",description="toverifytheSubmitButtonUserFieldIsBlank_SC_09_TC_13")
//	public void NRDA_RTI_SC_09_TC_13(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
//		{
//			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
//			login_as_PIO.loginAsPIO(username, password);
//			
//			ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
//			RTI_PIO.toverifythependingApplicationWithValidNumber_SC_09_TC_10();
//			RTI_PIO.toVerifySubmitbuttonFunctionalityWithActionFieldISBlank_SC_09_TC_12();
//			RTI_PIO.toVerifySubmitbuttonFunctionalityWithUserFieldISBlank_SC_09_TC_13();
//			RTI_PIO.toVerifySubmitbuttonFunctionalityWithActionFieldISBlank();
//			RTI_PIO.toVerifyErrorMessageAsUserisBlank();
//			
//		}

	
	@Test(priority=14,dataProvider ="PIO",description="toverifytheSubmitButtonCommentFieldIsBlank_SC_09_TC_14")
	public void NRDA_RTI_SC_09_TC_14(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
			RTI_PIO.toverifythependingApplicationWithValidNumber_SC_09_TC_10();
			RTI_PIO.toVerifySubmitbuttonFunctionalityWithActionFieldISBlank_SC_09_TC_12();
			RTI_PIO.toVerifySubmitbuttonFunctionalityWithCommentFieldISBlank_SC_09_TC_14();
			RTI_PIO.toVerifySubmitbuttonFunctionalityWithActionFieldISBlank();
			RTI_PIO.toVerifyErrorMessageAsCommentFieldisBlank();
			
		}
	
	
	
	
//	@Test(priority=15,dataProvider ="PIO",description="toverifytheSubjectfile_SC_09_TC_15")
//	public void NRDA_RTI_SC_09_TC_18(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
//		{
//			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
//			login_as_PIO.loginAsPIO(username, password);
//			
//			ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
//			RTI_PIO.toverifythependingApplicationWithValidNumber_SC_09_TC_10();
//			RTI_PIO.toverifythependingApplicationActionFunctionality_SC_09_TC_11();
//			RTI_PIO.ToverifySubjectandFileNoFields();
//			
//			
//		}

	@Test(priority=16,dataProvider ="PIO",description="toverifytheSubmitButtonActionIsForward_SC_09_TC_15")
	public void NRDA_RTI_SC_09_TC_21(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
			RTI_PIO.toverifythependingApplicationWithValidNumber_SC_09_TC_10();
			RTI_PIO.toverifythependingApplicationActionFunctionality_SC_09_TC_11();
			RTI_PIO.toVerifyfunctionalityofUploadingDocument_SC_04_TC_06();
			
		}
	
	
	@Test(priority=17,dataProvider ="PIO",description="toverifytheCloseButtonFunctionality_SC_09_TC_15")
	public void NRDA_RTI_SC_09_TC_23(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
			RTI_PIO.toverifythependingApplicationWithValidNumber_SC_09_TC_10();
			RTI_PIO.toverifythependingApplicationActionFunctionality_SC_09_TC_11();
			RTI_PIO.toVerifyfunctionalityofCloseButton_SC_04_TC_06();
			
		}
	
	
	@Test(priority=18,dataProvider ="PIO",description="toverifytheSubmitButtonActionIsForward_SC_09_TC_15")
	public void NRDA_RTI_SC_09_TC_24(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
			RTI_PIO.toVerifyPendingApplicationLink();
			RTI_PIO.toverifySubmitFunctionalitywithActionAsForward();
			
		}
	
	
	
	
	
	
	
	
	
	
	
//	/*@Test(priority=16,dataProvider ="PIO",description="toverifytheSubmitButtonActionIsReject_SC_09_TC_16")
//	public void NRDA_RTI_SC_09_TC_16(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
//		{
//			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
//			login_as_PIO.loginAsPIO(username, password);
//			
//			ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
//			RTI_PIO.toverifySubmitFunctionalitywithActionAsReject_SC_09_TC_16();
//			
//		}
//	
//	@Test(priority=17,dataProvider ="PIO",description="toverifytheCloseButtonFunctionality_SC_09_TC_16")
//	public void NRDA_RTI_SC_09_TC_17(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
//		{
//			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
//			login_as_PIO.loginAsPIO(username, password);
//			
//			ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
//			RTI_PIO.toverifyfunctionalityofclosebutton_SC_09_TC_17();
//			RTI_PIO.toverifythemenuAfterClosingPendingApplication_SC_09_TC_017();
//			
//		}
//	*/
	
	

}
