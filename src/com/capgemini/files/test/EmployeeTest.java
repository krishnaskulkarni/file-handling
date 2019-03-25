package com.capgemini.files.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

import com.capgemini.files.assignments.Employee;

public class EmployeeTest {
	
	

	@Test
	public void test() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		 Employee employee = new Employee(101,"name",12000);
		 ObjectOutputStream os1 = new ObjectOutputStream(new FileOutputStream("test.ser"));
		 os1.writeObject(employee);
	     os1.close();
	     
	     ObjectInputStream is = new ObjectInputStream(new FileInputStream("test.ser"));
	     Employee employee2 = (Employee)is.readObject();
	     
	     assertTrue(employee.equals(employee2));
	}

}
