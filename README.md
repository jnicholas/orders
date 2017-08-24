# Orders

REST API defining orders, items, and their relationships.

### setup

Prerequisites:
- Java SDK 1.8
- Maven 3

Clone this repository and from the root directory run

`
mvn clean package && java -jar target/orders-service-0.1.0.jar
`

### running

Visit or `curl` request `localhost:8080` to explore the REST API.

### technologies

- [Spring Boot 1.5.6](https://projects.spring.io/spring-boot/)
    - quick configuration of HAL endpoints
    - interoperable with javax.persistence library
    - includes Tomcat
- [h2 database](http://www.h2database.com/html/main.html)
    - installable from Maven