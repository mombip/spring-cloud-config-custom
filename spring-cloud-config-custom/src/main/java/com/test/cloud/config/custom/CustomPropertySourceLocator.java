package com.test.cloud.config.custom;

import java.util.HashMap;
import java.util.Map;

import org.springframework.cloud.bootstrap.config.PropertySourceLocator;
import org.springframework.core.env.Environment;
import org.springframework.core.env.PropertySource;

public class CustomPropertySourceLocator implements PropertySourceLocator {

	@Override
	public PropertySource<?> locate(Environment environment) {
//		String appName = environment.getProperty("spring.application.name");
//		List<String> profiles = Arrays.asList(environment.getActiveProfiles());
		Map<String, String> source = readCustomProperties();
		final CustomPropertySource customPorpertySource = new CustomPropertySource("custom", source );
		customPorpertySource.init(source);
		return customPorpertySource;
	}

	private Map<String, String> readCustomProperties() {
		Map<String, String> source = new HashMap<>();
		source.put("test.prop1", "CUSTOM-VALUE-1");
		source.put("test.prop2", "CUSTOM-VALUE-2");
		source.put("test.prop3", "CUSTOM-VALUE-3");
		return source;
	}

}
