/**
 * 
 */
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
 * @date: 02-11-2017
 */
@Listeners(GenericLibrary.ListenerDriver.class)
public class NRDA_RTILoginAsmanager_Release extends URLPageWSNRDAScript
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
	 public void NRDA_RTI_SC_17_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
			{
				WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
				login_as_PIO.loginAsPIO(username, password);
				URLPageWSNRDAScript.logoutWS1();
			}
	/***************************************** End *********************************************************/
	/*************************************Created By Joydip ************************************************/
	@Test(priority=2,dataProvider ="PIO",description="verifytheDashBoardOfRTI_PIO")
	public void NRDA_RTI_SC_17_TC_05(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
			{
				WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
				login_as_PIO.loginAsPIO(username, password);
				
				ToverifyRTILoginASPIO RTI_PIO=PageFactory.initElements(driver, ToverifyRTILoginASPIO.class);
				RTI_PIO.toverifythefunctionalityofeGovernance();
				RTI_PIO.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
				RTI_PIO.toverifytheRTIlink();
				RTI_PIO.toverifysearchapplication();
				RTI_PIO.toverifythefunctionalityofactionbutton();
				RTI_PIO.toverifythefunctionalityofactiondropdown2();
				RTI_PIO.toverifythefunctionalityofsubmitbutton();
				//RTI_PIO.toverifythefunctionalityofsubmitbutton1();
				//URLPageWSNRDAScript.logoutWS1();
			}
	/***************************************** End *********************************************************/
	
}
