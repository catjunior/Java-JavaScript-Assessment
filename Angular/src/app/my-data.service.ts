import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import 'rxjs/add/operator/map';

@Injectable()
export class MyDataService {

  constructor(private http: Http) { }  
 
  fetchData(){
    return this.http.get('https://api.github.com/orgs/sidgs/repos').map(
      (res) => res.json()
    );
  }

}
