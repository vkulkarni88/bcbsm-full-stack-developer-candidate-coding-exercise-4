import { Component } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {HttpErrorResponse} from '@angular/common/http';
 
 
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Simple Example Contact-us page using Angular 4';
  public data:any={
    username : "",
    date : "",
    rate : "",
    comment : ""
  }
 
  
  constructor(private http: HttpClient){
  }
 
  save(): void {
    let error = false;
 
    if(this.data.comment.length>400) {
      error = true;
    }
    
    if(error === false) {
    console.log(this.data);
                //add request to send email or into mysql
                this.http.post<any>("http://localhost:8095/rest/Feedbackform/register/", this.data).subscribe(
        res => {
          console.log(res);
      },
      (err: HttpErrorResponse) => {
        if (err.error instanceof Error) {
          console.log("Client-side error occured.");
        } else {
          console.log("Server-side error occurred.");
        }
      });
    }
   }
}