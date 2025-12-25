package kafka.consumer.listener;

import kafka.producer.model.User;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaMessageListener {
    private static final Logger logger = LoggerFactory.getLogger(KafkaMessageListener.class);

    //What is mean by KafkaListener?
    //KafkaListener is an annotation provided by Spring Kafka that marks a method to be the target of a Kafka message listener on the specified topics.
    // When a message is received on the specified topic, the annotated method is invoked with the message payload.
    // It simplifies the process of consuming messages from Kafka topics in a Spring application.


    // Five listeners for the same topic and group
    //kafka_topic has 5 partitions, so each listener will consume from one partition
    // This way, messages are processed in parallel
    //What is mean by groupId in KafkaListener?
    //groupId is used to identify a group of consumers that work together to consume messages from a topic.
    // Each consumer in the group is assigned a subset of partitions to consume from.


    @KafkaListener(topics = "kafka_topic", groupId = "suresh-group-one")
    public void consumeMessage1(String message) {
        logger.info("Received message1: {}", message);
    }

    @KafkaListener(topics = "kafka_topic", groupId = "suresh-group-one")
    public void consumeMessage2(String message) {
        logger.info("Received message2: {}", message);
    }

    @KafkaListener(topics = "kafka_topic", groupId = "suresh-group-one")
    public void consumeMessage3(String message) {
        logger.info("Received message3: {}", message);
    }

    @KafkaListener(topics = "kafka_topic", groupId = "suresh-group-one")
    public void consumeMessage4(String message) {
        logger.info("Received message4: {}", message);
    }

    @KafkaListener(topics = "kafka_topic", groupId = "suresh-group-one")
    public void consumeMessage5(String message) {
        logger.info("Received message5: {}", message);
    }

    @KafkaListener(topics = "kafka_json_topic", groupId = "suresh-group-one")
    public void consumeJsonMessage(User user) {
        logger.info("Received Json Message : {}", user);
    }



}
