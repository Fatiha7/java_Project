package SGCI;


import java.io.*;
import java.util.*;

public class Main {

 public static void main(String[] args) throws IOException {
		//_____________________Q1-a________________________________
		 
		//------------------ les etudaints-----------------------------
		 Student St1=new Student("fatiha","Fatihaaitadi@gmail.com");
		 Student St2=new Student("Nassima","Nassimagan.99@ymail.com");
		 Student St3=new Student("Esaâdia","Esâadiaait@gmail.com");
		 Student St4=new Student("Habiba","Habibaichga@gmail.com");
		 Student St5=new Student("Brahim","brahima2018@gmail.com");
		// Student St6=new Student("Noura","ben_tahernoura@yhoo.com");
		// Student St7=new Student("Taha","TahaSkywolf@yahoo.fr");
		 Student St8=new Student("Ahmed","Ahmedaitaadi@hotmail.com");
		 Student St9=new Student("Souhaib","Souhaibaitaadi@gmail.com");
		 Student St10=new Student("Hamza","AitaadiHamza@ymail.com");
		 //------------------ les ensignants-------------------------------
		 Lecturer L1=new Lecturer("Mr Kabbadj","kabbadjyounes@yahoo.fr");
		 Lecturer L2=new Lecturer("Afdel","Kafdel@ymail.com");
		 //Lecturer L3=new Lecturer("idbraim","soufianeidbraim@yahoo.fr");
		 //Lecturer L4=new Lecturer("belaqziz","salwa.belaqziz@gmail.com");
		 
		 //--------------------- les coures -------------------------------
		 
			 Course C1,C2;
		   C1=new Course();
		   C2=new Course();
		   C1.addStudent(St1);
		   C1.addStudent(St2);
		   C1.addStudent(St3);
		   C1.addStudent(St4);
		   C1.addStudent(St5);
		   C1.assignTeacher(L1);
		   C2.addStudent(St1);
		   C2.addStudent(St8);
		   C2.addStudent(St9);
		   C2.addStudent(St10);
		   C2.assignTeacher(L2);
		   
		   //---------- l'affichage----------------------------------
		   C1.getNumberOfStudents();
		   System.out.println("la liste les etudaint est: ");
		   C1.getListOfStudent();
		   System.out.println("Nombre d'étudiants : " +C1.NumberOfStudents);
		   System.out.println("Le nom est : "+C1.getTeacher().GetNom()+" l'email Address est : "+C1.getTeacher().GetEmailAddress());
		   C1.removeStudent(St1);
		   C1.getNumberOfStudents();
		   System.out.println("la liste les étudaints est: ");
		   C1.getListOfStudent();
		   System.out.println("Nombre d'étudiants : " +C1.NumberOfStudents);
		   System.out.println("Le nom est : "+C1.getTeacher().GetNom()+" l'email Address est : "+C1.getTeacher().GetEmailAddress());
		   //------------------------------------------------------------------
		/*
		ArrayList<Student> ALE1=new ArrayList<Student>();
		ArrayList<Student> ALE2=new ArrayList<Student>();
		ArrayList<Student> ALE3=new ArrayList<Student>();
		 
		 
	 	---------------- la liste des etudaints N°1--------------------
		ALE1.add(St1);
		ALE1.add(St2);
		ALE1.add(St3);
		ALE1.add(St4);
		ALE1.add(St5);
		ALE1.add(St6);
		ALE1.add(St7);
		----------------- la liste des etudaints N°2--------------------
		ALE2.add(St1);
		ALE2.add(St8);
		ALE2.add(St9);
		ALE2.add(St10);
		----------------- la liste des etudaints N°3--------------------
		 ALE3.add(St1);
		 ALE3.add(St3);
		 ALE3.add(St8);
		 ALE3.add(St9);
		 ALE3.add(St10);
		 
		 
		 Course C1=new Course(ALE1,L1);
		 Course C2=new Course(ALE1,L2);
		 Course C3=new Course(ALE2,L3);
		 Course C4=new Course(ALE3,L1);
		 Course C5=new Course(ALE3,L2);
		   */
		   //__________________________Q3-b____________________________
		   Vector<Course> VC = new Vector<Course>();
		   VC.add(C1);
		   VC.add(C2);
		 //__________________________Q3-c____________________________
		   Vector<Student> VE = new Vector<Student>();
	       VE.add(St1);
	       VE.add(St2);
	       VE.add(St3);
	       VE.add(St4);
	       VE.add(St5);
	     //__________________________Q3-d____________________________
	       L1.addTaughtCourse(C1);
		   L1.addTaughtCourse(C2);
		   for(int i=0;i<L1.getTaughtCourses().size();i++) {
		   System.out.println("\n le cours N°"+(i+1)+" est: ");
		   System.out.println("\n-------- l'étudiants-----------\n");
		   L1.getTaughtCourses().get(i).getListOfStudent();
		   System.out.println("\n-------- l'ensignant-----------\n");
		   System.out.println("Le nom est : "+L1.getTaughtCourses().get(i).getTeacher().GetNom()+" l'email Address est : "+L1.getTaughtCourses().get(i).getTeacher().GetEmailAddress());
	       }
		   St1.addCourse(C1);
		   St1.addCourse(C2);
		   for(int i=0;i<St1.getCourses().size();i++) {
		   System.out.println("\n le cours N°"+(i+1)+" est:\n ");
		   System.out.println("\n-------- l'étudiants-----------\n");
		   St1.getCourses().get(i).getListOfStudent();
		   System.out.println("\n-------- l'ensignant-----------\n");
		   System.out.println("Le nom est : "+St1.getCourses().get(i).getTeacher().GetNom()+" l'email Address est : "+St1.getCourses().get(i).getTeacher().GetEmailAddress());
		   }
 
		   FileOutputStream fc= new FileOutputStream("course.ser");
		   FileOutputStream fs= new FileOutputStream("students.ser");
		   FileOutputStream fl= new FileOutputStream("lecture.ser");
		   ObjectOutputStream oc=new ObjectOutputStream(fc);
		   ObjectOutputStream os=new ObjectOutputStream(fs);
		   ObjectOutputStream ol=new ObjectOutputStream(fl);
		   oc.writeObject(C1);
		   oc.writeObject(C2);
		   os.writeObject(St1);
		   os.writeObject(St2);
		   os.writeObject(St3);
		   os.writeObject(St4);
		   os.writeObject(St5);
		   os.writeObject(St8);
		   os.writeObject(St9);
		   os.writeObject(St10);
		   ol.writeObject(L1);
		   ol.writeObject(L2);
		   oc.close();
		   os.close();
		   ol.close();
      }
}
