package com.capgemini.files.test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;
import com.capgemini.files.assignments.WordCount;

public class WordCountTest {

	@Test
	public void testIsFileExist() throws IOException {
		File file = new File("test.txt");
		FileInputStream inputStream = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(inputStream);
		BufferedReader reader = new BufferedReader(input);
		
		WordCount file1 = new WordCount();
		assertEquals(120, file1.numberOfWords(reader));
		
	}
	
	@Test
	public void testIsFileExistWithEmptyFile() throws IOException {
		File file = new File("test1.txt");
		FileInputStream inputStream = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(inputStream);
		BufferedReader reader = new BufferedReader(input);
		
		WordCount file1 = new WordCount();
		assertEquals(120, file1.numberOfWords(reader));
		
	}

}
