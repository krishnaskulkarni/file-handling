package com.capgemini.files.assignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.sound.sampled.Line;

public class WordCount {

	public int numberOfWords(BufferedReader buReader) throws IOException {
		int count = 0;
		
		
		String line;
		while((line = buReader.readLine())  != null) {
			String[] words = line.split("\\s+");
			
			count = count + words.length;
		}
		
		
		return count;
	}
}
