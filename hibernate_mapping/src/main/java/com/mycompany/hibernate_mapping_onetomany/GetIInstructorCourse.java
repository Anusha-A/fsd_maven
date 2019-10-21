package com.mycompany.hibernate_mapping_onetomany;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetIInstructorCourse {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			session.beginTransaction();
			int theId = 1;
			Instructor tempInstructor = session.get(Instructor.class, theId);

			System.out.println("Instructor: " + tempInstructor);
			System.out.println("Courses: " + tempInstructor.getCourses());

			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {

			session.close();

			factory.close();
		}
	}


}
