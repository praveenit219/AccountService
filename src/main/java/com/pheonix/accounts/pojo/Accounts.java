package com.pheonix.accounts.pojo;

import java.util.List;

public class Accounts {

	private List<InsuranceAccounts> insuranceAccounts;
	private List<BankAccounts> bankAccounts;
	private List<CardAccounts> cardAccounts;
	private List<CardThirdPartyAccounts> cardThirdPartyAccounts;
	
	public List<InsuranceAccounts> getInsuranceAccounts() {
		return insuranceAccounts;
	}
	public void setInsuranceAccounts(List<InsuranceAccounts> insuranceAccounts) {
		this.insuranceAccounts = insuranceAccounts;
	}
	public List<BankAccounts> getBankAccounts() {
		return bankAccounts;
	}
	public void setBankAccounts(List<BankAccounts> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}
	public List<CardAccounts> getCardAccounts() {
		return cardAccounts;
	}
	public void setCardAccounts(List<CardAccounts> cardAccounts) {
		this.cardAccounts = cardAccounts;
	}
	public List<CardThirdPartyAccounts> getCardThirdPartyAccounts() {
		return cardThirdPartyAccounts;
	}
	public void setCardThirdPartyAccounts(List<CardThirdPartyAccounts> cardThirdPartyAccounts) {
		this.cardThirdPartyAccounts = cardThirdPartyAccounts;
	}
	
	@Override
	public String toString() {
		return "Accounts [insuranceAccounts=" + insuranceAccounts + ", bankAccounts=" + bankAccounts + ", cardAccounts="
				+ cardAccounts + ", cardThirdPartyAccounts=" + cardThirdPartyAccounts + "]";
	}
	
	
	
	
}
