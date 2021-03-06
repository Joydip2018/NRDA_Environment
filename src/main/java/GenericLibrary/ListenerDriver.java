package GenericLibrary;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.ITestAnnotation;

/**
 * @author deepak.saini
 *
 */
public class ListenerDriver extends BrowserDriver implements ITestListener, IRetryAnalyzer, IAnnotationTransformer {
	static String failureTestCase_ScreenShotLocation = ".\\NRDA_PROJECT\\Failure_Screenshot\\";
	static String successTestCase_ScreenShotLocation = ".\\NRDA_PROJECT\\Success_ScreenShot\\";
	public int scc = 0;
	private int retryCnt = 0;
	private int maxRetryCnt = 1; /*
									 * maxRetryCnt (Maximiun Retry Count) as per
									 * your requirement. Here I took 1, If any
									 * failed testcases then it runs two times
									 */

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	/*************************************************************************************************************/
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.testng.ITestListener#onTestFailure(org.testng.ITestResult)
	 * onTestFailure() is used to take the ScreenShot and store in the Specified
	 * path folder' EventFiringWebDriver listenser is a webdriver class which is
	 * used to help to take ScreenShot by using non-static method
	 * getScreenshotAs() pass the Output File Type as a argument. FileUtils is a
	 * apache class having Static copyFile() used to store the screenshot from
	 * source to destination.
	 * 
	 * @author deepak.saini
	 * 
	 * @since 2017-06-16
	 */
	/****************************************************************************************************************/
	@Override
	public void onTestFailure(ITestResult result) {
		EventFiringWebDriver fdriver = new EventFiringWebDriver(driver);
		File sourcefile = fdriver.getScreenshotAs(OutputType.FILE);
		File destinatiofile = new File(
				failureTestCase_ScreenShotLocation + result.getName() + getDateTimeStamp() + scc + ".png");
		try {
			FileUtils.copyFile(sourcefile, destinatiofile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String filePath = destinatiofile.toString();
		String path = "<img src=\"file://" + filePath + "\" alt=\"\"/>";
		Reporter.log(path, true);
	}

	/********************************************************************************************************************/
	/**
	 * getDateTimeStamp() is used for display the month,date and time stamp
	 * along with failed testcases.
	 * 
	 * @return
	 * @author deepak.saini
	 * @since 2017-06-16
	 */
	/********************************************************************************************************************/
	public static String getDateTimeStamp() {
		// creates a date time stamp that is Windows OS filename compatible
		return new SimpleDateFormat(" MMM dd   HH.mm.ss").format(Calendar.getInstance().getTime());
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		EventFiringWebDriver fdriver = new EventFiringWebDriver(driver);
		File sourcefile = fdriver.getScreenshotAs(OutputType.FILE);
		File destinatiofile = new File(
				successTestCase_ScreenShotLocation + result.getName() + getDateTimeStamp() + ".png");
		try {
			FileUtils.copyFile(sourcefile, destinatiofile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String filePath = destinatiofile.toString();
		String path = "<img src=\"file://" + filePath + "\" alt=\"\"/>";
		Reporter.log(path, true);

	}

	@Override
	public boolean retry(ITestResult result) {
		if (retryCnt < maxRetryCnt) {
			System.out.println("Retrying " + result.getName() + " again and the count is " + (retryCnt + 1));
			retryCnt++;
			return true;
		}
		return false;
	}

	@Override
	public void transform(ITestAnnotation testannotation, Class testClass, Constructor testConstructor,
			Method testMethod) {
		IRetryAnalyzer retry = testannotation.getRetryAnalyzer();

		if (retry == null) {
			testannotation.setRetryAnalyzer(ListenerDriver.class);
		}

	}

}
