/**
 * 
 */
package NRDA_RTI;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sun.media.sound.InvalidFormatException;

import GenericLibrary.ExcelDataDriver;
import LoginLogoutWSNRDAScript.URLPageWSNRDAScript;
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;

/**
 * @author Sarvesh.Nellore
 * @Date: 02-11-2017
 * @Purpose: 
 */
@Listeners(GenericLibrary.ListenerDriver.class)
public class NRDA_RTILoginEEVerified extends URLPageWSNRDAScript
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
	@DataProvider(name="HEAD")
	public String[][] getExcelData() throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException
	{
		return exceldata.getCellData(filepath,"EE credentials");
	}
	
		/*************************************Created By Joydip ***********************************************/    
		@Test(priority=1,dataProvider ="HEAD",description="verifyLoginAsHead_SC_13_TC_01")
		public void NRDA_RTI_SC_13_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
			{
	    	WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsEE(username, password);
			URLPageWSNRDAScript.logoutWS1();
			}
	    
	    /***************************************** End *********************************************************/
		/*************************************Created By Joydip ***********************************************/
		@Test(priority=2,dataProvider ="HEAD",description="toverifytheapplicationnumber")
		public void NRDA_RTI_SC_13_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
			{
				WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
				login_as_PIO.loginAsEE(username, password);
				
				ToverifyRTILoginAsEEverified Head_Login=PageFactory.initElements(driver, ToverifyRTILoginAsEEverified.class);
				Head_Login.toverifythefunctionalityofeGovernance();
				Head_Login.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
				Head_Login.toverifytheRTIlink();
				Head_Login.toverifysearchapplication();
				Head_Login.toverifythefunctionalityofactionbutton();	
				Head_Login.toverifytheapplicationno();	
				URLPageWSNRDAScript.logoutWS1();
			}
		/***************************************** End *********************************************************/
		/*************************************Created By Joydip ************************************************/
		@Test(priority=3,dataProvider ="HEAD",description="verifythesendbackfuctionality")
		public void NRDA_RTI_SC_13_TC_04(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
				{
					WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
					login_as_PIO.loginAsEE(username, password);
					
					ToverifyRTILoginAsEEverified Head_Login=PageFactory.initElements(driver, ToverifyRTILoginAsEEverified.class);
					Head_Login.toverifythefunctionalityofeGovernance();
					Head_Login.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
					Head_Login.toverifytheRTIlink();
					Head_Login.toverifysearchapplication();
					Head_Login.toverifythefunctionalityofactionbutton();
					Head_Login.toverifythefunctionalityofactiondropdown();
					Head_Login.toverifytheRTIInformationtab1();	
					URLPageWSNRDAScript.logoutWS1();
				}
		/***************************************** End *********************************************************/
		/*************************************Created By Joydip ***********************************************/
		@Test(priority=4,dataProvider ="HEAD",description="verifyRTIApplicationReceivedFromEmployee_SC_13_TC_02")
		public void NRDA_RTI_SC_13_TC_05(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
				{
					WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
					login_as_PIO.loginAsEE(username, password);
					
					ToverifyRTILoginAsEEverified Head_Login=PageFactory.initElements(driver, ToverifyRTILoginAsEEverified.class);
					Head_Login.toverifythefunctionalityofeGovernance();
					Head_Login.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
					Head_Login.toverifytheRTIlink();
					Head_Login.toverifysearchapplication();
					Head_Login.toverifythefunctionalityofactionbutton();
					Head_Login.toverifythefunctionalityofactiondropdown();
					Head_Login.toverifythecommentbox();
					Head_Login.toverifythefunctionalityofsubmitbutton();									
				}	
		/***************************************** End *********************************************************/
	}
