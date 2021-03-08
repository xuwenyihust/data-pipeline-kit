package kit.pipeline.data.job;

import kit.pipeline.data.shared.Behavior;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import com.google.gson.Gson;

import java.util.Properties;

public class DataGenerator {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(DataGenerator.class);

        // Kafka connection setup
        Properties props = new Properties();
        props.put("bootstrap.servers", "kafka:9092");
        props.put("acks", "all");
        props.put("retries", 0);
        props.put("key.serializer",
                "org.apache.kafka.common.serialization.StringSerializer");

        props.put("value.serializer",
                "org.apache.kafka.common.serialization.StringSerializer");

        Gson gson = new Gson();
        Behavior behaviorTest = new Behavior();
        String behaviorTestString = gson.toJson(behaviorTest);

        while (true) {
            try (Producer<String, String> producer = new KafkaProducer<String, String>(props)) {
                producer.send(new ProducerRecord<String, String>("behavior", "key", behaviorTestString));
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                logger.error("Got exception: {}", e.getMessage());
            }
        }
    }
}
