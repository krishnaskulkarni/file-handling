package com.capgemini.files.assignments;

import java.io.File;

public class FileExistApplication {

	

	
	public FileExistApplication() {
		super();
	}

	
	File file = new File("C:\\krishna\\CORE JAVA\\Java_Assignments\\Assignments\\bank_app\\src\\com\\capgemini\\bankapp\\bbb.java");
	public boolean isFileExist() {
		return file.exists();
	}
	
	
}
