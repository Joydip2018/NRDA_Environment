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
public class NRDA_RTILoginAsmanager extends URLPageWSNRDAScript
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
	/*************************************Created By Joydip ***********************************************/
	 @Test(priority=1,dataProvider ="PIO",description="verifyLoginAsPIO")
		public void NRDA_RTI_SC_09_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
			{
				WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
				login_as_PIO.loginAsPIO(username, password);
				URLPageWSNRDAScript.logoutWS1();
			}
	/***************************************** End *********************************************************/
	/*************************************Created By Joydip ***********************************************/
	@Test(priority=2,dataProvider ="PIO",description="verifytheDashBoardOfRTI_PIO")
	public void NRDA_RTI_SC_09_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
			RTI_PIO.toVerifyMenuFieldsonDashBoard_SC_09_TC02();
			URLPageWSNRDAScript.logoutWS1();
		}
	/***************************************** End *********************************************************/
	/*************************************Created By Joydip ***********************************************/
	@Test(priority=3,dataProvider ="PIO",description="toverifythefunctionalityofpaginationinPendingApplication")
	public void NRDA_RTI_SC_09_TC_07(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
			RTI_PIO.toverifythefunctionalityofeGovernance();
			RTI_PIO.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
			//URLPageWSNRDAScript.logoutWS1();
		} 
	/***************************************** End *********************************************************/
	/*************************************Created By Joydip ***********************************************/
	@Test(priority=4,dataProvider ="PIO",description="toverifythefunctionalityofpaginationinPendingApplication")
	public void NRDA_RTI_SC_09_TC_08(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
			RTI_PIO.toverifythefunctionalityofeGovernance();
			RTI_PIO.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
			RTI_PIO.toverifytheRTIlink();
			RTI_PIO.toverifyPagination();
			URLPageWSNRDAScript.logoutWS1();
		}
	/***************************************** End *********************************************************/
	/*************************************Created By Joydip ***********************************************/
	@Test(priority=5,dataProvider ="PIO",description="toverifythePendingApplicationBlankField")
	public void NRDA_RTI_SC_09_TC_11(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
			RTI_PIO.toverifythefunctionalityofeGovernance();
			RTI_PIO.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
			RTI_PIO.toverifytheRTIlink();
			RTI_PIO.toverifysearchapplication();
			URLPageWSNRDAScript.logoutWS1();
		} 
	/***************************************** End *********************************************************/
	/*************************************Created By Joydip ***********************************************/
	@Test(priority=6,dataProvider ="PIO",description="toverifytheSubmitButtonActionFunctionalityisBlank")
	public void NRDA_RTI_SC_09_TC_12(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
			RTI_PIO.toverifythefunctionalityofeGovernance();
			RTI_PIO.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
			RTI_PIO.toverifytheRTIlink();
			RTI_PIO.toverifysearchapplication();
			RTI_PIO.toverifythefunctionalityofactionbutton();
			URLPageWSNRDAScript.logoutWS1();
				
		} 
	/***************************************** End *********************************************************/
	/*************************************Created By Joydip ***********************************************/
	
	@Test(priority=7,dataProvider ="PIO",description="toverifytheSubmitButtonCommentFieldIsBlank")
	public void NRDA_RTI_SC_09_TC_14(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
			RTI_PIO.toverifythefunctionalityofeGovernance();
			RTI_PIO.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
			RTI_PIO.toverifytheRTIlink();
			RTI_PIO.toverifysearchapplication();
			RTI_PIO.toverifythefunctionalityofactionbutton();
			RTI_PIO.toverifythefunctionalityofsubmitbutton();
			RTI_PIO.toVerifyErrorMessageAsCommentFieldisBlank();
			URLPageWSNRDAScript.logoutWS1();
			
		}
	/***************************************** End *********************************************************/
	/*************************************Created By Joydip ***********************************************/
	@Test(priority=8,dataProvider ="PIO",description="ToverifySubjectField")
	public void NRDA_RTI_SC_09_TC_15(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
			RTI_PIO.toverifythefunctionalityofeGovernance();
			RTI_PIO.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
			RTI_PIO.toverifytheRTIlink();
			RTI_PIO.toverifysearchapplication();
			RTI_PIO.toverifythefunctionalityofactionbutton();
			RTI_PIO.ToverifySubjectField();
			URLPageWSNRDAScript.logoutWS1();
			
		}
	/***************************************** End *********************************************************/
	/*************************************Created By Joydip ***********************************************/
	@Test(priority=9,dataProvider ="PIO",description="ToverifyfileField")
	public void NRDA_RTI_SC_09_TC_16(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
			RTI_PIO.toverifythefunctionalityofeGovernance();
			RTI_PIO.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
			RTI_PIO.toverifytheRTIlink();
			RTI_PIO.toverifysearchapplication();
			RTI_PIO.toverifythefunctionalityofactionbutton();
			RTI_PIO.ToverifyfileField();
			URLPageWSNRDAScript.logoutWS1();
		}
	/***************************************** End *********************************************************/
	/*************************************Created By Joydip ***********************************************/
	@Test(priority=10,dataProvider ="PIO",description="toverifythesearchbutton")
	public void NRDA_RTI_SC_09_TC_17(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
			RTI_PIO.toverifythefunctionalityofeGovernance();
			RTI_PIO.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
			RTI_PIO.toverifytheRTIlink();
			RTI_PIO.toverifysearchapplication();
			RTI_PIO.toverifythefunctionalityofactionbutton();
			RTI_PIO.Toverifysearchbutton();			
			URLPageWSNRDAScript.logoutWS1();
		}
	/***************************************** End *********************************************************/
	/*************************************Created By Joydip ***********************************************/
	@Test(priority=11,dataProvider ="PIO",description="Toverifycreatefilefunctionalityofsubmitbutton")
	public void NRDA_RTI_SC_09_TC_18(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
			RTI_PIO.toverifythefunctionalityofeGovernance();
			RTI_PIO.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
			RTI_PIO.toverifytheRTIlink();
			RTI_PIO.toverifysearchapplication();
			RTI_PIO.toverifythefunctionalityofactionbutton();
			RTI_PIO.Toverifysearchbutton();	
			RTI_PIO.Toverifycreatefilebutton();	
			RTI_PIO.Toverifyfunctionalityofcreatefile();
			RTI_PIO.toverifythefunctionalityofFilesubmitbutton();
			URLPageWSNRDAScript.logoutWS1();
		}
	@Test(priority=12,dataProvider ="PIO",description="Toverifyresetfilefunctionalityofclearbutton")
	public void NRDA_RTI_SC_09_TC_19(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
			RTI_PIO.toverifythefunctionalityofeGovernance();
			RTI_PIO.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
			RTI_PIO.toverifytheRTIlink();
			RTI_PIO.toverifysearchapplication();
			RTI_PIO.toverifythefunctionalityofactionbutton();
			RTI_PIO.Toverifysearchbutton();	
			RTI_PIO.Toverifycreatefilebutton();	
			RTI_PIO.Toverifyfunctionalityofcreatefile();
			RTI_PIO.toverifythefunctionalityofFileclearbutton();
			URLPageWSNRDAScript.logoutWS1();
		}
	@Test(priority=13,dataProvider ="PIO",description="Toverifycreatefilefunctionalityofsubmitbutton")
	public void NRDA_RTI_SC_09_TC_20(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
			RTI_PIO.toverifythefunctionalityofeGovernance();
			RTI_PIO.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
			RTI_PIO.toverifytheRTIlink();
			RTI_PIO.toverifysearchapplication();
			RTI_PIO.toverifythefunctionalityofactionbutton();
			RTI_PIO.toverifythefunctionalityofactiondropdown();
			RTI_PIO.Toverifysearchbutton();
			RTI_PIO.Toverifycreatefilebutton();
			RTI_PIO.Toverifyfunctionalityofcreatefile();
			RTI_PIO.toverifythefunctionalityofFilesubmitbutton();
			RTI_PIO.toverifythefunctionalityofFileselected();
			RTI_PIO.toverifythecommentbox();
			RTI_PIO.toverifytheRTIInformationtab();
			RTI_PIO.toverifythefunctionalityofsubmitbutton();
			URLPageWSNRDAScript.logoutWS1();
		}
	@Test(priority=14,dataProvider ="PIO",description="Toverifycreatefilefunctionalitysubmitbutton")
	public void NRDA_RTI_SC_09_TC_22(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
			RTI_PIO.toverifythefunctionalityofeGovernance();
			RTI_PIO.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
			RTI_PIO.toverifytheRTIlink();
			RTI_PIO.toverifysearchapplication();
			RTI_PIO.toverifythefunctionalityofactionbutton();
			RTI_PIO.toverifythefunctionalityofactiondropdown1();
			RTI_PIO.Toverifysearchbutton();	
			RTI_PIO.Toverifycreatefilebutton();	
			RTI_PIO.Toverifyfunctionalityofcreatefile();
			RTI_PIO.toverifythefunctionalityofFilesubmitbutton();
			RTI_PIO.toverifythefunctionalityofFileselected();
			RTI_PIO.toverifythecommentbox();
			RTI_PIO.toverifytheRTIInformationtab();
			RTI_PIO.toverifythefunctionalityofsubmitbutton();
			URLPageWSNRDAScript.logoutWS1();
		}
	@Test(priority=15,dataProvider ="PIO",description="Toverifycreatefilefunctionalityofclosebutton")
	public void NRDA_RTI_SC_09_TC_23(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
			RTI_PIO.toverifythefunctionalityofeGovernance();
			RTI_PIO.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
			RTI_PIO.toverifytheRTIlink();
			RTI_PIO.toverifysearchapplication();
			RTI_PIO.toverifythefunctionalityofactionbutton();
			RTI_PIO.toverifythefunctionalityofclosebutton();
			URLPageWSNRDAScript.logoutWS1();
		}
	
}
