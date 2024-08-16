# Web Automation on SauceDemo Website with Selenium TestNG

## Technology used:
- Selenium Webdriver
- TestNG Framework
- Java
- Maven
- Intellij idea/VSCode
- ExtentReports

## How to run this project

- Clone this project
- Hit the following command into the terminal:
 ```mvn clean test```
  1) mvn test - to run the execution of tests using pom.xml 
  3) mvn test -DbrowserName=firefox - executes the tests in firefox browser
  4) mvn test -Dsurefire.suiteXmlFiles -DbrowserName=firefox - executes a particular testng xml tests into firefox browser
  
 ## Docker Commands

1)	docker -v : provides current docker version
2)	docker ps : provides the currently running docker containers
3)	docker stop : to stop running containers
Example: docker stop container_id (id can be received using docker ps)
4)	docker logs container_id : provides information about the running container
5)	docker pull image_name : pulls the image using the name mentioned in command from docker hub
6)	docker-compose -f file_name.yml up : used to run the docker compose file which is in YAML format. “up” is used to run the docker compose file
7)	docker-compose -f file_name.yml down : used to stop the docker-compose file which is in YAML format. “down” is used to stop the docker compose file
8)	docker run -d -p 4444:4444 -p 7900:7900 --shm-size 2g seleniarm/standalone-firefox
9)	docker run -d -p 4444:4444 -p 7900:7900 --shm-size 2g seleniarm/standalone-chromium
10)	Docker run -d -p 4444:4444 -p 7900:7900 –shm-size=”2g” selenium/standalone-chrome
11)	docker ps -a: gives info about the running containers and stopped containers

Explanation for above command: 

1)	The docker run command runs a command in a new container, pulling the image if needed and starting the container.
2)	-d : detached mode
3)	-p 4444:4444 : port and container port:host port
4)	–shm-size=2g : 2gb of memory allocated utmost to container
5)	seleniarm/standalone-firefox : docker image name
6)	-p 7900:7900 : means a port assigned to 7900 to view VNC


Setup Chrome and firefox Standalone browsers 

1)	Docker run -d -p 4444:4444 -p 7900:7900 –shm-size=”2g” selenium/standalone-chrome
2)	Docker run -d -p 4444:4444 -p 7900:7900 –shm-size=”2g” selenium/standalone-firefox

## Scenerio:

- Login into SauceDemo site: https://www.saucedemo.com/
- Add a few username and passwords 
- Land on Product page and select item

## Test case check list based on the Scenerio:

- Customer Login with valid credentials.
- Customer login with locked_out-invalid credentials.
- Customer Login with performance_glitch-slowresponse credentials. 
- ItemNumberSelected on productpage
  
