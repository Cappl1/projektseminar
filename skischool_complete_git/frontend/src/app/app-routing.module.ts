import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { CourseListComponent } from './course-list/course-list.component';
import { CourseDetailsComponent } from './course-details/course-details.component';
import { RegisterComponent } from './register/register.component';
import { UserCoursesComponent } from './user-courses/user-courses.component';
import { UnregisterComponent } from './unregister/unregister.component';

// Here we define the routes for our application, so that when the user navigates to a certain URL, the corresponding component is loaded.
//The :id in the path is a placeholder for a specific course ID. When navigating to a route with a specific ID, that ID is available for the component to use (for example, to fetch the details of the course).
const routes: Routes = [
  { path: '', redirectTo: '/course-list', pathMatch: 'full' },
  { path: 'course-list', component: CourseListComponent },
  { path: 'course-list/course-details/:id', component: CourseDetailsComponent },
  { path: 'course-list/course-details/register/:id', component: RegisterComponent },
  { path: 'user-courses', component: UserCoursesComponent },
  { path: 'unregister/:id', component: UnregisterComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
