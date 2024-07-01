# Microserviços com Spring Boot e Kafka

Este projeto utiliza Kafka como um sistema de mensagens para trocar mensagens entre dois microsserviços: produtor e consumidor. Os dados do serviço consumidor estão sendo armazenados em um banco de dados local Mysql. Os dados são fornecidos pela API da wikimedia, que retorna em tempo real todas as atualizações da Wikipedia feitas por usuários ao redor do mundo.

### PASSO 1: DOWNLOAD DO APACHE KAFKA
https://www.apache.org/dyn/closer.cgi?path=/kafka/3.7.0/kafka_2.13-3.7.0.tgz

### PASSO 2: INICIAR O AMBIENTE KAFKA
- Iniciar o serviço ZooKeeper:

Vá para a pasta principal do Kafka, digite "cmd" e depois digite isto:

``.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties``

-Iniciar o serviço broker do Kafka:

Vá para a pasta principal do Kafka, digite "cmd" e depois digite isto:

``.\bin\windows\kafka-server-start.bat .\config\server.properties``
