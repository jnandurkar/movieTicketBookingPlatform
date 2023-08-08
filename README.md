
# MovieTicketBookingPlatform
This is a simple application for purchasing movie tickets that uses Spring Security, HTML, CSS, and Bootstrap on the front end. 


### Requirements

* Java 8+
* The command-line programme git (https://help.github.com/articles/set-up-git)
* Maven
* Your preferred IDE (obligatory but advised; I use Intellij) 

### Steps:

Project cloned from git
```
```
2a) When using the command line, execute:
```
cd BookMyMovie
./mvnw package
java -jar target/*.jar
```
can use the Spring Boot Maven plugin to execute it straight from Maven.
```
cd BookMyMovie
./mvnw spring-boot:run
```
2b) To execute using Intellij's IDE:
Select "File->Open" from the main menu, then locate the BookMyMovie folder you copied in step 1 from there.
Then choose Run by right-clicking the ''ReservationsApplication'' class file.

You may then access the application by navigating to http://localhost:8080/movies in your browser.

2c) A Docker image of the programme may also be used to execute it. Running as a Docker image requires Docker to already be installed.
```
cd BookMyMovie
docker build -t bookmymovie
docker run -p 8080:8080 -d bookmymovie


