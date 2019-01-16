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
public class NRDA_RTILoginAsEE extends URLPageWSNRDAScript
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
	@DataProvider(name="EE")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"EE credentials");
	}
	/*************************************Created By Joydip ***********************************************/
	 @Test(priority=1,dataProvider ="EE",description="verifyLoginAsEE")
	 public void NRDA_RTI_SC_11_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
			{
				WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
				login_as_PIO.loginAsEE(username, password);
				URLPageWSNRDAScript.logoutWS1();
			}
	 /***************************************** End *********************************************************/
	 /*************************************Created By Joydip ***********************************************/
	 @Test(priority=2,dataProvider ="EE",description="verifythehomelinkofdashboard")
	 public void NRDA_RTI_SC_11_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
			{
				WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
				login_as_PIO.loginAsEmployee(username, password);
				
				ToverifyRTILoginAsEE RTI_EE=PageFactory.initElements(driver, ToverifyRTILoginAsEE.class);
				RTI_EE.toverifythefunctionalityofhomelink();
				URLPageWSNRDAScript.logoutWS1();
			}
	 /***************************************** End *********************************************************/
	/*************************************Created By Joydip ***********************************************/
	@Test(priority=3,dataProvider ="EE",description="toverifythefunctionalityofpaginationinPendingApplication")
	public void NRDA_RTI_SC_11_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
			{
				WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
				login_as_PIO.loginAsPIO(username, password);
				
				ToverifyRTILoginAsEE RTI_EE=PageFactory.initElements(driver, ToverifyRTILoginAsEE.class);
				RTI_EE.toverifythefunctionalityofeGovernance();
				RTI_EE.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
				RTI_EE.toverifytheRTIlink();
				RTI_EE.toverifyPagination();		
				URLPageWSNRDAScript.logoutWS1();
			} 
	/***************************************** End *********************************************************/
	/*************************************Created By Joydip ***********************************************/
	@Test(priority=6,dataProvider ="EE",description="toverifythePendingApplicationBlankField")
	public void NRDA_RTI_SC_11_TC_06(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginAsEE RTI_EE=PageFactory.initElements(driver, ToverifyRTILoginAsEE.class);
			RTI_EE.toverifythefunctionalityofeGovernance();
			RTI_EE.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
			RTI_EE.toverifytheRTIlink();
			RTI_EE.toverifysearchapplication();
			URLPageWSNRDAScript.logoutWS1();
		} 
	/***************************************** End *********************************************************/
	/*************************************Created By Joydip ***********************************************/
	@Test(priority=7,dataProvider ="EE",description="toverifytheSubmitButtonActionFunctionality")
	public void NRDA_RTI_SC_11_TC_07(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginAsEE RTI_EE=PageFactory.initElements(driver, ToverifyRTILoginAsEE.class);
			RTI_EE.toverifythefunctionalityofeGovernance();
			RTI_EE.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
			RTI_EE.toverifytheRTIlink();
			RTI_EE.toverifysearchapplication();
			RTI_EE.toverifythefunctionalityofactionbutton();
			URLPageWSNRDAScript.logoutWS1();
				
		} 
	/***************************************** End *********************************************************/
	/*************************************Created By Joydip ***********************************************/
	@Test(priority=8,dataProvider ="EE",description="toverifytheprintButtonFunctionality")
	public void NRDA_RTI_SC_11_TC_08(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginAsEE RTI_EE=PageFactory.initElements(driver, ToverifyRTILoginAsEE.class);
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
	@Test(priority=9,dataProvider ="EE",description="toverifytheapplicationnumber")
	public void NRDA_RTI_SC_11_TC_09(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginAsEE RTI_EE=PageFactory.initElements(driver, ToverifyRTILoginAsEE.class);
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
	@Test(priority=12,dataProvider ="EE",description="toverifythedepartmentalbox")
	public void NRDA_RTI_SC_11_TC_12(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginAsEE RTI_EE=PageFactory.initElements(driver, ToverifyRTILoginAsEE.class);
			RTI_EE.toverifythefunctionalityofeGovernance();
			RTI_EE.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
			RTI_EE.toverifytheRTIlink();
			RTI_EE.toverifysearchapplication();
			RTI_EE.toverifythefunctionalityofactionbutton();
			RTI_EE.toverifytheRTIInformationtab();
			RTI_EE.toverifytheDepartmentalbox();
			URLPageWSNRDAScript.logoutWS1();
		}
	
	/***************************************** End *********************************************************/
	/*************************************Created By Joydip ***********************************************/
	@Test(priority=13,dataProvider ="EE",description="toverifytheuploadfunctionality")
	public void NRDA_RTI_SC_11_TC_13(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginAsEE RTI_EE=PageFactory.initElements(driver, ToverifyRTILoginAsEE.class);
			RTI_EE.toverifythefunctionalityofeGovernance();
			RTI_EE.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
			RTI_EE.toverifytheRTIlink();
			RTI_EE.toverifysearchapplication();
			RTI_EE.toverifythefunctionalityofactionbutton();
			//RTI_EE.toverifytheRTIInformationtab();
			RTI_EE.toverifythefunctionalityof_UploadingDocument();
			URLPageWSNRDAScript.logoutWS1();
		} 
	/***************************************** End *********************************************************/
	/*************************************Created By Joydip ***********************************************/
	@Test(priority=15,dataProvider ="EE",description="Toverifyfunctionalityofofsubmitbutton")
	public void NRDA_RTI_SC_11_TC_15(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginAsEE RTI_EE=PageFactory.initElements(driver, ToverifyRTILoginAsEE.class);
			RTI_EE.toverifythefunctionalityofeGovernance();
			RTI_EE.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
			RTI_EE.toverifytheRTIlink();
			RTI_EE.toverifysearchapplication();
			RTI_EE.toverifythefunctionalityofactionbutton();
			RTI_EE.toverifythefunctionalityofactiondropdown();
			RTI_EE.toverifythecommentbox();
			RTI_EE.toverifytheRTIInformationtab();
			RTI_EE.toverifythefunctionalityofsubmitbutton();
			//URLPageWSNRDAScript.logoutWS1();
		}
	/***************************************** End *********************************************************/
	/*************************************Created By Joydip ***********************************************/
	@Test(priority=16,dataProvider ="EE",description="toverifytheclosebutton")
	public void NRDA_RTI_SC_11_TC_16(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginAsEE RTI_EE=PageFactory.initElements(driver, ToverifyRTILoginAsEE.class);
			RTI_EE.toverifythefunctionalityofeGovernance();
			RTI_EE.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
			RTI_EE.toverifytheRTIlink();
			RTI_EE.toverifysearchapplication();
			RTI_EE.toverifythefunctionalityofactionbutton();
			//RTI_EE.toverifytheRTIInformationtab();
			RTI_EE.toverifythefunctionalityofclosebutton();
			//URLPageWSNRDAScript.logoutWS1();
		} 
	/***************************************** End *********************************************************/
	/*************************************Created By Joydip ***********************************************/	
	@Test(priority=17,dataProvider ="EE",description="toverifytheSubmitButtonCommentFieldIsBlank")
	public void WithoutTC_NRDA_RTI_SC_09_TC_06(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginAsEE RTI_EE=PageFactory.initElements(driver, ToverifyRTILoginAsEE.class);
			RTI_EE.toverifythefunctionalityofeGovernance();
			RTI_EE.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
			RTI_EE.toverifytheRTIlink();
			RTI_EE.toverifysearchapplication();
			RTI_EE.toverifythefunctionalityofactionbutton();
			RTI_EE.toverifythefunctionalityofsubmitbutton();
			RTI_EE.toVerifyErrorMessageAsCommentFieldisBlank();		
			URLPageWSNRDAScript.logoutWS1();
		}
	/***************************************** End *********************************************************/
}
