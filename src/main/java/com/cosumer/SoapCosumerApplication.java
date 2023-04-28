package com.cosumer;


import com.cosumer.client.SendResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import javax.xml.bind.JAXBElement;

@Slf4j
@SpringBootApplication
public class SoapCosumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapCosumerApplication.class, args);
	}

	@Bean
	CommandLineRunner lookup(Client client) {

		return args -> {

			JAXBElement<SendResponse> response = client.getResponse();
			log.info("Response: {}", response.getValue().getData().getDescription());
		};
	}
}
