package utilities;


import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    public static ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();

    public void onTestStart(ITestResult result) {
        String testCaseName = result.getTestName();
        System.out.println("Running Test Case" + testCaseName + " ");
    }

    public void onTestSuccess(ITestResult result) {
        String testCaseName = result.getTestName();
        System.out.println("Test Case" + testCaseName + " was successful.");
    }

    public void onTestFailure(ITestResult result) {
        String testCaseName = result.getTestName();
        System.out.println("Test Case" + testCaseName + " failed");
    }

    public void onTestSkipped(ITestResult result) {
        String testCaseName = result.getTestName();
        System.out.println("Test Case" + testCaseName + " was skipped");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    public void onTestFailedWithTimeout(ITestResult result) {

    }

    public void onStart(ITestContext context) {
System.out.println("*********** Initiating Test ***********");
    }

    public void onFinish(ITestContext context) {
        System.out.println("*********** Test Complete ***********");
    }


}
