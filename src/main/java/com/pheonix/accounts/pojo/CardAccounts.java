package com.pheonix.accounts.pojo;

public class CardAccounts extends Account {
	
	
	private String cardMode;
	private String cardStatus;
	private String overSeasCardActivation;
	private boolean overSeasCardUsageAllowed;
	private String linkedTo;
	
	public String getCardMode() {
		return cardMode;
	}
	public void setCardMode(String cardMode) {
		this.cardMode = cardMode;
	}
	public String getCardStatus() {
		return cardStatus;
	}
	public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
	}
	public String getOverSeasCardActivation() {
		return overSeasCardActivation;
	}
	public void setOverSeasCardActivation(String overSeasCardActivation) {
		this.overSeasCardActivation = overSeasCardActivation;
	}
	public boolean isOverSeasCardUsageAllowed() {
		return overSeasCardUsageAllowed;
	}
	public void setOverSeasCardUsageAllowed(boolean overSeasCardUsageAllowed) {
		this.overSeasCardUsageAllowed = overSeasCardUsageAllowed;
	}
	public String getLinkedTo() {
		return linkedTo;
	}
	public void setLinkedTo(String linkedTo) {
		this.linkedTo = linkedTo;
	}
	
	

}
