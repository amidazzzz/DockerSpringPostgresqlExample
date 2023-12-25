# Spring Boot with PostgreSQL and Docker Compose Example

## STEPS FOR THIS SPRING BOOT APP
- Define dependencies in build.gradle
- Create a Spring Boot Main @SpringBootApplication
- Create components @Entity / @Controller / @Repository
- Create application.properties
- Build 
- Check app using curls 

## BUILD the application 
./gradlew build   

## BUILD AND UP Docker Compose 
docker-compose up --build   
docker-compose down <- down docker compose     

## CURLS 

### POST /users/form
curl -s -X POST \
  http://localhost:8080/user/form \
  -H 'Content-Type: application/json' \
  -d '{"name":"Your Name"}'


### GET /users/list
curl -s -X GET \
  http://localhost:8080/user/1 
  
