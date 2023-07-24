import { Component, OnInit } from '@angular/core';
import { UserService } from '../_services/user.service';
import { Comments } from '../comment.model';

@Component({
  selector: 'app-board-admin',
  templateUrl: './board-admin.component.html',
  styleUrls: ['./board-admin.component.css']
})
export class BoardAdminComponent implements OnInit {
  content = '';
  
  comments: Comments[] | undefined;

  constructor(private userService: UserService) { }

  ngOnInit(): void {
    this.getUsers();
  }
  
    private getComments() {
    this.userService.getAdminBoard().subscribe(data => {
      this.comments = data;
    });
  }
}
