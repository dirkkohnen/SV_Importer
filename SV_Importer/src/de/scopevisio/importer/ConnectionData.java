/*
 * (c) 2018 Scopevisio AG
 */

package de.scopevisio.importer;

/**
 * Connection data encapsultes all parameters
 * needed to connect to scopevisio
 */
public class ConnectionData {
	private final String customer;
	private final String organisation;
	private final String username;
	private final String password;
	
	public ConnectionData(String customer, String organisation, String username, String password) {
		this.customer = customer;
		this.organisation = organisation;
		this.username = username;
		this.password = password;
	}

	public String getCustomer() {
		return customer;
	}

	public String getOrganisation() {
		return organisation;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
}


