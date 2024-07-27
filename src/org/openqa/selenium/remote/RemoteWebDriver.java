package org.openqa.selenium.remote;

import java.net.URL;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.HasVirtualAuthenticator;
import org.openqa.selenium.Interactive;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Printspage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.VirtualAuthenticator;
import org.openqa.selenium.VirtualAuthenticatorOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RemoteWebDriver implements 
WebDriver,
HasCapabilities,
JavascriptExecutor,
HasVirtualAuthenticator,
SearchContext,TakesScreenshot,
Printspage,Interactive {

	@Override
	public WebElement FindElement(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WebElement> FindElements(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void get(String url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getURL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String getPageSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String GetWindowHandle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> GetWindowHandles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quite() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Options manage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Navigations naviagate() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public class RemoteTargetLocator implements TargetLocator{

		@Override
		public WebDriver frame(int index) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public WebDriver frame(String nameOrId) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public WebDriver frame(WebElement frameElement) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public WebDriver parentFrame() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public WebDriver window(String handle) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Alert alert() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	public class RemoteNavigations implements Navigations{

		@Override
		public void back() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void forword() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void to(String url) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void to(URL url) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public class RemoteWebDriverOptions implements Options{

		@Override
		public Timeouts timeouts() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Window window() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void delete() {
			// TODO Auto-generated method stub
			
		}
		
		public class RemoteWindow implements Window{

			@Override
			public void maximize() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void minimize() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void fullScreen() {
				// TODO Auto-generated method stub
				
			}
			
		}
		
		public class RemoteTimeouts implements Timeouts{

			@Override
			public Timeouts implicitelyWait() {
				// TODO Auto-generated method stub
				return null;
			}
			
		}
		
		
	}

	@Override
	public void addVirtualAuthenticator(VirtualAuthenticatorOptions option) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeVirtualAuthenticator(VirtualAuthenticator authenticator) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
