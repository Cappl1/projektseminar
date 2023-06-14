import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-unregister',
  templateUrl: './unregister.component.html',
  styleUrls: ['./unregister.component.css']
})
export class UnregisterComponent implements OnInit {
  constructor(
    private route: ActivatedRoute,
    private userService: UserService
  ) { }

  ngOnInit(): void {
    this.unregister();
  }

  unregister(): void {
    const id = this.route.snapshot.paramMap.get('id');
  
    if (id === null) {
      console.log("No 'id' parameter in the route");
      // handle the case when id is null here
      return;
    }
  
    const numId = +id;
    // Here we assume you already have the user information. 
    // If not, you should create a form to get user information from the user.
    const user = {id: 1, email: 'test@example.com', username: 'testuser', password: 'password', firstName: 'Test', lastName: 'User'};
    this.userService.unregister(user, numId)
      .subscribe(response => {
        // handle response here
      });
  }
  
}
