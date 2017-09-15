# Challenge1

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 1.3.1.

## Development server

If you use `ng build` and run from eclipse, you won't be able to see changes in real time. Instead, use ng serve while developing.
Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Angular typically runs from a node server, but for better security both the angular frontend and the Spring REST backend are running from the same server. This creates a slightly different build process. From the root of the project directory, you will need to use angular-cli to build the front end files which will then be moved to a src folder that the Java controllers will then be able to see.

From the root directory, run `ng build` to build the project. The build artifacts will be stored in the `src/main/webapp` directory. Use the `-prod` flag for a production build. After that, you should be able to run the project like you normally would from your IDE and things should run just fine.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/).
Before running the tests make sure you are serving the app via `ng serve`.

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI README](https://github.com/angular/angular-cli/blob/master/README.md).
