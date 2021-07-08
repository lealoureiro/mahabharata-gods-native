# Mahabharata Gods

REST API to Calculate the popularity of Indian gods in Mahabharata book. 
The goal of the project/challenge is to explore **Spring Native** and **CompletableFutures** in java.


## Pre-requisites

- Java 11
- Docker (To build a light container with native application)
  GraalVM SDK (To build native image locally, can be installed with SDKMan)
- httpie (Optional to API)

## Build locally JVM version 

```bash
./mvnw clean install
```

## Run locally JVM version

```bash
./mvnw spring-boot:run
```

## Build and run locally native version

```bash
./mvnw -Pnative -DskipTests package 
```

## Build and run using docker container

```bash
mvn spring-boot:build-image
docker run --rm -p 8080:8080 mahabharata-gods-native:1.0.0-SNAPSHOT
```

## Test 
```bash
http :8080/top-gods
```