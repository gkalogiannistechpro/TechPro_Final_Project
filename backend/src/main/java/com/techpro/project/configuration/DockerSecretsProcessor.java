package com.techpro.project.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;


/**
 * Read property from docker secret file.
 */
public class DockerSecretsProcessor implements EnvironmentPostProcessor {

	@Override
	public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
		System.setProperty("MYSQL_HOST", "192.168.43.200");
		System.setProperty("MYSQL_USERNAME", "root");
		System.setProperty("MYSQL_PASSWORD", "root");
	}
}
