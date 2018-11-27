package com.pheonix.accounts.service;

import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pheonix.accounts.config.ResourceEndpointUrl;
import com.pheonix.accounts.pojo.BankAccounts;
import com.pheonix.accounts.pojo.CardAccounts;
import com.pheonix.accounts.pojo.CardThirdPartyAccounts;
import com.pheonix.accounts.pojo.InsuranceAccounts;

@Service
public class AccountsDomainService {

	private static final Logger log = LoggerFactory.getLogger(AccountsDomainService.class);

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	ResourceEndpointUrl resourceEndpointUrl;

	@Async
	//@HystrixCommand(fallbackMethod = "getInsuranceAccountsFromDomain_Fallback")
	public CompletableFuture<InsuranceAccounts> getInsuranceAccountsFromDomain() throws InterruptedException {
		log.info("firing insurance domain accounts through eureka loadbalanced");
		String url = null;
		InsuranceAccounts results = null;
		if (null != resourceEndpointUrl) {
			log.info("getting InsuranceAccounts endpoints to form url");
			url = "http://" + resourceEndpointUrl.getInsuranceDomainEndPoint()
			+ resourceEndpointUrl.getInsuranceAccountsResource().get(0);
		}

		if (null != url)
			results = restTemplate.getForObject(url, InsuranceAccounts.class);
		log.info("resulst from Insurance Accounts: " + results);
		return CompletableFuture.completedFuture(results);
	}
	
	@SuppressWarnings("unused")
	private InsuranceAccounts getInsuranceAccountsFromDomain_Fallback() throws InterruptedException {
		log.info("firing getInsuranceAccountsFromDomain Fallback becz the service is unavailable");
		
		InsuranceAccounts results =  new InsuranceAccounts();
		return results;
	}

	@Async
	//@HystrixCommand(fallbackMethod = "getBankAccountsFromDomain_Fallback")
	public CompletableFuture<BankAccounts> getBankAccountsFromDomain() throws InterruptedException {
		log.info("firing bank domain accounts through eureka loadbalanced");
		String url = null; 
		BankAccounts results = null;
		if (null != resourceEndpointUrl) {
			log.info("getting BankAccounts endpoints to form url");
			url = "http://" + resourceEndpointUrl.getBankDomainEndPoint()
			+ resourceEndpointUrl.getBanksAccountsResource().get(0);
			log.info(url);
		}

		if (null != url)
			results = restTemplate.getForObject(url, BankAccounts.class);

		log.info("resulst from Bank Accounts: " + results);
		return CompletableFuture.completedFuture(results);
	}
	
	@SuppressWarnings("unused")
	private BankAccounts getBankAccountsFromDomain_Fallback() throws InterruptedException {
		log.info("firing getBankAccountsFromDomain Fallback becz the service is unavailable");
		
		BankAccounts results =  new BankAccounts();
		return results;
	}

	@Async
	//O@HystrixCommand(fallbackMethod = "getCardsAccountsFromDomain_Fallback")
	public CompletableFuture<CardAccounts> getCardsAccountsFromDomain() throws InterruptedException {
		log.info("firing creditcards domain accounts through eureka loadbalanced");
		String url = null;
		CardAccounts results = null;
		if (null != resourceEndpointUrl) {
			log.info("getting CardAccounts endpoints to form url");
			url = "http://" + resourceEndpointUrl.getCardsDomainEndPoint()
			+ resourceEndpointUrl.getCardsAccountsResource().get(0);
			log.info(url);
		}

		if (null != url)
			results = restTemplate.getForObject(url, CardAccounts.class);

		log.info("resulst from creditcard Accounts: " + results);
		return CompletableFuture.completedFuture(results);
	}
	
	@SuppressWarnings("unused")
	private CardAccounts getCardsAccountsFromDomain_Fallback() throws InterruptedException {
		log.info("firing getCardsAccountsFromDomain Fallback becz the service is unavailable");
		
		CardAccounts results =  new CardAccounts();
		return results;
	}

	@Async
	//@HystrixCommand(fallbackMethod = "getOtherCardsAccountsFromDomain_Fallback")
	public CompletableFuture<CardThirdPartyAccounts> getOtherCardsAccountsFromDomain() throws InterruptedException {
		log.info("firing Othercreditcards domain accounts through eureka loadbalanced");
		String url = null;
		CardThirdPartyAccounts results = null;
		if (null != resourceEndpointUrl) {
			log.info("getting CardThirdPartyAccounts endpoints to form url");
			url = "http://" + resourceEndpointUrl.getCardsDomainEndPoint()
			+ resourceEndpointUrl.getCardsAccountsResource().get(1);
			log.info(url);
		}

		if(null!=url)
			results = restTemplate.getForObject(url, CardThirdPartyAccounts.class);

		log.info("resulst from othercreditcards Accounts: " + results);
		return CompletableFuture.completedFuture(results);
	}
	
	@SuppressWarnings("unused")
	private CardThirdPartyAccounts getOtherCardsAccountsFromDomain_Fallback() throws InterruptedException {
		log.info("firing getOtherCardsAccountsFromDomain Fallback becz the service is unavailable");
		
		CardThirdPartyAccounts results =  new CardThirdPartyAccounts();
		return results;
	}
}
