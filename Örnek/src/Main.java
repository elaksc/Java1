
public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course();
		course1.id = 1;
		course1.name = "C# & Angular Kamp�";
		course1.teacher ="Engin Demiro�";
		course1.detail = " Kurs Detaylar� ";
		
		Course course2 = new Course(2, "Java & React Kamp�","Engin Demiro�","Kurs Detaylar�");
		Course course3 = new Course(3, "Programlamaya Giri� ��in Temel Kurs","Engin Demiro�","Kurs Detaylar�");;

		
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
		category1.name = "T�m kurslar";
		
		Category category2 = new Category(2,"Kurslar");
		Category category3 = new Category(3,"Kampa Haz�rl�k");
		Category category4 = new Category(4,"S�k Sorulan Sorular");
		
		Category[] category = {category1,category2,category3,category4};
		
		for (Category category5 : category) {
			System.out.println(category5.name);
		}
		}

}
