package com.capgemini.files.test;

import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.files.assignments.Employee;
import com.capgemini.files.assignments.EmployeeDeserialization;
import com.capgemini.files.assignments.EmployeeSeializable;

public class EmployeeTest {

	private static Employee employee;

	@BeforeClass
	public static void setUp() {
		employee = new Employee(101, "John Deo", 34000);
	}

	@Test
	public void testObjectSerializeSuccessfully() throws FileNotFoundException, IOException {
		EmployeeSeializable employeeser = new EmployeeSeializable();
		assertTrue(employeeser.serializableEmployee(employee));
	}
	
	@Test
	public void testObjectDeserializeSuccessfully() throws FileNotFoundException, IOException, ClassNotFoundException {
		 EmployeeDeserialization employeeser = new  EmployeeDeserialization();
		assertTrue(employeeser.deserialization());

	}
}
