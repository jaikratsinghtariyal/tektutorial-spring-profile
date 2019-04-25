package com.tektutorial.spring.boot.profile.tektutorialspringprofile.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("uat")
public class BeanOne {

	private static final Logger log = LoggerFactory.getLogger(BeanTwo.class);
	
	public BeanOne() {
		super();
		log.info("In BeanOne profile UAT");
		
	}
	
	

}
