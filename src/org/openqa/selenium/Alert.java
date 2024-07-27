package org.openqa.selenium;

public interface Alert {
	
	void dismiss();

	void accept();

	String getText();

	void sendKeys(String keysToSend);

}
