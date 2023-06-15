# projektseminar

MVP zu einer hypothetischen Skischule

overview backend:
src
|   |   backend.txt
|   |   
|   +---main
|   |   +---java
|   |   |   \---com
|   |   |       \---skischool
|   |   |           |   SkischoolApplication.java
|   |   |           |   
|   |   |           +---course
|   |   |           |   +---domain
|   |   |           |   |       Course.java
|   |   |           |   |       CourseRepository.java
|   |   |           |   |       
|   |   |           |   +---logic
|   |   |           |   |       CourseManagement.java
|   |   |           |   |       
|   |   |           |   \---service
|   |   |           |           CourseService.java
|   |   |           |           
|   |   |           +---member
|   |   |           |   +---domain
|   |   |           |   |       Member.java
|   |   |           |   |       MemberRepository.java
|   |   |           |   |       
|   |   |           |   +---logic
|   |   |           |   |       MemberManagement.java
|   |   |           |   |       
|   |   |           |   \---service
|   |   |           |           MemberService.java
|   |   |           |           
|   |   |           \---registration
|   |   |               +---domain
|   |   |               |       CourseRegistration.java
|   |   |               |       CourseRegistrationRepository.java
|   |   |               |       
|   |   |               +---logic
|   |   |               |       CourseRegistrationManagement.java
|   |   |               |       
|   |   |               \---service
|   |   |                       CourseRegistrationService.java
|   |   |                       
|   |   \---resources
|   |       |   application.properties
|   |       |   
|   |       +---static
|   |       \---templates
|   \---test
|       \---java
|           \---com
|               \---skischool
|                       SkischoolApplicationTests.java


overview Frontend

+---app
|   |   app-routing.module.ts
|   |   app.component.css
|   |   app.component.html
|   |   app.component.spec.ts
|   |   app.component.ts
|   |   app.module.ts
|   |   
|   +---course-details
|   |       course-details.component.css
|   |       course-details.component.html
|   |       course-details.component.spec.ts
|   |       course-details.component.ts
|   |       
|   +---course-list
|   |       course-list.component.css
|   |       course-list.component.html
|   |       course-list.component.spec.ts
|   |       course-list.component.ts
|   |       
|   +---models
|   |       course.ts
|   |       user.ts
|   |       
|   +---register
|   |       register.component.css
|   |       register.component.html
|   |       register.component.spec.ts
|   |       register.component.ts
|   |       
|   +---services
|   |       course.service.spec.ts
|   |       course.service.ts
|   |       user.service.spec.ts
|   |       user.service.ts
|   |       
|   +---unregister
|   |       unregister.component.css
|   |       unregister.component.html
|   |       unregister.component.spec.ts
|   |       unregister.component.ts
|   |       
|   \---user-courses
|           user-courses.component.css
|           user-courses.component.html
|           user-courses.component.spec.ts
|           user-courses.component.ts

Skischule Problembeschreibung
https://hessenbox-a10.rz.uni-frankfurt.de/getlink/fiWKSpF5eLRDB8oSyPhgnw/R4_Fachliche_Informationen%20%283%29.doc
