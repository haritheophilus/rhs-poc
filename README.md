**Project Details	Sept.16.2021**

a.	01-storage-demo :
This project has a sample Java code to produce and consume messages to/from Kafka.
/scripts package has the commands related to Kafka.
b.	api-gateway

Service Name : API-GATEWAY
We have integrated items C, D & F microservices. This project is the gateway for all these services.
c.	Hwservice (microservice for persisting messages before sending to event hub)

Service Name : PERSIST-MSG-SERVICE

d.	KafkaOnAzureEventHub (microservice to publish messages to event hub , consume them and save them to Azure blob storage as files)

Service Name : PUBLISH-MSG-SERVICE

e.	mobile_app-ws (microservice that implements Spring Boot, JPA, REST API, Spring Security, Error Handling)

f.	my-web-project (microservice for UI. JSP and Spring Boot. Items C & D are called from this service using RestTemplate)
Service Name : MY-UI-SERVICE

g.	service-registry (Eureka Service discovery server where the three microservices are registered along with api-gateway)

h.	spring-kafka (Suresh version of Kafka implementation. Publishing and Consuming to/from multiple topics)


Microservices integration:
1.	Start Service Registry and open the link : http://localhost:8761/
2.	Start b, c, d & f services and check their registration on Eureka
3.	Enter the message to be published in http://localhost:9191/ui/ 
a.	The UI service calls c & d services to persist and publish the message
b.	The same is notified on the UI.
4.	Observe the application properties & Application class files of each of these services for implementation details.
5.	Special mention about the controller class of UI service ( item f above) that makes use of RestTemplate and Service Names as registered with Eureka server.
6.	API Gateway is single point of entry to access these services
a.	@TODO: As of now, we can still access the microservices without using API gateway. Such access must be restricted.

**Project Details	Oct.09.2021**

**Kafka-Streams:**
1.	cardservices-jason-producer 
2.	kafkastreams


**Kafka-Client API:**
1.	rhs-kafka-on-azure-consumer
2.	rhs-kafka-on-azure
3.	mongodb


