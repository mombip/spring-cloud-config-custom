package com.test.cloud.config.custom;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.core.env.EnumerablePropertySource;

public class CustomPropertySource extends EnumerablePropertySource {

	protected CustomPropertySource(String name) {
		super(name);
	}

	public CustomPropertySource(String name, Object source) {
		super(name, source);
	}

	private final Map<String, Object> properties = new LinkedHashMap<>();

	@Override
	public Object getProperty(String name) {
		return properties.get(name);
	}

	@Override
	public String[] getPropertyNames() {
		Set<String> strings = properties.keySet();
		return strings.toArray(new String[strings.size()]);
	}

	public void init(Map<String, String> props){
		properties.putAll(props);
	}

}
