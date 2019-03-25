package com.capgemini.files.assignments;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class GrepApplication {

		public Map checkAppearances() throws IOException {
			 BufferedReader br = new BufferedReader(new FileReader("test.txt"));
			 String content;
			 TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
			 int countLine = 0;
			 
			 while((content = br.readLine())  != null){
				 ++countLine;
				 if(content.contains("Hello")){
					tm.put(countLine, content);
				 }
				 
			 }
			 return tm;
			 
		}
}

