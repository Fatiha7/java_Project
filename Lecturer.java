package SGCI;
import java.util.*;
import java.io.*;
public class Lecturer implements Person,Serializable{
    
	private static final long serialVersionUID = 1L;
	String nom ;
    String EmailAddress  ;
    ArrayList<Course> TaughtCourses=new ArrayList<Course>();
   
 //-------------------------constructor Lecturer ----------------------
   
   public Lecturer(String nom, String emailAddress) {
	super();
	this.nom = nom;
	EmailAddress = emailAddress;
}
 
   //------------------------the methods defined ------------------------ 

   public void addTaughtCourse(Course course){
	   TaughtCourses.add(course); }
	public String GetNom() {
		return nom;
	}
	public String GetEmailAddress() {
		return EmailAddress;
	}
	public ArrayList<Course> getTaughtCourses() {
		
		return TaughtCourses;
	}
	  
  
}
