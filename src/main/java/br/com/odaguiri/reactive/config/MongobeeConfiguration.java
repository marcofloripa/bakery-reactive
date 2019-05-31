package br.com.odaguiri.reactive.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.mongobee.Mongobee;

@Configuration
public class MongobeeConfiguration {

	@Bean
	public Mongobee mongobee() {
		Mongobee runner = new Mongobee("mongodb://localhost:27017/bakery");
		runner.setDbName("bakery");
		runner.setChangeLogsScanPackage("br.com.odaguiri.reactive.changelog");
		return runner;
	}
	
}
