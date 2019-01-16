package NRDA_Estate_Project;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToverifyFunctionalityof_LOA_LoginAs_SectionEngineer extends CommonLibrary
{

Logger log=Logger.getLogger("devpinoyLogger");
ExcelDataDriver excel=new ExcelDataDriver();


@FindBy(xpath="//div[@class='col-md-9']/table/tbody/tr/td/div/div/div/div/div[1]/div")
private List <WebElement> HeadingsInApplications;


public void toverifythedashboardoftheApplication() throws InterruptedException
{
	waitForSomeTime();
	for(WebElement menulist:HeadingsInApplications)
	{
		HighlightOnElement(menulist);
		Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
		if(menulist.isDisplayed())
		{
			String Menu=menulist.getText();
			System.out.println(" Menu list in Dash Board are:"+Menu );
		}

	}

 }	

	@FindBy(xpath="//a[contains(.,'eGovernance')]")
	private WebElement eGovernanceLink;

	@FindBy(xpath="//a[contains(.,'eGovernance/ ई-गवर्नेंस')]/../following-sibling::div/ul/li")
	private List <WebElement> HeadingsInEgovernance;
	
	
	public void toverifytheApplicationsinEgovernance() throws InterruptedException
	{
		HighlightOnElement(eGovernanceLink);
		eGovernanceLink.click();
		waitForSomeTime();
		for(WebElement menulist:HeadingsInEgovernance)
		{
			HighlightOnElement(menulist);
			Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
			if(menulist.isDisplayed())
			{
				String Menu=menulist.getText();
				System.out.println(" Menu list in Egovernance Applications are:"+Menu );
			}

		}

	 }	

	@FindBy(xpath="//span[contains(.,'Generate NoA/LoA')]")
	private WebElement GenerateLOA_Link;
	
	@FindBy(xpath=".//*[@id='inboxForm:datatb']/div[1]/table/tbody/tr")
	private WebElement ApplicationList;
	
	

}
