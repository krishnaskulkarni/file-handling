package com.capgemini.files.assignments;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeSeializable {

	public EmployeeSeializable() {
		super();

	}

	public boolean serializableEmployee(Employee employee) throws FileNotFoundException, IOException {
		try {
			ObjectOutputStream os1 = new ObjectOutputStream(new FileOutputStream("test"));
			os1.writeObject(employee);
			os1.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return false;
	}
}
