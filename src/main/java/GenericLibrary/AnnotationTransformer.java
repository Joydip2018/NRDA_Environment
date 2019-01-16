package GenericLibrary;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

/*****************************************************************/
/*
* This bellow class helps send the retry method to the listener.
* @author Joydip.Bhattacharjee
*/
/*****************************************************************/
public class AnnotationTransformer implements IAnnotationTransformer
{
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) 
	{
		annotation.setRetryAnalyzer(Retry.class);
	}
}