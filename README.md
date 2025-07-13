# kafka-demo

Installation Steps

STEP1 -  .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
STEP2 -  .\bin\windows\kafka-server-start.bat .\config\server.properties
kafka-topics.bat --create--bootstrap-server localhost:9092 --replication-factor 1 --partition 1--topic test
STEP3 - kafka-topics.bat --create--bootstrap-server localhost:9092 --topic test
{"Name: "John", "Age":"31", "Gender":"Male"} {"Name: "Emma", "Age":"27", "Gender":"Female"} {"Name: "Ronald", "Age":"17", "Gender":"Male"}

STEP4 - kafka-console-producer.bat --broker-list localhost:9092 --topic test
STEP5 - kafka-console-consumer.bat --topic test --bootstrap-server localhost:9092 --from-beginning

\bin\windows\zookeeper-server-stop.bat. \config\zookeeper.properties
\bin\windows\kafka-server-stop.bat. \config\server.properties

AmpCede
Install Apache Kafka on Windows PC | Kafka Installation Step-By-Step

--kafka-topics.bat --list --bootstrap-server localhost:9092
--kafka-topics.bat --delete --bootstrap-server localhost:9092 --topic test

kafka-topics.sh --list --bootstrap-server localhost:9092

curl --location --request POST 'localhost:8080/api/kafka/send?message=Hello%20World!!'

curl --location 'localhost:8080/api/booking/confirmBooking' \
--header 'Content-Type: application/json' \
--data '{
  "bookingId": "B12345",
  "userId": "U7890",
  "amount": 250,
  "timestamp": "2025-07-13T10:15:00Z"
}'