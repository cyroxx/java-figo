//
// Copyright (c) 2013 figo GmbH
// 
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
// 
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
// 
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
//

package me.figo.models;

import java.util.List;

/***
 * Object representing one bank account of the user, independent of the exact account type
 * 
 * @author Stefan Richter <stefan.richter@figo.me>
 *
 */
public class Account {
  
	/***
	 * Internal figo Connect account ID
	 */
    private String account_id;
    
    /***
     * Internal figo Connect bank ID
     */
    private String bank_id;
    
    /***
     * Account name
     */
    private String name;
    
    /***
     * Account owner
     */
    private String owner;
    
    /***
     * This flag indicates whether the account will be automatically synchronized
     */
    private boolean auto_sync;
    
    /***
     * Account number
     */
    private String account_number;
    
    /***
     * Bank code
     */
    private String bank_code;
    
    /***
     * Bank name
     */
    private String bank_name;
    
    /***
     * Three-character currency code
     */
    private String currency;
    
    /***
     * IBAN
     */
    private String iban;
    
    /***
     * BIC
     */
    private String bic;
    
    /***
     * Account type: Giro account, Savings account, Credit card, Loan account, PayPal or Unknown
     */
    private String type;
    
    /***
     * Account icon URL
     */
    private String icon;
	
    public Account() {}

	/**
	 * Internal figo Connect account ID
	 */
	public String getAccountId() {
		return account_id;
	}

	/***
	 * Internal figo Connect bank ID
	 */
	public String getBankId() {
		return bank_id;
	}
	
	/***
	 * Account name
	 */
	public String getName() {
		return name;
	}
	
	/***
	 * Account owner
	 */
	public String getOwner() {
		return owner;
	}
	
	/***
	 * This flag indicates whether the account will be automatically synchronized
	 */
	public boolean isAutoSync() {
		return auto_sync;
	}
	
	/***
	 * Account number
	 */
	public String getAccountNumber() {
		return account_number;
	}
	
	/***
	 * Bank code
	 */
	public String getBankCode() {
		return bank_code;
	}
	
	/***
	 * Bank name
	 */
	public String getBankName() {
		return bank_name;
	}
	
	/***
	 * Three-character currency code
	 */
	public String getCurrency() {
		return currency;
	}
	
	/***
	 * IBAN
	 */
	public String getIBAN() {
		return iban;
	}
	
	/***
	 * BIC
	 */
	public String getBIC() {
		return bic;
	}
	
	/***
	 * Account type: Giro account, Savings account, Credit card, Loan account, PayPal or Unknown
	 */
	public String getType() {
		return type;
	}
	
	/***
	 * Account icon URL
	 */
	public String getIconUrl() {
		return icon;
	}
	
    /***
     * Helper type to match actual response from figo API
     */
    public class AccountsResponse {
    	/***
    	 * List of accounts asked for
    	 */
    	private List<Account> accounts;
    	
    	public AccountsResponse() {}

    	/***
    	 * List of accounts asked for
    	 */
    	public List<Account> getAccounts() {
    		return accounts;
    	}
    }
}
