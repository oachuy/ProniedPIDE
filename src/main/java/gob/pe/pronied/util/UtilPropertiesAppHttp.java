package gob.pe.pronied.util;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Configuration
@PropertySource("classpath:codigo.properties")
@ConfigurationProperties(prefix = "http")

public class UtilPropertiesAppHttp {
	
	private Map<String, String> code;


	public Map<String, String> getCode() {
		return code;
	}

	public void setCode(Map<String, String> code) {
		this.code = code;
	}



     
}
