package com.generic.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener{
	@Override
    public void onTestFailure(ITestResult result) {
       System.out.println("TestListener: " + result.getName() + " Test method failed\n");
    }
}
