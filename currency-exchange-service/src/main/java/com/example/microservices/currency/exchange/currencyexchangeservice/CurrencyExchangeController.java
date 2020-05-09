package com.example.microservices.currency.exchange.currencyexchangeservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.config.environment.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

//	@Autowired
//	private Environment environment; 
	
	@GetMapping("/curreny-exchange/from/{from}/to/{to}")
	public ExchangeValue  retrieveExchangeValue(@PathVariable String from, @PathVariable String to){
		ExchangeValue exhangeValue = new ExchangeValue(1000L,from, to, BigDecimal.valueOf(65));
		 //exhangeValue.setPort(Integer.parseInt(environment.getPropertySources("local.server.port")));
		exhangeValue.setPort(8000);
				return exhangeValue; 
	}
}
