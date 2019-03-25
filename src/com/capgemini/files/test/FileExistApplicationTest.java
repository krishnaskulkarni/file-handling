package com.capgemini.files.test;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.files.assignments.FileExistApplication;

public class FileExistApplicationTest extends FileExistApplication {
	
	@Test
	public void testIsFileExist() {
		FileExistApplication file = new FileExistApplication();
		assertEquals(true, file.isFileExist());
	}
	
	@Test
	public void testIsFileNotExist() {
		FileExistApplication file = new FileExistApplication();
		assertEquals(false, file.isFileExist());
	}
	
	
	

}
