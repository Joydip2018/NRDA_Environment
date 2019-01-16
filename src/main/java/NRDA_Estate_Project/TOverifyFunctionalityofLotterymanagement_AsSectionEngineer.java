package NRDA_Estate_Project;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class TOverifyFunctionalityofLotterymanagement_AsSectionEngineer extends CommonLibrary {
	
	Logger log=Logger.getLogger("devpinoyLogger");
	ExcelDataDriver excel=new ExcelDataDriver();
	
	WebDriverWait wait;
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "All Fields NAME"
	 * @author birbal tahim
	 * @Date: 6-08-2018
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="//a[text()='eGovernance']")
    private WebElement eGovernanceLink;

    @FindBy(xpath="//span[contains(.,'Application Form')]")
    private WebElement ApplicationForm_Link;


    @FindBy(xpath="//div[@class='ui-accordion ui-widget ui-helper-reset ui-hidden-container Accordian-Header-Black']/h3/a")
    private List <WebElement> MenuLists;
    
    
    public void toverifyApplicationFormLink() throws InterruptedException
    {
   	 HighlightOnElement(eGovernanceLink);
   	 Assert.assertTrue(eGovernanceLink.isDisplayed(),"Test case failed");
   	 eGovernanceLink.click();
   	 Reporter.log("To Click on eGovernanceLink is Successfully",true);
   	 waitForSomeTime();
	
   	 HighlightOnElement(ApplicationForm_Link);
   	 Assert.assertTrue(ApplicationForm_Link.isDisplayed(),"Test case fail");
   	 ApplicationForm_Link.click();
   	 Reporter.log("To Click on ApplicationForm_Link is Successfully",true);
   	 waitForSomeTime();
			
   	 waitForSomeTime();
   	 for(WebElement menulist:MenuLists)
   	 {
   		 HighlightOnElement(menulist);
   		 Assert.assertTrue(menulist.isDisplayed(),"Test case pass");
   		 if(menulist.isDisplayed())
   		 {
   			 String Menu=menulist.getText();
   			Reporter.log(" Menu list in Dash Board are:"+Menu );
   		 }

   	 }
	
    }
    
    @FindBy(xpath="//div[@class='ui-accordion ui-widget ui-helper-reset ui-hidden-container Accordian-Header-Black']/h3[4]")
    private WebElement EstateSectionLink;
   
    
    @FindBy(xpath="//a[contains(.,'Estate Section')]/../following-sibling::div[1]/table/tbody/tr/td[1]/span")
	private List<WebElement> SubMenuLists;
    
	public void toverifyEstate_Project_SectionLink() throws InterruptedException
	{
		HighlightOnElement(EstateSectionLink);
		Assert.assertTrue(EstateSectionLink.isDisplayed(),"Test case Fail");
		EstateSectionLink.click();
		Reporter.log("To Click on EstateSectionLabel is Successfully",true);
		waitForSomeTime();
				
		waitForSomeTime();
		for(WebElement menulist:SubMenuLists)
		{
			HighlightOnElement(menulist);
			Assert.assertTrue(menulist.isDisplayed(),"Test case failed");
			if(menulist.isDisplayed())
			{
				String Menu=menulist.getText();
				Reporter.log(" SubMenu list in EstateSectionLink are:"+Menu );
			}
		}
		
		
	}
	@FindBy(xpath="//a[contains(.,'Estate Section')]/../following-sibling::div[1]/table/tbody/tr/td[2]/span/a/img")
	private WebElement LotteryManagementLink;
	
	public void toVerifyLotteryManagementLink(){
		HighlightOnElement(LotteryManagementLink);
		Assert.assertTrue(LotteryManagementLink.isDisplayed(),"Test case Failed");
		LotteryManagementLink.click();
		}
	
	@FindBy(xpath="//input[@title='Draw Date']")
	private WebElement DrawDateTextBox;
	
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	private WebElement DrawDateMonth;
	
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	private WebElement DrawDateYear;
	
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']/tbody/tr/td/a")
	private List<WebElement> DrawDatePick;
	
	public void toVerifyDrawDateTextBox() throws InterruptedException{
		
		 String date1="3/Dec/2019";
	   String dateArr[]=date1.split("/");
		 String day=dateArr[0];
		 String month=dateArr[1];
		 String year=dateArr[2];
		boolean  flag=false;
		waitForSomeTime();
		HighlightOnElement(DrawDateTextBox);
		
	   	 Assert.assertTrue(DrawDateTextBox.isEnabled(),"Test case failed");
	   	Reporter.log("To Click on DrawDateTextBox is Successfully",true);

		DrawDateTextBox.click();
		
		DrawDateMonth.click();
		waitForSomeTime();
		
		
		SelectVisibleText(DrawDateMonth,month);
		DrawDateYear.click();
		
		SelectVisibleText(DrawDateYear,year);
		
		 for(int i=0;i<DrawDatePick.size();i++){
	    	  
	    	 WebElement SingleDates=DrawDatePick.get(i);
	    	 
	    	String datetoSlect=SingleDates.getAttribute("innerHTML");
	    	System.out.println(datetoSlect);
	    	System.out.println(day);
	    	if(day.contains(datetoSlect)){
	    		SingleDates.click();
	    	}
	    	else{
	    		Reporter.log("Invalid Day value");
	    	}
		
        
		 }
		
			}
	
	
	 @FindBy(xpath="//input[@class='ui-inputfield pe-timepicker-input ui-state-default ui-corner-all hasTimepicker']")
		private WebElement DrawTime;
	 
	 @FindBy(xpath="//td[@class='ui-timepicker-hour-cell']/a")
	 private List <WebElement> DrawTimeHours;
	 
	 @FindBy(xpath="//td[@class='ui-timepicker-minute-cell']/a")
	 private List<WebElement> DrawTimeminutes;
	 
	 public void toVerifyDrawTime(){
		 String St="10-03";
		 
		 String[] Time=St.split("-");
		 String hours=Time[0];
		 String minutes=Time[1];
		 HighlightOnElement(DrawTime);
		 DrawTime.click();
		 
		 for(int i=0;i<DrawTimeHours.size();i++){
	    	  
	    	 WebElement SingleHours=DrawTimeHours.get(i);
	    	 
	    	String HourstoSlect=SingleHours.getAttribute("innerHTML");
	    	System.out.println(HourstoSlect);
	    	System.out.println(hours);
	    	if(hours.contains(HourstoSlect)){
	    		SingleHours.click();
	    	}
	    	else{
	    		Reporter.log("Invalid hours value");
	    	}
	 }
		 
		 for(int i=0;i<DrawTimeminutes.size();i++){
	    	  
	    	 WebElement SingleMinutes=DrawTimeminutes.get(i);
	    	 
	    	String MinutestoSlect=SingleMinutes.getAttribute("innerHTML");
	    	System.out.println(MinutestoSlect);
	    	System.out.println(minutes);
	    	if(minutes.contains(MinutestoSlect)){
	    		SingleMinutes.click();
	    	}
	    	else{
	    		Reporter.log("Invalid Minutes value");
	    	}
	 }
	 
	 }
	 
	 @FindBy(xpath="//label[text()='Attendence']/following-sibling::input")
	 private WebElement Percentage;
	 
	 public void toVerifyPercentageTextbox() throws InterruptedException{
		 HighlightOnElement(Percentage);
		 Percentage.click();
		 Percentage.sendKeys("70");
		 }
	 @FindBy(xpath="//label[text()='Audience']/following-sibling::table/tbody/tr/td[1]/div/div[2]")
	 private WebElement YesAudienceButton;
	 @FindBy(xpath="//label[text()='Audience']/following-sibling::table/tbody/tr/td[3]/div/div[2]")
	 private WebElement NoAudienceButton;
	 
	 @FindBy(xpath="//span/label[contains(text(),'Allottee')]/following-sibling::table/tbody/tr/td[1]/div")
	 private WebElement YesAllotteeButton;
	 
	 @FindBy(xpath="//span/label[contains(text(),'Allottee')]/following-sibling::table/tbody/tr/td[3]/div")
	 private WebElement NoAllotteeButton;
	 
	 @FindBy(xpath="//label[contains(text(),'Select')]")
	 private WebElement ProjectTypeDropdown;
	 
	@FindBy(xpath="//div[@class='ui-selectcheckboxmenu-items-wrapper']/ul/li/div")
	private List<WebElement> ProTypeDropdownList;
	
	@FindBy(xpath="//span[contains(text(),'Add')]")
	private WebElement AddButton;
	
	@FindBy(xpath="//div[@id='inboxForm:memdataTableId']/div/button/span[contains(text(),'ui-button')]")
	private WebElement AddInternalMembers;
	
    @FindBy(xpath="(//button[@type='submit' and @title='Add Row'])[2]")
	private WebElement AddExternalMembers;
    
    @FindBy(xpath="//label[contains(text(),'--Select--')]")
	private WebElement SelectActionDropdown;
    
    public void toverifySEFormSubmit() throws InterruptedException{
    	YesAudienceButton.click();
    	waitForSomeTime();
        YesAllotteeButton.click();
    	waitForSomeTime();
    	waitForSomeTime();
    	
    	String st=YesAudienceButton.getAttribute("checked");
    	Reporter.log(st);
    	
    	
    	
    }

}

	
	
	
	
	
	

