# Spring Boot Kafka Microservices

This project uses Kafka as a messaging system to exchange messages between two microservices: producer and consumer. The consumer service data is being storaged in a Mysql local database.
The data is provided by the wikimedia API that returns in real time 
all wikipedia updates made by users around the world (https://stream.wikimedia.org/v2/stream/recentchange).

### STEP 1 APACHE KAFKA DOWNLOAD
https://www.apache.org/dyn/closer.cgi?path=/kafka/3.7.0/kafka_2.13-3.7.0.tgz

### STEP 2: START THE KAFKA ENVIRONMENT
- Start the ZooKeeper service:

Go to the main Kafka folder, type "cmd", and than type this:

``.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties``

- Start the Kafka broker service:

Go to the main Kafka folder, type "cmd", and than type this:

``.\bin\windows\kafka-server-start.bat .\config\server.properties``
