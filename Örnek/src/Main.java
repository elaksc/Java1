
public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course();
		course1.id = 1;
		course1.name = "C# & Angular Kampý";
		course1.teacher ="Engin Demiroð";
		course1.detail = " Kurs Detaylarý ";
		
		Course course2 = new Course(2, "Java & React Kampý","Engin Demiroð","Kurs Detaylarý");
		Course course3 = new Course(3, "Programlamaya Giriþ Ýçin Temel Kurs","Engin Demiroð","Kurs Detaylarý");;

		
		Course[] course = {course1, course2, course3};
		
		for (Course courses : course) {
			System.out.println(courses.name);
		}
		CourseManager courseManager = new CourseManager();
		courseManager.Add(course1);
		courseManager.Add(course2);
		courseManager.Dell(course3);
		
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Tüm kurslar";
		
		Category category2 = new Category(2,"Kurslar");
		Category category3 = new Category(3,"Kampa Hazýrlýk");
		Category category4 = new Category(4,"Sýk Sorulan Sorular");
		
		Category[] category = {category1,category2,category3,category4};
		
		for (Category category5 : category) {
			System.out.println(category5.name);
		}
		}

}
