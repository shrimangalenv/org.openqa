package org.openqa.selenium;

public interface WebElement extends SearchContext,TakesScreenshot{
	void click();
	void submit();
	void sendKeys(CharSequence  keyToSend);
	void clear();
	boolean isSelected();
	boolean isEnabled();
	boolean isDisplayed();
	String getText();
	String getTagName();
	
	

}
