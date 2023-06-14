import { Component, OnInit } from '@angular/core';
import { Course } from '../models/course';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-user-courses',
  templateUrl: './user-courses.component.html',
  styleUrls: ['./user-courses.component.css']
})
export class UserCoursesComponent implements OnInit {
  courses: Course[] = [];

  constructor(private userService: UserService) { }

  ngOnInit(): void {
    this.getCourses();
  }

  getCourses(): void {
    const user = {id: 1, email: 'test@example.com', username: 'testuser', password: 'password', firstName: 'Test', lastName: 'User' }; // Assuming you have the user information.
    this.userService.getCourses(user)
      .subscribe(courses => this.courses = courses);
  }
}
