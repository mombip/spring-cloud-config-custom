package com.test.cloud.config.custom;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class CustomConfigBootstrapConfiguration {

	@Configuration
	@EnableConfigurationProperties
	@ConditionalOnProperty(name = "spring.cloud.custom.config.enabled", matchIfMissing = true)
	protected static class DbPropertySourceConfiguration {

		@Bean
		public CustomPropertySourceLocator customPropertySourceLocator() {
			return new CustomPropertySourceLocator();
		}
	}
}
