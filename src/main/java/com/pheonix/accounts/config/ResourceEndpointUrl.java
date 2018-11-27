package com.pheonix.accounts.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ResourceEndpointUrl {

	@Value("#{'${cards.domain.accountsResourceUri}'.split(',')}") 
	private List<String> cardsAccountsResource;

	@Value("#{'${banks.domain.accountsResourceUri}'.split(',')}") 
	private List<String> banksAccountsResource;

	@Value("#{'${insurance.domain.accountsResourceUri}'.split(',')}") 
	private List<String> insuranceAccountsResource;

	@Value("${insurance.domain.accountsEndpoint:null}")
	private String insuranceDomainEndPoint;

	public List<String> getCardsAccountsResource() {
		return cardsAccountsResource;
	}

	public void setCardsAccountsResource(List<String> cardsAccountsResource) {
		this.cardsAccountsResource = cardsAccountsResource;
	}

	public List<String> getBanksAccountsResource() {
		return banksAccountsResource;
	}

	public void setBanksAccountsResource(List<String> banksAccountsResource) {
		this.banksAccountsResource = banksAccountsResource;
	}

	public List<String> getInsuranceAccountsResource() {
		return insuranceAccountsResource;
	}

	public void setInsuranceAccountsResource(List<String> insuranceAccountsResource) {
		this.insuranceAccountsResource = insuranceAccountsResource;
	}

	

	public String getInsuranceDomainEndPoint() {
		return insuranceDomainEndPoint;
	}

	public void setInsuranceDomainEndPoint(String insuranceDomainEndPoint) {
		this.insuranceDomainEndPoint = insuranceDomainEndPoint;
	}

	public String getCardsDomainEndPoint() {
		return cardsDomainEndPoint;
	}

	public void setCardsDomainEndPoint(String cardsDomainEndPoint) {
		this.cardsDomainEndPoint = cardsDomainEndPoint;
	}

	public String getBankDomainEndPoint() {
		return bankDomainEndPoint;
	}

	public void setBankDomainEndPoint(String bankDomainEndPoint) {
		this.bankDomainEndPoint = bankDomainEndPoint;
	}

	@Value("${cards.domain.accountsEndpoint:null}")
	private String cardsDomainEndPoint;

	@Value("${banks.domain.accountsEndpoint:null}")
	private String bankDomainEndPoint;

	@Override
	public String toString() {
		return "ResourceEndpointUrl [cardsAccountsResource=" + cardsAccountsResource + ", banksAccountsResource="
				+ banksAccountsResource + ", insuranceAccountsResource=" + insuranceAccountsResource
				+ ", insureanceDomainEndPoint=" + insuranceDomainEndPoint + ", cardsDomainEndPoint="
				+ cardsDomainEndPoint + ", bankDomainEndPoint=" + bankDomainEndPoint + "]";
	}

	
	


}

