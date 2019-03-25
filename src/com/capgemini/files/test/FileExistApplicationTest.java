package com.capgemini.files.test;


import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.Test;

import com.capgemini.files.assignments.FileExistApplication;

public class FileExistApplicationTest extends FileExistApplication {
	
	@Test
	public void testIsFileExist() {
		File file1 = new File("C:\\krishna\\BankAccount.java");
		FileExistApplication file = new FileExistApplication();
		assertEquals(true, file.isFileExist(file1));
	}
	
	@Test
	public void testIsFileNotExist() {
		File file1 = new File("C:\\krishna\\CORE JAVA\\Java_Assignments\\Assignments\\bank_app\\src\\com\\capgemini\\bankapp\\bbb.java");
		FileExistApplication file = new FileExistApplication();
		assertEquals(false, file.isFileExist(file1));
	}
	
	
	

}
