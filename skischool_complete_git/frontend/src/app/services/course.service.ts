import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Course } from '../models/course';

@Injectable({
  providedIn: 'root'
})

//IMPORTANT: Please replace the URLs with the actual endpoints of your Spring Boot application

export class CourseService {
  private courseUrl = 'http://localhost:8080/courses'; // URL to your Spring Boot application

  constructor(private http: HttpClient) { }

  getCourses(): Observable<Course[]> {
    return this.http.get<Course[]>(this.courseUrl);
  }

  getCourse(id: number): Observable<Course> {
    const url = `${this.courseUrl}/${id}`;
    return this.http.get<Course>(url);
  }
}
