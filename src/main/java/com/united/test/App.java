package com.united.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App implements CommandLineRunner {
private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(App.class, args);
    }
    @Autowired
    private AppName appName;

	@Override
	public void run(String... args) throws Exception {
		logger.info("Application name: {}", appName.getName());
		
	}
	
	@Bean
    public AppName getAppName(@Value("${app.name}") final String appName) {

        return new AppName() {
			
			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return appName;
			}
		};
    }
}
