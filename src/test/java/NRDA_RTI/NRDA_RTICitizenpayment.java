
package NRDA_RTI;

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
import NRDA_Estate_Project.ToVerifyPaymentDetailsofNewConnection;
import NRDA_WaterAndSewerage_Disconnection.ToverifyDisConnectionAsWaterandSewerage;
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;


/**
 * @author Sarvesh.Nellore
 * @Date: 16-10-2017
 * @Purpose Warer And Sewerage RTI Login As  Citizen WithoutBPL
 */
@Listeners(GenericLibrary.ListenerDriver.class)
public class NRDA_RTICitizenpayment extends URLPageWSNRDAScript
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
		@DataProvider(name="citizen")
		public String[][] getExcelData() throws InvalidFormatException, IOException
		{
			return exceldata.getCellData(filepath,"Citizen Credentials");
		}

		/*******************************Created By Joydip on 1/11/2018*************************************/
		@Test(description="VerifytheLoginAsCitizen_SC_01_TC_01",priority=1,dataProvider ="citizen")
		public void NRDA_RTI_SC_14_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			URLPageWSNRDAScript.logoutWS1();
		}
		/************************************* End *********************************************************/		
		/********************************Created By Joydip on 1/11/2018*************************************/
		@Test(description="verifythefunctionalityofpendingPayments",priority=2,dataProvider ="citizen")
		public void NRDA_RTI_SC_14_TC_02(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.toverifythePendingPaymentFunctionalityAsCitizen_RTI_SC_08_TC_02();
			URLPageWSNRDAScript.logoutWS1();	
		}
		/**************************************** End ******************************************************/		
		/************************************Created By Joydip**********************************************/
		@Test(description="verifythefunctionalityofdemandnote",priority=3,dataProvider ="citizen")
		public void NRDA_RTI_SC_14_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.toverifythePendingPaymentFunctionalityAsCitizen_RTI_SC_08_TC_02();
			RTI.toverifythenextbtn();
			RTI.toverifythedemandnote();
			URLPageWSNRDAScript.logoutWS1();
		}
		/************************************* End *********************************************************/		
		/**********************************Created By Joydip************************************************/
		@Test(description="verifythefunctionalityofFirstAppeal",priority=4,dataProvider ="citizen")
		public void NRDA_RTI_SC_14_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.toverifythePendingPaymentFunctionalityAsCitizen_RTI_SC_08_TC_02();
			RTI.toverifythenextbtn();
			RTI.toverifythefirstapproval();
			URLPageWSNRDAScript.logoutWS1();
		}
		@Test(description="verifythefunctionalityofPayments",priority=5,dataProvider ="citizen")
		public void NRDA_RTI_SC_14_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
			RTI.toverifythePendingPaymentFunctionalityAsCitizen_RTI_SC_08_TC_02();
			RTI.toverifythenextbtn();
			RTI.toverifythePay();
			
			ToVerifyPaymentDetailsofNewConnection payment=PageFactory.initElements(driver, ToVerifyPaymentDetailsofNewConnection.class);
			payment.selectPaymentGateway();
			payment.selectPaymentMode();
			payment.entervaliddetailsoncreditcard();
			payment.clickOnPayNow();
			URLPageWSNRDAScript.logoutWS1();
		}
		/************************************* End *********************************************************/		
		
	}
