package com.capgemini.files.test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

import com.capgemini.files.assignments.LineCount;

public class LineCountTest {

	@Test
	public void testNumberOfLines() throws IOException {
		FileReader reader = new FileReader("C:\\krishna\\CORE JAVA\\Java_Assignments\\Assignments\\aaa.java");
		BufferedReader breader = new BufferedReader(reader);
		LineCount file = new LineCount();
		assertEquals(48, file.numberOfLines(breader));
		breader.close();
		reader.close();
	}

	@Test
	public void testNumberOfLinesForEmptyFile() throws IOException {
		FileReader reader = new FileReader("test");
		BufferedReader breader = new BufferedReader(reader);
		LineCount file = new LineCount();
		assertEquals(0, file.numberOfLines(breader));
		breader.close();
		reader.close();
	}
	
	@Test(expected = Exception.class)
	public void testNumberOfLinesForInvalidFile() throws IOException {
		FileReader reader = new FileReader("testy");
		BufferedReader breader = new BufferedReader(reader);
		LineCount file = new LineCount();
		file.numberOfLines(breader);
		breader.close();
		reader.close();
	}
	
}
