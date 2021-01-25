package SGCI;
import java.io.*;
import java.util.*;
public class Student implements Person ,Serializable{
	
	private static final long serialVersionUID = 1L;
	String nom;
	 String EmailAddress;
	 ArrayList<Course> Courses=new ArrayList<Course>();
	 
	 //-------------------------constructor Student ----------------------
	 
		 public Student(String nom, String emailAddress) {
		super();
		this.nom = nom;
		EmailAddress = emailAddress;
	}
		 
		//-------------------------  the methods defined ----------------------
	public String GetNom() {
		return nom;
	}
	public String GetEmailAddress() {
		return EmailAddress;
	}
	public void addCourse(Course course){
		   Courses.add(course); }
	public ArrayList<Course> getCourses() {
		return Courses;
	}
	 
	}

