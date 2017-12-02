# Spring
This project was generated with SpringBoot version 1.5.9

## Development server
Locate to the project file ("Spring")
Run command "java -jar target/demo-0.0.1-SNAPSHOT.jar"
Navigate to `http://localhost:8080/`

### Result
GET http://localhost:8080/date
  -shows the user's current date and time
  
GET http://localhost:8080/timezone
  -shows the user's time zone
  
GET http://localhost:8080/ip
  -shows the user's ip address
  
POST http://localhost:8080/name
  -creates a user name through POST body 
  -shows [
          {
            "name": "userName"
          }
         ]
         
GET http://localhost:8080/name
  -shows the user's name if already set
  -otherwise shows
         [
          {
            "name": "Anonymous"
          }
         ]
