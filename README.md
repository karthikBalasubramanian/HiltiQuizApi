Hilti Quiz API
==============

 Hilti Quiz API is a [Java Spring Data](https://www.petrikainulainen.net/spring-data-jpa-tutorial/) Appilication. It exposes database CRUD operations as REST API calls. [This](https://github.com/karthikBalasubramanian/HiltiDBSchema) is the schema of the database which gets updated from the REST calls. The application follows a Model-View-Controller pattern.

## application.properties

  This file contains the properties that are responsible for connecting the database with the application. User can create a database using the schema.

## Model

  Model package has the individual tables in the database as plain old java objects.

## View

  CRUD operations are performed by the application on the database and the result is rendered in the browser as JSON.

## Controller

  Controller opens up the URLs which are exposed to perform a specific operation on a table in the database.

## DAO and Service Layer

  Data access handles database transactions in the application and Service layer handles the business logic. 
 

   
