package com.TestNG.Day20_Feb_21_A_RunningMultipleSuites_Sanity;



import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class E_MyRetry implements IRetryAnalyzer {

  private int retryCount = 0;
  private static final int maxRetryCount = 3;

  @Override
  public boolean retry(ITestResult result) {
    if (retryCount < maxRetryCount) {
      retryCount++;
      return true;
    }
    return false;
  }
}

