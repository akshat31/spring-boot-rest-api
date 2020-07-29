package com.springrest.springrest.entities;

public class Test {
	
	private long testId;
	private String testName;
	public Test(long testId, String testName) {
		super();
		this.testId = testId;
		this.testName = testName;
	}
	public long getTestId() {
		return testId;
	}
	public void setTestId(long testId) {
		this.testId = testId;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	@Override
	public String toString() {
		return "Test [testId=" + testId + ", testName=" + testName + ", getTestId()=" + getTestId() + ", getTestName()="
				+ getTestName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
}
