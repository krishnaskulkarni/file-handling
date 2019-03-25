package com.capgemini.files.assignments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineCount{

	public int numberOfLines(BufferedReader breader) throws IOException {
	int count = 0;
	

	while(breader.readLine()!=null)
	{
		count++;
	}
	
	breader.close();
	return count;
	}
}

	