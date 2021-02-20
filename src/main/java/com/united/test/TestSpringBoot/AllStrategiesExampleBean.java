package com.united.test.TestSpringBoot;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
@Component
public class AllStrategiesExampleBean implements InitializingBean  {
	private static final Logger LOG 
    = LoggerFactory.getLogger(AllStrategiesExampleBean.class);
	public AllStrategiesExampleBean() {
        LOG.info("Constructor");
    }
	@Override
	public void afterPropertiesSet() throws Exception {
		LOG.info("InitializingBean");
		
	}

	@PostConstruct
    public void postConstruct() {
        LOG.info("PostConstruct");
    }
	
	@Bean
	public void init() {
        LOG.info("init-method");
    }
}
