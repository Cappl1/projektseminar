import { Component, OnInit } from '@angular/core';
import { Course } from '../models/course';
import { CourseService } from '../services/course.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';



@Component({
  selector: 'app-course-list',
  templateUrl: './course-list.component.html',
  styleUrls: ['./course-list.component.css'],
  providers: [{ provide: CourseService, useClass: CourseService }]
})
export class CourseListComponent implements OnInit {
  courses?: Course[];

  constructor(private courseService: CourseService,
              private router: Router,
              private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.getCourses();
  }

  getCourses(): void {
    this.courseService.getCourses()
      .subscribe(courses => {
        this.courses = courses;
        console.log(this.courses); // Log the courses array to the console
      });
  }

  onCourseClick(courseId: number) {
    this.router.navigate(['course-details', courseId], { relativeTo: this.route });
  }

  onRegisterClick(courseId: number) {
    this.router.navigate(['register', courseId]);
  }
}