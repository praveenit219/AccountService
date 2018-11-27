package com.pheonix.accounts.pojo;

public class BankAccounts extends Account {

	
	private String bankingMode;
	private String linkedTo;
	
	
	
	public String getBankingMode() {
		return bankingMode;
	}
	public void setBankingMode(String bankingMode) {
		this.bankingMode = bankingMode;
	}
	public String getLinkedTo() {
		return linkedTo;
	}
	public void setLinkedTo(String linkedTo) {
		this.linkedTo = linkedTo;
	}
}
