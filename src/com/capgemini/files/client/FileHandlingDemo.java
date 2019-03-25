package com.capgemini.files.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException {
		
		/*
		 * File file = new File("C:\\krishna\\Demo\\A.java");
		 * System.out.println(file.exists());
		 * 
		 * 
		 * File file1 = new File("C:\\krishna\\Demo\\d.java");
		 * System.out.println(file1.exists());
		 */		
		
		/*
		 * File file = new File("test.txt"); if(!file.exists()) { file.createNewFile();
		 * System.out.println("file is created successfully"); }
		 */
		
		//FileWriter writer = new FileWriter(file);
		//BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		/*PrintWriter writer = new PrintWriter(new FileWriter(file, true)); 
		writer.println("Hello ....");
		writer.println("How are you ....");
		writer.println("hope you r fine ");
		writer.println("bye ....");
		
		writer.close();
		System.out.println("written successfully");
		
	
		
		*/
		/*
		 * FileReader reader = new
		 * FileReader("C:\\krishna\\CORE JAVA\\Java_Assignments\\Assignments\\inheritance-assignments\\inheritance-assignments\\src\\com\\capgemini\\employee\\model\\BankAccount.java"
		 * ); BufferedReader bReader = new BufferedReader(reader);
		 * 
		 * PrintWriter writer = new PrintWriter("BankAcount.java"); String content;
		 * 
		 * while((content = bReader.readLine()) != null) {
		 * //System.out.println(content); writer.println(content); }
		 * 
		 * System.out.println("...succeeessssssss....");
		 * 
		 * writer.close(); bReader.close(); reader.close();
		 */
		
		/*
		 * File windowsDirectory = new File("c:\\windows");
		 * System.out.println(windowsDirectory.isDirectory()); String content[] =
		 * windowsDirectory.list();
		 * 
		 * for(String s : content) { System.out.println(s); }
		 */
	
		File newDir = new File("myDir");
		if(!newDir.exists()) {
			newDir.mkdir();
			System.out.println("folder is successfully created ");
		}
		
		File file = new File(newDir, "myfile.txt");
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("file is successfully created");
		}
			
			
	}
	
}
