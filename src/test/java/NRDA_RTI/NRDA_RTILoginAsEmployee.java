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
public class NRDA_RTILoginAsEmployee extends URLPageWSNRDAScript
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
	@DataProvider(name="Employee")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"Employee Credential");
	}
	/*************************************Created By Joydip ***********************************************/
	 @Test(priority=1,dataProvider ="Employee",description="verifyLoginAsEmployee")
	 public void NRDA_RTI_SC_12_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
			{
				WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
				login_as_PIO.loginAsEmployee(username, password);
				URLPageWSNRDAScript.logoutWS1();
			}
	/***************************************** End *********************************************************/
	 /*************************************Created By Joydip ***********************************************/
	 @Test(priority=2,dataProvider ="Employee",description="verifythehomelinkofdashboard")
	 public void NRDA_RTI_SC_12_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
			{
				WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
				login_as_PIO.loginAsEmployee(username, password);
				
				ToverifyRTILoginAsEmployee RTI_EE=PageFactory.initElements(driver, ToverifyRTILoginAsEmployee.class);
				RTI_EE.toverifythefunctionalityofhomelink();
				URLPageWSNRDAScript.logoutWS1();
			}
	/***************************************** End *********************************************************/
	/*************************************Created By Joydip ***********************************************/
	@Test(priority=3,dataProvider ="Employee",description="verifythefunctionalityofpaginationinPendingApplication")
	public void NRDA_RTI_SC_12_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginAsEmployee RTI_EE=PageFactory.initElements(driver, ToverifyRTILoginAsEmployee.class);
			RTI_EE.toVerifyMenuFieldsonDashBoard_SC_09_TC02();
			RTI_EE.toverifythefunctionalityofeGovernance();
			RTI_EE.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
			//URLPageWSNRDAScript.logoutWS1();
		}
	/***************************************** End *********************************************************/
	/*************************************Created By Joydip ***********************************************/
	@Test(priority=4,dataProvider ="Employee",description="toverifythefunctionalityofpaginationinPendingApplication")
	public void NRDA_RTI_SC_12_TC_04(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginAsEmployee RTI_EE=PageFactory.initElements(driver, ToverifyRTILoginAsEmployee.class);
			RTI_EE.toverifythefunctionalityofeGovernance();
			RTI_EE.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
			RTI_EE.toverifytheRTIlink();
			RTI_EE.toverifyPagination();
			URLPageWSNRDAScript.logoutWS1();
		}
	/***************************************** End *********************************************************/
	/*************************************Created By Joydip ***********************************************/
	@Test(priority=5, dataProvider ="Employee", description="toverifythesearchvalidapplication")
	public void NRDA_RTI_SC_12_TC_10(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginAsEmployee RTI_EE=PageFactory.initElements(driver, ToverifyRTILoginAsEmployee.class);
			RTI_EE.toverifythefunctionalityofeGovernance();
			RTI_EE.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
			RTI_EE.toverifytheRTIlink();
			RTI_EE.toverifysearchapplication();
			URLPageWSNRDAScript.logoutWS1();
		} 
	/***************************************** End *********************************************************/
	/*************************************Created By Joydip ***********************************************/
	@Test(priority=6,dataProvider ="Employee",description="toverifytheSubmitButtonActionFunctionality")
	public void NRDA_RTI_SC_12_TC_11(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginAsEmployee RTI_EE=PageFactory.initElements(driver, ToverifyRTILoginAsEmployee.class);
			RTI_EE.toverifythefunctionalityofeGovernance();
			RTI_EE.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
			RTI_EE.toverifytheRTIlink();
			RTI_EE.toverifysearchapplication();
			RTI_EE.toverifythefunctionalityofactionbutton();	
			URLPageWSNRDAScript.logoutWS1();
		} 
	/***************************************** End *********************************************************/
	/*************************************Created By Joydip ***********************************************/
	@Test(priority=7,dataProvider ="Employee",description="toverifytheprintButtonFunctionality")
	public void NRDA_RTI_SC_12_TC_12(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginAsEmployee RTI_EE=PageFactory.initElements(driver, ToverifyRTILoginAsEmployee.class);
			RTI_EE.toverifythefunctionalityofeGovernance();
			RTI_EE.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
			RTI_EE.toverifytheRTIlink();
			RTI_EE.toverifysearchapplication();
			RTI_EE.toverifythefunctionalityofactionbutton();
			RTI_EE.toverifythefunctionalityofprintbutton();	
			URLPageWSNRDAScript.logoutWS1();
		} 
	/***************************************** End *********************************************************/
	/*************************************Created By Joydip ***********************************************/
	@Test(priority=8,dataProvider ="Employee",description="toverifytheapplicationnumber")
	public void NRDA_RTI_SC_12_TC_13(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginAsEmployee RTI_EE=PageFactory.initElements(driver, ToverifyRTILoginAsEmployee.class);
			RTI_EE.toverifythefunctionalityofeGovernance();
			RTI_EE.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
			RTI_EE.toverifytheRTIlink();
			RTI_EE.toverifysearchapplication();
			RTI_EE.toverifythefunctionalityofactionbutton();
			RTI_EE.toverifytheapplicationno();		
			URLPageWSNRDAScript.logoutWS1();
		}
	/***************************************** End *********************************************************/
	/*************************************Created By Joydip ***********************************************/
	@Test(priority=9,dataProvider ="Employee",description="toverifytheapplicationnumber")
	public void NRDA_RTI_SC_12_TC_14(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginAsEmployee RTI_EE=PageFactory.initElements(driver, ToverifyRTILoginAsEmployee.class);
			RTI_EE.toverifythefunctionalityofeGovernance();
			RTI_EE.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
			RTI_EE.toverifytheRTIlink();
			RTI_EE.toverifysearchapplication();
			RTI_EE.toverifythefunctionalityofactionbutton();
			RTI_EE.toverifytheRTIInformationtab();
			RTI_EE.toverifythefunctionalityof_UploadingDocument();
			URLPageWSNRDAScript.logoutWS1();
		} 
	/***************************************** End *********************************************************/
	/*************************************Created By Joydip ***********************************************/
	@Test(priority=11,dataProvider ="Employee",description="toverifytheuploadfunctionality")
	public void NRDA_RTI_SC_12_TC_15(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginAsEmployee RTI_EE=PageFactory.initElements(driver, ToverifyRTILoginAsEmployee.class);
			RTI_EE.toverifythefunctionalityofeGovernance();
			RTI_EE.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
			RTI_EE.toverifytheRTIlink();
			RTI_EE.toverifysearchapplication();
			RTI_EE.toverifythefunctionalityofactionbutton();
			RTI_EE.toverifytheRTIInformationtab();
			RTI_EE.toverifytheAnswerbox();
			RTI_EE.toverifythefunctionalityof_UploadingDocument();
			RTI_EE.toverifythefunctionalityofsubmitbutton();			
		} 
	/***************************************** End *********************************************************/
	/*************************************Created By Joydip ***********************************************/
	@Test(priority=10,dataProvider ="Employee",description="toverifytheapplicationnumber")
	public void NRDA_RTI_SC_12_TC_16(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginAsEmployee RTI_EE=PageFactory.initElements(driver, ToverifyRTILoginAsEmployee.class);
			RTI_EE.toverifythefunctionalityofeGovernance();
			RTI_EE.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
			RTI_EE.toverifytheRTIlink();
			RTI_EE.toverifysearchapplication();
			RTI_EE.toverifythefunctionalityofactionbutton();
			RTI_EE.toverifytheRTIInformationtab();
			RTI_EE.toverifythefunctionalityofsubmitbutton();
			RTI_EE.toVerifyErrorMessageAsCommentFieldisBlank();	
			URLPageWSNRDAScript.logoutWS1();
		} 
	/***************************************** End *********************************************************/
	/*************************************Created By Joydip ***********************************************/
	@Test(priority=12,dataProvider ="Employee",description="toverifytheclosefunctionality")
	public void NRDA_RTI_SC_12_TC_17(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginAsEmployee RTI_EE=PageFactory.initElements(driver, ToverifyRTILoginAsEmployee.class);
			RTI_EE.toverifythefunctionalityofeGovernance();
			RTI_EE.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
			RTI_EE.toverifytheRTIlink();
			RTI_EE.toverifysearchapplication();
			RTI_EE.toverifythefunctionalityofactionbutton();
			RTI_EE.toverifytheRTIInformationtab();
			RTI_EE.toverifythefunctionalityofclosebutton();					
		} 
	/***************************************** End *********************************************************/
}
