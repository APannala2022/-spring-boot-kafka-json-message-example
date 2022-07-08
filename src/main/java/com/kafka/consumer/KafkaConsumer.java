//package com.kafka.consumer;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Component;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.kafka.constant.ApplicationConstant;
//import com.kafka.dto.Student;
//
//@Component
//public class KafkaConsumer {
//
//	private static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);
//
//	@KafkaListener(groupId = ApplicationConstant.GROUP_ID_JSON, topics = ApplicationConstant.TOPIC_NAME, containerFactory = ApplicationConstant.KAFKA_LISTENER_CONTAINER_FACTORY)
//	public void receivedMessage(Student message) throws JsonProcessingException {
//		ObjectMapper mapper = new ObjectMapper();
//		String jsonString = mapper.writeValueAsString(message);
//		logger.info("Json message received using Kafka listener " + jsonString);
//	}
//}


package com.kafka.consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.constant.ApplicationConstant;
import com.kafka.dto.Space;

@RestController
@RequestMapping("/consume")
public class KafkaConsumer {

	@Autowired
	private ConcurrentKafkaListenerContainerFactory<String, Space> factory;

	@GetMapping("/message")
	public List<Space> receiveMessage() {
		List<Space> Spaces = new ArrayList<>();
		ConsumerFactory<String, Space> consumerFactory = factory.getConsumerFactory();
		Consumer<String, Space> consumer = consumerFactory.createConsumer();
		try {
			consumer.subscribe(Arrays.asList(ApplicationConstant.TOPIC_NAME));
			ConsumerRecords<String, Space> consumerRecords = consumer.poll(5000);
			Iterable<ConsumerRecord<String, Space>> records = consumerRecords.records(ApplicationConstant.TOPIC_NAME);
			Iterator<ConsumerRecord<String, Space>> iterator = records.iterator();

			while (iterator.hasNext()) {
				Spaces.add(iterator.next().value());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return Spaces;
	}
}