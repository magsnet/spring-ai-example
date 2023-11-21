package de.aclue.magsnet.springaiexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestSpringAiExampleApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringAiExampleApplication::main).with(TestSpringAiExampleApplication.class).run(args);
	}

}
