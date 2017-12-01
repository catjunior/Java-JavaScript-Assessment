import { Component } from '@angular/core';
import { MyDataService } from './my-data.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
  table = [];

  constructor(private newService: MyDataService){}

  ngOnInit(){
    this.newService.fetchData().subscribe(
      (data) => this.table = data
    );
  }
  
}
