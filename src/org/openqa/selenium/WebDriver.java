package org.openqa.selenium;

import java.net.URL;
import java.util.Set;

public interface WebDriver extends SearchContext {
	
	void get(String url);
	String getURL();
	String getTitle();
	String getPageSource();
	String GetWindowHandle();
	Set<String> GetWindowHandles();
	void close();
	void quite();
	Options manage();
	TargetLocator switchTo();
	Navigations naviagate();
	
	public interface Timeouts{
		WebDriver.Timeouts implicitelyWait();
		
	}
	
	public interface Window{
		void maximize();
		void minimize();
		void fullScreen();
		
		
	}
	
	public interface  Options{
		WebDriver.Timeouts timeouts();
		WebDriver.Window window();
		void delete();
		
	}
	
	public interface TargetLocator{
		WebDriver frame(int index);
		WebDriver frame(String nameOrId);
		WebDriver frame(WebElement frameElement);
		WebDriver parentFrame();
		WebDriver window(String handle);
		Alert alert();
		
	}
	
	public interface Navigations{
		void back();
		void forword();
		void to(String url);
		void to(URL url);

		}

}
