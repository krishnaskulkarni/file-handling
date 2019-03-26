package com.capgemini.files.assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeDeserialization {

	public boolean deserialization() throws FileNotFoundException, IOException, ClassNotFoundException {
    
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("test.ser"));
			Employee employee2 = (Employee)is.readObject();
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
