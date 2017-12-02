# Angular
This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 1.0.0.

## Development server
Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

## Result
After run `ng serve`, the table will be automatically generated in the view. 

### 
Source code is under Anuglar/src/app  

A http get method is in my-data.service.ts, and it fetches all the raw data from the endpoint https://api.github.com/orgs/sidgs/repos

Maps the fetched the data into json format and stores into local variable "table []" in app.component.ts

Lays out the asked data into a table view in app.component.html



