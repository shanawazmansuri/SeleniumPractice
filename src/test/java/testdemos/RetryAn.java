package testdemos;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAn implements IRetryAnalyzer {

	int count = 0;
	int retryCount = 1;

	public boolean retry(ITestResult result) {
		while (count < retryCount) {
			count++;
			return true;
		}
		return false;
	}

}
