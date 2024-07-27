package org.openqa.selenium;

public interface HasVirtualAuthenticator {
	
	void addVirtualAuthenticator( VirtualAuthenticatorOptions option);
	void removeVirtualAuthenticator(VirtualAuthenticator authenticator);

}
