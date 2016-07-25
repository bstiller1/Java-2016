
public class Course {
private String courseName;
private String[] students = new String[100];
private int numOfStudents;

public Course(String courseName){
	this.courseName = courseName;
}
public void addStudent(String student){
	students[numOfStudents] = student;
	numOfStudents++;
}
public String[] getStudents(){
	return students;
}
public int getNumOfStudents(){
	return numOfStudents;
}
public String getCourseName(){
	return courseName;
}
public void dropStudent(String student){
	// left empty on purpose
}
}
