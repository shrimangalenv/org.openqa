package org.openqa.selenium;

import java.util.List;

public interface SearchContext {
	
	WebElement FindElement(By by);
	List<WebElement> FindElements(By by);

}
