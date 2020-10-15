package com.residencia.contatos.service.implementation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.residencia.contatos.config.AppConfig;
import com.residencia.contatos.model.Contact;
import com.residencia.contatos.service.specification.ContactPublishService;

@Service
public class KafkaPublisherService implements ContactPublishService {
	
	private static final Logger LOG=LoggerFactory.getLogger(KafkaPublisherService.class);
	
	@Autowired
	private AppConfig appConfig;
	
	@Autowired
	private KafkaTemplate<String, Contact> kafkaTemplate;

	@Override
	public void publish(Contact contact) {
		LOG.info("Sending '{}' to topic = '{}' ",contact,appConfig.getOutputKafkaTopic());
		Message<Contact> message=MessageBuilder.withPayload(contact).setHeader(KafkaHeaders.TOPIC, appConfig.getOutputKafkaTopic()).build();
		kafkaTemplate.send(message);
	}

	
}
