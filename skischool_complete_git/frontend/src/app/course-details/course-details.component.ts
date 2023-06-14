import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Course } from '../models/course';
import { CourseService } from '../services/course.service';

@Component({
  selector: 'app-course-details',
  templateUrl: './course-details.component.html',
  styleUrls: ['./course-details.component.css']
})
export class CourseDetailsComponent implements OnInit {
  course!: Course;

  constructor(
    private route: ActivatedRoute,
    private courseService: CourseService
  ) { }

  ngOnInit(): void {
    const courseId = Number(this.route.snapshot.paramMap.get('id'));
    this.courseService.getCourse(courseId).subscribe(course => {
      this.course = course;
    });
  }

  getCourse(): void {
    const id = this.route.snapshot.paramMap.get('id');
    
    if (id === null) {
      console.log("No 'id' parameter in the route");
      // handle the case when id is null here
      return;
    }
  
    const numId = +id;
    this.courseService.getCourse(numId)
      .subscribe(course => this.course = course);
  }
  
  
}
