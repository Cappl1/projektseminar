import { ComponentFixture, TestBed } from '@angular/core/testing';
import { CourseListComponent } from './course-list.component';
import { CourseService } from '../services/course.service';
import { of } from 'rxjs';

describe('CourseListComponent', () => {
  let component: CourseListComponent;
  let fixture: ComponentFixture<CourseListComponent>;
  let courseService: CourseService;

  beforeEach(() => {
    const courseServiceMock = {
      getCourses: jasmine.createSpy('getCourses').and.returnValue(of([{ id: 1, title: 'Test Course', description: 'Test Description' }]))
    };

    TestBed.configureTestingModule({
      declarations: [ CourseListComponent ],
      providers: [
        { provide: CourseService, useValue: courseServiceMock }
      ]
    });

    fixture = TestBed.createComponent(CourseListComponent);
    component = fixture.componentInstance;
    courseService = TestBed.inject(CourseService);
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should call getCourses on CourseService', () => {
    component.ngOnInit();
    expect(courseService.getCourses).toHaveBeenCalled();
  });
});
