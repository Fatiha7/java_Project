package SGCI;
import java.io.*;
import java.util.*;
public class Course implements Serializable {
	private static final long serialVersionUID = 1L;
	ArrayList<Student> Students=new ArrayList<Student>();
    Lecturer Teacher;
	 int NumberOfStudents=0;
	
	//-------------------- Constructor Courses------------------------------
	public Course(ArrayList<Student> students, Lecturer teacher) {
		super();
		Students = students;
		Teacher = teacher;
	}
	
	
	public Course() {
		super();
	}


	public void getListOfStudent(){
		for (int i = 0; i < Students.size(); i++) {
		      System.out.println("Le nom est : "+Students.get(i).GetNom()+" l'email Address est : "+Students.get(i).GetEmailAddress());
		    }		
	}
	
	public Lecturer getTeacher() {
		return Teacher;
	}
	public void addStudent(Student student) {
		Students.add(student);
	}
	public void assignTeacher(Lecturer teacher) {
		Teacher=teacher;
	}
	public void getNumberOfStudents() {
		NumberOfStudents=Students.size();

	
	}
	public void removeStudent(Student student) {
		Students.remove(student);
	}
	
}