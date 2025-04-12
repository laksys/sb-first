package org.example.sb_first;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbFirstApplication {
	private static Logger log = LoggerFactory.getLogger(SbFirstApplication.class);
	public static void main(String[] args) {
		log.debug("---STARTING MAIN-------");
		SpringApplication.run(SbFirstApplication.class, args);
		log.debug("----STOPPING MAIN------");
	}

}
