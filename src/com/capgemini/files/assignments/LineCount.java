package com.capgemini.files.assignments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineCount{

	public int numberOfLines() throws IOException {
	int count = 0;
	FileReader reader = new FileReader("C:\\krishna\\CORE JAVA\\Java_Assignments\\Assignments\\aaa.java");
	BufferedReader breader = new BufferedReader(reader);

	while(breader.readLine()!=null)
	{
		count++;
	}
	reader.close();
	breader.close();
	return count;
	}
}

	