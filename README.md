# Introduction

This is an alternative solution to use with the frontend application (https://github.com/PiiaMiia/subscription-frontend).

This app is compiled with maven, so first make sure you have that set up.
Instructions can be found here: https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html.
I used IntelliJ for developing and building this project, so I recommend using this for packaging the project.

The frontend application should access the data, once all this is set up.

# Running The Application

```bash
$ git clone https://github.com/PiiaMiia/subscription-backend-spring-boot.git
```
* open the project with IntelliJ
* package the project or run mvn package.
* cd to target folder and run command:

```bash
$java -jar test-spring-1.0-SNAPSHOT.jar
```

# Configuration

Default application server configuration

```bash
PORT             = 8080;
```

Available services:

SERVICE | URL | GET | DELETE | POST
--- | --- | --- | --- | ---
**DetailsController** | /details | X | X | X
|  |   | *Gets all details of current service* | *Ends current subscription* | *reinstates ended subscription*
**BillsController** | /bills | X | - | -
|  |   | *gets all the past payments* |  |  