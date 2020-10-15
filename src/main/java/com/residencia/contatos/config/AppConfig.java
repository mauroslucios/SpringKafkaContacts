package com.residencia.contatos.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("app")
public class AppConfig {

	private String outputKafkaTopic;

	public String getOutputKafkaTopic() {
		return outputKafkaTopic;
	}

	public void setOutputKafkaTopic(String outputKafkaTopic) {
		this.outputKafkaTopic = outputKafkaTopic;
	}
}
