import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from '../models/user';
import { Course } from '../models/course';

@Injectable({
  providedIn: 'root'
})

//IMPORTANT: Please replace the URLs with the actual endpoints of your Spring Boot application

export class UserService {
  private userUrl = 'http://localhost:8080/members/'; // URL to your Spring Boot application

  constructor(private http: HttpClient) { }

  register(user: User, courseId: number): Observable<User> {
    const url = `${this.userUrl}/${user.id}/courses/${courseId}`;
    return this.http.post<User>(url, user);
  }

  getCourses(user: User): Observable<Course[]> {
    const url = `${this.userUrl}/${user.id}/courses`;
    return this.http.get<Course[]>(url);
  }

  unregister(user: User, courseId: number): Observable<User> {
    const url = `${this.userUrl}/${user.id}/courses/${courseId}`;
    return this.http.delete<User>(url);
  }
}

