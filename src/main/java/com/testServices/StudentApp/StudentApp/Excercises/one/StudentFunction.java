package com.testServices.StudentApp.StudentApp.Excercises.one;

import java.util.ArrayList;
import java.util.Date;
import java.util.*;
import org.springframework.stereotype.Component;


@Component
public class StudentFunction {

	private static Integer studentCount = 5;
	private static ArrayList<StudentApp> devOpsClass = new ArrayList<StudentApp>();

	public StudentFunction() {
		devOpsClass.add(new StudentApp(1,"Rohan",new Date()));
		devOpsClass.add(new StudentApp(2,"Anga",new Date()));
		devOpsClass.add(new StudentApp(3,"Shivam",new Date()));
	}
	public ArrayList<StudentApp> displayStudents(){
		return devOpsClass;
	}
	public StudentApp addStudent(StudentApp student) {
		
    devOpsClass.add(student);
	return student;

}
	 public StudentApp searchStudent(int studentID) {
	    	for(StudentApp DevOpsStudent:devOpsClass)
	    	{
	    		if(DevOpsStudent.getStudentId() == studentID )
	    			return DevOpsStudent;
	    	}
	    	return null;
	    }
	    public StudentApp deleteStudent(int studentID){
	    	Iterator<StudentApp> iterator = devOpsClass.iterator();
	    	while(iterator.hasNext())
	    	{
	    		StudentApp devOpsStudent = iterator.next();
	    		if (devOpsStudent.getStudentId() == studentID)
	    		{
	    			iterator.remove();
	    	    	return devOpsStudent;
	    		}
	    	}
	    	return null;
	    }
}
