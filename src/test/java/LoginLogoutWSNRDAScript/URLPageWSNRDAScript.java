package LoginLogoutWSNRDAScript;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import GenericLibrary.BrowserDriver;
import GenericLibrary.ConstantI;


public class URLPageWSNRDAScript extends BrowserDriver
{

	Logger log=Logger.getLogger("devpinoyLogger");
	static String DownloadPDF="C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\DownloadFile\\PLUMBER_REGISTRATION.pdf";
	
	/*****************************************************************************************************************/
	/**
	 *  BeforeMethod annotation is used to open Url of application 
	 * 	@author deepak.saini
	 * @throws InterruptedException 
	 *  @since 2017-08-03 
	 */
	/****************************************************************************************************************/
	@BeforeMethod
	public void openBrowser()
	{	
		BrowserDriver.getBrowser(ConstantI.browser).navigate().to(ConstantI.url);
	}

	public static void logoutWS1() throws InterruptedException
	{
		//try
		//{
		
		/*WebElement web1=driver.findElement(By.xpath("//a[@class='dropdown-toggle' or @role='button']/span"));
		Actions action = new Actions(driver);
		WebDriverWait wait1 = new WebDriverWait(driver,10000);
		wait1.until(ExpectedConditions.visibilityOf(web1));
		HighlightOnElement(web1);
		wait1.until(ExpectedConditions.elementToBeClickable(web1));
		action.moveToElement(web1).build().perform();
		//waitForDomElement();
		Thread.sleep(2000);
		WebElement logout=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		wait1.until(ExpectedConditions.visibilityOf(logout));
		HighlightOnElement(logout);
		wait1.until(ExpectedConditions.elementToBeClickable(logout));
		logout.click();*/
		
		/*driver.close();
		}
		finally
		{
			driver.close();
		}
		driver.close();*/
	}
	@AfterMethod 
	public void Closebrowser() throws InterruptedException
	{
		
			driver.close();

	}

}
