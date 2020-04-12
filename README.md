## CurrencyWise
Three separate microservices to calculate currency conversion in a distributed fault tolerant manner.

### Microservices with Spring Boot and Spring Cloud
- Established Communication between Microservices
- Centralized Microservice Configuration with Spring Cloud Config Server
- Used Spring Cloud Bus to exchange messages about Configuration updates
- Simplified communication with other Microservices using Feign REST Client
- Implemented client side load balancing with Ribbon
- Implemented dynamic scaling using Eureka Naming Server and Ribbon
- Implemented API Gateway with Zuul
- Implemented Distributed tracing with Spring Cloud Sleuth and Zipkin
- Implemented Fault Tolerance with Zipkin

### Ports

|     Application       |     Port          |
| ------------- | ------------- |
| Limits Service | 8080, 8081, ... |
| Spring Cloud Config Server | 8888 |
|  |  |
| Currency Exchange Service | 8000, 8001, 8002, ..  |
| Currency Conversion Service | 8100, 8101, 8102, ... |
| Eureka Naming Server | 8761 |
| Zuul API Gateway Server | 8765 |
| Zipkin Distributed Tracing Server | 9411 |


### URLs

|     Application       |     URL          |
| ------------- | ------------- |
| Limits Service | http://localhost:8080/limits POST -> http://localhost:8080/actuator/refresh|
| Spring Cloud Config Server| http://localhost:8888/limits-service/default http://localhost:8888/limits-service/dev |
| Currency Converter Service - Direct Call| http://localhost:8100/currency-converter/from/USD/to/INR/quantity/10|
| Currency Exchange Service | http://localhost:8000/currency-exchange/from/EUR/to/INR http://localhost:8001/currency-exchange/from/USD/to/INR|
| Eureka | http://localhost:8761/|
| Zuul - Currency Exchange & Exchange Services | http://localhost:8765/currency-exchange/currency-exchange/from/EUR/to/INR http://localhost:8765/currency-convertor/currency-converter/from/USD/to/INR/quantity/10|
| Zipkin | http://localhost:9411/zipkin/ |
| Spring Cloud Bus Refresh | http://localhost:8080/bus/refresh |

