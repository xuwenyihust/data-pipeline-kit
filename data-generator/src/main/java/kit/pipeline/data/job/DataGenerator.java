package kit.pipeline.data.job;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class DataGenerator {

    public static void main(String[] args) {
        Properties props = new Properties();
        props.put("bootstrap.servers", "kafka:9092");
        props.put("acks", "all");
        props.put("retries", 0);
        props.put("key.serializer",
                "org.apache.kafka.common.serialization.StringSerializer");

        props.put("value.serializer",
                "org.apache.kafka.common.serialization.StringSerializer");

        while (true) {
            try (Producer<String, String> producer = new KafkaProducer<String, String>(props)) {
                producer.send(new ProducerRecord<String, String>("test_in", "key", "wow"));
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Got exception: " + e.getMessage());
            }
        }
    }
}
