# Spring Projections

What this project is about...

## Quickstart

Prerequisites:
- Java SE 8!
- git
- maven

From the command line do:

```
git clone https://github.com/Thinkenterprise/spring-projections.git
cd spring-projections
mvn clean package
java -jar target/*.jar
```

Root Resources:
http://localhost:8080/aircrafts
http://localhost:8080/employees
http://localhost:8080/routes

Projections:
http://localhost:8080/routes?projection=connection
http://localhost:8080/routes?projection=connectionFlightCount
http://localhost:8080/routes?projection=flightplan
http://localhost:8080/routes?projection=routeFlightAircraft
http://localhost:8080/routes?projection=routeFlightEmployee


## IDE setup 

For the usage inside an IDE do the following:

1. Make sure you have an Eclipse with m2e installed (preferably [STS](http://spring.io/sts)).
2. Install [Lombok](http://projectlombok.org).
   1. Download it from the [project page](http://projectlombok.org/download.html).
   2. Run the JAR (double click or `java -jar …`).
   3. Point it to your Eclipse installation, run the install.
   4. Restart Eclipse.
   
3. Import the checked out code through *File > Import > Existing Maven Project…*

## Project description

The project uses:

- [Spring Boot](http://github.com/spring-projects/spring-boot) - 1.2.2
- [Spring Data JPA](http://github.com/spring-projects/spring-data-jpa) - 1.6.0.RELEASE
- [Spring Data REST](http://github.com/spring-projects/spring-data-rest) - 2.1.0.RELEASE
- [Spring Hateoas](http://github.com/spring-projects/spring-hateoas) - 0.12.0.RELEASE
- [Spring Plugin](http://github.com/spring-projects/spring-plugin) - 1.1.0.RELEASE

Write something about code...

