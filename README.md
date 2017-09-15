# Challenge1

The purpose of this project is to provide a REST server that can communicate with separate mobile applications that use geofencing to determine if a user is in a specific area.
Like many of STG's dev center projects, this project has had bumps where the original creators moved on to other projects.

It is currently designed so that an angular2 front end _could_ be used. However, there is no current desktop front end built for it.

The project works only with user names, email addresses and lets you know if they are "in the office".

There exists a single table in MariaDB with 'contact' information.

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 1.3.1.

## Development server

To develop the front end, us `ng serve` and run the app from angular. On a development environment, this will likely be localhost:4200

If you simply want to run the REST server and test with cURL from a CLI, run the project in eclipse or some other IDE, and test against localhost:8080

## Build

Angular typically runs from a node server, but for better security both the angular frontend and the Spring REST backend are running from the same server. This creates a slightly different build process. From the root of the project directory, you will need to use angular-cli to build the front end files which will then be moved to a src folder that the Java controllers will then be able to see.

From the root directory, run `ng build` to build the project. The build artifacts will be stored in the `src/main/webapp` directory. Use the `-prod` flag for a production build. After that, you should be able to run the project like you normally would from your IDE and things should run just fine.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/).
Before running the tests make sure you are serving the app via `ng serve`.

## Further help
*Guide to using the REST server*
Create - POST
Read - GET
Update - PATCH
Delete - DELETE

*Add a Contact*

  curl  -X POST -H 'content-type: application/json' -d '{"email" : "some.user@StgConsulting.com", "firstName" : "Nelson", "lastName": "Boyer", "inOffice" : "false" }' http://localhost:8080/contacts

*Get all contacts:*
curl http://localhost:8080/contacts
This will give you a list of all contacts and provide a link that you can use to run all other commands against
{
    "_embedded" : {
          "contacts" : [ {
                  "email" : "RP@stgconsulting.com",
                        "firstName" : "Ryan",
                              "lastName" : "Pritt",
                                    "inOffice" : false,
                                          "_links" : {
                                                    "self" : {
                                                                "href" : "http://localhost:8080/contacts/2"
                                                                          },
                                                            "contact" : {
                                                                        "href" : "http://localhost:8080/contacts/2"
                                                                                  }
                                                          }
                      } ]
            },

*Update a Contact:*
      curl -X PATCH -H 'content-type: application/json' -d '{"inOffice" : "true" }' http://localhost:8080/contacts/2

*Delete a Contact*

      curl -X DELETE http://localhost:8080/contacts/2


